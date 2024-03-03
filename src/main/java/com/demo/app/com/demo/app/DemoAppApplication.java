package com.demo.app.com.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class DemoAppApplication extends SpringBootServletInitializer {



	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DemoAppApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication sa = new SpringApplication(DemoAppApplication.class);
		sa.setLogStartupInfo(false);
		sa.run(args);
	}

}
