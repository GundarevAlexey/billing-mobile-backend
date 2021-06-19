package wg.rest.mobile.model;

import org.json.JSONArray;

import java.util.ArrayList;

/**
 * Created by BigMan on 28.02.2019.
 */
public class JsonSerializableConverter {
    public static <T extends JsonSerializable> JSONArray convertToJSONArray(ArrayList<T> list) {
        JSONArray jsonArray = new JSONArray();
        if (list != null) {
            for (JsonSerializable element : list) {
                jsonArray.put(element.toJson());
            }
        }
        return jsonArray;
    }
}
