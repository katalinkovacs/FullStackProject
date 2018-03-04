package au.com.childcare.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataConfig {

    // It needs 2 beans --> DriverManagerDataSource AND JdbcOperations !!!!!
    // These will be added to the Application Context created by SPRING

    // BEAN1 --> DriverManagerDataSource
    @Bean
    public DriverManagerDataSource dataSource() {

        System.out.println("In DataConfig CLASS - dataSource METHOD ***************** Datasource created ");

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        //ds.setUrl("jdbc:mysql://localhost/katidb");
        //ds.setUsername("admin");
        //ds.setPassword("admin");
        ds.setUrl("jdbc:mysql://localhost/fullstackprojectdata");  // DB connection + auth
        ds.setUsername("root");
        ds.setPassword("mysql");
        return ds;

    }

    // BEAN2  --> JdbcOperations
    @Bean
    public JdbcOperations jdbcTemplate(DriverManagerDataSource dataSource) {

        System.out.println("In DataConfig CLASS - jdbcTemplate METHOD *****************");
        return new JdbcTemplate(dataSource);
    }

}
