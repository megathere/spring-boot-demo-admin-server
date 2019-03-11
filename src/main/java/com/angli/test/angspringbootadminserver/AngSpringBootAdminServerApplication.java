package com.angli.test.angspringbootadminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AngSpringBootAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngSpringBootAdminServerApplication.class, args);
	}

}
