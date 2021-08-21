package model.cliente;

public class Cliente implements Autenticavel {

    private final Autenticacao autenticador;

    // constructors

    public Cliente() {
        this.autenticador = new Autenticacao();
    }

    // implements

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
