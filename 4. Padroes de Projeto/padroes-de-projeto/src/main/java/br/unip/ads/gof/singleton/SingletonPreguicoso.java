package br.unip.ads.gof.singleton;

public class SingletonPreguicoso {
	
	private static SingletonPreguicoso intancia;
	
	private SingletonPreguicoso() {
		super();
	}
	
	public static SingletonPreguicoso getIntancia() {
		if (SingletonPreguicoso.intancia == null) {
			SingletonPreguicoso.intancia = new SingletonPreguicoso();
		}
		return SingletonPreguicoso.intancia;
	}
}
