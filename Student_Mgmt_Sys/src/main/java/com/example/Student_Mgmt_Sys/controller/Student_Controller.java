package com.example.Student_Mgmt_Sys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Student_Mgmt_Sys.entity.Student_entity;
import com.example.Student_Mgmt_Sys.service.Student_Service;


@RestController

public class Student_Controller {
	@Autowired
    private Student_Service studentService;

    @GetMapping("/studentinfo")
    public List<Student_entity> getAllStudents() {
    	List<Student_entity> stuntdata = studentService.getAllStudents();
    	return stuntdata;
        
    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
//        Optional<Student> student = studentService.getStudentById(id);
//        return student.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
//                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
    @PostMapping("/addstudent")
    public ResponseEntity<Student_entity> saveStudent(@RequestBody Student_entity student) {
        Student_entity savedStudent = studentService.saveStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteStudentById(@PathVariable Long id) {
//        studentService.deleteStudentById(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
}
