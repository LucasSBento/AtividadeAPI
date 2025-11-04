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

import com.senai.infob.atividade_api.Models.Cadastro;
import com.senai.infob.atividade_api.Services.CadastroService;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    public CadastroService cadastroService;

    @GetMapping("/count")
    public Long count() {
        return cadastroService.count();
    }

    @PostMapping("/salvar")
    public Cadastro salvar(@RequestBody Cadastro cadastro) { 
        return cadastroService.salvar(cadastro);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer id){
        boolean deletou = cadastroService.deletar(id);
        if (deletou) {
            return "cadastro deletado com sucesso";
        }
        return "cadastro nao encontrado";
    }

    @GetMapping("/buscar/{id}")
    public Cadastro buscar(@PathVariable Integer id){
        return cadastroService.buscar(id);
    }

    @GetMapping("/listar")
    public List<Cadastro> getMethodName(){
        return cadastroService.listar();
    }

    @PutMapping("/atualizar/{id}")
    public String atualizar(@PathVariable Integer id, @RequestBody Cadastro cadastro) {
        boolean atualizou = cadastroService.atualizarBoolean(cadastro, id);
        if (atualizou) {
            return "cadastro atualizado com sucesso";
        }
        return "cadastro nao encontrado";
    }
}