package model;

public class Conta {

	private static int total = 0;

	private int agencia;

	private int numero;

	private double saldo;

	private Cliente titular;

	// constructors

	public Conta(int agencia, int numero) {
		Conta.total++;

		System.out.println("O total de contas: " + Conta.total);

		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;

		System.out.println("Estou criando uma conta com o número: " + this.numero);
	}

	// getters and setters

	public static int getTotal() {
		return Conta.total;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	// methods

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saque(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;

			return true;
		} else {
			return false;
		}
	}

	public boolean transferencia(double valor, Conta destino) {
		if (this.saque(valor)) {
			destino.deposita(valor);

			return true;
		} else {
			return false;
		}
	}
}