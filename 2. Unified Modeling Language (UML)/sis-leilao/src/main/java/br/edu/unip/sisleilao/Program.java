package br.edu.unip.sisleilao;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		// Criando as "Pessoas" para o Leilão:

		Leiloeiro leiloeiro = new Leiloeiro();
		leiloeiro.setNome("Fulano");

		Participante lucas = new Participante();
		lucas.setNome("Lucas");
		lucas.setCpf("659.088.710-10");

		Participante bruno = new Participante();
		bruno.setNome("Bruno");
		bruno.setCpf("372.955.200-74");

		// Criar os Items para o Leilão:

		ItemLeilao celular = new ItemLeilao();
		celular.setNome("Celular");
		celular.setValorMinimo(50);

		ItemLeilao caneta = new ItemLeilao();
		caneta.setNome("Caneta");

		// Adicionar os itens em uma lista:

		List<ItemLeilao> itens = new ArrayList<>();
		itens.add(celular);
		itens.add(caneta);

		// Criar o Leilão com o Leiloeiro e os Items

		Leilao leilao = new Leilao(leiloeiro, itens);
		
		// TODO Iniciar o Leilão do primeiro Item (Celular):

		// TODO Realizar os lances para o Item atual:

		// TODO Finalizar o Leilão do item atual (Celular)

		// TODO Iniciar o Leilão do próximo Item (Caneta)

		// TODO Realizar os lances para o Item atual:

		// TODO Finalizar o Leilão do item atual (Caneta)

		// TODO Tentar iniciar o próximo item (deve dar erro)
	}

}
