package wg.rest.mobile.config;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
import java.io.IOException;

/**
 * Created by BigMan on 28.02.2019.
 */
public class RestFilter implements ContainerResponseFilter {
    @Override
    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException {
        MultivaluedMap<String, Object> headers = containerResponseContext.getHeaders();

        headers.add("Access-Control-Allow-Origin", "*");
        headers.add("Access-Control-Allow-Methods", "GET,POST,OPTIONS,HEAD,PUT");
        headers.add("Access-Control-Allow-Headers", "WG_API_TOKEN,X-Access-Token,X-Requested-With,Content-Type,X-Codingpedia,Origin,Access-Control-Request-Method,Access-Control-Request-Headers,COOK-ID,accept");
    }
}