package com.sistema.flashcards.sistema_flashcards;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.flashcards")
@EnableMongoRepositories(basePackages = "com.flashcards.repository")
public class SistemaFlashcardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaFlashcardsApplication.class, args);
	}

}
