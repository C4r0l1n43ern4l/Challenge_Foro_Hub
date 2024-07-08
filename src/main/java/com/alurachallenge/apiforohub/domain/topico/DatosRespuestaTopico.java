package com.alurachallenge.apiforohub.domain.topico;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        Estado status,
        Long idAutor,
        String curso,
        LocalDateTime fecha) {

    public DatosRespuestaTopico(Topico nuevoTopico) {
        this(nuevoTopico.getId(), nuevoTopico.getTitulo(), nuevoTopico.getMensaje(), nuevoTopico.getStatus(),
                nuevoTopico.getAutor().getId(), nuevoTopico.getCurso(), nuevoTopico.getFecha());
    }
}
