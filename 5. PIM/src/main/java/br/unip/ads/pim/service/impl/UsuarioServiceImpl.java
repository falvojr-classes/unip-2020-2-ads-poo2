package br.unip.ads.pim.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.unip.ads.pim.model.usuarios.Usuario;
import br.unip.ads.pim.repository.UsuarioRepository;
import br.unip.ads.pim.service.UsuarioService;

@Service
public class UsuarioServiceImpl extends BaseCrudService<Usuario> implements UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	protected CrudRepository<Usuario, Long> getRepository() {
		return repository;
	}

}
