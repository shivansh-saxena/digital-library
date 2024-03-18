package org.shiv.digitallibrary.controller;

import org.shiv.digitallibrary.entity.Student;
import org.shiv.digitallibrary.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping(path = "/addStudent")
    public <S extends Student> S save(@RequestBody S entity) {
        return studentService.save(entity);
    }
    @PostMapping(path = "/addAllStudent")
    public <S extends Student> Iterable<S> saveAll(Iterable<S> entities) {
        return studentService.saveAll(entities);
    }
    @GetMapping(path = "/getStudent")
    public Optional<Student> findById(Integer integer) {
        return studentService.findById(integer);
    }
    @GetMapping(path = "/studentExist/{student_id}")
    public boolean existsById(@PathVariable("student_id") Integer integer) {
        return studentService.existsById(integer);
    }
    @GetMapping(path = "/getStudents")
    public Iterable<Student> findAll() {
        return studentService.findAll();
    }

    public Iterable<Student> findAllById(Iterable<Integer> integers) {
        return studentService.findAllById(integers);
    }

    public long count() {
        return studentService.count();
    }

    public void deleteById(Integer integer) {
        studentService.deleteById(integer);
    }

    public void delete(Student entity) {
        studentService.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        studentService.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Student> entities) {
        studentService.deleteAll(entities);
    }

    public void deleteAll() {
        studentService.deleteAll();
    }
}
