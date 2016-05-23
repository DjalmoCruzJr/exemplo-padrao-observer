package br.facape.sistemas.distribuidos.exemplo.observer.interfaces;

import java.io.Serializable;

public interface IObserver<T extends Serializable, E extends IEvent<T>> extends Serializable {

	public void update(E event); 
	
}
