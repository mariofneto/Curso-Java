package entities;

public final class ContaEmpresarial extends Conta{
    private Double limiteEmprestimo;

    public ContaEmpresarial() {
        super();
    }

    public ContaEmpresarial(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(Double quantidade){
        if(quantidade <= limiteEmprestimo){
            limiteEmprestimo -= quantidade;
        }
    }
    @Override
    public void saque(Double quantidade){
        super.saque(quantidade);
        saldo -= 2.0;
    }
}
