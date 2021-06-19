package wg.rest.mobile.config;

import org.glassfish.jersey.server.ResourceConfig;
import wg.rest.mobile.config.filter.TokenFilter;

/**
 * Created by BigMan on 28.02.2019.
 */
public class AppConfig extends ResourceConfig {

    public AppConfig() {
        packages("wg.rest.mobile.controller");
        register(TokenFilter.class);
        register(RestFilter.class);

    }
}
