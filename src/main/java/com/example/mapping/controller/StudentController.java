package com.example.mapping.controller;

import com.example.mapping.dto.StudentDto;
import com.example.mapping.entity.Student;
import com.example.mapping.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/save")
    public Student saveStudent(@RequestBody StudentDto studentDto) throws Exception {
        return studentService.saveStudent(studentDto);
    }

}
