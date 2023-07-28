import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        Locale.setDefault(Locale.US); // mudando a localização do programa

        double a = 10.568968;
        System.out.println(a);
        System.out.printf("%.2f%n", a); // printf() nesse exemplo vai formatar com duas casas decimais
        System.out.printf("%.4f%n", a);
        */
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
        /*
        double baseMenor = 6;
        double baseMaior = 8;
        double altura = 5;

        double area = (baseMenor+baseMaior) * altura / 2;

        System.out.printf("%.2f%n", area);
        */
        // input de dados

        //Scanner sc = new Scanner(System.in);

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
        /*
        double raiz = Math.sqrt(4);
        double potencia = Math.pow(4, 2);
        double valorAbs = Math.abs(-2.53);
        long arredondado = Math.round(2.53);

        System.out.println("funções matemáticas: ");
        System.out.println("raiz quadrada de 4: "+ raiz);
        System.out.println("4 elevado a 2 potencia: "+ potencia);
        System.out.println("valor absoluto de -2.53: "+ valorAbs);
        System.out.println("valor arredondado de 2.53: "+ arredondado);
        */

        /*
            EXEMPLO OPERADORA DE TELEFONIA
         */

        // cada minuto que exceder a franquia de 100 minutos custa R$ 2.00
        Scanner sc = new Scanner(System.in);

        /*
            double plano = 50.00;
            int tempoLimite = 100; // em minutos


            System.out.print("Tempo gasto: ");
            int tempoGasto = sc.nextInt();

            int tempoExcedido = tempoGasto - tempoLimite; // calcula o quanto que passou do limite

            if(tempoGasto < tempoLimite){
                System.out.printf("Valor a pagar: R$ %.2f%n", plano);
            }
            else if(tempoGasto > tempoLimite){
                double acrescimoPlano = plano + (tempoExcedido * 2);
                System.out.printf("Valor a pagar: R$ %.2f%n", acrescimoPlano);
            }
        */

        /*
            EXEMPLO SWITCH CASE DIA DA SEMANA
         */

        /*
        System.out.print("Digite 1 ao 7 para o dia da semana desejado: ");
        int dia = sc.nextInt();

        switch(dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia da Semana inválido");
        }
        //*/

        /*
            CONDICIONAL TERNÁRIA
         */
        /*
        int a = 13;

        String result = (a > 4) ? "a é maior que " + 4 : "a é menor que " + 4;

        System.out.println(result);
        */

        /*
            ESTRUTURA REPETITIVA WHILE
         */
        /*
        int num = sc.nextInt();
        int soma = 0;
        while(num != 0){
            soma += num;
            num = sc.nextInt();

        }

        System.out.println("A soma dos numeros é: " + soma);
        */

         /*
            ESTRUTURA REPETITIVA FOR
         */
        /*
        int soma = 0;
        int repetir = sc.nextInt();
        int lerNum;

        for(int c = 0; c < repetir; c++){
            lerNum = sc.nextInt();
            soma += lerNum;
        }

        System.out.println(soma);
        */

        /*
            ex celsius para fahrenhheit usando do-while

            formula: multiplica celsius por 1,8 e somar 32
            caso digite "s", continue o programa
         */
        /*
        char res = 's';
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = celsius * 1.8 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
            System.out.print("Deseja repetir (s/n)?");
            res = sc.next().charAt(0);
        } while(res != 'n');
        */

        System.out.println("Enter three numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int maior = max(num1, num2, num3);

        showResult(maior);

        sc.close();
    }

    public static int max(int a, int b, int c){
        int max = a;
        if(b > a && b > c) {
            max = b;
        }
        else if(c > b && c > a){
            max = c;
        }
        return max;
    }

    public static void showResult(int m){
        System.out.println("O maior número é: " + m);
    }


}