package model.conta;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        saldo += valor;
    }

    @Override
    public boolean saque(double valor) {
        return super.saque(valor + 0.2);
    }

    @Override
    public double getValorImposto() {
        return saldo * 0.01;
    }
}
