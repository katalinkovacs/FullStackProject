package co.fullstack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataConfig {

    //2 beans --> DriverManagerDataSource AND JdbcOperations
    // These will be added to the Application Context created by SPRING
    @Bean
    public DriverManagerDataSource dataSource() {

        System.out.println("In DataConfig CLASS - dataSource METHOD ***************** Datasource created ");

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("${driverclassName}");
        //ds.setUrl("jdbc:mysql://localhost/katidb");
        //ds.setUsername("admin");
        //ds.setPassword("admin");
        ds.setUrl("${dbUrl}");
        ds.setUsername("${dbUser}");
        ds.setPassword("${dbPassword}");
        return ds;

    }

    @Bean
    public JdbcOperations jdbcTemplate(DriverManagerDataSource dataSource) {

        System.out.println("In DataConfig CLASS - jdbcTemplate METHOD *****************");
        return new JdbcTemplate(dataSource);
    }

}
