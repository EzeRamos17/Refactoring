package oop2.tp3.ejercicio5;

public class Drama extends Actuacion {

    public Drama(String nombreEvento, int numeroEspectadores) {
        super(nombreEvento, numeroEspectadores);
    }

    @Override
    public float calcularMonto() {
        float monto = 40000;
        if (this.numeroEspectadores() > 30) {
            monto += 1000 * (this.numeroEspectadores() - 30);
        }
        return monto;
    }

    @Override
    public float creditosExtras() {
        return 0.0f;
    }
}
