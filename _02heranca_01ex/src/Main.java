import entities.Funcionario;
import entities.Tercerizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Entre com o número de funcionários: ");
        int res = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= res; i++){
            System.out.println("Funcionario #"+i+":");
            System.out.print("Tercerizado (y/n)? ");
            char eTercerizado = sc.next().charAt(0);
            sc.nextLine();

            if(eTercerizado == 'y'){
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Horas: ");
                int horas = sc.nextInt();
                System.out.print("Valor por hora: ");
                double valorPorHora = sc.nextDouble();
                System.out.print("Valor adicional: ");
                double valorAdicional = sc.nextDouble();

                Tercerizado t = new Tercerizado(nome, horas, valorPorHora, valorAdicional);
                funcionarios.add(t);
            }
            else if(eTercerizado == 'n'){
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Horas: ");
                int horas = sc.nextInt();
                System.out.print("Valor por hora: ");
                double valorPorHora = sc.nextDouble();

                Funcionario f = new Funcionario(nome, horas, valorPorHora);
                funcionarios.add(f);
            }
            else {
                System.out.println("Apenas (y/n)");
            }
        }

        System.out.println("PAYMENTS: ");
        for(Funcionario f : funcionarios){
            System.out.println(f);
        }

    }
}