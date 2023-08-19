import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Entre com o numero de contribuintes: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= n; i++){
            System.out.println("Contribuinte #"+i+":");
            System.out.print("Pessoa_Física ou Pessoa_Juridica (f/j)? ");
            char res = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda Anual: ");
            Double rendaAnual = sc.nextDouble();

            if(res == 'f'){
                System.out.print("Gastos com saúde: ");
                Double gastosSaude = sc.nextDouble();

                list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            }
            else {
                System.out.print("Numero de funcionários: ");
                Integer numFuncionarios = sc.nextInt();

                list.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
            }
        }

        Double todosImpostos = 0.0;
        System.out.println();
        System.out.println("Impostos Pagos:");
        for(Contribuinte c : list){
            System.out.println(c.getNome()+": $ "+String.format("%.2f",c.imposto()));
            todosImpostos += c.imposto();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $"+ String.format("%.2f", todosImpostos));
    }
}