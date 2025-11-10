package com.geardn.geardn.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student frank = new Student(
                    "Frank",
                    "frank@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 20)
            );

            Student tracy = new Student(
                    "Tracy",
                    "tracy@gmail.com",
                    LocalDate.of(2007, Month.JANUARY, 20)
            );

            repository.saveAll(List.of(frank, tracy));
        };
    }
}
