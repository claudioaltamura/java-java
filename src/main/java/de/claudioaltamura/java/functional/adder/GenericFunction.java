package de.claudioaltamura.java.functional.adder;

@FunctionalInterface
public interface GenericFunction<T,R> {
	R apply(T parameter);
}