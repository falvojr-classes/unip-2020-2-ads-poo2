package br.unip.gof.templatemethod;

public class PacoteA extends Viagem {

	@Override
	protected void iniciarIda() {
		System.out.println("Indo de carro...");
	}

	@Override
	protected void iniciarDiaA() {
		System.out.println("Iniciando dia A em Motuca...");
	}

	@Override
	protected void iniciarDiaB() {
		System.out.println("Iniciando dia B em Rincão...");
	}

	@Override
	protected void iniciarDiaC() {
		System.out.println("Iniciando dia C em Guariba...");
	}

	@Override
	protected void iniciarVolta() {
		System.out.println("Voltando de carro...");
	}

}
