import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		Scanner questionUser;
		int rang = -1;
		int f1 = 0;
		int f2 =1;
		int suite;
		// Demande d'un rang à l'utilisateur
		while(rang <0) {
			System.out.println("Choisissez un rang N positif");
			questionUser = new Scanner(System.in);
			rang = questionUser.nextInt();			
		}
		System.out.println("Suite de Fibonnaci jusqu'au rang "+rang);
		
		for(int i=0; i<=rang+1; i++) {
			if(i==0 || i==1) {
				System.out.print(i+" ");
			}
			if(i>2) {
				suite = f1+f2;
				System.out.print(suite+" ");
				f1=f2;
				f2=suite;
			}
		}
	
	

	}

}
