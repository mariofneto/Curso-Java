package entities;


import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Period;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Integer numeroQuarto;
    private Date dataEntrada;
    private Date dataSaida;

    public Reserva() {
    }

    public Reserva(Integer numeroQuarto, Date dataEntrada, Date dataSaida) {
        this.numeroQuarto = numeroQuarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public long duracao(){
        long duracao = dataSaida.getTime() - dataEntrada.getTime();
        return TimeUnit.DAYS.convert(duracao, TimeUnit.MILLISECONDS);
    }

    public void atualizarDatas(Date entrada, Date saida){
        this.dataEntrada = entrada;
        this.dataSaida = saida;

        duracao();
    }

    @Override
    public String toString() {
        return "Reserva: " +
                "numeroQuarto " + numeroQuarto +
                ", dataEntrada: " + sdf.format(dataEntrada) +
                ", dataSaida: " + sdf.format(dataSaida) +
                ", " + duracao() + " dias";
    }
}
