package cursoJava2024;

public class ArraysSimples {

	public static void main(String[] args) {
		//Criando um Array de supermercado(lista de compras):
		String[] mercado = {"Arroz", "Açúcar", "Danone", "Café", "Leite", "Refrigerante", "Manteiga", "Feijão", "Sal", "Macarrão"};
		
		//Exibindo apenas o terceiro item da lista:
		System.out.println("Item Selecionado:"+ mercado[1]);//Danone!
	   //Todo Array começa com zero !
		
		//Exibindo todos os itens do Array:
		//Lendo a linha "item < mercadp.length": Enquanto item for menor do que o comprimento de itens do array, faça algo!
		
		for (int item = 0; item < mercado.length; item++) {
			System.out.println(mercado[item]);
		}
	}

}
