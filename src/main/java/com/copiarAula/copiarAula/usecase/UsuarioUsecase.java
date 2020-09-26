package com.copiarAula.copiarAula.usecase;

import com.copiarAula.copiarAula.exceptions.ObjectNotFound;
import com.copiarAula.copiarAula.model.entity.UsuarioEntity;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioUsecase {

    public UsuarioEntity criarNovoUsuario( UsuarioEntity usuarioEntity );

    public UsuarioEntity editarUsuario(UsuarioEntity usuarioEdite) throws ObjectNotFound;
}
