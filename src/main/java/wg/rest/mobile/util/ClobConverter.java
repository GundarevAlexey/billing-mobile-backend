package wg.rest.mobile.util;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;



import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.sql.Clob;
import java.sql.SQLException;

/**
 * Created by BigMan on 22.01.2019.
 */
public class ClobConverter {

    public static JSONArray toJsonObj(Clob clob) throws IOException, SQLException {
        Reader in = clob.getCharacterStream();
        StringWriter w = new StringWriter();
        IOUtils.copy(in, w);
        String clobAsString = w.toString();

        Gson gson = new Gson();
        JsonElement jelem = gson.fromJson(clobAsString, JsonElement.class);

        return new JSONArray(jelem.toString());
    }

}
