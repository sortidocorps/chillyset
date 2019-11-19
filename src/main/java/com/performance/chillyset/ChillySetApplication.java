package com.performance.chillyset;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableJpaRepositories("com.performance.chillyset.repository")
@EntityScan("com.performance.chillyset.model")
@SpringBootApplication
@EnableSwagger2
public class ChillySetApplication {



	public static void main(String[] args) {
		SpringApplication.run(ChillySetApplication.class, args);


	}

	@Bean
    public Module hibernate5Module() {
        Hibernate5Module hnetModule = new Hibernate5Module();
        hnetModule.disable(Hibernate5Module.Feature.USE_TRANSIENT_ANNOTATION);
        return hnetModule;
    }



}
