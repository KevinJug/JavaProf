package approcheimperative.tableau;

import java.util.Arrays;
import java.util.Scanner;

public class App {
	
	
	public static void main( String[] args ) {
		
		Scanner sc = new Scanner( System.in );
		System.out.println("Bienvenue au conseil des classes");
		System.out.print("Entrer le nom de l'apprenant 1 : ");
		String name1 = sc.nextLine();
		System.out.print("Entrez la note de "+name1+" : ");
		float note1 = sc.nextFloat();
		sc.nextLine();
		System.out.print("Entrer le nom de l'apprenant 2 : ");
		String name2 = sc.nextLine();
		System.out.print("Entrez la note de "+name2+" : ");
		float note2 = sc.nextFloat();
		
		System.out.println("la moyenne de la classe est de : "+ (note1+note2) / 2);
		
		String[][] tab = new String[5][10];
		for ( String[] line : tab ) {
			for ( String str : line ) {
				System.out.println(str);
			}
		}
		
		Arrays.asList(args).forEach( System.out::println );
	}
}
