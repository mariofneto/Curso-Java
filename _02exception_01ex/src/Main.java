import entities.Reserva;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            System.out.print("Numero do quarto: ");
            int numeroQuarto = sc.nextInt();
            sc.nextLine();
            System.out.print("Data de entrada (DD/MM/YYYY): ");
            Date entrada = sdf.parse(sc.nextLine());
            System.out.print("Data de saida (DD/MM/YYYY): ");
            Date saida = sdf.parse(sc.nextLine());

            if(!saida.after(entrada)){
                System.out.println("Erro na reserva: data de saida deve ser posterior a data de entrada!");
            }
            else {
                Reserva r1 = new Reserva(numeroQuarto, entrada, saida);
                System.out.println(r1);

                System.out.println();

                System.out.println("Entre com a atualização da reserva");
                System.out.print("Data de entrada (DD/MM/YYYY): ");
                Date entradaAtualizada = sdf.parse(sc.nextLine());
                System.out.print("Data de saida (DD/MM/YYYY): ");
                Date saidaAtualizada = sdf.parse(sc.nextLine());

                if(!entradaAtualizada.after(entrada) && !saidaAtualizada.after(saida)){
                    System.out.println("Erro na reserva: datas de atualização devem ser futuras!");
                }
                else {
                    r1.atualizarDatas(entradaAtualizada, saidaAtualizada);
                    System.out.println(r1);
                }
            }

    }
}