/* @Carolina Bernal (C4r0l1n43ern4l) - Challenge_FORO_HUB_Backend - Spring Boot 3 - G6 - ONE */
package com.alurachallenge.apiforohub.domain.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Table(name = "usuarios")
@Entity(name = "Usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column(unique = true)
    private String correo;
    private String username;
    private String contrasena;
    @Enumerated(EnumType.STRING)
    private Perfil perfil;
    private Boolean activo;

    public Usuario(DatosRegistroUsuario datosRegistroUsuario) {
        this.nombre = datosRegistroUsuario.nombre();
        this.correo = datosRegistroUsuario.correo();
        this.username = datosRegistroUsuario.username();
        this.contrasena  = datosRegistroUsuario.contrasena();
        this.perfil = datosRegistroUsuario.perfil();
        this.activo = true;
    }


    public void actualizarDatos(DatosActualizarUsuario datosActualizarUsuario) {
        if (datosActualizarUsuario.nombre() != null){
            this.nombre = datosActualizarUsuario.nombre();
        }

        if (datosActualizarUsuario.correo() != null){
            this.correo = datosActualizarUsuario.correo();
        }

        if (datosActualizarUsuario.contrasena() != null){
            this.contrasena  = datosActualizarUsuario.contrasena();
        }
    }

    public void desactivarUsuario() {
        this.activo = false;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return contrasena;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
