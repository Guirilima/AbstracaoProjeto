package com.copiarAula.copiarAula.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity //Dizendo ao Spring que essa classe é uma entidade
@Table(name = "ESTADO")
public class EstadoEntity {

    @Id //SINALIZANDO QUE SERÁ NO ID NO BD
    @Column(name = "CD_ESTADO_EST",nullable = false)
    private String codigoEstado;

    @Column(name = "DS_ESTADO_EST",nullable = false)
    private String descricaoEstado;

    @Column(name = "DS_CAPITAL_EST",nullable = false)
    private String descricaoCapital;
}
