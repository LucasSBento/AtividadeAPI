package com.senai.infob.atividade_api.Models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="cadastro")
public class Cadastro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @Column(name="nome_completo")
    private String nomeCompleto;

    @Column(name="email")
    private String email;

    @Column(name="senha")
    private String senha;

    @Column(name="data_nascimento")
    private LocalDate dataNascimento;

    @Column(name="cpf")
    private String cpf;

    @Transient
    private String confirmarSenha;

    public Cadastro() {
    }

    public Cadastro(Integer id, String nomeCompleto, String email, String senha, LocalDate dataNascimento, String cpf,
            String confirmarSenha) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.confirmarSenha = confirmarSenha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }

}
