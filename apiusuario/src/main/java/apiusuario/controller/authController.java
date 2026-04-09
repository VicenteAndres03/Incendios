package apiusuario.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apiusuario.model.Usuario;
import apiusuario.service.usuarioService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/usuario")

public class authController {

    private final usuarioService service;

    @PostMapping("/registro")
    public String RegistrarUsuario(@Valid @RequestBody Usuario usuario){
        return service.RegistrarUsuario(usuario);
    }

}
