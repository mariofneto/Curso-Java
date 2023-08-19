package entities;

public class PessoaFisica extends Contribuinte{
    private static Double rendaLimite = 20000.00;
    private Double gastoSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public Double imposto() {
        double imposto = 0.0;

        if(rendaAnual < rendaLimite && gastoSaude > 0.0) {
            // pagam 15% de imposto - 50% dos gastos
            imposto = (rendaAnual * 0.15) - (gastoSaude * 0.5);
        }
        else if(rendaAnual < rendaLimite && gastoSaude == 0.0){
            // pagam 15% de imposto
            imposto = (rendaAnual *  0.15);
        } else if(rendaAnual > rendaLimite && gastoSaude > 0.0) {
            // pagam 25% de imposto - 50% dos gastos
            imposto = (rendaAnual * 0.25) - (gastoSaude * 0.5);
        } else if(rendaAnual > rendaLimite && gastoSaude == 0.0){
            // pagam 25% de imposto
            imposto = (rendaAnual * 0.25);
        }
        return imposto;
    }
}
