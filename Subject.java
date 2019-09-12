package atividade03;

public interface Subject {
	public void addObserverEstadaoF(Observer observer);
	public void removeObserverEstadaoF(Observer pessoa);
	
	public void addObserverEstadaoDS(Observer observer);
	public void removeObserverEstadaoDS(Observer pessoa);
	
	public void addObserverMarie(Observer observer);
	public void removeObserverMarie(Observer pessoa);
	
	public void notifyObservers();
}
