package com.senai.infob.atividade_api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infob.atividade_api.Models.Login;
import com.senai.infob.atividade_api.Services.LoginService;



@RestController
@RequestMapping("/login")
public class LoginController {
    
    @Autowired
    public LoginService loginService ;

    @GetMapping("/count")
    public Long count() {
        return loginService.count();
    }
    
    @PostMapping("/salvar")
    public Login salvar(@RequestBody Login login) { 
        return loginService.salvar(login);
    }
    
    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer id){
        boolean deletou = loginService.deletar(id);
        if (deletou) {
            return "login deletado com sucesso";
        }
        return "login nao encontrado";
    }

    @GetMapping("/buscar/{id}")
    public Login buscar(@PathVariable Integer id){
        return loginService.buscar(id);
    }

    @GetMapping("/listar")
    public List<Login> getMethodName(){
        return loginService.listar();
    }

    @PutMapping("/atualizar/{id}")
    public String atualizar(@PathVariable Integer id, @RequestBody Login login) {
        boolean atualizou = loginService.atualizarBoolean(login, id);
        if (atualizou) {
            return "login atualizado com sucesso";
        }
        return "login nao encontrado";
    }
}