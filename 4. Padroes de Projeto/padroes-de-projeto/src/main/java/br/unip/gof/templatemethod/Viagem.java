package br.unip.gof.templatemethod;

public abstract class Viagem {

	public final void viajar() {
		iniciarIda();
		iniciarDiaA();
		iniciarDiaB();
		iniciarDiaC();
		iniciarVolta();
	}

	protected abstract void iniciarIda();
	protected abstract void iniciarDiaA();
	protected abstract void iniciarDiaB();
	protected abstract void iniciarDiaC();
	protected abstract void iniciarVolta();
}
