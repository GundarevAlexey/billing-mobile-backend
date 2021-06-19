package wg.rest.mobile.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by BigMan on 28.02.2019.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestData {
    private String data;

    public RequestData() {

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


}
