package co.fullstack.config;

import co.fullstack.web.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// FIRST STEP IN TOMCAT WEBCONTAINER - STARTING POINT!!!!!!!!!!!!!!!!!!!!!!!

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {

        // It holds DAO business logic related beans
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
