package br.unip.ads.pim.controller.usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.unip.ads.pim.config.docs.OpenApiConfig;
import br.unip.ads.pim.controller.BaseRestController;
import br.unip.ads.pim.model.usuarios.Usuario;
import br.unip.ads.pim.service.UsuarioService;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = OpenApiConfig.TAG_USUARIOS)
@CrossOrigin
@RestController
public class UsuarioRestController extends BaseRestController {

	@Autowired
	private UsuarioService camadaNegocio;
	
	@GetMapping("usuarios")
	private ResponseEntity<Iterable<Usuario>> buscarTodos() {
		return ResponseEntity.ok(camadaNegocio.buscarTodos());
	}
	
	@GetMapping("usuarios/{id}")
	public ResponseEntity<Usuario> buscarUm(@PathVariable Long id) {
		return ResponseEntity.ok(camadaNegocio.buscarUm(id));
	}

	@PostMapping("usuarios")
	public ResponseEntity<Void> inserir(@RequestBody Usuario entidade) {
		camadaNegocio.inserir(entidade);
		return ResponseEntity.created(super.criarUri(entidade.getId())).build();
	}

	@PutMapping("usuarios/{id}")
	public ResponseEntity<Void> alterar(@PathVariable Long id, @RequestBody Usuario entidade) {
		camadaNegocio.alterar(id, entidade);
		return ResponseEntity.ok().build();
	}

	@DeleteMapping("usuarios/{id}")
	public ResponseEntity<Void> excluir(@PathVariable Long id) {
		camadaNegocio.excluir(id);
		return ResponseEntity.ok().build();
	}

}
