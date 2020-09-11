package br.unip.gof.strategy;

public class ComportamentoNormal implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Se movendo normalmente...");
	}

}
