import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionários estão registrados? ");
        int n = sc.nextInt();
        List<Funcionario> lista = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println("Funcionário #"+(i+1)+":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            System.out.println();

            lista.add(new Funcionario(id, nome, salario));
        }

        System.out.print("Entre com o Id da pessoa que terá um aumento: ");
        int id = sc.nextInt();

        for(int i = 0; i < lista.size(); i++){
            if(){
                System.out.print("Entre com a porcentagem: ");
                double porc = sc.nextDouble();

                listaFuncionario[i].increaseSalary(porc);
            }

        }

        System.out.println();
        System.out.println("Lista de Funcionários");

        for(Funcionario func : listaFuncionario){
            System.out.println(func);
        }



    }
}