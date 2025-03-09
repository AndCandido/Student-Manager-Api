package io.github.AndCandido.Students_quality_sistemas.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public record StudentCreateDto(
    @NotBlank(message = "{field.name.notBlank}")
    String name,

    @NotBlank(message = "{field.email.notBlank}")
    @Email(message = "{field.email.invalid}")
    String email,

    String phoneNumber,
    String cellPhoneNumber,

    @CPF(message = "{field.cpf.invalid}")
    String cpf,

    @Past(message = "{field.birthDate.past}")
    LocalDate birthDate
) {
}
