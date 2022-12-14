package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Getter @Setter
public class StudentDTO {

    @Size(max=50, message="O comprimento do nome não pode exceder 50 caracteres.")
    @NotEmpty(message="O nome do aluno não pode ficar vazio.")
    @Pattern(regexp = "\\b([A-ZÀ-Ú][a-zà-ú]*\\s?)*\\b", message="O nome do aluno deve começar com letra maiúscula.")
    String studentName;
    String message;
    Double averageScore;

    @NotEmpty(message="A lista não pode estar vazia.")
    List<@Valid SubjectDTO> subjects;

}
