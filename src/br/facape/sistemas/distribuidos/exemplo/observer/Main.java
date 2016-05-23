package br.facape.sistemas.distribuidos.exemplo.observer;

import br.facape.sistemas.distribuidos.exemplo.observer.events.MyEvent;
import br.facape.sistemas.distribuidos.exemplo.observer.observables.MyEventObservable;
import br.facape.sistemas.distribuidos.exemplo.observer.observers.MyEventObserver;

public class Main {

	public static void main(String[] args) {
		MyEvent event = new MyEvent();
		event.setInfo("New info");
		
		MyEventObserver myEventObserver1 = new MyEventObserver();
		MyEventObserver myEventObserver2 = new MyEventObserver();
		
		MyEventObservable myEventObservable = new MyEventObservable();

		myEventObservable.registerObserver(myEventObserver1);
		myEventObservable.registerObserver(myEventObserver2);
		
		myEventObservable.setEvent(event);
		myEventObservable.notifyObservers();
	}
	
}
