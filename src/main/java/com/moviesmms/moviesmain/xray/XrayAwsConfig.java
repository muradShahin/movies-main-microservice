package com.moviesmms.moviesmain.xray;

import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.xray.javax.servlet.AWSXRayServletFilter;

@Configuration
public class XrayAwsConfig {

	
	@Bean
	public Filter xrayFilter() {
		
		return new AWSXRayServletFilter("movies-main");
	}
	
}
