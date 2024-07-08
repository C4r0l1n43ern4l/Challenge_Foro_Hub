package com.alurachallenge.apiforohub.domain.usuario;

public record DatosListadoUsuarios(
        Long id,
        String nombre,
        String correo,
        String contrasena,
        Perfil perfil) {

    public DatosListadoUsuarios(Usuario usuario){
        this(usuario.getId(), usuario.getNombre(), usuario.getCorreo(), usuario.getContrasena(), usuario.getPerfil());
    }
}
