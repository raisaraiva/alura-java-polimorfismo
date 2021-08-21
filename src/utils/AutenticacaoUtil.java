package utils;

import model.cliente.Autenticavel;

public class AutenticacaoUtil {

    public void autentica(Autenticavel autenticavel) {
        boolean autenticou = autenticavel.autentica(2222);

        if (autenticou) {
            System.out.println("Acesso liberado.");
        } else {
            System.out.println("Acesso negado, verifique as credenciais");
        }
    }
}
