package listaexercicios3;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		/*
		 * EXERCÍCIO 3 Enunciado: Escreva um algoritmo em Java, que leia a idade de
		 * várias pessoas (números inteiros), via teclado, e mostre na tela o total de
		 * pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade
		 * seja maior que 50 anos. A leitura dos dados deve ser finalizada ao digitar
		 * uma idade negativa. Na construção do Algoritmo, utilize os seguintes
		 * conteúdos: Laços Condicionais e Laço de Repetição WHILE
		 * 
		 * 
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Responda a pesquisa abaixo e ganhe um cupom de 10%" + "na sua próxima visita!\n");

		int pessoas;

		int menor21 = 0, maior50 = 0;

		System.out.print("Informe o número total de pessoas da sua família que visitaram nosso estabelecimento pela última vez: ");
		pessoas = leia.nextInt();

		int i = 1;

		while (i <= pessoas) {
			System.out.printf("Idade da pessoa %d: ", i);
			int idade = leia.nextInt();

			if (idade < 0) {
				System.out.print("Idade digitada em formato inválido.\n"
						+ "Sua pesquisa foi encerrada e você perdeu seu cupom!");
				break;
			}

			if (idade < 21) {
				menor21++;
			} 
			else if (idade > 50) {
				maior50++;
			}

			i++;

		}

		System.out.println("Agradecemos sua participação!\n"
				+ "Sua pesquisa foi encerrada com sucesso "
				+ "e você ganhou um cupom!\n" + "Confira o resultado abaixo:\n");
		System.out.println("Total de Clientes menores de 21 anos: " + menor21);
		System.out.println("Total de Clientes maiores de 50 anos: " + maior50);

		
		// A partir daqui eu fiz com ajuda do ChatGPT porque eu queria explorar um pouco mais e "brincar" com o contexto do código. 
		
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVXWYZ0123456789";

		Random rand = new Random();

		StringBuilder cupom = new StringBuilder();

		int tamanhoCupom = 5;

		for (int b = 0; b < tamanhoCupom; b++) {
			int index = rand.nextInt(caracteres.length());
			cupom.append(caracteres.charAt(index));

		}

		System.out.printf("\nAqui está seu cupom: %s.\n Informe o código a um de nossos atendentes na sua próxima visita!", cupom.toString());

		leia.close();
	}

}
