package com.example.demo.security;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
@Configuration
public class JWTWebSecurity extends WebSecurityConfigurerAdapter {

	
	@Bean
	public AuthenticationManager authenticationmanager() {
		
		return new ProviderManager(Collections.singletonList(AuthenticationProvider));
	}
	@Bean
	public JwtAuthenticationTokenFilter authenticationTokenFilter() {
		
		JwtAuthenticationTokenFilter token = new JwtAuthenticationTokenFilter();
		
	}
	
}
