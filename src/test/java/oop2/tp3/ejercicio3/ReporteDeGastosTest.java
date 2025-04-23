package oop2.tp3.ejercicio3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReporteDeGastosTest {
    @Test
    public void gastosDesayunoMayorA1000() {
        var g1 = new GastoDesayuno(10000);
        var reporte = new ReporteDeGastos();
        String sep = System.lineSeparator();
        String salida = reporte.imprimir(List.of(g1), LocalDate.now());
        assertEquals("Expenses " + LocalDate.now() + sep +
                "Desayuno\t10000\tX" + sep +
                "Gastos de comida: 10000" + sep +
                "Total de gastos: 10000" + sep, salida);
    }

    @Test
    public void gastosMultiples() {
        var g1 = new GastoDesayuno(10000);
        var g2 = new GastoCena(10);
        var reporte = new ReporteDeGastos();
        String sep = System.lineSeparator();
        String salida = reporte.imprimir(List.of(g1, g2), LocalDate.now());
        assertEquals("Expenses " + LocalDate.now() + sep +
                "Desayuno\t10000\tX" + sep +
                "Cena\t10\t " + sep +
                "Gastos de comida: 10010" + sep +
                "Total de gastos: 10010" + sep, salida);
    }

    @Test
    public void gastosMultiplesMayorA500() {
        var g1 = new GastoDesayuno(10001);
        var g2 = new GastoCena(5000);
        var reporte = new ReporteDeGastos();
        String sep = System.lineSeparator();
        String salida = reporte.imprimir(List.of(g1, g2), LocalDate.now());
        assertEquals("Expenses " + LocalDate.now() + sep +
                "Desayuno\t10001\tX" + sep +
                "Cena\t5000\t " + sep +
                "Gastos de comida: 15001" + sep +
                "Total de gastos: 15001" + sep, salida);
    }

    @Test
    public void gastosMultiplesCenaYAlquierDeAuto() {
        var g1 = new GastoAlquilerAuto(10001);
        var g2 = new GastoCena(5000);
        var reporte = new ReporteDeGastos();
        String sep = System.lineSeparator();
        String salida = reporte.imprimir(List.of(g1, g2), LocalDate.now());
        assertEquals("Expenses " + LocalDate.now() + sep +
                "Alquiler de Autos\t10001\t " + sep +
                "Cena\t5000\t " + sep +
                "Gastos de comida: 5000" + sep +
                "Total de gastos: 15001" + sep, salida);
    }
}
