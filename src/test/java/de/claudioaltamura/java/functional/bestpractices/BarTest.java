package de.claudioaltamura.java.functional.bestpractices;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BarTest {

	@Test
	void test() {
		Bar<String, String> fn = str -> str + "fb";

		assertThat(fn.apply(fn.defaultMethod())).isEqualTo("defaultfb");
	}

}