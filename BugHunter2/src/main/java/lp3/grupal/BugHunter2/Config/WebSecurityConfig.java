/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp3.grupal.BugHunter2.Config;

import lp3.grupal.BugHunter2.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
/**
 *
 * @author YOII
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    @Autowired
    private UsuarioService usuarioService;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
		auth.setUserDetailsService(usuarioService);
		auth.setPasswordEncoder(passwordEncoder());
		return auth;
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
	}
        
        String[] resources = new String[]{
            "/include/**","/css/**","/icons/**","/img/**","/js/**","/layer/**"
        };
        
        @Override
	protected void configure(HttpSecurity http) throws Exception {
            http
                .authorizeRequests()
                    .antMatchers(resources).permitAll()
                    .anyRequest().authenticated()
                    .and()
		.formLogin()
                    .loginPage("/login")
                    .permitAll()
                    .and()
		.logout()
                    .invalidateHttpSession(true)
                    .clearAuthentication(true)
                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                    .logoutSuccessUrl("/login?logout")
                    .permitAll();
	}
}
