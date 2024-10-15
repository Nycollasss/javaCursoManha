package cursoJava2024;

public class Cap8_Lab2 {
    public static void main(String[] args) {
        // Simulando a entrada de argumentos
        String[] simulatedArgs = {"33", "26", "54", "16"};

        // Verificando o tamanho do array simulatedArgs
        if (simulatedArgs.length > 0) {
            int soma = 0;

            // Somando os valores do array
            for (int i = 0; i < simulatedArgs.length; i++) {
                soma += Integer.parseInt(simulatedArgs[i]);
            }

            // Calculando a média
            double media = (double) soma / simulatedArgs.length;

            // Exibindo a lista de idades
            System.out.print(simulatedArgs[0]); // Imprime a primeira idade
            for (int i = 1; i < simulatedArgs.length; i++) {
                System.out.print(" " + simulatedArgs[i]); // Imprime as demais idades com espaço
            }

            // Exibindo o resultado da média
            System.out.printf("\né de: %.1f anos.\n", media);
        } else {
            // Mensagem de erro se o array simulatedArgs estiver vazio
            System.out.println("Entre com valores válidos para as idades");
        }
    }
}
