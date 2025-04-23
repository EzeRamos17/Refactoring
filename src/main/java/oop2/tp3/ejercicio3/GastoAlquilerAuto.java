package oop2.tp3.ejercicio3;

public class GastoAlquilerAuto extends Gasto {
    public GastoAlquilerAuto(int monto) {
        super(monto);
    }

    @Override
    public String nombre() {
        return "Alquiler de Autos";
    }
}
