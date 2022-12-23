package com.example.springboot.springboot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Course {
    private long id;
    private String name;
    private String author;
}
