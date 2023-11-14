package com.avanade.service;

import reactor.core.publisher.Mono;
import com.avanade.model.Student;

public interface StudentService {
    public Mono<Student> getStudent(int id);
}
