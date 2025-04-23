package oop2.tp3.ejercicio4;

import org.jdbi.v3.core.Jdbi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaRepositoryTest {
    PersonaRepository repo;

    @BeforeEach
    public void setup() {
        Jdbi jdbi = Jdbi.create("jdbc:hsqldb:mem;create=true");
        new SetUpDatabase(jdbi).setUp();
        repo = new PersonaRepository(jdbi);
    }

    @Test
    void buscarPorNombre_parcialCoincidencia_devuelveListaCorrecta() {
        List<Persona> personas = repo.buscarPorNombre("Vla");
        assertNotNull(personas);
        assertEquals(1, personas.size());
        assertEquals("Vladimir", personas.get(0).nombre());
        assertEquals("Varkov", personas.get(0).apellido());
    }

    @Test
    void buscarPorNombre_sinCoincidencias_devuelveListaVacia() {
        List<Persona> personas = repo.buscarPorNombre("XYZ");
        assertNotNull(personas);
        assertTrue(personas.isEmpty());
    }

    @Test
    void buscarId_existente_devuelvePersonaCorrecta() {
        Persona persona = repo.buscarId(1L);
        assertNotNull(persona);
        assertEquals("José", persona.nombre());
        assertEquals("Laurenti", persona.apellido());
    }

    @Test
    void buscarId_inexistente_devuelveNull() {
        Persona persona = repo.buscarId(999L);
        assertNull(persona);
    }
}
