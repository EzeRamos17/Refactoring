package oop2.tp3.ejercicio1;

public class LibroNuevoLanzamiento {
    double calcularMonto(Alquiler alquiler, double monto) {
        monto += alquiler.diasAlquilados() * 3;
        return monto;
    }
}
