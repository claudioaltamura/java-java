package de.claudioaltamura.java.generics;

public class GenericType<T> {

	private T t;

	public T get() {
		return this.t;
	}

	public void set(T t1) {
		this.t = t1;
	}
}