package br.unip.ads.gof;

import br.unip.ads.gof.singleton.SingletonApressado;
import br.unip.ads.gof.singleton.SingletonPreguicoso;
import br.unip.ads.gof.strategy.ComportamentoAgressivo;
import br.unip.ads.gof.strategy.ComportamentoDefensivo;
import br.unip.ads.gof.strategy.ComportamentoNormal;
import br.unip.ads.gof.strategy.Robo;
import br.unip.ads.gof.templatemethod.PacoteA;
import br.unip.ads.gof.templatemethod.PacoteB;
import br.unip.ads.gof.templatemethod.Viagem;

public class Main {

	public static void main(String[] args) {
		
		// Testes Singleton (verificando as instâncias)
		
		SingletonApressado apressado = SingletonApressado.getIntancia();
		System.out.println(apressado);
		
		apressado = SingletonApressado.getIntancia();
		System.out.println(apressado);
		
		SingletonPreguicoso preguicoso = SingletonPreguicoso.getIntancia();
		System.out.println(preguicoso);
		
		preguicoso = SingletonPreguicoso.getIntancia();
		System.out.println(preguicoso);
		
		// Testes Template Method
		
		Viagem viagemA = new PacoteA();
		viagemA.viajar();	
		Viagem viagemB = new PacoteB();
		viagemB.viajar();
		
		// Testes Strategy
		
		ComportamentoAgressivo agressivo = new ComportamentoAgressivo();
		ComportamentoNormal normal = new ComportamentoNormal();
		ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
	}
}
