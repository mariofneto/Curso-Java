package entities;

import enums.Cor;

public class Circulo extends Forma{
    private static final Double pi = 3.141592;
    private Double raio;

    public Circulo() {
    }

    public Circulo(Cor cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double area() {
        return pi * (Math.pow(raio, 2));
    }
}
