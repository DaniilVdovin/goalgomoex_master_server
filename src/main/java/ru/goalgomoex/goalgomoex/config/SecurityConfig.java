package ru.goalgomoex.goalgomoex.config;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CorsConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Collections;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .cors(httpSecurityCorsConfigurer -> httpSecurityCorsConfigurer.configurationSource(request ->
                {
                    CorsConfiguration config = new CorsConfiguration();
                    config.setAllowedHeaders(Collections.singletonList("*"));
                    config.setAllowedMethods(Collections.singletonList("*"));
                    config.addAllowedOrigin("*");
                    config.setAllowCredentials(true);
                    return config;
                }))
                .authorizeHttpRequests(auth -> auth
                        //.requestMatchers(
                        //        antMatcher(HttpMethod.GET,"/login"),
                        //        antMatcher(HttpMethod.POST,"/login")).permitAll()
                        //.requestMatchers(
                        //        antMatcher("/users")).hasAuthority("ADMIN")
                        //.requestMatchers(
                        //        antMatcher("/logout"),
                        //        antMatcher("/organisation"),
                        //        antMatcher("/organisation/**")).authenticated()
                        //.requestMatchers(
                        //        antMatcher("/"),
                        //        antMatcher(HttpMethod.GET, "/favicon.ico"),
                        //        antMatcher(HttpMethod.GET, "/icon/**")).permitAll()
                        //.requestMatchers(antMatcher("/api/**")).permitAll()
                        //.requestMatchers(antMatcher("/app"),antMatcher("/generated/**")).permitAll()
                        .anyRequest().permitAll()
                )
                .build();
    }

}
