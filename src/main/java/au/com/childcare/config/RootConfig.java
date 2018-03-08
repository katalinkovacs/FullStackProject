package au.com.childcare.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import java.util.regex.Pattern;

// EVERYTHING IS SPRING
@Configuration
@Import(DataConfig.class)    // SpringContext injected with the contents of DataConfig AKA Beans!!!
// SPRING scans everything in co.fullstack.dao package that has @Repository --> creates a java class
@ComponentScan(basePackages = "au.com/childcare/dao",
        excludeFilters={
                @ComponentScan.Filter(type= FilterType.CUSTOM, value= RootConfig.WebPackage.class)
        })

// It will not scan the web package that SCANS THE CONTROLLERS!!!!!!
@PropertySource("classpath:application.properties")
public class RootConfig {

    public static class WebPackage extends RegexPatternTypeFilter {


        public WebPackage() {

            super(Pattern.compile("co/fullstack/web"));
            System.out.print("In RootConfig CLASS - WebPackage METHOD *****************");
        }
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer myProperties() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
