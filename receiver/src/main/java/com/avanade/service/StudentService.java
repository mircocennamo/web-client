package com.avanade.service;

import com.avanade.model.Student;
import reactor.core.publisher.Mono;

public interface StudentService {
    public Student getStudent(Long id);
}
