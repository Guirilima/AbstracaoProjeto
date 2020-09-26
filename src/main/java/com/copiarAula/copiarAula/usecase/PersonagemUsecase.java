package com.copiarAula.copiarAula.usecase;

import com.copiarAula.copiarAula.model.entity.PersonagemEntity;
import org.springframework.stereotype.Service;

@Service
public interface PersonagemUsecase {

    public Iterable<String> listarRacaPersonagem();

    Iterable<String> listarClassePersonagem();
}
