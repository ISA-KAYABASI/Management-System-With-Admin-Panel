package com.example.aminpanelproject.repository;

import com.example.aminpanelproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}