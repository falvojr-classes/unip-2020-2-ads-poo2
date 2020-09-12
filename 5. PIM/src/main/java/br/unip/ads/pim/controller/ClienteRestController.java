package br.unip.ads.pim.controller;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.unip.ads.pim.model.Cliente;
import br.unip.ads.pim.repository.ClienteRepository;

@RestController
@RequestMapping("clientes")
public class ClienteRestController {

	@Autowired
	private ClienteRepository repository;
	
	@GetMapping
	private ResponseEntity<Iterable<Cliente>> buscarTodos() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> buscarUm(@PathVariable Long id) {
		final Optional<Cliente> cliente = this.repository.findById(id);
		if (cliente.isPresent()) {
			return ResponseEntity.ok(cliente.get());
		} else {
			return ResponseEntity.noContent().build();
		}
	}

	@PostMapping
	public ResponseEntity<Void> incluir(@RequestBody Cliente cliente) {
		repository.save(cliente);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(cliente.getId())
				.toUri();
		
		return ResponseEntity.created(uri).build();
	}

}
