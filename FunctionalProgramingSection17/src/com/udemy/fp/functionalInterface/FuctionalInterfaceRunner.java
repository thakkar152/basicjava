package com.udemy.fp.functionalInterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class MyPredicateForFilter implements Predicate<Integer> {

	@Override
	public boolean test(Integer element) {
		return element % 2 == 0;
	}

}

class MyConsumerForForEach implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}

}

class MyConsumerStringForForEach implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}

class MyFunctionForMap implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer t) {
		return t * t;
	}

}

public class FuctionalInterfaceRunner {

	public static void main(String[] args) {

		List.of(23, 42, 34, 53).stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));

		// or I can also do as below.behind the scene java does same thing.
		List.of(23, 42, 34, 53).stream().filter(new MyPredicateForFilter()).forEach(e -> System.out.println(e));

		// consumer is of integer type because our list is an integer
		List.of(23, 42, 34, 53).stream().filter(new MyPredicateForFilter()).forEach(new MyConsumerForForEach());

		List.of("aa", "bb", "cc").stream().forEach(new MyConsumerStringForForEach());

		List.of(23, 42, 34, 53).stream().map(e -> e * e).forEach(e -> System.out.println(e));
		List.of(23, 42, 34, 53).stream().map(new MyFunctionForMap()).forEach(e -> System.out.println(e));
	}

}
