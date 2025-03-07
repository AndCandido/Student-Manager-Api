package io.github.AndCandido.Students_quality_sistemas.dtos;

import io.github.AndCandido.Students_quality_sistemas.entities.Student;

import java.time.LocalDate;
import java.util.UUID;

public record StudentDto(
    UUID id,
    String name,
    String email,
    String phoneNumber,
    String cellPhoneNumber,
    String cpf,
    LocalDate birthDate
) {
    public StudentDto(Student student) {
        this(
            student.getId(),
            student.getName(),
            student.getEmail(),
            student.getPhoneNumber(),
            student.getCellPhoneNumber(),
            student.getCpf(),
            student.getBirthDate()
        );
    }
}
