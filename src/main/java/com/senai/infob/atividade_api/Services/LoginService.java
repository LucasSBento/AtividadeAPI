package com.senai.infob.atividade_api.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.atividade_api.Models.Login;
import com.senai.infob.atividade_api.Repositories.LoginRepository;

@Service
public class LoginService {
    
    @Autowired
    public LoginRepository loginRepository;

    public Long count(){
        return loginRepository.count();
    }

    public Login salvar(Login login){
        return loginRepository.save(login);
    }

    public boolean deletar(Integer id){
        Login login = loginRepository.findById(id).get();
        if(login != null){
            loginRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Login buscar(Integer id){
        return loginRepository.findById(id).get();
    }

    public List<Login> listar(){
        return loginRepository.findAll();
    }

    public Login atualizar(Login login, Integer id){
        Login e = buscar(id);
        if (e != null){
            login.setId(id);
            return loginRepository.save(login);
        }
        return null;
    }

    public Boolean atualizarBoolean(Login login, Integer id){
        if (loginRepository.existsById(id)) {
            login.setId(id);
            loginRepository.save(login);
            return true;
        }
        return false;
    }
}
