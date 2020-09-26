package com.copiarAula.copiarAula.usecase.Impl;

import com.copiarAula.copiarAula.exceptions.ObjectNotFound;
import com.copiarAula.copiarAula.model.entity.UsuarioEntity;
import com.copiarAula.copiarAula.model.repository.UsuarioRepository;
import com.copiarAula.copiarAula.usecase.UsuarioUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioUsecaseImpl implements UsuarioUsecase {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public UsuarioEntity criarNovoUsuario(UsuarioEntity usuarioEntity) {
        if (usuarioEntity == null) return null;
        //if (usuarioEntity.getIdUsuario() != null) return null;

        UsuarioEntity saveNewUser = null;
        try {
            saveNewUser = usuarioRepository.save(usuarioEntity);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return saveNewUser;
    }

    @Override
    public UsuarioEntity editarUsuario(UsuarioEntity usuarioEdite) throws ObjectNotFound {

        Optional.ofNullable(usuarioEdite.getIdUsuario()).orElseThrow( () -> new ObjectNotFound("ID Usuário está nulo."));

        Optional<UsuarioEntity> usuarioRegistro = usuarioRepository.findById(usuarioEdite.getIdUsuario());

        if (!usuarioRegistro.isPresent()) throw new ObjectNotFound("Usuario não encontrado em nossos registros.");

        try {
            usuarioRepository.save(usuarioEdite);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return usuarioEdite;
    }

}
