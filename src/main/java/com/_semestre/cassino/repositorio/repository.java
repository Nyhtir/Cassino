// repository/UsuarioCassinoRepository.java
package com._semestre.cassino.repositorio;

import com._semestre.cassino.usuario.UsuarioCassino;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<UsuarioCassino, Long> {
    // Ex: buscar por e-mail
    UsuarioCassino findByEmail(String email);
}