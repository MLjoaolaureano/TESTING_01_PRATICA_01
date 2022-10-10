package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter @Setter
public class SubjectDTO {
    @Size(max=30, message="O comprimento do nome não pode exceder 30 caracteres.")
    @NotEmpty(message="O nome do assunto não pode ficar vazio.")
    @Pattern(regexp = "\\b([A-ZÀ-Ú][a-zà-ú]*\\s?)*\\b", message="O nome do assunto deve começar com letra maiúscula.")
    String name;

    @NotNull(message="A nota não pode estar vazia.")
            @Max(value=10, message="A nota máxima é 10,0.")
            @Min(value=0, message="A nota mínima é 0,0.")
    Double score;
}
