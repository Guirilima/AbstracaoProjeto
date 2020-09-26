package com.copiarAula.copiarAula.model.repository;

import com.copiarAula.copiarAula.model.entity.PersonagemEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface PersonagemRepository extends CrudRepository<PersonagemEntity, BigInteger> {

    @Query("select distinct  p.classePersonagem from PersonagemEntity p ")
    public Iterable<String> listaDeClassesDistinct();

    @Query("select distinct p.racaPersonagem from PersonagemEntity p ")
    public Iterable<String> listaDeRacasDistinct();
}
