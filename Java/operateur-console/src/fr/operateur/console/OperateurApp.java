package fr.operateur.console;

import java.util.Scanner;

public class OperateurApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Déclaration des différentes variables utilisées
		Scanner questionUser;
		int nombre1;
		int nombre2;
		
		System.out.println("***** Application Opérateur *****");
		// Récupération du premier nombre
		System.out.println("Veuillez saisir le premier nombre : ");
		questionUser = new Scanner(System.in);
		nombre1 = questionUser.nextInt();
		// Récupération du deuxième nombre
		System.out.println("Veuillez saisir le deuxième nombre : ");
		questionUser = new Scanner(System.in);
		nombre2 = questionUser.nextInt();
		// Affichage des différentes opérations
		System.out.println(""+ nombre1 + " + "+ nombre2 + " = "+ (nombre1+nombre2));
		System.out.println(""+ nombre1 + " - "+ nombre2 + " = "+ (nombre1-nombre2));
		System.out.println(""+ nombre1 + " * "+ nombre2 + " = "+ (nombre1*nombre2));
		System.out.println(""+ nombre1 + " / "+ nombre2 + " = "+ (nombre1/nombre2));
		System.out.println(""+ nombre1 + " % "+ nombre2 + " = "+ (nombre1%nombre2));

		
		
	}

}
