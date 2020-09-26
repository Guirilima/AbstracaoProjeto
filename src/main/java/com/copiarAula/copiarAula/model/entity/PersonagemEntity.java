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
@Table(name = "PERSONAGEM")
public class PersonagemEntity {

    @Id //SINALIZANDO QUE SERÁ NO ID NO BD
    @Column(name = "ID_PERSONAGEM",nullable = false)
    private BigInteger idPersonagem;

    @Column(name = "ID_USUARIO_USU",length = 50,nullable = false)
    private BigInteger idUsuario;

    @Column(name = "NM_PERSONAGEM",nullable = false)
    private String nomePersonagem;

    @Column(name = "NIVEL_PERSONAGEM",nullable = false)
    private String nivelPersonagem;

    @Column(name = "HISTORIA_PERSO")
    private String historiaPersonagem;

    @Column(name = "CLASSE_PERSO",nullable = false)
    private String classePersonagem;

    @Column(name = "GAMEMODE_PERSO")
    private String gameModePersonagem;

    @Column(name = "RACA_PERSONAGEM",nullable = false)
    private String racaPersonagem;

    @Column(name = "RATING_PERSONAGEM")
    private BigInteger ratingPersonagem;

}
