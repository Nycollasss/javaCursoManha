package cursoJava2024;

public class NumeroPrimo {
	    
	    public static void main(String[] args) {
	        // Passo 2: Declarar a variável "numero"
	        int numero = 4; // Você pode mudar esse número para testar outros valores
	        boolean ehPrimo = NumeroPrimo(numero);
	        
	        // Verificar se é primo e exibir o resultado
	        if (ehPrimo) {
	            System.out.println(numero + " é um número primo.");
	        } else {
	            System.out.println(numero + " não é um número primo.");
	        }
	    }
	    
	    // Passo 3: Implementar a lógica para verificar se é primo
	    public static boolean NumeroPrimo(int numero) {
	        // Números menores que 2 não são primos
	        if (numero < 2) {
	            return false;
	        }
	        
	        int contadorDivisores = 0;
	        
	        // Contar o número de divisores
	        for (int i = 1; i <= numero; i++) {
	            if (numero % i == 0) {
	                contadorDivisores++;
	            }
	        }
	        
	        // Passo 4: Se o número de divisores for superior a 2, não é primo
	        return contadorDivisores == 2;
	    }
	}
