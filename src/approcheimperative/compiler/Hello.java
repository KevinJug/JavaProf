package approcheimperative.compiler;

import java.util.Arrays;

public class Hello {
	
	public static void main( String[] args ) {
		Arrays.asList(args).forEach(System.out::println);
		System.out.println("Hello, world!");
	}
}
