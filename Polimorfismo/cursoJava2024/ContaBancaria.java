package cursoJava2024;

public class ContaBancaria {
	// Atributo privado:
	private double saldo;

	// Construtor para inicializar o saldo:
	public ContaBancaria(double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	//Metodo para depositar dinheiro na conta:
	public void depositar(double valor) {
		if ( valor > 0 ) {
			saldo += valor;
			System.out.println("Deposito de "+valor+" realizado!");
		} else {
			System.out.println("Valor de depósito invalido.");
		}
		
    }

	// Metodo publico para sacar sua GRANA:
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$ " + valor + " realizado! ");
		} else {
			System.out.println("Saque inválido. Saldo insuficiente ou valor negativo!");
		}
	}

	// Método publico para consultar o saldo(getter):
	public double getSaldo() {
		return saldo;
	}
}
