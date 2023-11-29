package ru.goalgomoex.goalgomoex.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;
import static org.springframework.security.web.util.matcher.AntPathRequestMatcher.antMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(
                                antMatcher("/"),
                                antMatcher(HttpMethod.GET, "/favicon.ico"),
                                antMatcher(HttpMethod.GET, "/icon/**")).permitAll()
                        .anyRequest().denyAll()
                )
                .rememberMe(withDefaults())
                .formLogin(withDefaults())
                .logout(withDefaults())
                .build();
    }
}
