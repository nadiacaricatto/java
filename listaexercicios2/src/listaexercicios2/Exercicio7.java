package listaexercicios2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, resultado;
		int opcao;
		        
		System.out.print("Digite o primeiro número: ");
		n1 = leia.nextFloat();
		        
		System.out.print("Digite o segundo número: \n");
		n2 = leia.nextFloat();
		        
		System.out.println("Escolha a operação e digite a opção numérica correspondente: \n"
				+ "1 - Soma\n"
				+ "2 - Subtração\n"
				+ "3 - Multiplicação\n"
				+ "4 - Divisão\n");
		
		System.out.print("Digite o código da operação: ");
		opcao = leia.nextInt();
		        
		switch (opcao) {
		case 1:
		       resultado = n1 + n2;
		       System.out.printf("A soma dos valores digitados é %.2f", resultado);
		       break;
		           
		case 2:
		      resultado = n1 - n2;
		      System.out.printf("A subtração dos valores digitados é %.2f", resultado);
		      break;
		
		case 3:
		      resultado = n1 * n2;
		      System.out.printf("O produto da multiplicação é %.2f", resultado);
		      break;
		case 4:
		      if (n2 != 0) {
		      resultado = n1 / n2;
		   
		      System.out.printf("A divisão dos valores digitados é %.2f", resultado);
		      
		      } else {
		      System.out.println("Não é possível dividir por 0.");
		      }
		      break;
		      
		default:
		      System.out.println("Operação Inválida!");
		      }
		        
		        leia.close();
		    }
		}
