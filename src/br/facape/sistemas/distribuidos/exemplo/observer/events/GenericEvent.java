package br.facape.sistemas.distribuidos.exemplo.observer.events;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import br.facape.sistemas.distribuidos.exemplo.observer.interfaces.IEvent;

public abstract class GenericEvent<T extends Serializable> implements IEvent<T> {

	private static final long serialVersionUID = -5878762195964734873L;
	
	private T info;

	@Override
	public T getInfo() {
		return this.info;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	public void setInfo(T info) {
		this.info = info;
	}

}
