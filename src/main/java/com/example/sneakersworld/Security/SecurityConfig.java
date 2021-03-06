//package com.example.sneakersworld.Security;
//
//
//import com.example.sneakersworld.model.Role;
//import org.springframework.context.annotation.Bean;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.stereotype.Controller;
//
//@Controller
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/","/news/**","/history/**","/images/**").permitAll()
//                .antMatchers(HttpMethod.POST,"/addNews").hasRole(Role.ADMIN.name())
//                .antMatchers(HttpMethod.GET,"/addNews").hasRole(Role.ADMIN.name())
//                .anyRequest()
//                .authenticated()
//                .and()
//                .formLogin();
//    }
//    @Bean
//    @Override
//    protected UserDetailsService userDetailsService() {
//        return new InMemoryUserDetailsManager(
//
//                User.builder()
//                        .username("admin")
//                        .password(passwordEncoder().encode("12$Admin09"))
//                        .roles(Role.ADMIN.name())
//                        .build(),
//                User.builder()
//                        .username("user")
//                        .password(passwordEncoder().encode("user"))
//                        .roles(Role.USER.name())
//                        .build()
//        );
//    }
//    @Bean
//    protected PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder(12);
//    }
//}
//
