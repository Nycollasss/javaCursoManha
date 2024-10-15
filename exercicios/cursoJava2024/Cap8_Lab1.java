package cursoJava2024;

public class Cap8_Lab1 {

	        // Método estático que retorna o maior número de um array
	        public static int maiorNumero1(int[] numeros) {
	            int maior = numeros[0]; // Assume que o primeiro número é o maior

	            // Percorre o array para encontrar o maior número
	            for (int i = 1; i < numeros.length; i++) {
	                if (numeros[i] > maior) {
	                    maior = numeros[i]; // Atualiza o maior número encontrado
	                }
	            }

	            return maior; // Retorna o maior número
	        }
	    

	    public static void main(String[] args) {
	        // Declara um array do tipo int e o inicializa
	        int[] numeros = {5, 12, 8, 3, 15, 2}; // Você pode mudar os números conforme desejar

	        // Chama o método maiorNumero e armazena o retorno em uma variável
	        int maior = Cap8_Lab1.maiorNumero1(numeros);

	        // Imprime o maior número encontrado+
	        System.out.println("O maior número do array é: " + maior);
	    }
	}


