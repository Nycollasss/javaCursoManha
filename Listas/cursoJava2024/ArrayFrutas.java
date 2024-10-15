package cursoJava2024;

public class ArrayFrutas {
	private String nome;
	private String cor;
	private double peso; // em gramas

	// Construtor da classe Frutas:
	public ArrayFrutas(String nome, String cor, double peso) {
		this.nome = nome;
		this.cor = cor;
		this.peso = peso;
	}

	// Métodos para acessar os atributos:
	// Acessando o nome;
	public String getNome() {
		return nome;
	}

	// Acessando o nome;
	public String Cor() {
		return cor;
	}

	// Acessando o nome;
	public double Peso() {
		return peso;
	}

	// Método para imprimir as informações das frutas:
	public void imprimirInfos() {
		System.out.println("Fruta: " + nome + ", Cor: " + cor + ", Peso: " + peso + " g");
	}

	// Classe principal:
	public class main {
		public static void main(String[] args) {
			// Criação de um array de objetos de classe ArrayFrutas:
			ArrayFrutas[] arrayFrutas = { new ArrayFrutas("Maçã", "Vermelha", 150.5),
					new ArrayFrutas("Banana", "Amarela", 125.5), new ArrayFrutas("laranja", "Laranja", 180),
					new ArrayFrutas("Uva", "Verde", 200.5), new ArrayFrutas("Manga", "Verde", 2000.5), };

			// Exibindo informações de cada fruta:
			System.out.println("Informações sobre as frutas: ");
			for (int i = 0; i < arrayFrutas.length; i++) {
				arrayFrutas[i].imprimirInfos();
			}
		}
	}

	public static void main(String[] args) {

	}

}
