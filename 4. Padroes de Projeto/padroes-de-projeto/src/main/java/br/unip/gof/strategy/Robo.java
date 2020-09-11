package br.unip.gof.strategy;

public class Robo {

	private Comportamento comportamento;

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		this.comportamento.mover();
	}
}
