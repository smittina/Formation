import java.util.Arrays;

public class TestArrayTri {

	public static void main(String[] args) {
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		// Affichage avant Tri
		System.out.println("Avant tri : ");
		for(int i =0 ; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		// Tri du tableau
		Arrays.sort(array);
		//Affichage Après tri
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}

	}

}
