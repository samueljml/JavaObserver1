package atividade03;

import java.awt.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

public class PontoInicial {
	
	public static void main(String[] args) {
			
		Editora marie = new Editora();
		Editora Estadao = new Editora();
		Editora EstadaoFDS = new Editora();
		
		marie.addObserverMarie(new Maria(marie));
		Estadao.addObserverEstadaoDS(new Jose(Estadao));
		EstadaoFDS.addObserverEstadaoF(new Joao(EstadaoFDS));
		
		marie.iniciar();
		EstadaoFDS.iniciar();
		Estadao.iniciar();
	}

}
