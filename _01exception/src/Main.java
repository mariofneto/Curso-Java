import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];

        try{
            nomes[0] = sc.nextLine();
            nomes[3] = sc.nextLine();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("[ERRO] O valor está fora do limite do array");
        }

    }
}