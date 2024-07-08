package com.alurachallenge.apiforohub.domain.usuario;

public record DatosRespuestaUsuario(
        Long id,
        String nombre,
        String correo,
        String username,
        String contrasena,
        String perfil) {
}
