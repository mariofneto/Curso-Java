import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluguel[] quartosAlugar = new Aluguel[10];
        int quarto = 0;

        System.out.print("Quantos estudantes irão alugar os quartos? ");
        int resposta = sc.nextInt();
        sc.nextLine();


        for(int i = 1; i <= resposta; i++){
            System.out.println("Aluguel #"+i+":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            quarto = sc.nextInt();
            sc.nextLine();

            quartosAlugar[quarto] = new Aluguel(nome, email);
        }

        System.out.println("Quartos ocupados: ");
        for(int c = 0; c < 10; c++) {
            if(quartosAlugar[c] != null) {
                System.out.println(c+": "+quartosAlugar[c]);
            }
        }








    }
}