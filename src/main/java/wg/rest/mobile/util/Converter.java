package wg.rest.mobile.util;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedInputStream;

public class Converter {

    public String getPMap (HttpServletRequest httpRequest) throws Exception {
        byte buf[] = new byte[4096];
        BufferedInputStream bis = new BufferedInputStream(httpRequest.getInputStream());

        int bytesRead = 0;
        String msg = "";

        while ((bytesRead = bis.read(buf)) != -1) {
            msg += new String(buf, 0, bytesRead);
        }
        bis.close();

        return msg;
    }
}
