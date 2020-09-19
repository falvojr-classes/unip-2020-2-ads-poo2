package br.unip.ads.pim.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.unip.ads.pim.model.usuarios.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	Optional<Usuario> findByEmailAndSenha(String email, String senha);
}
