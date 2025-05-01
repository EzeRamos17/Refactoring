package oop2.tp3.ejercicio5;

import static java.lang.System.lineSeparator;

public class Calculador {

    public static final String LABEL_FACTURACION = "Facturacion para ";
    public static final String LABEL_MONTO_GANADO = "Monto ganado: ";
    public static final String LABEL_CREDITOS_GANADOS = "Creditos ganados: ";
    public static final String LABEL_ASIENTOS = ". Asientos: ";

    public String reporte(Factura factura) {
        float totalAmount = 0;
        float creditos = 0;
        var result = LABEL_FACTURACION + factura.nombreCliente() + lineSeparator();
        var actuaciones = factura.actuaciones();
        for (var actuacion : actuaciones) {
            float monto = 0;
            monto += actuacion.calcularMonto();
            creditos += actuacion.calcularCreditos();
            result += actuacion.nombreEvento() + ": " + monto + LABEL_ASIENTOS + actuacion.numeroEspectadores() + lineSeparator();
            totalAmount += monto;
        }
        result += LABEL_MONTO_GANADO + totalAmount + lineSeparator();
        result += LABEL_CREDITOS_GANADOS + creditos + lineSeparator();

        return result;
    }
}
