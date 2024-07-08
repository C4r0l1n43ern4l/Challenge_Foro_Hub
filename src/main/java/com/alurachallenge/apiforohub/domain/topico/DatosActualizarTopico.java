package com.alurachallenge.apiforohub.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        String titulo,
        String mensaje,
        String curso) {
}
