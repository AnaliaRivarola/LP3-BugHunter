/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp3.grupal.BugHunter2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig{
    
    @Bean
        public UserDetailsService User(){
        
        var user = User.withUsername("user")
                .password("user")
                .roles("USER")
                .build();
        
        return new InMemoryUserDetailsManager(user);
    }
    
    public UserDetailsService Admin(){
        
        var admin = User.withUsername("admin")
                .password("admin")
                .roles("ADMIN")
                .build();
        
        return new InMemoryUserDetailsManager(admin);
    }
   

    
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance(); //No apto para produccion
    }
    
}