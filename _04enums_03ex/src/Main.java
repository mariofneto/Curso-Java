import entities.Cliente;
import entities.Pedido;
import entities.PedidoItens;
import entities.Produto;
import enums.PedidoStatus;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Nascimento (DD/MM/YYYY):");
        String nascimentoEmString = sc.nextLine();

        Date nascimentoEmDate = sdf.parse(nascimentoEmString);
        Cliente c = new Cliente(nome, email, nascimentoEmDate);

        System.out.println("Entre com os dados do pedido: ");
        System.out.print("Status: ");
        PedidoStatus status = PedidoStatus.valueOf(sc.nextLine().toUpperCase());

        Pedido pedido = new Pedido(status, c);

        System.out.print("Quantidade de itens para o pedido? ");
        int res = sc.nextInt();

        for(int i = 1; i <= res; i++){
            sc.nextLine();
            System.out.println("Entre com o "+i+"° item: ");
            System.out.print("Produto nome: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Preço produto: ");
            Double precoProduto = sc.nextDouble();
            System.out.print("Quantidade: ");
            Integer quantidade = sc.nextInt();

            Produto produto = new Produto(nomeProduto, precoProduto);
            PedidoItens pedidoItens = new PedidoItens(produto, quantidade, precoProduto);
            pedido.addItem(pedidoItens);
        }

        System.out.print(pedido);







    }
}