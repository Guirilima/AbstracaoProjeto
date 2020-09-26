package com.copiarAula.copiarAula.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity //Dizendo ao Spring que essa classe é uma entidade
@Table(name = "USUARIO_TIPO")
public class UsuarioTipoEntity {

    @Id //SINALIZANDO QUE SERÁ NO ID NO BD
    @Column(name = "ID_TIPO_USU",nullable = false)
    private BigInteger idTipoUsuario;

    @Column(name = "DESC_TIPO_USU",length = 50,nullable = false)
    private String descricaoTipoUsuario;

}
