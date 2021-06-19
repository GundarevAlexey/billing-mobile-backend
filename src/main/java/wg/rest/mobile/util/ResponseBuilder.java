package wg.rest.mobile.util;

import org.json.JSONObject;


import javax.ws.rs.core.Response;
import java.util.HashMap;

/**
 * Created by BigMan on 28.02.2019.
 */
public class ResponseBuilder {


    public static Response build(HashMap<String, Object> map) {
        JSONObject jsonObject = new JSONObject();
        if (Integer.valueOf(map.get("state").toString()) > 0) {
            jsonObject.put("state", 1);
            jsonObject.put("items", map.get("items"));

            return Response.status(Response.Status.OK).entity(jsonObject.toString()).build();
        } else {
            jsonObject.put("state", -1);
            jsonObject.put("errObj", map.get("errObj"));
            return Response.status(Response.Status.BAD_REQUEST).entity(jsonObject.toString()).build();
        }
    }

    public static Response badRequest() {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("state", -1);
        return Response.status(Response.Status.BAD_REQUEST).entity(jsonObject.toString()).build();
    }

}
