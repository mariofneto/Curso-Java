package entities;

public class PessoaJuridica extends Contribuinte{
    private static Integer numeroMaximo = 10;
    private Integer numeroDeFuncionarios;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public Double imposto() {
        double imposto = 0.0;

        if(numeroDeFuncionarios < numeroMaximo){
            //paga 16%
            imposto = rendaAnual * 0.16;
        }
        else if(numeroDeFuncionarios > numeroMaximo){
            //paga 14%
            imposto = rendaAnual * 0.14;
        }
        return imposto;
    }
}
