import java.util.Scanner;

public class TestMenu {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner questionUser;
		int option = -1;
		int nombreUser = 0;
		int nombreElements = 0;
		int choixFinal = -1;
		int[] array = new int[2];
		do {
			choixFinal = -1;
			option = -1;
			// Demande à l'utilisateur de choisir une option
			while(option<1 || option>2) {
				System.out.println("Que voulez-vous faire ? \n 1) Ajouter un nombre au tableau \n 2) Afficher le tableay");
				System.out.println("Entrez votre choix et cliquez sur Entrée : ");
				questionUser = new Scanner(System.in);
				option = questionUser.nextInt();
				System.out.println();
			}
			switch(option) {
			case 1 : 
				System.out.println("Entrez un nombre et cliquez sur Entrée : ");
				questionUser = new Scanner(System.in);
				nombreUser = questionUser.nextInt();
				// S'il y a la place on ajoute l'élément au tableau
				if(nombreElements > array.length) {				
					int[] arrayTemp = new int[array.length*2];
					for(int i = 0; i< array.length; i++) {
						arrayTemp[i] = array[i];
					}
					array = arrayTemp;					
				}
				array[nombreElements] = nombreUser;
				nombreElements++;
				break;
			case 2 : 
				for(int i = 0; i< array.length; i++) {
					System.out.print(array[i]+" ");
				}
				System.out.println();
				break;
				default :
					break;
			}
			System.out.println();
			while(choixFinal<0 || choixFinal>1) {
				System.out.println("Voulez-vous continuer ? 1:oui ; 0:Non");
				questionUser = new Scanner(System.in);
				choixFinal = questionUser.nextInt();
			}
			
		}while(choixFinal == 1);
		

	}

}
