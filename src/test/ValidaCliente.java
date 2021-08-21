package test;

import model.cliente.*;
import utils.BonificacaoUtil;
import utils.AutenticacaoUtil;

public class ValidaCliente {

	public static void test() {
		Administrador administrador = new Administrador();

		administrador.setNome("Administrador");
		administrador.setDocumento("111.111.111-11");
		administrador.setSalario(1000.00);
		administrador.setSenha(1111);

		Cliente cliente = new Cliente();

		cliente.setSenha(2222);

		Vendedor vendedor = new Vendedor();

		vendedor.setNome("Designer");
		vendedor.setDocumento("222.222.222-22");
		vendedor.setSalario(2000.00);

		System.out.println("Verificando acesso...");

		AutenticacaoUtil autenticacaoUtil = new AutenticacaoUtil();

		System.out.println("Administrador...");

		autenticacaoUtil.autentica(administrador);

		System.out.println("Cliente...");

		autenticacaoUtil.autentica(cliente);

		System.out.println("Verificando bonificação");

		BonificacaoUtil bonificacaoUtil = new BonificacaoUtil();

		System.out.println("Administrador...");

		bonificacaoUtil.registra(administrador);

		System.out.println("Vendedor...");

		bonificacaoUtil.registra(vendedor);

		System.out.println("Bonificação total: " + bonificacaoUtil.getSoma());
	}
}
