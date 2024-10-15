package cursoJava2024;
		
import java.util.Scanner;

public class VerificaDiasDoMes {

    public static void main(String[] args) {
        // Passo 2: Declarar a variável do tipo String para armazenar o nome do mês
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do mês: ");
        String mes = scanner.nextLine().toLowerCase(); // Convertendo para minúsculo para evitar problemas
        
        // Passo 3: Utilizar o switch para decidir o número de dias
        switch (mes) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                System.out.println("O mês " + capitalize(mes) + " tem 31 dias.");
                break;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                System.out.println("O mês " + capitalize(mes) + " tem 30 dias.");
                break;
            case "fevereiro":
                System.out.println("O mês " + capitalize(mes) + " geralmente tem 28 dias, ou 29 em anos bissextos.");
                break;
            // Passo 4: Item default para tratar erros
            default:
                System.out.println("Erro: O nome do mês '" + capitalize(mes) + "' é inválido.");
        }
        
        scanner.close(); // Fechar o Scanner
    }

    // Método para capitalizar a primeira letra do mês (deixar a primeira letra maiúscula)
    public static String capitalize(String mes) {
        return mes.substring(0, 1).toUpperCase() + mes.substring(1);
    }
}
