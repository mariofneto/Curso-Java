package entities;

public class Tercerizado extends Funcionario{

    private Double horasAdicionais;
    public Tercerizado() {
        super();
    }

    public Tercerizado(String nome, Integer horas, Double valorPorHoras, Double horasAdicionais) {
        super(nome, horas, valorPorHoras);
        this.horasAdicionais = horasAdicionais;
    }

    public Double getHorasAdicionais() {
        return horasAdicionais;
    }

    public void setHorasAdicionais(Double horasAdicionais) {
        this.horasAdicionais = horasAdicionais;
    }

    @Override
    public Double pagamento(){
        return super.pagamento() + horasAdicionais * 1.1;
    }
}
