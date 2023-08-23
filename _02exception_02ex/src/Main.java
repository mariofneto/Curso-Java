import model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Entre com os dados da conta");
            System.out.print("Numero Da Conta: ");
            Integer numConta = sc.nextInt();
            System.out.print("Proprietário: ");
            String proprietario = sc.nextLine();
            sc.nextLine();
            System.out.print("Saldo inicial: ");
            Double saldo = sc.nextDouble();
            System.out.print("Saque limite: ");
            Double saqueLimite = sc.nextDouble();

            ContaBancaria cb = new ContaBancaria(numConta, proprietario, saldo, saqueLimite);
            System.out.println();
            System.out.print("Entre com a quantidade para o saque: ");
            Double quantSaque = sc.nextDouble();

            cb.saque(quantSaque);

        }
        catch (DomainException e){
            System.out.println("Erro no saque: " + e.getMessage());
        }

        sc.close();
    }
}