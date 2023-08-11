import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = s.nextInt();
        int[][] num = new int[n][n];

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                num[i][j] = s.nextInt();
            }
        }

        System.out.println("Main Diagonal: ");
        int j = 0;
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i][j] + " ");
            j++;
        }
        System.out.println();
        System.out.println("Negative Numbers: ");
        int somaNegativos = 0;
        for(int i = 0; i < num.length; i++){
            for(int k = 0; k < num[i].length; k++){
                if(num[i][k] < 0){
                    somaNegativos++;
                }
            }
        }
        System.out.println(somaNegativos);

        s.close();
    }
}