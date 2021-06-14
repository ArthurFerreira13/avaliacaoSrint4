package com.avaliacao.avaliacao.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	// autentica
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
	}
	//configuracoes de autorizacao
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	http.authorizeRequests().antMatchers(HttpMethod.GET,"/*").permitAll()
	.antMatchers(HttpMethod.POST,"/protected/produto").permitAll()
	.antMatchers(HttpMethod.POST,"/protected/pedido").permitAll()
	.anyRequest().authenticated().and().csrf().disable()
	.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	//.and().addFilterBefore(null, null);*/
	}
	//configuracao estatica
	@Override
	public void configure(WebSecurity web) throws Exception {
		
	
	}
}
