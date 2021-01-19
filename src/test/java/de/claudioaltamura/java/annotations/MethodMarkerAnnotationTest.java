package de.claudioaltamura.java.annotations;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MethodMarkerAnnotationTest {

	@Test
	void test() throws ClassNotFoundException, IllegalAccessException, InstantiationException,
			InvocationTargetException, NoSuchMethodException {
		Class<?> clazz = Class.forName(MethodMarkerAnnotationExample.class.getName());
		Constructor<MethodMarkerAnnotationExample> constructor = MethodMarkerAnnotationExample.class.getConstructor();
		MethodMarkerAnnotationExample instance = constructor.newInstance();
		for (Method m : clazz.getDeclaredMethods()) {
			if (m.isAnnotationPresent(MethodMarkerAnnotation.class)) {
				assertTrue(true);
				try {
					assertEquals(23,m.invoke(instance,1));
				} catch (InvocationTargetException wrappedExc) {
					Throwable exc = wrappedExc.getCause();
					System.out.println(m + " failed: " + exc);
				} catch (Exception exc) {
					System.out.println("Invalid: " + m);
				}
			}
		}
	}
}
