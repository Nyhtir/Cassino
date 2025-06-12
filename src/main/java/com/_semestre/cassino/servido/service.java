package com._semestre.cassino.servido;

import com._semestre.cassino.usuario.UsuarioCassino;
import com._semestre.cassino.repositorio.repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class service {

    private final repository repository;

    public service(repository repository) {
        this.repository = repository;
    }

    public List<UsuarioCassino> listarTodos() {
        return repository.findAll();
    }

    public Optional<UsuarioCassino> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public UsuarioCassino salvar(UsuarioCassino usuario) {
        return repository.save(usuario);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
