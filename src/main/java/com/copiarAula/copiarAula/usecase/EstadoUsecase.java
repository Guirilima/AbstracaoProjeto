package com.copiarAula.copiarAula.usecase;

import com.copiarAula.copiarAula.model.entity.EstadoEntity;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface EstadoUsecase {

    public Iterable<EstadoEntity> listarEstados();
}
