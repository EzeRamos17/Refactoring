package oop2.tp3.ejercicio5;

public abstract class Actuacion {
    private String nombreEvento;
    private int numeroEspectadores;


    public Actuacion(String nombreEvento, int numeroEspectadores) {
        this.nombreEvento = nombreEvento;
        this.numeroEspectadores = numeroEspectadores;
    }

    public abstract float creditosExtras();

    public abstract float calcularMonto();

    public final float calcularCreditos() {
        float credito = Math.max(this.numeroEspectadores() - 30, 0);
        return credito + creditosExtras();
    }

    String nombreEvento() {
        return this.nombreEvento;
    }

    int numeroEspectadores() {
        return this.numeroEspectadores;
    }
}
