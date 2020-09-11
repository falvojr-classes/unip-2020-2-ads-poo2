package br.unip.gof.singleton;

public class SingletonApressado {
	
	private static SingletonApressado intancia = new SingletonApressado();
	
	private SingletonApressado() {
		super();
	}
	
	public static SingletonApressado getIntancia() {
		return intancia;
	}
}
