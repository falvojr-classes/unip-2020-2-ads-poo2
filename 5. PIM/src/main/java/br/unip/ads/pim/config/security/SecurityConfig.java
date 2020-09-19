package br.unip.ads.pim.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * https://www.baeldung.com/spring-security-authentication-provider
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
 
    @Autowired
    private ApiAuthenticationProvider authProvider;
 
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authProvider);
    }
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
        	// Habilita a segurança apenas a partir do path da nossa API RESTful: "/api".
        	.antMatchers("/api/**").authenticated()
        	// Habilita o Basic Authentication.
        	.and().httpBasic()
        	// Desabilita o Cross Site Request Forgery (CSRF).
        	.and().csrf().disable();
    }
}
