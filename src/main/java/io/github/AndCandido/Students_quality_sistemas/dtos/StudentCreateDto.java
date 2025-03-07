package io.github.AndCandido.Students_quality_sistemas.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public record StudentCreateDto(
    @NotBlank(message = "{field.name.notBlank}")
    String name,

    @NotBlank(message = "{field.email.notBlank}")
    @Email(message = "{field.email.invalid}")
    String email,

    String phoneNumber,
    String cellPhoneNumber,

    @Pattern(regexp = "([0-9]{3}[.]?[0-9]{3}[.]?[0-9]{3}-[0-9]{2})|([0-9]{11})", message = "{field.cpf.invalid}")
    String cpf,

    LocalDate birthDate
) {
}
