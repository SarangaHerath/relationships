package com.example.mapping.service;

import com.example.mapping.dto.StudentDto;
import com.example.mapping.entity.Student;

public interface StudentService {
    Student saveStudent(StudentDto studentDto) throws Exception;
}
