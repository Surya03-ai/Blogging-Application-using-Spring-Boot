package com.excelr;

import org.springframework.boot.SpringApplication;

public class TestJavaRealTimeBackendProjectApplication {

	public static void main(String[] args) {
		SpringApplication.from(JavaRealTimeBackendProjectApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
