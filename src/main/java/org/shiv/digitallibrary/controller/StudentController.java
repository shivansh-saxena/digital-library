package org.shiv.digitallibrary.controller;

import org.shiv.digitallibrary.entity.Student;
import org.shiv.digitallibrary.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping(path = "/addStudent")
    public void addStudent(@RequestBody Student student)
    {
        studentService.save(student);
    }
    @PostMapping(path = "/addStudents")
    public void addStudents(@RequestBody List<Student> studentList)
    {
        studentService.saveAll(studentList);
    }
    @GetMapping(path = "/getStudents")
    public List<Student> getStudents()
    {
        List<Student> studentList =new ArrayList<>();
        studentService
                .findAll()
                .iterator()
                .forEachRemaining(studentList::add);
        return studentList;
    }
    @GetMapping(path = "/getStudent/{student_id}")
    public Optional<Student> getStudent(@PathVariable("student_id") Integer id)
    {
        return studentService.findById(id);
    }
    @PutMapping(path = "/updateStudent")
    public void updateStudent(@RequestBody Student student)
    {
        if(studentService.existsById(student.getId()))
            studentService.save(student);
    }
    @DeleteMapping(path = "/deleteStudent")
    public void deleteStudent(@RequestBody Student student)
    {
        studentService.delete(student);
    }
    @DeleteMapping(path = "/deleteStudentById/{student_id}")
    public void deleteStudentById(@PathVariable("student_id") Integer id)
    {
        studentService.deleteById(id);
    }


}
