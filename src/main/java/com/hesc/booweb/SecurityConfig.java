package com.hesc.booweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()

                // ONLY for development
                .anyRequest().not().authenticated()

                // OTHERS
                //.anyRequest().authenticated()

                .and()
                .oauth2Login();
    }
}