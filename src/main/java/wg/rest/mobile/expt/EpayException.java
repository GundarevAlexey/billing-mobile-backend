package wg.rest.mobile.expt;

import org.codehaus.jettison.json.JSONObject;

public class EpayException  extends RuntimeException{

    private static final long serialVersionUID = -435163610162059873L;

    private JSONObject errObj;

    public EpayException() {
        super();
    }
    public EpayException(JSONObject errObj ) {
        super();
        this.errObj=errObj;
    }

    public JSONObject getErrObj() {
        return errObj;
    }
}
