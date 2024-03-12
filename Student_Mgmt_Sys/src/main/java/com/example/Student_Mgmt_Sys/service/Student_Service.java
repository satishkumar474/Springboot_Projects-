package com.example.Student_Mgmt_Sys.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Student_Mgmt_Sys.entity.Student_entity;
import com.example.Student_Mgmt_Sys.reporsitory.StudentRepositor;

@Service
public class Student_Service {
	@Autowired
    private StudentRepositor studentRepository;
	
	public List<Student_entity> getAllStudents () {
		List<Student_entity> info = studentRepository.findAll();
		return info;
	 		}
	public Optional<Student_entity> getStudentById(Long id) {
	        return studentRepository.findById(id);
	    	}

	public Student_entity saveStudent(Student_entity student) {
	        return studentRepository.save(student);
	    	}

	public void deleteStudentById(Long id) {
	        studentRepository.deleteById(id);
	    	}
//	public List<Student_entity> getAllStudentsByRollno () {
//        return studentRepository.findAll();
// 		}
}
