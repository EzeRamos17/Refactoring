package oop2.tp3.ejercicio4;

import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class PersonaRepository {

    private static final String SQL_BUSCAR_POR_NOMBRE =
            "SELECT nombre, apellido FROM persona WHERE nombre LIKE ?";
    private static final String SQL_BUSCAR_POR_ID =
            "SELECT nombre, apellido FROM persona WHERE id_persona = ?";

    private final Jdbi jdbi;

    public PersonaRepository(Jdbi jdbi) {
        this.jdbi = jdbi;
        this.jdbi.registerRowMapper(new PersonaMapper());
    }

    /**
     * Busca por nombre a parte
     */
    public List<Persona> buscarPorNombre(String nombreOParte) {
        return jdbi.withHandle(handle ->
                handle
                        .select(SQL_BUSCAR_POR_NOMBRE)
                        .bind(0, "%" + nombreOParte + "%")
                        .mapTo(Persona.class)
                        .list()
        );
    }

    /**
     * Dado un id, retorna:
     * - null si el id no se encuentra en la BD
     * - la instancia de Persona encontrada
     */
    public Persona buscarId(Long id) {
        return jdbi.withHandle(handle ->
                handle
                        .select(SQL_BUSCAR_POR_ID)
                        .bind(0, id)
                        .mapTo(Persona.class)
                        .findOne()
                        .orElse(null)
        );
    }
}
