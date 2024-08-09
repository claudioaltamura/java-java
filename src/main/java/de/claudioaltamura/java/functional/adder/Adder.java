package de.claudioaltamura.java.functional.adder;

class Adder implements GenericFunction<Long, Long> {

	@Override
	public Long apply(Long a) {
		return a + 3;
	}
}