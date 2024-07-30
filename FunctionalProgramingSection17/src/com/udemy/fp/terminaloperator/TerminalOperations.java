package com.udemy.fp.terminaloperator;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TerminalOperations {

	public static void main(String[] args) {

		OptionalInt sum = IntStream.range(1, 10).reduce((element1, element2) -> element1 + element2);
		// optional value.
		System.out.println(sum);
		// perfect value out of optional variable.
		System.out.println(sum.getAsInt());

		// In above example if we mention initial value as 0 then we can store in int.
		int sumInt = IntStream.range(1, 10).reduce(0, (element1, element2) -> element1 + element2);

		// max terminal opetator. Max needs comparator as an argument.Simlarly min is
		// also there.
		Optional<Integer> max = List.of(1, 2, 3, 4).stream()
				.max((element1, element2) -> Integer.compare(element1, element2));
		System.out.println(max);
		System.out.println(max.get());

		List<Integer> li = List.of(23, 56, 73, 92).stream().filter(e -> e % 2 != 0).toList();
		System.out.println(li.toString());

		// or can do like below as well. Collect in a list.
//		List<Integer> li = List.of(23, 56, 73, 92).stream().filter(e -> e % 2 != 0).collect(Collectors.toList());

		// check notes for IntStream -> Intpipeline.
		IntStream.range(1, 11).map(element -> element * element).boxed().collect(Collectors.toList());
	}

}
