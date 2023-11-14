package com.avanade.controller;


import com.avanade.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/webclient")
public class SenderController {

    Logger logger = LoggerFactory.getLogger(SenderController.class);
    
    private StudentService studentService;
    
    SenderController(StudentService studentService) {
        this.studentService = studentService;
    }
    
    @GetMapping("/{id}")
    public Mono<com.avanade.model.Student> getStudentId(@PathVariable int id) {
        logger.debug("SenderController called getStudentId with id {} " , id);
        return studentService.getStudent(id);
    }
}
