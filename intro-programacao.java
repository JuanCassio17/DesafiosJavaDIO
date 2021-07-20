//DESAFIO 1 VISITA NA FEIRA

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int a = leitor.nextInt();
		int b = leitor.nextInt();
		int total = a+b;
		System.out.println("X = " + total);
		
	}
}

//DESAFIO 2 MULTIPLICAÇÃO SIMPLES

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
    int num1 = leitor.nextInt();
    int num2 = leitor.nextInt();
    int prod = num1*num2;
  
    System.out.println("PROD = " + prod);
	}
}

//DESAFIO 3 FOLHA DE PAGAMENTO

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numeroColaborador = leitor.nextInt();
		int horasTrabalhadas = leitor.nextInt();
		double salario = leitor.nextDouble();
		double total = horasTrabalhadas*salario;
		System.out.printf("NUMBER = " + numeroColaborador +
		"\nSALARY = " + "U$ " + "%.2f", total);
	}
}
