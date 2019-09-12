package atividade03;

import java.util.Random;

public abstract class Pessoa implements Observer{
	
	public abstract void reagir(String e);
	
	public Pessoa(Subject s) {
		this.s=s;
	}
	private Subject s;
		public Subject getS() {
		return s;
	}
	
	public abstract void querSair();
}

