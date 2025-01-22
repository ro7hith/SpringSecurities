//package com.SecurityDemo.demoSecurity.Config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//@Configuration
//public class AppConfig {
//
//	@Bean
//	public UserDetailsService userDetailsService()
//	{
//		UserDetails userAdmin=User.builder()
//				.username("microsoft")
//				.password(passwordEncoder().encode("Admin#123"))
//				.roles("ADMIN").build();
//		UserDetails user=User.builder()
//				.username("oracle")
//				.password(passwordEncoder().encode("Admin#123"))
//				.roles("USER").build();
//
//		return new InMemoryUserDetailsManager(userAdmin,user);
//	}
//	@Bean
//	public PasswordEncoder passwordEncoder()
//	{
//		return new BCryptPasswordEncoder();
//	}
//	
//}
