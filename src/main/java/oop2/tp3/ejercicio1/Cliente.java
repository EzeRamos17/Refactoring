package oop2.tp3.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private List<Alquiler> alquileres = new ArrayList<Alquiler>();
    private String name;

    public Cliente(String nombre) {
        this.name = nombre;
    }

    public Object[] calcularDeudaYPuntosObtenidos() {
        Object[] resultado = new Object[2];
        double total = 0;
        int puntosAlquilerFrecuente = 0;
        for (Alquiler alquiler : alquileres) {
            double monto = 0;
// determine amounts for each line
            switch (alquiler.copia().libro().codigoPrecio()) {
                case Libro.REGULARES:
                    monto = new LibroRegular().calcularMonto(alquiler, monto);
                    break;
                case Libro.NUEVO_LANZAMIENTO:
                    monto = new LibroNuevoLanzamiento().calcularMonto(alquiler, monto);
                    break;
                case Libro.INFANTILES:
                    monto = new LibroInfantil().calcularMonto(alquiler, monto);
                    break;
            }
            total += monto;
            // sumo puntos por alquiler
            puntosAlquilerFrecuente++;
            // bonus por dos días de alquiler de un nuevo lanzamiento
            if ((alquiler.copia().libro().codigoPrecio() == Libro.NUEVO_LANZAMIENTO)
                    && alquiler.diasAlquilados() > 1) {
                puntosAlquilerFrecuente++;
            }
        }
        resultado[0] = total;
        resultado[1] = puntosAlquilerFrecuente;
        return resultado;
    }

    public void alquilar(Alquiler rental) {
        alquileres.add(rental);
    }
}