package config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataConfig {

    @Bean
    public DriverManagerDataSource dataSource() {
        System.out.print("****************** Datasource created \n");

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost/katidb");
        ds.setUsername("admin");
        ds.setPassword("admin");
        return ds;

    }

    @Bean
    public JdbcOperations jdbcTemplate(DriverManagerDataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
