package br.facape.sistemas.distribuidos.exemplo.observer.interfaces;

import java.io.Serializable;

public interface IObservable<T extends Serializable, E extends IEvent<T>> extends Serializable {

	public void registerObserver(IObserver<T, E> observer);
	
	public void removeObserver(IObservable<T, E> observer);
	
	public void notifyObservers();
	
}
