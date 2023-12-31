package main.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:4200") // Add your Angular app's origin
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // Add the allowed HTTP methods
                        .allowedHeaders("Content-Type") // Add the allowed request headers
                        .allowCredentials(true);
            }
        };
    }
}

