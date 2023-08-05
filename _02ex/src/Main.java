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
        /*
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
            nomes[c] = sc.next();
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

        // porcentagemmenor16 = (qtdpessoasmenores16 * (1.0 / N)) * 100
        double porcentagemMenor16 = (qtdPessoasMenores16 * (1.0 / N)) * 100;

        alturaMedia = alturaSoma / N;

        System.out.printf("%nAltura média: %.2f%n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagemMenor16);

        for(int c = 0; c < N; c++){
            if(idades[c] < 16){
                System.out.println(nomes[c]);
            }
        }
        */

        /*
            Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
            tela todos os números pares, e também a quantidade de números pares
         */

        /*System.out.print("Quantos numeros voce vai digitar? ");
        int resposta = sc.nextInt();
        int [] numeros = new int[resposta];
        int quantidadePares = 0;

        for(int c = 0; c < numeros.length; c++){
            System.out.print("Digite um numero: ");
            numeros[c] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES: ");

        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                System.out.print(numeros[i] + " ");
                quantidadePares++;
            }
        }
        System.out.println(" ");
        System.out.print("QUANTIDADE DE PARES = " + quantidadePares);
        */

        /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
        o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
        considerando a primeira posição como 0 (zero).
         */
        /*
        System.out.print("Quantos numeros voce vai digitar? ");
        int resposta = sc.nextInt();
        double[] numerosReais = new double[resposta];
        double maior = 0;
        int posicao = 0;

        for(int c = 0; c < numerosReais.length; c++){
            System.out.print("Digite um numero: ");
            numerosReais[c] = sc.nextDouble();

            if(numerosReais[c] > maior){
                maior = numerosReais[c];
                posicao = c;
            }
        }

        System.out.println("MAIOR VALOR = "+ maior);
        System.out.println("POSICAO DO MAIOR VALOR = "+ posicao);
        */

        /*
        Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
        terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
        o vetor C gerado.
         */

        /*System.out.print("Quantos valores vai ter cada vetor? ");
        int resposta = sc.nextInt();

        int [] vetorA = new int[resposta];
        int [] vetorB = new int[resposta];
        int [] vetorC = new int[resposta];

        System.out.println("Digite os valores do vetor A:");
        for(int c = 0; c < vetorA.length; c++){
            vetorA[c] = sc.nextInt();

        }

        System.out.println("Digite os valores do vetor B:");
        for(int c = 0; c < vetorB.length; c++){
            vetorB[c] = sc.nextInt();

        }

        System.out.println("VETOR RESULTANTE: ");
        for(int c = 0; c < vetorC.length; c++){
            System.out.println(vetorA[c] + vetorB[c]);

        }
        */

        /*
        Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
        mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
        os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
         */

        System.out.print("Quantos elementos vai ter o vetor? ");
        int resposta = sc.nextInt();

        double[] vetor = new double[resposta];
        double soma;
        double media;

        for(int c = 0; c < vetor.length; c++){
            System.out.print("Digite um numero: ");
            vetor[c] = sc.nextDouble();
            soma += vetor[c];
        }







    }
}