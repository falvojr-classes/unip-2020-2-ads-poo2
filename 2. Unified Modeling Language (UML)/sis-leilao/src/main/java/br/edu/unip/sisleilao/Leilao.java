package br.edu.unip.sisleilao;

import java.util.List;

public class Leilao {

	private Leiloeiro leiloeiro;
	private List<ItemLeilao> itens;
	private ItemLeilao itemAtual;

	public Leilao(Leiloeiro leiloeiro, List<ItemLeilao> itens) {
		super();
		this.leiloeiro = leiloeiro;
		this.itens = itens;
	}

	public void iniciar() {
		if (itens != null && !itens.isEmpty()) {
			itemAtual = itens.remove(0);
			itemAtual.iniciar();
		} else {
			System.err.println("Não existem mais itens para o leilão.");
		}
	}

	public Leiloeiro getLeiloeiro() {
		return leiloeiro;
	}

	public List<ItemLeilao> getItens() {
		return itens;
	}

	public ItemLeilao getItemAtual() {
		return itemAtual;
	}

	public void setItemAtual(ItemLeilao itemAtual) {
		this.itemAtual = itemAtual;
	}

}
