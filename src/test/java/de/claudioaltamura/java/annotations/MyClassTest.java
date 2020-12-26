package de.claudioaltamura.java.annotations;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

	@Test
	void testClassAnnotation() {
		MyClass myClass = new MyClass();

		Class<MyClass> aClass = MyClass.class;
		Annotation[] annotations = aClass.getAnnotations();

		assertThat(annotations).hasSize(1);

		CustomAnnotation customAnnotation = (CustomAnnotation) annotations[0];
		assertThat(customAnnotation.name()).isEqualTo("MyClass");
		assertThat(customAnnotation.count()).isEqualTo(1);
	}

}