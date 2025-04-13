package oop2.tp3.ejercicio1;

public abstract class Libro {
    public static final int INFANTILES = 2;
    public static final int REGULARES = 0;
    public static final int NUEVO_LANZAMIENTO = 1;
    private String nombre;
    private int codigoPrecio;

    public Libro(String nombre, int priceCode) {
        this.nombre = nombre;
        this.codigoPrecio = priceCode;
    }

    public int codigoPrecio() {
        return codigoPrecio;
    }

    public String nombre() {
        return nombre;
    }

    abstract double calcularMonto(int diasAlquilados, double monto);

    public boolean esFrecuente(int diasAlquilados) {
        return false;
    }

    public int sumaPuntosFrecuente(int diasAlquilados) {
        return 0;
    }
}