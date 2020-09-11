package br.unip.gof.strategy;

public class ComportamentoDefensivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Se movendo defensivamente...");
	}

}
