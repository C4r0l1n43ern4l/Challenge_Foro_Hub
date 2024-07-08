/* @Carolina Bernal (C4r0l1n43ern4l) - Challenge_FORO_HUB_Backend - Spring Boot 3 - G6 - ONE */
package com.alurachallenge.apiforohub.domain.topico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {

    boolean existsByTituloIgnoreCase(String titulo);
    boolean existsByMensajeIgnoreCase(String mensaje);
}
