import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o número de produtos: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= n; i++){
            System.out.println("Produto #"+i+":");
            System.out.print("Novo, usado ou importado (n/u/i)? ");
            char res = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            Double preco = sc.nextDouble();
            if(res == 'i'){
                System.out.print("Taxa Alfandega: ");
                Double taxaAlfandega = sc.nextDouble();
                produtos.add(new ProdutoImportado(nome, preco, taxaAlfandega));
            }
            else if(res == 'u'){
                sc.nextLine();
                System.out.print("Fabricado em (DD/MM/YYYY): ");
                Date fabricacao = sdf.parse(sc.nextLine());
                produtos.add(new ProdutoUsado(nome, preco, fabricacao));
            }
            else{
                produtos.add(new Produto(nome, preco));
            }
        }
        System.out.println();
        System.out.println("TAG PREÇOS: ");
        for(Produto p : produtos){
            System.out.println(p.precoTag());
        }

        sc.close();

    }
}