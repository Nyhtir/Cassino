package com._semestre.cassino.usuario;

import com._semestre.cassino.usuario.UsuarioCassino;
import com._semestre.cassino.servido.service;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class Controller {

    private final service service;

    public Controller(service service) {
        this.service = service;
    }

    @GetMapping
    public List<UsuarioCassino> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioCassino> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UsuarioCassino> criar(@Valid @RequestBody UsuarioCassino usuario) {
        return ResponseEntity.ok(service.salvar(usuario));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioCassino> atualizar(@PathVariable Long id, @Valid @RequestBody UsuarioCassino usuario) {
        return service.buscarPorId(id)
                .map(u -> {
                    usuario.setId(id);
                    return ResponseEntity.ok(service.salvar(usuario));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}