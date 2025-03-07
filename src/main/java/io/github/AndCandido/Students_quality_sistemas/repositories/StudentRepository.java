package io.github.AndCandido.Students_quality_sistemas.repositories;

import io.github.AndCandido.Students_quality_sistemas.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {
}
