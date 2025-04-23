package oop2.tp3.ejercicio3;

public class GastoCena extends Gasto {
    public GastoCena(int monto) {
        super(monto);
    }

    @Override
    public String nombre() {
        return "Cena";
    }

    protected int montoComida() {
        return this.monto();
    }

    protected boolean esExcesoDeComida() {
        if (this.monto() > 5000) {
            return true;
        }
        return false;
    }
}
