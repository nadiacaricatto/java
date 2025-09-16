package listaexercicios2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        String nome, cargo = "";
        int codigo;
        float salario, reajusteSal;

        System.out.print("Digite o nome do colaborador: ");
        nome = leia.nextLine();

        System.out.print("Digite o código do cargo de 1 a 6, sendo: \n"
        		+ "1 - Gerente\n"
        		+ "2 - Vendedor\n"
        		+ "3 - Supervisor\n"
        		+ "4 - Motorista\n"
        		+ "5 - Estoquista\n"
        		+ "6 - Técnico de TI\n");
        codigo = leia.nextInt();

        System.out.print("Digite o salário atual: ");
        salario = leia.nextFloat();

        switch (codigo) {
            case 1:
                cargo = "Gerente";
                reajusteSal = salario + (salario * 0.10f);
                break;

            case 2:
                cargo = "Vendedor";
                reajusteSal = salario + (salario * 0.07f);
                break;

            case 3:
                cargo = "Supervisor";
                reajusteSal = salario + (salario * 0.09f);
                break;

            case 4:
                cargo = "Motorista";
                reajusteSal = salario + (salario * 0.06f);
                break;

            case 5:
                cargo = "Estoquista";
                reajusteSal = salario + (salario * 0.05f);
                break;

            case 6:
                cargo = "Técnico de TI";
                reajusteSal = salario + (salario * 0.08f);
                break;

            default:
                System.out.println("Código de cargo inválido!");
                leia.close();
                return;
        }

        System.out.printf("\nColaborador: %s\nCargo: %s\nNovo Salário: R$ %.2f\n",
        nome, cargo, reajusteSal);

        leia.close();
 	}

}
