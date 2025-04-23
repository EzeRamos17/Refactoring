package oop2.tp3.ejercicio5;

import java.util.List;
import java.util.Map;

public class Calculador {

    public String reporte(Factura factura, List<Evento> eventos) {
        float totalAmount = 0;
        float creditos = 0;
        var result = "Facturacion para " + factura.nombreCliente() + System.lineSeparator();
        var actuaciones = factura.actuaciones();
        for (var actuacion : actuaciones) {
            float monto = 0;
            var tipo = eventos.stream()
                    .filter(e -> e.nombreEvento().equals(actuacion.nombreEvento()))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Evento no encontrado"))
                    .tipo();

            switch (tipo) {
                case "Drama":
                    monto = costoDrama(actuacion);
                    break;
                case "Comedia":
                    monto = 30000;
                    if (actuacion.numeroEspectadores() > 20) {
                        monto += 10000 + 500 * (actuacion.numeroEspectadores() - 20);
                    }
                    monto += 300 * actuacion.numeroEspectadores();
                    break;
                default:
                    throw new RuntimeException("Tipo de evento no conocido");
            }
            //creditos a ganar
            creditos += Math.max(actuacion.numeroEspectadores() - 30, 0);
            //creditos extras para comedia
            if ("Comedia".equals(tipo)) {
                creditos += Math.floor(actuacion.numeroEspectadores() / 5);
            }
            result += actuacion.nombreEvento() + ": " + monto + ". Asientos: " + actuacion.numeroEspectadores() + System.lineSeparator();
            totalAmount += monto;
        }
        result += "Monto ganado: " + totalAmount + System.lineSeparator();
        result += "Creditos ganados: " + creditos + System.lineSeparator();

        return result;
    }

    private float costoDrama(Actuacion actuacion) {
        float monto;
        monto = 40000;
        if (actuacion.numeroEspectadores() > 30) {
            monto += 1000 * (actuacion.numeroEspectadores() - 30);
        }
        return monto;
    }
}
