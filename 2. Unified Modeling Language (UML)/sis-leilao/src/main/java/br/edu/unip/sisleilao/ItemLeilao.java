package br.edu.unip.sisleilao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ItemLeilao {

	private String nome;
	private String descricao;
	private double valorMinimo;
	private LocalDateTime dataInicio;
	private LocalDateTime dataFim;
	private List<Lance> lances = new ArrayList<>();

	public void iniciar() {
		dataInicio = LocalDateTime.now();
		dataFim = dataInicio.plusMinutes(30);
	}

	public void registrarLance(Lance lance) {
		if (LocalDateTime.now().isAfter(dataFim)) {

			System.err.println("Leilão encerrado (data final expirada)");

		} else if (lance.getValor() < valorMinimo) {

			System.err.println("O valor do lance é menor que o valor mínimo");

		} else {

			try {
				CPFValidator validator = new CPFValidator();
				validator.assertValid(lance.getParticipante().getCpf());
				
				// Aqui o CPF já é valido, portanto o Lance pode ser registrado:
				lances.add(lance);
				
			} catch (InvalidStateException e) {
				System.err.println("O CPF do participante é inválido.");
			}

		}
	}
	
	public Lance finalizar() {
		Lance lanceVencedor = null;
		for (Lance lance : lances) {
			if (lanceVencedor == null || lanceVencedor.getValor() < lance.getValor()) {
				lanceVencedor = lance;
			}
		}
		return lanceVencedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorMinimo() {
		return valorMinimo;
	}

	public void setValorMinimo(double valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDateTime getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDateTime dataFim) {
		this.dataFim = dataFim;
	}

	public List<Lance> getLances() {
		return lances;
	}

	public void setLances(List<Lance> lances) {
		this.lances = lances;
	}

}
