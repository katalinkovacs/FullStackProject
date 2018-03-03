package co.fullstack.web;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;


/**
 * This class is automatically gets processed by servlet container
 */
@Configuration
@EnableWebMvc                                               // Enable Spring MVC
@ComponentScan("co.fullstack.controller")  // It scans the controller package for components/ CONTROLLERS!!!!!
public class WebConfig extends WebMvcConfigurerAdapter {


    @Bean
    public ViewResolver viewResolver() {

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();  // Configure a JSP view resolver
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Bean
    public ViewResolver cnViewResolver() {

        return new ContentNegotiatingViewResolver();
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {   //Configure static content handling

        configurer.enable();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        // TODO Auto-generated method stub
        super.addResourceHandlers(registry);
    }




}
