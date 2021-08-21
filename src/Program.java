import test.ValidaCliente;
import test.ValidaConta;

public class Program {

    public static void main(String[] args) {

        System.out.println("--------------------------------");
        System.out.println("ValidaConta");
        System.out.println("--------------------------------");
        ValidaConta.test(100, 50);
        System.out.println("--------------------------------");
        System.out.println("ValidaCliente");
        System.out.println("--------------------------------");
        ValidaCliente.test();
    }
}
