import entities.Conta;
import entities.ContaEmpresarial;
import entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Conta c = new Conta(1001, "Mario", 1000.00);
        c.saque(500.00);
        System.out.println(c.getSaldo());

        Conta cp = new ContaPoupanca(1002, "Odila", 1000.00, 0.01);
        cp.saque(500.00);
        System.out.println(cp.getSaldo());

        Conta ce = new ContaEmpresarial(1003, "Sol", 1000.00, 250.00);
        ce.saque(500.00);
        System.out.println(ce.getSaldo());


    }
}