package com.management.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

//	@Bean
//	public BCryptPasswordEncoder pwdEnc()
//	{
//		return new BCryptPasswordEncoder();
//	}

	@Bean
	 public SecurityFilterChain security(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((req) -> req
        				.anyRequest().permitAll()
        				);
//                        .requestMatchers("/contact").permitAll()
//                        .anyRequest().authenticated()
//                ).httpBasic(Customizer.withDefaults())
//                .formLogin(Customizer.withDefaults());

        return http.build();
    }
}
