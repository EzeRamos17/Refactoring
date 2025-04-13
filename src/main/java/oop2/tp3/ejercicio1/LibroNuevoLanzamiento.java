package oop2.tp3.ejercicio1;

public class LibroNuevoLanzamiento extends Libro{

    public static final int COEFICIENTE_DE_COBRO = 3;
    public static final int DIAS_MINIMO_DE_ALQUILER_FRECUENTE = 1;


    public LibroNuevoLanzamiento(String nombre, int priceCode) {
        super(nombre, priceCode);
    }

    double calcularMonto(int diasAlquilados, double monto) {
        monto += diasAlquilados * COEFICIENTE_DE_COBRO;
        return monto;
    }

    @Override
    public boolean esFrecuente(int diasAlquilados){
        return diasAlquilados > DIAS_MINIMO_DE_ALQUILER_FRECUENTE;
    }
}
