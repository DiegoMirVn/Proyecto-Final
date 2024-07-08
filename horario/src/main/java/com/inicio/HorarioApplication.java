package com.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.proyectoFinal.model")
@EnableJpaRepositories(basePackages = "com.proyectoFinal.dao")
@SpringBootApplication(scanBasePackages = { "com.proyectoFinal.service", "com.proyectoFinal.controller" })
public class HorarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(HorarioApplication.class, args);
	}

}
