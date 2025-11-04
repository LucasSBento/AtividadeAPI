package com.senai.infob.atividade_api.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.atividade_api.Models.Cadastro;
import com.senai.infob.atividade_api.Repositories.CadastroRepository;

@Service
public class CadastroService {

    @Autowired
    public CadastroRepository cadastroRepository;

    public Long count() {
        return cadastroRepository.count();
    }

    public Cadastro salvar(Cadastro cadastro) {
        if (!cadastro.getSenha().equals(cadastro.getConfirmarSenha())) {
            throw new IllegalArgumentException("As senhas não conferem");
        }
        return cadastroRepository.save(cadastro);
    }

    public boolean deletar(Integer id) {
        Cadastro cadastro = cadastroRepository.findById(id).get();
        if (cadastro != null) {
            cadastroRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Cadastro buscar(Integer id) {
        return cadastroRepository.findById(id).get();
    }

    public List<Cadastro> listar() {
        return cadastroRepository.findAll();
    }

    public Cadastro atualizar(Cadastro cadastro, Integer id) {
        Cadastro e = buscar(id);
        if (e != null) {
            cadastro.setId(id);
            return cadastroRepository.save(cadastro);
        }
        return null;
    }

    public Boolean atualizarBoolean(Cadastro cadastro, Integer id) {
        if (cadastroRepository.existsById(id)) {
            cadastro.setId(id);
            cadastroRepository.save(cadastro);
            return true;
        }
        return false;
    }
}
