package com.copiarAula.copiarAula.controller;

import com.copiarAula.copiarAula.model.entity.PersonagemEntity;
import com.copiarAula.copiarAula.model.entity.UsuarioEntity;
import com.copiarAula.copiarAula.usecase.PersonagemUsecase;
import com.copiarAula.copiarAula.vo.HttpGenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personagem")
public class PersonagemController {

    @Autowired
    PersonagemUsecase personagemUsecase;

    @RequestMapping (value = "/listar-classe-personagem",method = RequestMethod.GET, produces = "application/json") //@GetMapping("criar-novo-usuario")
    public ResponseEntity<HttpGenericResponse> listarClassePersonagem() {
        try {

            Iterable<String> listaClassesPersonagem = personagemUsecase.listarClassePersonagem();

            return new ResponseEntity<HttpGenericResponse>(new HttpGenericResponse().builder()
                    .status("OK")
                    .mensagem("")
                    .response(listaClassesPersonagem).build(), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<HttpGenericResponse>(new HttpGenericResponse().builder()
                    .status("NOK")
                    .mensagem(e.getMessage())
                    .response(null).build(), HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping (value = "/listar-raca-personagem",method = RequestMethod.GET, produces = "application/json") //@GetMapping("criar-novo-usuario")
    public ResponseEntity<HttpGenericResponse> listarRacaPersonagem() {
        try {

            Iterable<String> listaRacaPersonagem = personagemUsecase.listarRacaPersonagem();

            return new ResponseEntity<HttpGenericResponse>(new HttpGenericResponse().builder()
                    .status("OK")
                    .mensagem("")
                    .response(listaRacaPersonagem).build(), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<HttpGenericResponse>(new HttpGenericResponse().builder()
                    .status("NOK")
                    .mensagem(e.getMessage())
                    .response(null).build(), HttpStatus.BAD_REQUEST);
        }
    }
}
