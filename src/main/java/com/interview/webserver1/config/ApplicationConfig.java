package com.interview.webserver1.config;

import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@EnableScheduling
@EnableAsync
@ComponentScan(basePackages = "com.interview.webserver1")
@PropertySources({
        @PropertySource(value = {
                "classpath:schedule.properties",
                "classpath:application.properties"}),
        @PropertySource(value = "${webserver1_properties}", ignoreResourceNotFound = true)
})
public class ApplicationConfig {
}
