package com.xiaoseller.shop.config;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
	
	@Bean
    public FilterRegistrationBean indexFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new Filter() {
			
			
			@Override
			public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
				request.setCharacterEncoding("UTF-8");
				response.setCharacterEncoding("UTF-8");
				chain.doFilter(request, response);
			}
			
			@Override
			public void destroy() {
			}

			@Override
			public void init(javax.servlet.FilterConfig arg0) throws ServletException {
				
			}
		});
        registration.addUrlPatterns("/*");
        return registration;
    }
}
