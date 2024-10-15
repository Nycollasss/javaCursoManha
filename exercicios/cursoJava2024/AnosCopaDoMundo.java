package cursoJava2024;

public class AnosCopaDoMundo {

    public static void main(String[] args) {
        // Passo 2: Usar um loop for para começar em 1930 e incrementar de 4 em 4 anos
        for (int ano = 1930; ano <= 2023; ano += 4) {
            // Passo 3: Ignorar os anos de 1942 e 1946 (Segunda Guerra Mundial)
            if (ano == 1942 || ano == 1946) {
                continue; // Pula para o próximo ano
            }
            
            // Passo 4: Imprimir o ano da copa
            System.out.println("Copa do Mundo no ano de: " + ano);
        }
    }
}
