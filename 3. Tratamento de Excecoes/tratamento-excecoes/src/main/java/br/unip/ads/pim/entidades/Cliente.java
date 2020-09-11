package br.unip.ads.pim.entidades;

import java.util.List;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class Cliente {

	private String nome;
	private String documento;
	private String email;
	private String senha;
	private TipoCliente tipo;
	private List<Endereco> enderecos;
	private List<DadoBancario> dadosBancarios;
	private List<Interesse> interesses;

	public boolean validarDocumento() {
		boolean ehValido = true;
		try {
			if (TipoCliente.PF.equals(tipo)) {
				new CPFValidator().assertValid(documento);
			} else if (TipoCliente.PJ.equals(tipo)) {
				new CNPJValidator().assertValid(documento);
			} else {
				ehValido = false;
			}
		} catch (InvalidStateException e) {
			e.printStackTrace();
			ehValido = false;
		}
		return ehValido;
	}
	
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
