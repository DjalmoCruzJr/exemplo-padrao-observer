package br.facape.sistemas.distribuidos.exemplo.observer.observables;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import br.facape.sistemas.distribuidos.exemplo.observer.events.BaseEvent;
import br.facape.sistemas.distribuidos.exemplo.observer.interfaces.IObservable;
import br.facape.sistemas.distribuidos.exemplo.observer.interfaces.IObserver;

public class BaseObservable<T extends Serializable, E extends BaseEvent<T>> implements IObservable<T, E> {

	private static final long serialVersionUID = -5388368083930262680L;

	protected final Logger LOGGER;
	
	private List<IObserver<T, E>> observers;
	private E event;
	
	public BaseObservable() {
		this.LOGGER = Logger.getLogger(getClass());
		this.observers = new ArrayList<>();
		this.event = null;
	}

	@Override
	public void registerObserver(IObserver<T, E> observer) {
		LOGGER.info(String.format("Registering new observer : %s", observer));
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(IObservable<T, E> observer) {
		LOGGER.info(String.format("Unregistering observer : %s", observer));
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		LOGGER.info(String.format("Notifying observers about the occurrence of new event: %s", this.event));
		for(IObserver<T, E> observer :this.observers) {
			observer.update(this.event);
		}
	}

	public void setEvent(E event) {
		this.event = event;
	}
	
}
