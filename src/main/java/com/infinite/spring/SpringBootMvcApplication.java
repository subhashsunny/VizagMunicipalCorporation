package com.infinite.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching(proxyTargetClass = true)

public class SpringBootMvcApplication {

		public static void main(String[] args) {
			SpringApplication.run(SpringBootMvcApplication.class, args);
		}
}
