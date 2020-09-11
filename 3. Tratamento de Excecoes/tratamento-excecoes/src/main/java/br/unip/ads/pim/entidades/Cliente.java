package br.unip.ads.pim.entidades;

import java.util.List;

public class Cliente {

	private String nome;
	private Long documento;
	private String email;
	private String senha;
	private TipoCliente tipo;
	private List<Endereco> enderecos;
	private List<DadoBancario> dadosBancarios;
	private List<Interesse> interesses;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getDocumento() {
		return documento;
	}

	public void setDocumento(Long documento) {
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

	public TipoCliente getTipo() {
		return tipo;
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<DadoBancario> getDadosBancarios() {
		return dadosBancarios;
	}

	public void setDadosBancarios(List<DadoBancario> dadosBancarios) {
		this.dadosBancarios = dadosBancarios;
	}

	public List<Interesse> getInteresses() {
		return interesses;
	}

	public void setInteresses(List<Interesse> interesses) {
		this.interesses = interesses;
	}

}
