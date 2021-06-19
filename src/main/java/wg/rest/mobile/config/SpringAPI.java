package wg.rest.mobile.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by BigMan on 28.02.2019.
 */
@Configuration
@ComponentScan({"wg.rest.mobile"})
@Import({DBConnConfig.class})
public class SpringAPI {
}
