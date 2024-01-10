package com.example.mapping.dto;

import com.example.mapping.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AddressDto {
    private int addressId;
    private String address;
    private StudentDto studentDto;
}
