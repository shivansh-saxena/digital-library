package org.shiv.digitallibrary.service;

import org.shiv.digitallibrary.entity.Student;
import org.shiv.digitallibrary.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public <S extends Student> S save(S entity) {
        return studentRepository.save(entity);
    }

    public <S extends Student> Iterable<S> saveAll(Iterable<S> entities) {
        return studentRepository.saveAll(entities);
    }

    public Optional<Student> findById(Integer integer) {
        return studentRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return studentRepository.existsById(integer);
    }

    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }

    public Iterable<Student> findAllById(Iterable<Integer> integers) {
        return studentRepository.findAllById(integers);
    }

    public long count() {
        return studentRepository.count();
    }

    public void deleteById(Integer integer) {
        studentRepository.deleteById(integer);
    }

    public void delete(Student entity) {
        studentRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        studentRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Student> entities) {
        studentRepository.deleteAll(entities);
    }

    public void deleteAll() {
        studentRepository.deleteAll();
    }
}
