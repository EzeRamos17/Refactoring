package oop2.tp3.ejercicio1;

public class LibroInfantil {
    double calcularMonto(Alquiler alquiler, double monto) {
        monto += 1.5;
        if (alquiler.diasAlquilados() > 3)
            monto += (alquiler.diasAlquilados() - 3) * 1.5;
        return monto;
    }
}
