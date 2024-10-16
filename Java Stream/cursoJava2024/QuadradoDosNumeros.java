package cursoJava2024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuadradoDosNumeros {

	public static void main(String[] args) {
		// 1. Criando uma lista de números
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		
		// 2. Transformando a lista: calculando o quadrado de cada número
		List<Integer> quadrados = numeros.stream()
				                         .map(n -> n * n)
				                         .collect(Collectors.toList());
		
		// 3. Mostrando a lista com os quadrados
		System.out.println(quadrados);

	}

}
