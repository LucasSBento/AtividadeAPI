package com.senai.infob.atividade_api.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infob.atividade_api.Models.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Integer>{

    
}