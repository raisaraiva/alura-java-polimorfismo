package model.cliente;

public abstract class Funcionario {

	private String documento;

	private String nome;

	private double salario;

	// getters and setters

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// methods

	public abstract double getBonificacao();
}
