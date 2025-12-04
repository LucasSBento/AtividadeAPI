package com.senai.infob.atividade_api.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="endereco")
public class Endereco {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @Column(name="logradouro")
    private String cidade;

    @Column(name="localidade")
    private String localidade;

    @Column(name="cep")
    private int cep;

    @Column(name="numero")
    private int numero;

    @Column(name="complemento")
    private String complemento;

    @Column(name="bairro")
    private String bairro;

    @Column(name="referencia")
    private String referencia;

    @ManyToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

    public Endereco() {
    }

    public Endereco(Integer id, String cidade, String localidade, int cep, int numero, String complemento, String bairro,
            String referencia, Usuario usuario) {
        this.id = id;
        this.cidade = cidade;
        this.localidade = localidade;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.referencia = referencia;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getlocalidade() {
        return localidade;
    }

    public void setlocalidade(String localidade) {
        this.localidade = localidade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    

}