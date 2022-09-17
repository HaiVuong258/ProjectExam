 package com.store.startlight_store.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.store.startlight_store.service.UserDetailsServiceImp;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Bean
	public UserDetailsService userDetailsService() {
		return new UserDetailsServiceImp();
	};
	
	// mã hóa mật khẩu
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	};

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				// permitall không cần kiểm tra
				.antMatchers("/", "/contact", "/about","/css/**","/images/**").permitAll()
				// .hasrole phaỉ có quyền ADMIN mới được phép truy cập và đăng nhập
//				.antMatchers("/users/**").access("hasRole('ADMIN')")
				.antMatchers("/users/**").hasRole("ADMIN")
				.antMatchers("/admin/**").hasRole("ADMIN")
				.anyRequest().authenticated()//Những cái URL còn lại đều phải đăng nhập mới được xài
				.and()
				.formLogin()
				.loginPage("/login")
				.defaultSuccessUrl("/user", true)
				.and().logout().permitAll()
				.logoutSuccessUrl("/login");
//				.and().csrf()
//				.disable();
	}
}
