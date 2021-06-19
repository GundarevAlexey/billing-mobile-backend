package wg.rest.mobile.util;

import wg.rest.mobile.config.filter.TokenFilter;

import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.core.HttpHeaders;
import java.util.List;

/**
 * Created by BigMan on 28.02.2019.
 */
public class TokenKit {
    public static String getAUTH_TOKEN(HttpHeaders headers) throws NotAuthorizedException {

        List<String> id = headers.getRequestHeader(TokenFilter.HEADER_PROPERTY_AUTH_TOKEN);

        if (id == null || id.size() != 1)
            throw new NotAuthorizedException("Unauthorized!");

        return id.get(0);
    }
}
