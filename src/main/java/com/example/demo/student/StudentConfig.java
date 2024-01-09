package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) { 
        return args -> { 
            Student jordan = new Student(
				"jordan.neff@gmail.com",
				"jordan",
				LocalDate.of(2000, Month.JANUARY, 1)
			);

            Student lieu = new Student(
				"lieu.neff@gmail.com",
				"lieu",
				LocalDate.of(2000, Month.JANUARY, 2)
			);
            repository.saveAll(
                List.of(jordan, lieu)
            );
        };
    }
}
