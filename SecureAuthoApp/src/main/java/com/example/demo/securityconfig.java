package com.example.demo;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class securityconfig extends WebSecurityConfigurerAdapter{

	@Autowired
	DataSource datasource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.jdbcAuthentication()  //take jdbc while building spring project
		.dataSource(datasource); //config database by datasource
		//here we dnt need to create class for database in java  
		
		
		/*.usersByUsernameQuery("select username,password,enabled"  //use this we have different schema we can run it like this
				+"from users "
				+"where username = ? ")
		.authoritiesByUsernameQuery("select username , authority "
				+"from users"
				+"where username = ?");*/
		/*.withDefaultSchema() //from h2 database directly
		.withUser(
				User.withUsername("user")
				.password("user")
				.roles("USER")
				)
		.withUser(
				User.withUsername("admin")
				.password("admin")
				.roles("ADMIN")
				);*/
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasAnyRole("USER" ,"ADMIN")
		.antMatchers("/").permitAll()
		.and().formLogin();
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		
		return NoOpPasswordEncoder.getInstance();
		
	}
	

	
}
