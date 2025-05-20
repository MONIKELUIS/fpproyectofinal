package controlador;

import modelo.Equipo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EquipoControlador {
    private Connection conexion;

    public EquipoControlador(Connection conexion) {
        this.conexion = conexion;
    }

    public List<Equipo> obtenerEquipos() {
        List<Equipo> equipos = new ArrayList<>();
        String query = "SELECT id, nombre FROM equiporeal";

        try (Statement comando = conexion.createStatement();
             ResultSet resultado = comando.executeQuery(query)) {

            while (resultado.next()) {
                equipos.add(new Equipo(
                    resultado.getInt("id"),
                    resultado.getString("nombre")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return equipos;
    }
}
