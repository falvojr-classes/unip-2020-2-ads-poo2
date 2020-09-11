package br.unip.ads.gof.singleton;

public class SingletonPreguicoso {
	
	private static SingletonPreguicoso intancia;
	
	private SingletonPreguicoso() {
		super();
	}
	
	public static SingletonPreguicoso getIntancia() {
		if (intancia == null) {
			intancia = new SingletonPreguicoso();
		}
		return intancia;
	}
}
