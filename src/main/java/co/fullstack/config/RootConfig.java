package co.fullstack.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import java.util.regex.Pattern;

// EVERYTHING IS SPRING
@Configuration
@Import(DataConfig.class)    // SpringContext injected with the contents of DataConfig AKA Beans!!!
// SPRING scans everything in com.fullstack.model package that has @Repository --> creates a java class
@ComponentScan(basePackages = "co.fullstack.model",
        excludeFilters={
                @ComponentScan.Filter(type= FilterType.CUSTOM, value= RootConfig.WebPackage.class)
        })

@PropertySource("classpath:application.properties")
// It will not scan the web package that SCANS THE CONTROLLERS!!!!!!
public class RootConfig {


    /**
     * This inner class provides a custom filter for /web which is used in componentscan above
     * not to include web components
     */
    public static class WebPackage extends RegexPatternTypeFilter {


        public WebPackage() {

            super(Pattern.compile("co.fullstack/web"));
            System.out.print("In RootConfig CLASS - WebPackage METHOD *****************");


        }
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer myProperties() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
