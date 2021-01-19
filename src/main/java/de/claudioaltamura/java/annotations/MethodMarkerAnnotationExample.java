package de.claudioaltamura.java.annotations;

public class MethodMarkerAnnotationExample {

	@MethodMarkerAnnotation
	public int method(int a) {
		return 23 * a;
	}
}
