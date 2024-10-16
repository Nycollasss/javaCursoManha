package cursoJava2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NomesOrdenados {
	
	public static void main(String[] args) {
		
		List<String> nomes = Arrays.asList("Carlos", "Bruna", "Daniel", "Ariana");
		List<String> nomesOrdenados = nomes.stream()
				                           .sorted()
				                           .collect(Collectors.toList());
		
		System.out.println(nomesOrdenados);
		
	}

}
