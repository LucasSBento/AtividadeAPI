package com.senai.infob.atividade_api.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infob.atividade_api.Models.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer>{

    
}