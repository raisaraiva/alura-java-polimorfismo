package test;

import model.conta.ContaCorrente;
import model.conta.ContaPoupanca;

public class ValidaConta {

	public static void test(double deposita, double transferencia) {
		ContaCorrente contaCorrente = new ContaCorrente(1, 1);
		ContaPoupanca contaPoupanca = new ContaPoupanca(1, 2);

		contaCorrente.deposita(deposita);

		System.out.println("Saldo antes da transferência");
		System.out.println("Conta corrente: " + contaCorrente.getSaldo());
		System.out.println("Conta poupança: " + contaPoupanca.getSaldo());

		boolean sucessoTransferencia = contaCorrente.transferencia(transferencia, contaPoupanca);

		if (sucessoTransferencia) {
			System.out.println("Transferência realizada com sucesso.");
			System.out.println("Saldo após da transferência");
			System.out.println("Conta corrente: " + contaCorrente.getSaldo());
			System.out.println("Conta poupança: " + contaPoupanca.getSaldo());
		} else {
			System.out.println("Crédito insuficiente.");
		}

		System.out.println("Valor do imposto da conta corrente: " + contaCorrente.getValorImposto());
	}
}
