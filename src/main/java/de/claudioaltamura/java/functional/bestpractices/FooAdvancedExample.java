package de.claudioaltamura.java.functional.bestpractices;

import java.util.function.Function;

public class FooAdvancedExample {

	@SuppressWarnings("java:S4276") //UnaryOperator<String>
	public String add(String string, Function<String, String> fn) {
		return fn.apply(string);
	}

}
