package atividade03;

import java.util.Random;

public class Maria extends Pessoa {
	public Maria(Subject s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(String e) {
		reagir(e);
	}

	@Override
	public void reagir(String e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void querSair() {
		Random gerador = new Random();
		boolean sair = gerador.nextDouble() <= 0.1;
		if(sair) {
			getS().removeObserverMarie(this);

		}

	}
}
