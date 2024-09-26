package cursoJava2024;

import java.util.Scanner;

  public class IfTernario {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int numero = scanner.nextInt();
		
		String resultado = (numero >= 18) ? "Se caso a pessoa for maior de 18." : "Se caso a pessoa for menos de 18";

		System.out.println(resultado);
		
	
	}

}
