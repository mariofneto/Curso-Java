import model.exceptions.DomainException;

public class ContaBancaria {
    private Integer numeroConta;
    private String proprietarioConta;
    private Double saldoConta;
    private Double limiteSaque;

    public ContaBancaria() {
    }

    public ContaBancaria(Integer numeroConta, String proprietarioConta, Double saldoConta, Double limiteSaque) {
        this.numeroConta = numeroConta;
        this.proprietarioConta = proprietarioConta;
        this.saldoConta = saldoConta;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getProprietarioConta() {
        return proprietarioConta;
    }

    public void setProprietarioConta(String proprietarioConta) {
        this.proprietarioConta = proprietarioConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void deposito(Double quantidade){
        saldoConta += quantidade;
    }

    public void saque(Double quantidade){
        if(quantidade > saldoConta && quantidade > limiteSaque){
            throw new DomainException("A quantidade excedeu o limite de saque");
        }
        if(quantidade > saldoConta){
            throw new DomainException("Saldo insuficiente");
        }
        if (quantidade > limiteSaque) {
            throw new DomainException("A quantidade excedeu o limite de saque");
        }
        else{
            saldoConta -= quantidade;
            System.out.print("Novo Saldo: "+ String.format("%.2f%n", saldoConta));
        }
    }
}
