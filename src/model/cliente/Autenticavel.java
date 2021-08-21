package model.cliente;

public interface Autenticavel {

    void setSenha(int senha);

    boolean autentica(int senha);
}
