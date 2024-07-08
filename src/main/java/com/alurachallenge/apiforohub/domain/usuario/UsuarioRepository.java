/* @Carolina Bernal (C4r0l1n43ern4l) - Challenge_FORO_HUB_Backend - Spring Boot 3 - G6 - ONE */
package com.alurachallenge.apiforohub.domain.usuario;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Page<Usuario> findByActivoTrue(Pageable paginacion);

    UserDetails findByUsername(String username);
}
