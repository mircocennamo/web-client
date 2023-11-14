package com.avanade.model;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Student {


    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String passportNumber;

    public Student(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }
}
