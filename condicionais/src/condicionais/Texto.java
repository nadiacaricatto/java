package condicionais;

import java.util.Scanner;

public class Texto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String texto; 
		
		System.out.println("Digite uma String: ");
		texto = leia.nextLine();
		
		System.out.println("A String digitada foi  " + texto);

		leia.close();
		
		
	}

}
