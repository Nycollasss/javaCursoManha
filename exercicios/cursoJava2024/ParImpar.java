package cursoJava2024;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite seu numero:");

			int valor = scanner.nextInt();
			; // exemplo de número
			if (valor % 2 == 0) {
				System.out.println("O número é par!");
			} else {
				System.out.println("O número é ímpar!");
				
			}
		}
	}


}
