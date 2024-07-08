/* @Carolina Bernal (C4r0l1n43ern4l) - Challenge_FORO_HUB_Backend - Spring Boot 3 - G6 - ONE */
package com.alurachallenge.apiforohub.domain.topico;

import com.alurachallenge.apiforohub.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fecha;
    @Enumerated(EnumType.STRING)
    private Estado status;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "autor_id")
    private Usuario autor;
    private String curso;


    public Topico(DatosRegistroTopico datosRegistroTopico, Usuario usuario) {
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.fecha = LocalDateTime.now();
        this.status = datosRegistroTopico.status();
        this.autor = usuario;
        this.curso = datosRegistroTopico.curso();
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.titulo() != null){
            this.titulo = datosActualizarTopico.titulo();
        }

        if (datosActualizarTopico.mensaje() != null){
            this.mensaje = datosActualizarTopico.mensaje();
        }

        if (datosActualizarTopico.curso() != null){
            this.curso = datosActualizarTopico.curso();
        }

    }

}
