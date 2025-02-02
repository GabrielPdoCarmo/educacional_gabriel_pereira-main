package br.com.gabriel_pereira.educational.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import java.util.Date;

public class ProfessorDto {

    private Integer id;

    @JsonProperty("nome")
    @NotBlank(message = "campo nome não pode ser nulo")
    private String nome;

    @NotBlank(message = "campo email não pode ser nulo")
    @Email(message = "o campo precisa ser preenchido com um email")
    private String email;

    @JsonProperty("telefone")
    @NotBlank(message = "campo telefone não pode ser nulo")
    private String telefone;

    @JsonProperty("especialidade")
    @NotBlank(message = "campo especialidade não pode ser nulo")
    private String especialidade;

    public ProfessorDto() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
