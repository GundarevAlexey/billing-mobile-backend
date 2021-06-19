package wg.rest.mobile.config.filter;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by BigMan on 28.02.2019.
 */

@Provider
@TokenSecured
public class TokenFilter implements ContainerRequestFilter {

    private static final Logger logger = LoggerFactory.getLogger(TokenFilter.class);

    @Context
    private ResourceInfo resourceInfo;

    @Context
    private HttpServletRequest servletRequest;

    public static final String HEADER_PROPERTY_AUTH_TOKEN = "auth_token";
    public static final String AUTHORIZATION_PROPERTY = "WG_API_TOKEN";

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        final MultivaluedMap<String, String> headers = requestContext.getHeaders();
        final List<String> authProperty = headers.get(AUTHORIZATION_PROPERTY);

        if (authProperty == null || authProperty.isEmpty()) {
            logger.warn("NO WG_API_TOKEN !!!");
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("message", Response.Status.UNAUTHORIZED.toString());
            requestContext.abortWith(
                    Response.status(Response.Status.UNAUTHORIZED).entity(jsonObject.toString()).build()
            );
            return;
        }

        String auth_token = authProperty.get(0);

        List<String> idList = new ArrayList<String>();
        idList.add(auth_token);
        headers.put(HEADER_PROPERTY_AUTH_TOKEN, idList);
    }

}
