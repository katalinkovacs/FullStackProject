package co.fullstack.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



public class DataConfig {

    Logger LOG = LoggerFactory.getLogger(DataConfig.class);

    @Value("${jdbc.url}")
    String jdbcUrl;

    @Value("${jdbc.user}")
    String jdbcUser;

    @Value("${jdbc.password}")
    String jdbcPassword;

    @Value("${jdbc.driverClassName}")
    String jdbcDriverClassName;


    @Autowired
    private Environment env;

    //2 beans --> DriverManagerDataSource AND JdbcOperations
    // These will be added to the Application Context created by SPRING
    @Bean
    public DriverManagerDataSource dataSource() {

        LOG.info("In DataConfig CLASS - dataSource METHOD ***************** Datasource created ");
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUrl(jdbcUrl);
        ds.setUsername(jdbcUser);
        ds.setPassword(jdbcPassword);
        ds.setDriverClassName(jdbcDriverClassName);
        return ds;
    }

    @Bean
    public JdbcOperations jdbcTemplate(DriverManagerDataSource dataSource) {
        LOG.info("In DataConfig CLASS - jdbcTemplate METHOD *****************");
        return new JdbcTemplate(dataSource);
    }

}
