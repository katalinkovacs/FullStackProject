package web;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.context.annotation.Configuration;  // ????   --> spring-context - 3.2.2.RELEASE
import org.springframework.context.annotation.ComponentScan;  // ?????




@Configuration
@EnableWebMvc                                               // Enable Spring MVC
@ComponentScan("web")                                       // Enable component scanning --> scanning your package for components
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
