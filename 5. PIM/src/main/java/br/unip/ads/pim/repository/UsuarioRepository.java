package br.unip.ads.pim.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.unip.ads.pim.model.usuarios.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	Optional<Usuario> findByEmailAndSenha(String email, String senha);
	
	//Opção 1: Buscar todos ordenados por nome usando o nome do método (Spring Data)
	Iterable<Usuario> findByOrderByNomeAsc();

	//Opção 2: Buscar todos ordenados por nome usando uma query HQL (Hibernate)
	@Query("FROM Usuario u WHERE u.tipo != 'ADM' ORDER BY u.nome ASC")
	Iterable<Usuario> buscarPorNaoAdmOrdenandoPorNome();
	
	@Query("SELECT u FROM Usuario u JOIN u.interesses i WHERE i.id IN (:interesses) ORDER BY u.nome ASC")
	Iterable<Usuario> buscarPorInteressesRelacionados(@Param("interesses") List<Long> interesses);
	
	Iterable<Usuario> findByInteressesIsEmpty();
}
