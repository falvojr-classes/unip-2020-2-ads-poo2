package br.unip.gof;

import br.unip.gof.singleton.SingletonApressado;
import br.unip.gof.singleton.SingletonPreguicoso;
import br.unip.gof.strategy.ComportamentoAgressivo;
import br.unip.gof.strategy.ComportamentoDefensivo;
import br.unip.gof.strategy.ComportamentoNormal;
import br.unip.gof.strategy.Robo;
import br.unip.gof.templatemethod.PacoteA;
import br.unip.gof.templatemethod.PacoteB;
import br.unip.gof.templatemethod.Viagem;

public class Main {

	public static void main(String[] args) {
		SingletonApressado apressado1 = SingletonApressado.getIntancia();
		System.out.println(apressado1);
		SingletonApressado apressado2 = SingletonApressado.getIntancia();
		System.out.println(apressado2);
		SingletonApressado apressado3 = SingletonApressado.getIntancia();
		System.out.println(apressado3);
		
		SingletonPreguicoso preguicoso = SingletonPreguicoso.getIntancia();
		System.out.println(preguicoso);
		preguicoso = SingletonPreguicoso.getIntancia();
		System.out.println(preguicoso);
		preguicoso = SingletonPreguicoso.getIntancia();
		System.out.println(preguicoso);
		
		Viagem viagemA = new PacoteA();
		viagemA.viajar();	
		Viagem viagemB = new PacoteB();
		viagemB.viajar();
		
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
