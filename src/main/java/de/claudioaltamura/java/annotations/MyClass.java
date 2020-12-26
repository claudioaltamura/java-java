package de.claudioaltamura.java.annotations;

@CustomAnnotation(count = 1, name = "MyClass")
public class MyClass {

	public int calculate(int a, int b) {
		return a + b;
	}
}
