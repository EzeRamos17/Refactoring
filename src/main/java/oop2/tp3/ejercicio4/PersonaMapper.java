package oop2.tp3.ejercicio4;

import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonaMapper implements RowMapper<Persona> {
    @Override
    public Persona map(ResultSet rs, StatementContext ctx) throws SQLException {
        return new Persona(rs.getString("nombre"), rs.getString("apellido"));
    }
}
