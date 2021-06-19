package wg.rest.mobile.model;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by BigMan on 28.02.2019.
 */
public interface JsonSerializable {
    public JSONObject toJson() throws JSONException;
}
