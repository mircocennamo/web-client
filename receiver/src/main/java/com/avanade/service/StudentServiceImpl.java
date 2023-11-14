package com.avanade.service;

import com.avanade.controller.ReceiverController;
import com.avanade.exception.StudentNotFoundException;
import com.avanade.model.Student;
import com.avanade.repository.StudentJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mirco.cennamo on 27/10/2023
 * @project spring-boot-rest-jpa
 */
@Service
public class StudentServiceImpl implements StudentService{

    Logger logger = LoggerFactory.getLogger(ReceiverController.class);

   @Autowired
    private  StudentJpaRepository studentJpaRepository;



    @Override
    public Student getStudent(Long id) {
        logger.debug("StudentServiceImpl called getStudentId with id {} " , id);
        return studentJpaRepository.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
    }
}
