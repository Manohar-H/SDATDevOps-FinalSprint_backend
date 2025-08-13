package com.sdat.aviation;

import org.springframework.boot.SpringApplication;

public class TestAviationApplication {

	public static void main(String[] args) {
		SpringApplication.from(AviationApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
