package de.claudioaltamura.java.functional.composing;

import java.util.function.IntUnaryOperator;

public class Functions {

	IntUnaryOperator triple = arg -> arg * 3;

	IntUnaryOperator square = arg ->  arg * arg;
}
