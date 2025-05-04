package com.rnyd.rnyd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@EntityScan(basePackages = "com.rnyd.rnyd.model")
@SpringBootApplication(scanBasePackages = "com.rnyd.rnyd")

public class RnydApplication {
	public static void main(String[] args) {
		SpringApplication.run(RnydApplication.class, args);

	}

}
