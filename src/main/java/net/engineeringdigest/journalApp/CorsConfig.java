package net.engineeringdigest.journalApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // Allow Vue.js origin
        config.addAllowedOrigin("http://localhost:5173");
        // Allow credentials (cookies, authorization headers)
        config.setAllowCredentials(true);
        // Allow all headers (or specify needed ones: Authorization, Content-Type)
        config.addAllowedHeader("*");
        // Allow all methods (GET, POST, etc.)
        config.addAllowedMethod("*");

        // Apply to all endpoints
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}