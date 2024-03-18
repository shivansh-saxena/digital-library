package org.shiv.digitallibrary.repository;

import org.shiv.digitallibrary.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
