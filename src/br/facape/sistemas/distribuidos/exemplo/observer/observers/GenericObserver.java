package br.facape.sistemas.distribuidos.exemplo.observer.observers;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.log4j.Logger;

import br.facape.sistemas.distribuidos.exemplo.observer.events.GenericEvent;
import br.facape.sistemas.distribuidos.exemplo.observer.interfaces.IObserver;

public abstract class GenericObserver<T extends Serializable, E extends GenericEvent<T>> implements IObserver<T, E> {

	private static final long serialVersionUID = 8500199288832521094L;
	
	protected final Logger LOGGER;
	
	protected E event;
	
	public GenericObserver() {
		this.LOGGER = Logger.getLogger(getClass());
	}

	@Override
	public void update(E event) {
		LOGGER.info(String.format("New event occurred (%s): %s", this, event));
		this.event = event;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
