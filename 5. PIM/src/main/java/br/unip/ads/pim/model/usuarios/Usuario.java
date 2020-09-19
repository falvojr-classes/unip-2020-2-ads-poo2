package br.unip.ads.pim.model.usuarios;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.unip.ads.pim.model.BaseEntity;

@Entity
public class Usuario extends BaseEntity {

	@Column(nullable = false)
	private String nome;
	@Column(nullable = false, unique = true)
	private String documento;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false)
	private String senha;
	@Column(nullable = false, length = 3)
	@Enumerated(EnumType.STRING)
	private TipoUsuario tipo;

	// TODO Mapear relacionamentos (enderecos, dadosBancarios e interesses)

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoUsuario getTipo() {
		return tipo;
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}

}
