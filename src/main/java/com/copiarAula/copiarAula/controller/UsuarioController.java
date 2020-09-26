package com.copiarAula.copiarAula.controller;

import com.copiarAula.copiarAula.model.entity.EstadoEntity;
import com.copiarAula.copiarAula.model.entity.UsuarioEntity;
import com.copiarAula.copiarAula.usecase.EstadoUsecase;
import com.copiarAula.copiarAula.usecase.UsuarioUsecase;
import com.copiarAula.copiarAula.vo.HttpGenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioUsecase usuarioUsecase;

    @RequestMapping (value = "/criar-novo-usuario",method = RequestMethod.POST, produces = "application/json") //@GetMapping("criar-novo-usuario")
    public ResponseEntity<HttpGenericResponse> criarUsuario(@RequestBody UsuarioEntity novoUsuario) {
        try {

            UsuarioEntity entityNovoUsuario = usuarioUsecase.criarNovoUsuario(novoUsuario);

            return new ResponseEntity<HttpGenericResponse>(new HttpGenericResponse().builder()
            .status("OK")
            .mensagem("Sucesso na criação")
            .response(entityNovoUsuario).build(), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<HttpGenericResponse>(new HttpGenericResponse().builder()
            .status("NOK")
            .mensagem(e.getMessage())
            .response(null).build(), HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping (value = "/editar-usuario",method = RequestMethod.POST, produces = "application/json") //@GetMapping("criar-novo-usuario")
    public ResponseEntity<HttpGenericResponse> editarUsuario(@RequestBody UsuarioEntity novoUsuario) {
        try {

            UsuarioEntity entityUsuarioEditado = usuarioUsecase.editarUsuario(novoUsuario);

            return new ResponseEntity<HttpGenericResponse>(new HttpGenericResponse().builder()
                    .status("OK")
                    .mensagem("")
                    .response(entityUsuarioEditado).build(), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<HttpGenericResponse>(new HttpGenericResponse().builder()
                    .status("NOK")
                    .mensagem(e.getMessage())
                    .response(null).build(), HttpStatus.BAD_REQUEST);
        }
    }

}
