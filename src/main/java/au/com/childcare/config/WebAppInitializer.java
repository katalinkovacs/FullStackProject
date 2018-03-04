package au.com.childcare.config;

import au.com.childcare.web.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// FIRST STEP IN TOMCAT WEBCONTAINER - STARTING POINT!!!!!!!!!!!!!!!!!!!!!!!
// Tomcat starts scanning the application.
// Configures conroller classes, mappings, views.
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {

        // It holds DAO business logic related beans, everithing that is not web related, not web component
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
