package com.alurachallenge.apiforohub.domain.topico;

import java.time.LocalDateTime;

public record DatosListadoTopicos(
        Long id,
        String titulo,
        String mensaje,
        Estado status,
        Long idAutor,
        String curso,
        LocalDateTime fecha) {

    public DatosListadoTopicos (Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getStatus(), topico.getAutor().getId(),
                topico.getCurso(), topico.getFecha());
    }
}
