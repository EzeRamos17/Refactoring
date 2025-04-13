package oop2.tp3.ejercicio1;

public class Alquiler {
    private CopiaLibro copia;
    private int diasAlquilados;

    public Alquiler(CopiaLibro copia, int diasAlquilados) {
        this.copia = copia;
        this.diasAlquilados = diasAlquilados;
    }

    public int diasAlquilados() {
        return this.diasAlquilados;
    }

    public CopiaLibro copia() {
        return this.copia;
    }

    double calcularMonto(double monto){
        return this.copia.calcularMonto(diasAlquilados, monto);
    }

    public boolean esFrecuente(){
        return this.copia.esFrecuente(diasAlquilados);
    }

    public int sumaPuntosFrecuente(){
        return this.copia.sumaPuntosFrecuente(diasAlquilados);
    }
}
