package approcheimperative.idea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        System.out.println("Bienvenue dans mon application!");
        String name;
        System.out.print("Entrez votre nom : ");
        Scanner sc = new Scanner( System.in );
        name = sc.nextLine();
        sc.close();
        System.out.println("Bienvenue '"+name+"'");
        System.out.println();
    }
}
