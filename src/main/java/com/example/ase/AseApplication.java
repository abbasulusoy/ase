package com.example.ase;

import com.example.book.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.example.*")
@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {BookRepository.class,Repository.class})
@EntityScan("com.example.*")
public class AseApplication {

	public static void main(String[] args) {
		SpringApplication.run(AseApplication.class, args);
	}

}
