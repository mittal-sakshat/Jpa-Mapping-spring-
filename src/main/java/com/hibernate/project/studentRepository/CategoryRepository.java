package com.hibernate.project.studentRepository;

import com.hibernate.project.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Categories,Integer> {
}
