package utils;

import model.cliente.Funcionario;

public class BonificacaoUtil {
	
	private double soma;

	public double getSoma() {
		return soma;
	}

	public void registra(Funcionario funcionario) {
		double bonificacao = funcionario.getBonificacao();

		System.out.println("Bonificação: " + bonificacao);

		this.soma = this.soma + bonificacao;
	}
}
