import java.sql.SQLOutput;
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

        //Scanner sc = new Scanner(System.in);

        //final double pi = 3.14159;

        //System.out.println("Valor do raio de um círculo: ");
        //double raioCirculo = sc.nextDouble();
        //double areaCirculo = pi * Math.pow(raioCirculo, 2);

        //System.out.printf("AREA = %.4f%n", areaCirculo);

        /*
            EXERCICIO 03

            Fazer um programa para ler quatro valores inteiros A, B, C e D.
            A seguir, calcule e mostre a diferença do produto
            de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        */
        /*
            Scanner sc = new Scanner(System.in);

            int a, b, c, d;
            System.out.print("A: ");
            a = sc.nextInt();
            System.out.print("B: ");
            b = sc.nextInt();
            System.out.print("C: ");
            c = sc.nextInt();
            System.out.print("D: ");
            d = sc.nextInt();

            int diferenca = (a * b - c * d);

            System.out.println("DIFERENCA = "+ diferenca);
        */

        /*
            EXERCICIO 04

            Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
            o valor que recebe por hora e calcula o salário desse funcionário. A seguir,
            mostre o número e o salário do funcionário, com duas casas decimais

        */

        /*
            Scanner sc = new Scanner(System.in);

            System.out.print("NUMERO FUNCIONARIO: ");
            int numFuncionario = sc.nextInt();
            System.out.print("NUMERO DE HORAS: ");
            int numHoras = sc.nextInt();
            System.out.print("VALOR DAS HORAS: ");
            double valorHora = sc.nextDouble();

            double salario = numHoras * valorHora;

            System.out.println("NUMBER = "+ numFuncionario);
            System.out.printf("SALARY = U$ %.2f%n", salario);
        */

        /*
            EXERCICIO 05

            Fazer um programa para ler o código de uma peça 1, o número de peças 1,
            o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2
            e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
         */


            Scanner sc = new Scanner(System.in);
        /*
            System.out.print("Código 1: ");
            int cod1 = sc.nextInt();
            System.out.print("Número de peças 1: ");
            int numPecas1 = sc.nextInt();
            System.out.print("Valor unitário de peças 1: ");
            double valorPecas1 = sc.nextDouble();

            System.out.print("Código 2: ");
            int cod2 = sc.nextInt();
            System.out.print("Número de peças 2: ");
            int numPecas2 = sc.nextInt();
            System.out.print("Valor unitário de peças 2: ");
            double valorPecas2 = sc.nextDouble();

            double valorPagar = numPecas1 * valorPecas1 + numPecas2 * valorPecas2;

            System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagar);
        */

        /*
            EXERCICIO 06

            Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
            Em seguida, calcule e mostre:

            a) a área do triângulo retângulo que tem A por base e C por altura.
            b) a área do círculo de raio C. (pi = 3.14159)
            c) a área do trapézio que tem A e B por bases e C por altura.
            d) a área do quadrado que tem lado B.
            e) a área do retângulo que tem lados A e B.
         */

        /*
            final double pi = 3.14159;
            Scanner sc = new Scanner(System.in);

            System.out.print("A: ");
            double a = sc.nextDouble();
            System.out.print("B: ");
            double b = sc.nextDouble();
            System.out.print("C: ");
            double c = sc.nextDouble();

            double areaTrianguloRetangulo = a * c / 2;
            double areaCirculo = pi * Math.pow(c, 2);
            double areaTrapezio = (a + b) * c / 2;
            double areaQuadrado = Math.pow(b, 2);
            double areaRetangulo = a * b;

            System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n",
                    areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);
        */


        /*
            ex 01 oop (file:///C:/Users/marii/Downloads/03-classes-atributos-membros-staticos.pdf)
         */

        /*
        Rectangle retan = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        retan.Width = sc.nextDouble();
        retan.Height = sc.nextDouble();

        System.out.println("AREA = "+ String.format("%.2f", retan.Area()));
        System.out.println("PERIMETER = "+ String.format("%.2f", retan.Perimeter()));
        System.out.println("DIAGONAL = "+ String.format("%.2f", retan.Diagonal()));

        */

        /*
         ex 02
         */
        /*
        Employee func = new Employee();

        System.out.print("Name: ");
        func.name = sc.nextLine();
        System.out.print("Groos salary: ");
        func.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        func.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f%n", func.name, func.netSalary());

        System.out.print("Which percentage to increase salary? ");
        func.incraseSalary(sc.nextDouble());

        System.out.printf("Updated data: %s, $ %.2f%n", func.name, func.netSalary());
        */

        /*
        ex 03
         */
        /*
        Student student = new Student();

        student.name = sc.nextLine();
        student.gradeA = sc.nextDouble();
        student.gradeB = sc.nextDouble();
        student.gradeC = sc.nextDouble();

        student.finalGrade();
        */

        // ex currencyConverter
        /*
        System.out.print("What is the dollar price? ");
        double dolarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        double result = CurrencyConverter.dolarToReal(amount, dolarPrice);

        System.out.printf("Amount to be paid in reais = %.2f%n", result);
        */






    }
}