package config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import web.WebConfig;


public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {

        //not doing much yet it will hold DAO business logic related beans
        return new Class<?>[] { RootConfig.class };

    }

    @Override
    protected Class<?>[] getServletConfigClasses() {        // Specify configuration class

        return new Class<?>[] { WebConfig.class };

    }

    @Override
    protected String[] getServletMappings() {               // Map DispatcherServlet to /

        return new String[] { "/" };

    }


}
