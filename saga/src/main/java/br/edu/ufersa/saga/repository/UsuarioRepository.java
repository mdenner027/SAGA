package br.edu.ufersa.saga.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufersa.saga.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Usuario findByLoginUsuarioAndSenhaUsuario(String loginUsuario, String senhaUsuario);

}
