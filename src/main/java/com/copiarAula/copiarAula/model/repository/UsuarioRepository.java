package com.copiarAula.copiarAula.model.repository;

import com.copiarAula.copiarAula.model.entity.UsuarioEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioEntity, BigInteger> {

}
