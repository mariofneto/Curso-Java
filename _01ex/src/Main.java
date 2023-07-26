import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);

        System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);

        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);

         */

        /*
            EXERCICIO 01

            Faça um programa para ler dois valores inteiros,
            e depois mostrar na tela a soma desses números com uma
            mensagem explicativa, conforme exemplos
        */

        /*
        int num1 = 10;
        int num2 = 30;
        int soma = num1 + num2;

        System.out.println("SOMA = "+ soma);
        */

        /*
            EXERCICIO 02

            Faça um programa para ler o valor do raio de um círculo,

            e depois mostrar o valor da área deste círculo com quatro
            casas decimais conforme exemplos.

            Fórmula da área: area = π . raio ao quadrado

            Considere o valor de π = 3.14159
         */

        Scanner sc = new Scanner(System.in);

        final double pi = 3.14159;

        System.out.println("Valor do raio de um círculo: ");
        double raioCirculo = sc.nextDouble();
        double areaCirculo = pi * Math.pow(raioCirculo, 2);

        System.out.printf("AREA = %.4f%n", areaCirculo);


    }
}