package oop2.tp3.ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalcularCostoTest {
    @Test
    public void Test01(){
        Libro elTunel = new LibroRegular("El Túnel", Libro.REGULARES);
        Libro antesDelFin = new LibroRegular("Antes del Fin", Libro.REGULARES);
        Libro libro1 = new LibroNuevoLanzamiento("Antes del Fin", Libro.NUEVO_LANZAMIENTO);
        Libro libro2 = new LibroInfantil("Antes del Fin", Libro.INFANTILES);
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
        CopiaLibro libro1Copia = new CopiaLibro(libro1);
        CopiaLibro libro2Copia = new CopiaLibro(libro2);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
        Alquiler libro1Alquiler = new Alquiler(libro1Copia, 1);
        Alquiler libro2Alquiler = new Alquiler(libro2Copia, 6);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(libro1Alquiler);
        yo.alquilar(libro2Alquiler);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        System.out.println(resultado[0]);
        System.out.println(resultado[1]);

        assertEquals(9.0, resultado[0]);
        assertEquals(2, resultado[1]);

    }
    @Test
    public void Test02() {
        //setup
        Libro elTunel = new LibroRegular("El Túnel", Libro.REGULARES);
        Libro antesDelFin = new LibroRegular("Antes del Fin", Libro.REGULARES);
        Libro libro = new LibroNuevoLanzamiento("Antes del Fin", Libro.NUEVO_LANZAMIENTO);
        Libro libro1 = new LibroInfantil("Antes del Fin", Libro.INFANTILES);
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro libroCopia = new CopiaLibro(libro);
        CopiaLibro libro1Copia = new CopiaLibro(libro1);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
        Alquiler alquilerLibroCopia = new Alquiler(libroCopia, 1);
        Alquiler alquilerLibroCopia1 = new Alquiler(libro1Copia, 4);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);
        yo.alquilar(alquilerLibroCopia);
        yo.alquilar(alquilerLibroCopia1);

        //ejercitacion
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();

        //verificacion

        System.out.println(resultado[0]);
        System.out.println(resultado[1]);
        assertEquals(16.0, resultado[0]);
        assertEquals(4, resultado[1]);

    }

    @Test
    public void Test03() {
        //setup
        Libro elTunel = new LibroRegular("El Túnel", Libro.REGULARES);
        Libro antesDelFin = new LibroRegular("Antes del Fin", Libro.REGULARES);
        Libro libro = new LibroNuevoLanzamiento("Antes del Fin", Libro.NUEVO_LANZAMIENTO);
        Libro libro1 = new LibroInfantil("Antes del Fin", Libro.INFANTILES);
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro libroCopia = new CopiaLibro(libro);
        CopiaLibro libro1Copia = new CopiaLibro(libro1);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 1);
        Alquiler alquilerLibroCopia = new Alquiler(libroCopia, 1);
        Alquiler alquilerLibroCopia1 = new Alquiler(libro1Copia, 4);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);
        yo.alquilar(alquilerLibroCopia);
        yo.alquilar(alquilerLibroCopia1);

        //ejercitacion
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();

        //verificacion

        System.out.println(resultado[0]);
        System.out.println(resultado[1]);
        assertEquals(14.5, resultado[0]);
        assertEquals(4, resultado[1]);

    }

    @Test
    public void Test04() {
        //setup
        Libro elTunel = new LibroRegular("El Túnel", Libro.REGULARES);
        Libro antesDelFin = new LibroRegular("Antes del Fin", Libro.REGULARES);
        Libro libro = new LibroNuevoLanzamiento("Antes del Fin", Libro.NUEVO_LANZAMIENTO);
        Libro libro1 = new LibroInfantil("Antes del Fin", Libro.INFANTILES);
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro libroCopia = new CopiaLibro(libro);
        CopiaLibro libro1Copia = new CopiaLibro(libro1);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 1);
        Alquiler alquilerLibroCopia = new Alquiler(libroCopia, 1);
        Alquiler alquilerLibroCopia1 = new Alquiler(libro1Copia, 2);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);
        yo.alquilar(alquilerLibroCopia);
        yo.alquilar(alquilerLibroCopia1);

        //ejercitacion
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();

        //verificacion

        System.out.println(resultado[0]);
        System.out.println(resultado[1]);
        assertEquals(13.0, resultado[0]);
        assertEquals(4, resultado[1]);

    }
}
