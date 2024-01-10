package com.example.mapping.service.impl;

import com.example.mapping.dto.AddressDto;
import com.example.mapping.dto.StudentDto;
import com.example.mapping.entity.Address;
import com.example.mapping.entity.Student;
import com.example.mapping.exception.RecordExistException;
import com.example.mapping.repository.StudentRepo;
import com.example.mapping.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    @Transactional
    public Student saveStudent(StudentDto studentDto) throws Exception {
        try {
            if(studentRepo.existsByName(studentDto.getName())){
                 throw new RecordExistException("This name already taken");
            }
            else {

                AddressDto addressDto = studentDto.getAddressDto();

                Address address = Address.builder()
                        .addressId(addressDto.getAddressId())
                        .address(addressDto.getAddress())
                        .build();

                Student student = Student.builder()
                        .studentId(studentDto.getStudentId())
                        .name(studentDto.getName())
                        .age(studentDto.getAge())
                        .address(address)
                        .build();

               return studentRepo.save(student);
            }

        }
        catch (Exception e){
              throw new Exception(e);
        }


    }
}
