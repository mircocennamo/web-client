package com.avanade.service;

import com.avanade.controller.SenderController;
import com.avanade.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @author mirco.cennamo on 27/10/2023
 * @project spring-boot-rest-jpa
 */
@Service
public class StudentServiceImpl implements StudentService{

    private final WebClient webClient;
    Logger logger = LoggerFactory.getLogger(SenderController.class);


    public StudentServiceImpl(@Value("${content-service}") String baseURL) {
        this.webClient = WebClient.builder().baseUrl(baseURL)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE)
                .build();
    }

    @Override
    public Mono<Student> getStudent(int id) {
        logger.debug("StudentServiceImpl called receiver getStudent with id {} " , id);
        return webClient.get().uri("/receiver/{id}", id).retrieve().bodyToMono(Student.class);
    }
}
