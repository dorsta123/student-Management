package com.sahil.stud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sahil.stud.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
