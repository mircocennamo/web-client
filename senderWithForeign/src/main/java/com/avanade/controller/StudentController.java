package com.avanade.controller;


import com.avanade.model.Student;
import com.avanade.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    Logger logger = LoggerFactory.getLogger(StudentController.class);
    
    private StudentService studentService;
    
    StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    
    @GetMapping("/{id}")
    public Student getStudentId(@PathVariable int id) {
        logger.debug("SenderController called getStudentId with id {} " , id);
        return studentService.getStudentId(id);
    }
}
