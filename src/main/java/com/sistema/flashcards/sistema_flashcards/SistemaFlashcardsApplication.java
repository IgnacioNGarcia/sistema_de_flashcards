package com.sistema.flashcards.sistema_flashcards;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages = "com.flashcards")

public class SistemaFlashcardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaFlashcardsApplication.class, args);
	}

}
