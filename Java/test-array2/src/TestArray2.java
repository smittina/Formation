
public class TestArray2 {

	public static void main(String[] args) {
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		// Calcul de la moyenne des éléments du tableau
		int somme = 0;
		for(int i = 0; i<array.length; i++) {
			somme += array[i];
		}
		double moyenne = ((double)somme)/array.length;
		System.out.println("Moyenne : "+moyenne);
		
		// Index dans le tableau de l'entier 15
		int index = 0;
		for(int i =0; i<array.length;i++) {
			if(array[i] == 15) {
				index = i;
			}
		}
		System.out.println("Index de l'entier 15 : "+index);
		
		//Algorithme pour trouver les doublons
		int nombreDoublons = 0;
		int multiples = 0;
		for(int i=0; i<array.length; i++) {
			multiples = 0;
			for(int j=i+1; j<array.length; j++) {
				if(array[i] == array[j]) {
					multiples++;
				}
			}
			if(multiples == 1) {
				nombreDoublons++;
			}
		}
		System.out.println("Nombre des doublons : "+nombreDoublons);
	}

}
