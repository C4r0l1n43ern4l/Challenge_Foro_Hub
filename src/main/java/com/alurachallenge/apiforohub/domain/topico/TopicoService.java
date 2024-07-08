/* @Carolina Bernal (C4r0l1n43ern4l) - Challenge_FORO_HUB_Backend - Spring Boot 3 - G6 - ONE */
package com.alurachallenge.apiforohub.domain.topico;

import com.alurachallenge.apiforohub.domain.usuario.UsuarioRepository;
import com.alurachallenge.apiforohub.infra.errores.ValidacionDeIntegridad;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    public DatosRespuestaTopico crearTopico(DatosRegistroTopico datosRegistroTopico){

        if (!usuarioRepository.findById(datosRegistroTopico.idAutor()).isPresent()){
            throw new ValidacionDeIntegridad("El id de usuario no fue encontrado en la Base de Datos");
        }

        var tituloTopico = datosRegistroTopico.titulo();
        if (tituloTopico != null && topicoRepository.existsByTituloIgnoreCase(tituloTopico)){
            throw new ValidacionDeIntegridad(("Existe un tópico con el mismo titulo"));
        }

        var mensajeTopico = datosRegistroTopico.mensaje();
        if (mensajeTopico != null && topicoRepository.existsByMensajeIgnoreCase(mensajeTopico)){
            throw new ValidacionDeIntegridad(("Existe un mensaje igual en la base de datos"));
        }

        var usuario = usuarioRepository.findById(datosRegistroTopico.idAutor()).get();

        var nuevoTopico = new Topico(datosRegistroTopico, usuario);

        topicoRepository.save(nuevoTopico);

        return new DatosRespuestaTopico(nuevoTopico);
    }

    public Topico verificarId (Long id){

        var topicoVerificado = topicoRepository.findById(id);
        if (topicoVerificado.isPresent()){
            var topico = topicoVerificado.get();
            return topico;
        }
        throw new EntityNotFoundException();
    }
}
