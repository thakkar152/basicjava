package com.udemy.filesDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class ReadRunner {

	public static void main(String[] args) throws IOException {

		Path pathOfDirectory = Paths.get("./Resources/Data.txt");

		// this reads full file all togeather and keep it in memory so its not a good
		// idea for long file
		List<String> fileLines = Files.readAllLines(pathOfDirectory);
		Iterator<String> itr = fileLines.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		Files.lines(pathOfDirectory).forEach(e -> System.out.println(e));

		Path pathofFileToWrite = Paths.get("./Resources/newData.txt");
		List<String> someThing = List.of("Apple", "Banana", "Chikoo");
		Files.write(pathofFileToWrite, someThing);

	}
}
