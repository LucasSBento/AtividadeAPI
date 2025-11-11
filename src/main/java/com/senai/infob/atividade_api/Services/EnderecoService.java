package com.senai.infob.atividade_api.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.atividade_api.Models.Endereco;
import com.senai.infob.atividade_api.Repositories.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    public EnderecoRepository enderecoRepository;

    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public Endereco buscar(Integer id) {
        return enderecoRepository.findById(id).get();
    }
}

