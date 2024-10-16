package cursoJava2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaImpares {

	public static void main(String[] args) {
		// Lista de inteiros
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
	    // Filtra os números pares
		List<Integer> numerosImpares = new ArrayList<>();
		for (int num : numeros) {
			if (num % 2 == 1) {
				numerosImpares.add(num);
			}
		}
		
// Exibe os números pares
System.out.println("Números impares: " + numerosImpares);
		
	}

}
