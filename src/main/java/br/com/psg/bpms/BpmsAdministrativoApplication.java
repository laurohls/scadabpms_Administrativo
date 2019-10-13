package br.com.psg.bpms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {
        "br.com.psg.bpms.model"
        })
@EnableJpaRepositories(basePackages = {
        "br.com.psg.bpms.repository"
        })
public class BpmsAdministrativoApplication {
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(BpmsAdministrativoApplication.class, args);
	}

}
