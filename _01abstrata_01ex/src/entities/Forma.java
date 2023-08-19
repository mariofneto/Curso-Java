package entities;

import enums.Cor;

public abstract class Forma {
    protected Cor cor;

    public Forma() {
    }

    public Forma(Cor cor) {
        this.cor = cor;
    }

    public abstract Double area();

}
