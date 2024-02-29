package com.avanade.service;

import com.avanade.controller.StudentController;
import com.avanade.model.Student;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author mirco.cennamo on 27/10/2023
 * @project spring-boot-rest-jpa
 */
@Service
public class StudentServiceImpl implements StudentService{

   @Autowired
   RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    private static final String URI = "/receiver/";
    Logger logger = LoggerFactory.getLogger(StudentController.class);



    @Override
    public Student getStudent(int id) {
        logger.debug("StudentServiceImpl called receiver getStudent with id {} " , id);
        String receiverUrl = discoveryClient.getInstances("receiver").get(0).getUri().toString();
        ResponseEntity<Student> response = restTemplate.getForEntity(receiverUrl + URI +id, Student.class);
        return response.getBody();
      }



}
