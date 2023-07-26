import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US); // mudando a localização do programa

        double a = 10.568968;
        System.out.println(a);
        System.out.printf("%.2f%n", a); // printf() nesse exemplo vai formatar com duas casas decimais
        System.out.printf("%.4f%n", a);

        // varios elementos em um printf()

        //String nome = "Maria";
        //int idade = 31;
        //double renda = 4000.0;

        /*
            %s = para strings
            %d = para inteiros
            %f = para floats
            %n = para quebra de linha
         */

        // System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

       /*
        AREA DE UM TRAPÉZIO

        Para calcular a área de um trapézio basta somar a base maior e base menor,
        multiplicar pela altura e depois, basta dividir o resultado por dois.
       */

        double baseMenor = 6;
        double baseMaior = 8;
        double altura = 5;

        double area = (baseMenor+baseMaior) * altura / 2;

        System.out.printf("%.2f%n", area);

        // input de dados

        Scanner sc = new Scanner(System.in);

        //char x = sc.next().charAt(0); // jeito de pegar um char no input
        //System.out.println("Você digitou: "+ x);

        // ** input's de dados na mesma linha **
        /*
        String nome;
        int idade;
        double dinheiro;

        nome = sc.next();
        idade = sc.nextInt();
        dinheiro = sc.nextDouble();

        System.out.println("Resultados:");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(dinheiro);
        */

        // ** quebra de linha pendente **
        /*
        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine(); // limpando o buffer de leitura do nextInt()
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados Digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
        */

        // ** funcoes matematicas **

        double raiz = Math.sqrt(4);
        double potencia = Math.pow(4, 2);
        double valorAbs = Math.abs(-2.53);
        long arredondado = Math.round(2.53);

        System.out.println("funções matemáticas: ");
        System.out.println("raiz quadrada de 4: "+ raiz);
        System.out.println("4 elevado a 2 potencia: "+ potencia);
        System.out.println("valor absoluto de -2.53: "+ valorAbs);
        System.out.println("valor arredondado de 2.53: "+ arredondado);



    }
}