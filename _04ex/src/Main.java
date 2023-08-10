import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

            // VERIFICAÇÃO SE EXISTE O ID NA LISTA

            for(Funcionario l : lista){
                if(l.getId() == id){
                    System.out.println("Esse id ja existe!");
                    break;
                }
            }

            lista.add(new Funcionario(id, nome, salario));
        }

        System.out.print("Entre com o id do funcionário que ira receber o aumento: ");
        int idFunc = sc.nextInt();

        // ESSA VARIAVEL AUX FOI PARA CONTAR SE EXISTIA ALGUEM COM O ID, SE SIM AUMENTAVA 1 NO VALOR
        int aux = 0;

        for(Funcionario l : lista){
            if(l.getId() == idFunc){
                System.out.print("Entre com a porcentagem: ");
                double porc = sc.nextDouble();

                l.increaseSalary(porc);
                aux++;
            }
        }

        // ENTAO SE O VALOR FOR MENOR QUE 1 É PQ NAO AUMENTOU NADA, PORTANTO NAO EXISTE O ID
        if(aux < 1){
            System.out.println("Não existe esse id!");
        }

        System.out.println();
        System.out.println("Lista de funcionários: ");
        for(Funcionario l : lista){
            System.out.println(l);
        }


    }
}