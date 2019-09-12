package atividade03;

import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public class Editora implements Subject {

	private List<Observer> EstadaoF = new ArrayList<>();
	private List<Observer> EstadaoDS = new ArrayList<>();
	private List<Observer> Marie = new ArrayList<>();

	@Override
	public void addObserverEstadaoF(Observer observer) {
		EstadaoF.add(observer);
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserverEstadaoF(Observer pessoa) {
		EstadaoF.remove(pessoa);
		
	}

	@Override
	public void addObserverEstadaoDS(Observer observer) {
		EstadaoDS.add(observer);
		
	}

	@Override
	public void removeObserverEstadaoDS(Observer pessoa) {
		EstadaoDS.remove(pessoa);
		
	}

	@Override
	public void addObserverMarie(Observer observer) {
		Marie.add(observer);
		
	}

	@Override
	public void removeObserverMarie(Observer pessoa) {
		Marie.remove(pessoa);
		
	}
	
	public void iniciar() {
		Calendar c = Calendar.getInstance();
		int day = c.get(Calendar.DAY_OF_WEEK);
	}

}
