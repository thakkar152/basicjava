package com.udemy.filesDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDirectoriesRunner {

	public static void main(String[] args) throws IOException {

		// files at current directory.

		// Files.list(Paths.get(".")).forEach(e -> System.out.println(e));

		// Files.list(Paths.get("d:/")).forEach(e -> System.out.println(e));

		// Files.walk(Paths.get("."), 2).forEach(e -> System.out.println(e));

		Files.walk(Paths.get("."), 5).filter(e -> String.valueOf(e).endsWith(".java"))
				.forEach(e -> System.out.println(e));

	}

}