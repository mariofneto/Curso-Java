package entities;

import entitiesEnum.LevelTrabalhador;

import java.util.ArrayList;
import java.util.List;

public class Trabalhador {
    private String nome;
    private LevelTrabalhador level;
    private Double salarioBase;

    public List<ContratoHoras> contratos = new ArrayList<ContratoHoras>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, LevelTrabalhador level, Double salarioBase) {
        this.nome = nome;
        this.level = level;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LevelTrabalhador getLevel() {
        return level;
    }

    public void setLevel(LevelTrabalhador level) {
        this.level = level;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void addContrato(ContratoHoras contrato){
        contratos.add(contrato);
    }

    public void removeContrato(ContratoHoras contrato){
        contratos.remove(contrato);
    }

    public Double aumento(Integer ano, Integer mes){
        return this.salarioBase;
    }



}
