package entities;

public final class ContaPoupanca extends Conta{
    private Double taxaJuros;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void atualizarSaldoComJuros(){
        saldo += saldo * taxaJuros;
    }

    @Override
    public void saque(Double quantidade){
        saldo -= quantidade;
    }
}
