package com.avanade.controller;

import com.avanade.model.Student;
import com.avanade.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receiver")
public class ReceiverController {

    Logger logger = LoggerFactory.getLogger(ReceiverController.class);
    
   @Autowired
    private StudentService studentService;
    
   @GetMapping("/{id}")
    public Student getStudentId(@PathVariable Long id) {

       logger.debug("called getStudentId with id {} " , id);
       return studentService.getStudent(id);
    }
}
