package cursoJava2024;

//Exercicio para remover duplicatas(distint)
//Apaga valores repetidos em uma lista de inteiros
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatas {2
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,2,3,4,4,5);
		
		//Removendo duplicatas:
		numeros.stream().distinct().forEach(System.out::println);
	}

}
