package oop2.tp3.ejercicio1;

public class CopiaLibro {
    private Libro libro;

    public CopiaLibro(Libro libro) {
        this.libro = libro;
    }

    public Libro libro() {
        return libro;
    }

    public double calcularMonto(int diasAlquilados, double monto) {
        return this.libro.calcularMonto(diasAlquilados, monto);
    }

    public boolean esFrecuente(int diasAlquilados) {
        return this.libro.esFrecuente(diasAlquilados);
    }

    public int sumaPuntosFrecuente(int diasAlquilados) {
        return this.libro.sumaPuntosFrecuente(diasAlquilados);
    }
}