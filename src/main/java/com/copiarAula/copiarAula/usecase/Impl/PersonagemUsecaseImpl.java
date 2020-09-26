package com.copiarAula.copiarAula.usecase.Impl;

import com.copiarAula.copiarAula.model.entity.PersonagemEntity;
import com.copiarAula.copiarAula.model.repository.PersonagemRepository;
import com.copiarAula.copiarAula.usecase.PersonagemUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonagemUsecaseImpl implements PersonagemUsecase {

    @Autowired
    PersonagemRepository personagemRepository;

    @Override
    public Iterable<String> listarRacaPersonagem() {

        Iterable<String> listaClasses = null;
        try {
             listaClasses = personagemRepository.listaDeRacasDistinct();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listaClasses;
    }

    @Override
    public Iterable<String> listarClassePersonagem() {

        Iterable<String> listaRacas = null ;

        try {
            listaRacas = personagemRepository.listaDeClassesDistinct();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listaRacas;
    }
}
