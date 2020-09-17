package br.unip.ads.pim.controller;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.unip.ads.pim.model.Usuario;
import br.unip.ads.pim.repository.UsuarioRepository;

@CrossOrigin
@RestController
@RequestMapping("usuarios")
public class UsuarioRestController extends BaseRestController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	private ResponseEntity<Iterable<Usuario>> buscarTodos() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> buscarUm(@PathVariable Long id) {
		final Optional<Usuario> entidade = this.repository.findById(id);
		if (entidade.isPresent()) {
			return ResponseEntity.ok(entidade.get());
		} else {
			return ResponseEntity.noContent().build();
		}
	}

	@PostMapping
	public ResponseEntity<Usuario> incluir(@RequestBody Usuario entidade) {
		repository.save(entidade);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(entidade.getId())
				.toUri();
		
		return ResponseEntity.created(uri).body(entidade);
	}

}
