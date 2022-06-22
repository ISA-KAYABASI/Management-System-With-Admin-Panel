package com.example.aminpanelproject;

import com.example.aminpanelproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AminPanelProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(AminPanelProjectApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;



}
