package wg.rest.mobile.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
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

    @Autowired
    @Bean(name = "dataSource")
    public DataSource getDataSource(DataSource dataSource1, DataSource dataSource2) {

        System.out.println("## Create DataSource from dataSource1 & dataSource2");

        MyRoutingDataSource dataSource = new MyRoutingDataSource();

        Map<Object, Object> dsMap = new HashMap<Object, Object>();
        dsMap.put("PUBLISHER_DS", dataSource1);
        dsMap.put("ADVERTISER_DS", dataSource2);

        dataSource.setTargetDataSources(dsMap);

        return dataSource;
    }

    @Bean(name = "dataSource1", destroyMethod = "close")
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
        config.addDataSourceProperty("autoReconnect",true);
        config.addDataSourceProperty("maxReconnects",5);
        config.addDataSourceProperty("cachePrepStmts", true);
        config.addDataSourceProperty("prepStmtCacheSize", 250);
        config.addDataSourceProperty("prepStmtCacheSqlLimit", 2048);
        config.addDataSourceProperty("useServerPrepStmts", true);
        config.addDataSourceProperty("cacheResultSetMetadata", true);

        HikariDataSource ds = new HikariDataSource(config);
//        ds.addDataSourceProperty("driverType", "thin");

        return ds;
    }

    @Bean(name = "dataSource2", destroyMethod = "close")
    public DataSource psqlDataSource() throws SQLException {

        String c = env.getProperty("db2.url");
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(env.getProperty("db2.url"));
        config.setUsername(env.getProperty("db2.username"));
        config.setPassword(env.getProperty("db2.pswd"));

        config.setDriverClassName("org.postgresql.Driver");
        config.setMinimumIdle(1);
        config.setIdleTimeout(36000);
        config.setMaximumPoolSize(Integer.parseInt(env.getProperty("spring.datasource.hikari.maximum-pool-size")));
//        config.setConnectionTestQuery("select 1 from dual");
        config.setConnectionTimeout(20000);
        config.setLeakDetectionThreshold(TimeUnit.SECONDS.toMillis(60));
        config.addDataSourceProperty("autoReconnect",true);
        config.addDataSourceProperty("maxReconnects",5);
        config.addDataSourceProperty("cachePrepStmts", true);
        config.addDataSourceProperty("prepStmtCacheSize", 250);
        config.addDataSourceProperty("prepStmtCacheSqlLimit", 2048);
        config.addDataSourceProperty("useServerPrepStmts", true);
        config.addDataSourceProperty("cacheResultSetMetadata", true);

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

    @Bean(name = "archive_jdbc")
    public JdbcTemplate archiveJdbcTemplate(@Qualifier("dataSource2") DataSource dataSource) {
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
