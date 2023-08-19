import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import enums.Cor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Forma> formas = new ArrayList<>();

        System.out.print("Entre com o número de formas: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Forma #"+i+":");
            System.out.print("Retângulo ou Circulo (r/c)? ");
            char forma = sc.next().charAt(0);
            System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
            Cor cor = Cor.valueOf(sc.next().toUpperCase());
            sc.nextLine();

            if(forma == 'r'){
                System.out.print("Largura: ");
                Double largura = sc.nextDouble();
                System.out.print("Altura: ");
                Double altura = sc.nextDouble();

                formas.add(new Retangulo(cor, largura, altura));
            }
            if(forma == 'c'){
                System.out.print("Raio: ");
                Double raio = sc.nextDouble();

                formas.add(new Circulo(cor, raio));
            }
        }
        System.out.println();
        System.out.println("AREA DAS FORMAS: ");

        for (Forma f : formas){
            System.out.printf("%.2f%n",f.area());
        }
    }
}