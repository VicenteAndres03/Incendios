package apiusuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import apiusuario.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
