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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infob.atividade_api.Models.Usuario;
import com.senai.infob.atividade_api.Services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    public UsuarioService usuarioService;

    @GetMapping("/count")
    public Long count() {
        return usuarioService.count();
    }

    @PostMapping("/cadastro")
    public Usuario cadastrar(@RequestBody Usuario usuario, @RequestParam String confirmarSenha) {
        if (!usuario.getSenha().equals(confirmarSenha)) {
            throw new RuntimeException("As senhas não coincidem");
        }
        return usuarioService.salvar(usuario);
    }

    @PostMapping("/login")
    public Usuario login(@RequestParam String email, @RequestParam String senha) {
        Usuario usuario = new Usuario();
        usuario.setEmail(email);
        usuario.setSenha(senha);
        return usuarioService.login(usuario);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer id) {
        boolean deletou = usuarioService.deletar(id);
        if (deletou) {
            return "usuario deletado com sucesso";
        }
        return "usuario nao encontrado";
    }

    @GetMapping("/buscar/{id}")
    public Usuario buscar(@PathVariable Integer id) {
        return usuarioService.buscar(id);
    }

    @GetMapping("/listar")
    public List<Usuario> getMethodName() {
        return usuarioService.listar();
    }

    @PutMapping("/atualizar/{id}")
    public String atualizar(@PathVariable Integer id, @RequestBody Usuario usuario) {
        boolean atualizou = usuarioService.atualizarBoolean(usuario, id);
        if (atualizou) {
            return "usuario atualizado com sucesso";
        }
        return "usuario nao encontrado";
    }
}