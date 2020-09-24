package br.unip.ads.pim.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.unip.ads.pim.model.usuarios.Usuario;
import br.unip.ads.pim.repository.UsuarioRepository;
import br.unip.ads.pim.service.UsuarioService;
import br.unip.ads.pim.service.exception.NegocioException;

@Service
public class UsuarioServiceImpl extends BaseCrudService<Usuario> implements UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	protected CrudRepository<Usuario, Long> getRepository() {
		return repository;
	}

	@Override
	public Usuario logar(Usuario entidade) {
		String email = entidade.getEmail();
		String senha = entidade.getSenha();
		
		if (StringUtils.isBlank(email)) {
			throw new NegocioException("O preenchimento do e-mail é obrigatório.");
		}
		if (StringUtils.isBlank(senha)) {
			throw new NegocioException("O preenchimento da senha é obrigatório.");
		}
		if (!EmailValidator.getInstance().isValid(email)) {
			throw new NegocioException("O e-mail é inválido.");
		}
		
		Usuario usuarioLogado = repository.findByEmailAndSenha(email, senha)
				.orElseThrow(() -> new NegocioException("E-mail ou senha inválidos."));
		
		// Evita que a senha seja enviada para o cliente (Web ou Android).
		usuarioLogado.setSenha(null);
		
		return usuarioLogado;
	}

}
