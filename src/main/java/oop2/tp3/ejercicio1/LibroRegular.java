package oop2.tp3.ejercicio1;

public class LibroRegular {
    double calcularMonto(Alquiler alquiler, double monto) {
        monto += 2;
        if (alquiler.diasAlquilados() > 2)
            monto += (alquiler.diasAlquilados() - 2) * 1.5;
        return monto;
    }
}
