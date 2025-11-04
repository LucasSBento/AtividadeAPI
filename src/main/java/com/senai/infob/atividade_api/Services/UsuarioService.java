package com.senai.infob.atividade_api.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.atividade_api.Models.Usuario;
import com.senai.infob.atividade_api.Repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    public UsuarioRepository usuarioRepository;

    public Long count() {
        return usuarioRepository.count();
    }

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario login(Usuario usuario) {
        Usuario u = usuarioRepository.findByEmail(usuario.getEmail());
        if (u != null && u.getSenha().equals(usuario.getSenha())) {
            return u;
        }
        return null;
    }

    public boolean deletar(Integer id) {
        Usuario usuario = usuarioRepository.findById(id).get();
        if (usuario != null) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Usuario buscar(Integer id) {
        return usuarioRepository.findById(id).get();
    }

    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    public Usuario atualizar(Usuario usuario, Integer id) {
        Usuario e = buscar(id);
        if (e != null) {
            usuario.setId(id);
            return usuarioRepository.save(usuario);
        }
        return null;
    }

    public Boolean atualizarBoolean(Usuario usuario, Integer id) {
        if (usuarioRepository.existsById(id)) {
            usuario.setId(id);
            usuarioRepository.save(usuario);
            return true;
        }
        return false;
    }
}
