package com.avanade.service;


import com.avanade.model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="receiver")
public interface StudentService {
    @GetMapping("/student/{id}")
    Student getStudentId(@PathVariable Integer id);
}
