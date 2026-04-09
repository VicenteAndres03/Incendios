package apiusuario.service;

import org.springframework.stereotype.Service;

import apiusuario.model.Usuario;
import apiusuario.repository.UsuarioRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class usuarioService {

    private final UsuarioRepository usuarioRepository;

    public String RegistrarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);

        return "El usuario con id: " + usuario.getId() + " se registro de manera correcta";
    }
}
