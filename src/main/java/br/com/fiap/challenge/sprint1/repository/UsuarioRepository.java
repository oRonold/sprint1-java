package br.com.fiap.challenge.sprint1.repository;

import br.com.fiap.challenge.sprint1.model.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
