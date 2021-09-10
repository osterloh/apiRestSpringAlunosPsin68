package br.com.senai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class LogisticaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogisticaApplication.class, args);
	}

}
