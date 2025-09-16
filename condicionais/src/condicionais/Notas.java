package condicionais;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite a 1ª nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a 2ª nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a 3ª nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a 4ª nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		/*As chaves {} tem o papel de delimitar - elas são o escopo.
		 * Tudo que ficar dentro das chaves só será executado se for verdadeiro*/
		
		System.out.printf("A média do aluno é %.2f%n", media);
		
		if(media >= 7) {
			System.out.println("Aluno(a) Aprovado(a)!");
			/*A linha abaixo fala: se a média estiver entre 5 e 7...
			 *Cada sys.out representa uma única instrução. Se houvesse duas instruções, 
			 *o uso de chaves seria obrigatório.
			 *As estruturas if não tem ; pq o fechamento é representado pelas {}*/
		}else if (media >= 5 && media < 7 ) {
		System.out.println("Aluno(a) em Recuperação.");
		}else {
			System.out.println("Aluno(a) Reprovado(a).");
		}
		
		
		leia.close();
	}

}
