package wg.rest.mobile.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by BigMan on 28.02.2019.
 */
@Configuration
@PropertySource({"classpath:conn.properties"})
@EnableTransactionManagement
public class DBConnConfig {

    @Autowired
    private Environment env;

    @Bean(name = "dataSource", destroyMethod = "close")
    public DataSource oracleDataSource() throws SQLException {

        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(env.getProperty("db.url"));
        config.setUsername(env.getProperty("db.username"));
        config.setPassword(env.getProperty("db.pswd"));

        config.setDriverClassName("oracle.jdbc.pool.OracleDataSource");
        config.setMinimumIdle(1);
        config.setIdleTimeout(36000);
//        config.setMaximumPoolSize(Runtime.getRuntime().availableProcessors()*5+2);
        config.setMaximumPoolSize(Integer.parseInt(env.getProperty("spring.datasource.hikari.maximum-pool-size")));
        config.setConnectionTestQuery("select 1 from dual");
        config.setConnectionTimeout(20000);
        config.setLeakDetectionThreshold(TimeUnit.SECONDS.toMillis(30));

        HikariDataSource ds = new HikariDataSource(config);
//        ds.addDataSourceProperty("driverType", "thin");

        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        return jdbcTemplate;
    }

    @Bean(name = "txName")
    public PlatformTransactionManager txManager() throws SQLException {
        DataSourceTransactionManager txManager = new DataSourceTransactionManager();
        txManager.setDataSource(oracleDataSource());
        return txManager;
    }

    Properties oracleCacheProperties() {
        return new Properties() {
            {
                setProperty("MinLimit", "2");
                setProperty("MaxLimit", "5");
                setProperty("ConnectionWaitTimeout", "100");
                setProperty("InactivityTimeout", "50");
                setProperty("ValidateConnection", "true");
            }
        };
    }

}
