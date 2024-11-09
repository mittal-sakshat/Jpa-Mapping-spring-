package com.hibernate.project.studentRepository;

import com.hibernate.project.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
