
public class TestArray1 {

	public static void main(String[] args) {
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		// Affichage de l'ensemble des éléments du tableau avec une boucle
		System.out.println("Affichage de l'ensemble du tableau");
		for(int i=0; i < array.length ; i++ ) {
			System.out.print(array[i]+"  ");
		}
		
		System.out.println();
		
		//Affichage dans l'ordre inverse du tableau
		System.out.println("Affichage du tableau dans l'ordre inverse");
		for(int i = (array.length-1); i>=0; i--) {
			System.out.print(array[i]+"  ");
		}
		
		System.out.println();

		// Affichage des entiers supérieurs à 3
		System.out.println("Affichage des entiers supérieurs à 3");
		for(int i=0; i < array.length ; i++ ) {
			if(array[i]>3) {
				System.out.print(array[i]+"  ");
			}
		}
		
		System.out.println();

		//Affichage des entiers pairs
		System.out.println("Affichage des entiers pairs");
		for(int i=0; i < array.length ; i++ ) {
			if(array[i]%2 == 0) {
				System.out.print(array[i]+"  ");
			}
		}
		
		System.out.println();	
		
		//Affichage du plus grand des éléments
		System.out.println("Affichage du plus grand des éléments");
		int max = -10;
		for(int i=0; i < array.length ; i++ ) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println(max);
				
		//Affichage du plus petit des éléments
		System.out.println("Affichage du plus petit des éléments");
		int min = 50;
		for(int i=0; i < array.length ; i++ ) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println(min);
		
		System.out.println();
	}

}
