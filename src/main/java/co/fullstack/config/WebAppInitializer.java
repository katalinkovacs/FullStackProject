package co.fullstack.config;

import co.fullstack.web.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// FIRST STEP IN TOMCAT WEBCONTAINER - STARTING POINT!!!!!!!!!!!!!!!!!!!!!!!

/**
 * This class is automatically gets processed by servlet container
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {



    /**
        Method loads another application context with middle-tier, data-tier beans
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {

        // It holds DAO business logic related beans
        return new Class<?>[] { RootConfig.class };

    }

    /**
     * Method load web components: controllers, view resolver, handler mapping
     * This case it is defined in Webconfig.class
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {        // Specify configuration class

        return new Class<?>[] { WebConfig.class };

    }

    @Override
    protected String[] getServletMappings() {               // Map DispatcherServlet to /

        return new String[] { "/" };

    }


}
