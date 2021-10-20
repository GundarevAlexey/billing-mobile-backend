package wg.rest.mobile.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class MyRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();

        // See more: DataSourceInterceptor
        String keyDS = (String) request.getAttribute("keyDS");

        System.out.println("KeyDS=" + keyDS);

        if (keyDS == null) {
            keyDS = "PUBLISHER_DS";
        }

        return keyDS;
    }

}