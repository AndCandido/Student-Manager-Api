package io.github.AndCandido.Students_quality_sistemas.services;

import io.github.AndCandido.Students_quality_sistemas.api.exceptions.ResourceNotFoundException;
import io.github.AndCandido.Students_quality_sistemas.dtos.StudentCreateDto;
import io.github.AndCandido.Students_quality_sistemas.dtos.StudentDto;
import io.github.AndCandido.Students_quality_sistemas.entities.Student;
import io.github.AndCandido.Students_quality_sistemas.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public void saveStudent(StudentCreateDto studentToSaveDto) {
        var student = new Student();
        BeanUtils.copyProperties(studentToSaveDto, student);
        this.studentRepository.save(student);
    }

    public List<StudentDto> getAllStudents() {
        return studentRepository
            .findAll().stream()
            .map(StudentDto::new).toList();
    }

    public void updateStudentById(StudentCreateDto studentToUpdateDto, UUID id) {
        var studentFound = getStudentByIdOrThrow(id);
        BeanUtils.copyProperties(studentToUpdateDto, studentFound);
        this.studentRepository.save(studentFound);
    }

    public void deleteStudentById(UUID id) {
        var studentFound = getStudentByIdOrThrow(id);
        this.studentRepository.delete(studentFound);
    }

    public Student getStudentByIdOrThrow(UUID id) {
        return this.studentRepository
            .findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Student not found"));
    }
}
