package wg.rest.mobile.dao;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import wg.rest.mobile.expt.EpayException;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by BigMan on 28.02.2019.
 */
public interface MobileDAO {

    JSONObject make_request(String reqUUID, String ctlUID, String lang, String pMap)
            throws JSONException, EpayException, IOException, SQLException;
}
