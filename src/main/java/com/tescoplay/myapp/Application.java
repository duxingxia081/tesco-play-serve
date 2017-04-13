package com.tescoplay.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

   /* @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
        return new Angular2PathLocationStrategyCustomizer();
    }

    // http://stackoverflow.com/questions/36761019/how-can-i-use-angular2-pathlocationstrategy-in-a-spring-boot-application
    private static class Angular2PathLocationStrategyCustomizer implements EmbeddedServletContainerCustomizer {
        public void customize(ConfigurableEmbeddedServletContainer container) {
            container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/"));
        }
    }*/
}
