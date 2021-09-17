package wg.rest.mobile.dao;

import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import wg.rest.mobile.config.filter.TokenFilter;
import wg.rest.mobile.expt.EpayException;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.sql.Clob;
import java.sql.SQLException;
import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by BigMan on 28.02.2019.
 */
@Component
public class MobileDAO_Impl implements MobileDAO {
    private String pkgName = "oapi_inspect_apk";

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private SimpleJdbcCall func;

    private static final Logger logger = LoggerFactory.getLogger(MobileDAO_Impl.class);

    @Override
    public Object make_request(String reqUUID, String ctlUID, String lang,String pMap)
            throws JSONException, EpayException, IOException, SQLException {

        Map inParams = new HashMap();
        inParams.put("pv#reqUUID", reqUUID);
        inParams.put("pv#ctlUID", ctlUID);
        inParams.put("pv#lang", lang);
        inParams.put("pv#pMap", pMap);
        Gson gson = new Gson();
        logger.warn("request -- {}",gson.toJson(inParams));

        this.func = new SimpleJdbcCall(jdbcTemplate).withCatalogName(pkgName).withFunctionName("do_request")
                .withoutProcedureColumnMetaDataAccess()
                .useInParameterNames("pv#reqUUID")
                .useInParameterNames("pv#ctlUID")
                .useInParameterNames("pv#pMap")
                .useInParameterNames("pv#lang")
                .declareParameters(new SqlOutParameter("result", Types.NUMERIC))
                .declareParameters(new SqlParameter("pv#reqUUID", Types.VARCHAR))
                .declareParameters(new SqlParameter("pv#ctlUID", Types.VARCHAR))
                .declareParameters(new SqlParameter("pv#pMap", Types.VARCHAR))
                .declareParameters(new SqlParameter("pv#lang", Types.VARCHAR))
                .declareParameters(new SqlOutParameter("clob#items", Types.CLOB))
                .declareParameters(new SqlOutParameter("ov#errObj", Types.VARCHAR));

        this.func.setReturnValueRequired(false);
        Map m = func.execute(inParams);

        if (Integer.parseInt(m.get("result").toString()) != 1) {
            logger.warn("error -- {}",gson.toJson(m.get("ov#errObj")));
            throw new EpayException(new JSONObject(m.get("ov#errObj").toString()));
        }
        ;

        
        if(m.get("clob#items") == null){
            return new JSONObject("{}");
        }

        Reader in = ((Clob) m.get("clob#items")).getCharacterStream();
        StringWriter w = new StringWriter();
        IOUtils.copy(in, w);

        String result = w.toString();
        if (result.startsWith("[")) {
            JSONArray jsonArray = new JSONArray(result);
            return jsonArray;
        }

        JSONObject jsonObject = new JSONObject(w.toString());
        logger.warn("response -- {}",gson.toJson(jsonObject));
        return jsonObject;
    }


}
