package de.claudioaltamura.java.functional.bestpractices;

@FunctionalInterface
public interface Bar<T, R> {
	R apply(T string);
	default String defaultMethod() {
		return "default";
	}
}
