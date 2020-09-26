package com.copiarAula.copiarAula.controller;

import com.copiarAula.copiarAula.model.entity.EstadoEntity;
import com.copiarAula.copiarAula.usecase.EstadoUsecase;
import com.copiarAula.copiarAula.vo.HttpGenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estado")
public class EstadoController {

    @Autowired
    EstadoUsecase estadoUsecase;

    @RequestMapping(value = "/listar-estados",method = RequestMethod.GET, produces = "application/json") //@GetMapping("criar-novo-usuario")
    public ResponseEntity<HttpGenericResponse> listarEstados() {
        try {

            Iterable<EstadoEntity> listaEstados = estadoUsecase.listarEstados();

            return new ResponseEntity<HttpGenericResponse>(new HttpGenericResponse().builder()
                    .status("OK")
                    .mensagem("")
                    .response(listaEstados).build(), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<HttpGenericResponse>(new HttpGenericResponse().builder()
                    .status("NOK")
                    .mensagem(e.getMessage())
                    .response(null).build(), HttpStatus.BAD_REQUEST);
        }
    }
}
