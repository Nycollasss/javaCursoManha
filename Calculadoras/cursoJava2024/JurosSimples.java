package cursoJava2024;

import java.util.Scanner;

public class JurosSimples {
	public static void main(String[] args) {
		//Instanciando a classe(usando a classe) :
		Scanner scanner = new Scanner(System.in);
		
		//Entrada de valores: 
		System.out.println("---------------------");
		System.out.println("--- Calculadora de juros Simples ---");
		System.out.println("---------------------");
		System.out.println("Digite o capital");
		double capital = scanner.nextDouble();
		                                      
		System.out.println("Informe a taxa de juros(%)");
		double taxa = scanner.nextDouble();
			
		System.out.println("Informe o tempo(em anos)");
		int tempo = scanner.nextInt();
		
		//Calculando os juros;
		double juros = (capital * taxa * tempo )/100;
		System.out.println("O valor dos juros são: "+juros);
		
		//resultando:
		double total = capital + juros;
		System.out.println("O total investido + juros é de:" + total);
		
		scanner.close();
				

	}

}
