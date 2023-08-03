import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
           e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos
        */

        /*
        System.out.print("Quantos números deseja digitar? ");
        int resposta = sc.nextInt();
        int[] numeros = new int[resposta];


        if(resposta > 10){
            System.out.print("[ERRO] Número máximo é 10");
        }
        else{
            for(int c = 0; c < resposta; c++){
                System.out.print("Digite um número: ");
                numeros[c] = sc.nextInt();
            }

            System.out.println("NÚMEROS NEGATIVOS: ");

            for(int c = 0; c < numeros.length; c++){
                if(numeros[c] < 0){
                    System.out.println(numeros[c]);
                }
            }
        }
        */

        /*
            Faça um programa que leia N números reais e armazene-os em um vetor.
            Em seguida:
            - Imprimir todos os elementos do vetor
            - Mostrar na tela a soma e a média dos elementos do vetor
         */
        /*
        System.out.print("Quantos números deseja digitar? ");
        int resposta = sc.nextInt();

        double[] numerosReais = new double[resposta];
        double soma = 0;
        double media;

        for(int c = 0; c < numerosReais.length; c++){
            System.out.print("Digite um número: ");
            numerosReais[c] = sc.nextDouble();
        }

        System.out.print("VALORES = ");

        for(int c = 0; c < numerosReais.length; c++){
            System.out.print(numerosReais[c]+" ");
            soma += numerosReais[c];
        }

        System.out.printf("%nSOMA = %.2f%n", soma);

        media = soma / numerosReais.length;

        System.out.printf("MEDIA = %.2f%n", media);
        */

        /*
            Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
            tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
            bem como os nomes dessas pessoas caso houver.
         */

        System.out.print("Quantas pessoas serão digitadas? ");
        int N = sc.nextInt();

        String[] nomes = new String[N];
        int[] idades = new int[N];
        double[] alturas = new double[N];

        double alturaSoma = 0.00;
        double alturaMedia;
        int qtdPessoasMenores16 = 0;

        for(int c = 0; c < N; c++){
            System.out.println("Dados da "+ (c+1) +"a pessoa:");
            System.out.print("Nome: ");
            nomes[c] = sc.nextLine();
            sc.nextLine();
            System.out.print("Idade: ");
            idades[c] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[c] = sc.nextDouble();

            alturaSoma += alturas[c];

            if(idades[c] < 16){
                qtdPessoasMenores16++;
            }
        }

        // porcentagemmenor16 = qtdpessoasmenores16 * (1.0 / N)
        double porcentagemMenor16 = qtdPessoasMenores16 * (1.0 / N);

        alturaMedia = alturaSoma / N;

        System.out.printf("%nAltura média: %.2f%n", alturaMedia);
        System.out.println(qtdPessoasMenores16);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%n", porcentagemMenor16);



    }
}