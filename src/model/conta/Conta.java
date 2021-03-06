package model.conta;

public abstract class Conta {

    private static int total = 0;

    private int agencia;

    private int numero;

    protected double saldo;

    private Cliente titular;

    // constructors

    public Conta(int agencia, int numero) {
        Conta.total++;

        this.agencia = agencia;
        this.numero = numero;
    }

    // getters and setters

    public static int getTotal() {
        return Conta.total;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");

            return;
        }

        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");

            return;
        }

        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    // methods

    public abstract void deposita(double valor);

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