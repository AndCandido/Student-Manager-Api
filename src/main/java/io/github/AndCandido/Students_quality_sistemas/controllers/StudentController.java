package io.github.AndCandido.Students_quality_sistemas.controllers;

import io.github.AndCandido.Students_quality_sistemas.dtos.StudentCreateDto;
import io.github.AndCandido.Students_quality_sistemas.dtos.StudentDto;
import io.github.AndCandido.Students_quality_sistemas.services.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<Void> saveStudent(@RequestBody @Valid StudentCreateDto studentToSave, URI uri) {
        this.studentService.saveStudent(studentToSave);
        return ResponseEntity.created(uri).build();
    }

    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        var studentsList = this.studentService.getAllStudents();
        return ResponseEntity.ok(studentsList);
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> updateStudentById(@RequestBody @Valid StudentCreateDto studentToUpdate, @PathVariable UUID id, URI uri) {
        this.studentService.updateStudentById(studentToUpdate, id);
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteStudentById(@PathVariable UUID id) {
        this.studentService.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }
}
