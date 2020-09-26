package com.copiarAula.copiarAula.usecase.Impl;

import com.copiarAula.copiarAula.model.entity.EstadoEntity;
import com.copiarAula.copiarAula.model.repository.EstadoRepository;
import com.copiarAula.copiarAula.usecase.EstadoUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EstadoUsecaseImpl implements EstadoUsecase {

    @Autowired
    EstadoRepository estadoRepository;

    @Override
    public Iterable<EstadoEntity> listarEstados() {

        return estadoRepository.findAll();
    }
}
