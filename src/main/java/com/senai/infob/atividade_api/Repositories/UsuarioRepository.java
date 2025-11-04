package com.senai.infob.atividade_api.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infob.atividade_api.Models.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

    Usuario findByEmail(String email);
    
}