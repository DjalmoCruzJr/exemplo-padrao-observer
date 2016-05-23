package br.facape.sistemas.distribuidos.exemplo.observer.interfaces;

import java.io.Serializable;

public interface IEvent<T extends Serializable> extends Serializable{
	
	public T getInfo();
	
}
