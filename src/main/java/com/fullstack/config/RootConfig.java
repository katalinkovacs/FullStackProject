package com.fullstack.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import java.util.regex.Pattern;

// EVERYTHING IS SPRING
@Configuration
@Import(DataConfig.class)    // SpringContext injected with the contents of DataConfig AKA Beans!!!
// SPRING scans everything in com.fullstack.model package that has @Repository --> creates a java class
@ComponentScan(basePackages = "com/fullstack/model",
        excludeFilters={
                @ComponentScan.Filter(type= FilterType.CUSTOM, value= RootConfig.WebPackage.class)
        })

// It will not scan the web package that SCANS THE CONTROLLERS!!!!!!
public class RootConfig {

    public static class WebPackage extends RegexPatternTypeFilter {


        public WebPackage() {

            super(Pattern.compile("com.fullstack/web"));
            System.out.print("In RootConfig CLASS - WebPackage METHOD *****************");


        }
    }

}
