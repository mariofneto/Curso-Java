package entities;

import enums.PedidoStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
    private Date momento = new Date();
    private PedidoStatus status;
    private Cliente cliente;
    private List<PedidoItens> pedidoItens = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(PedidoStatus status, Cliente cliente) {
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public PedidoStatus getStatus() {
        return status;
    }

    public void setStatus(PedidoStatus status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<PedidoItens> getPedidoItens() {
        return pedidoItens;
    }

    public void addItem(PedidoItens pedido){
        pedidoItens.add(pedido);
    }

    public void removeItem(PedidoItens pedido){
        pedidoItens.remove(pedido);
    }

    public Double total(){
        Double somaTotal = 0.00;
        for(PedidoItens p : pedidoItens){
            somaTotal += p.subTotal();
        }

        return somaTotal;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Resumo do Pedido: \n");
        sb.append("Momento do pedido: "+ sdf1.format(momento) + "\n");
        sb.append("Status do pedido: "+ status+ "\n");
        sb.append("Cliente: "+ cliente.getNome() + " " + "("+sdf2.format(cliente.getNascimento())+ ")" + " - " + cliente.getEmail() +
                "\n");
        sb.append("Itens do pedido: \n");
        for(PedidoItens p : pedidoItens){
            sb.append(p.getProduto().getNome() + ", "
                    +"$"+String.format("%.2f", p.getPreco())+ ", "
                    +"Quantidade: "+ p.getQuantidade() + ", "
                    +"Subtotal: "+ "$"+String.format("%.2f", p.subTotal()) + "\n"
                    );
        }
        sb.append("Preço total: " + "$"+String.format("%.2f", total()));
        return sb.toString();
    }
}
