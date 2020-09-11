package br.unip.gof.templatemethod;

public class PacoteB extends Viagem {

	@Override
	protected void iniciarIda() {
		System.out.println("Indo de onibus...");
	}

	@Override
	protected void iniciarDiaA() {
		System.out.println("Iniciando dia A em São Carlos...");
	}

	@Override
	protected void iniciarDiaB() {
		System.out.println("Iniciando dia B em Ribeirão...");
	}

	@Override
	protected void iniciarDiaC() {
		System.out.println("Iniciando dia C em São Paulo...");
	}

	@Override
	protected void iniciarVolta() {
		System.out.println("Voltando de onibus...");
	}

}
