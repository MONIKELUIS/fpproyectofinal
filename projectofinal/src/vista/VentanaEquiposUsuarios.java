package vista;

import java.awt.*;
import java.util.List;
import javax.swing.*;

import controlador.EquipoUsuarioControlador;
import controlador.UsuarioControlador;
import modelo.EquipoUsuario;

public class VentanaEquiposUsuarios extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel panelEquiposUser;
    private UsuarioControlador usuarioControlador;
    private EquipoUsuarioControlador equipoUsuarioControlador;

    public VentanaEquiposUsuarios(UsuarioControlador usuarioControlador,
                                   EquipoUsuarioControlador equipoUsuarioControlador) {
        super();
        this.usuarioControlador = usuarioControlador;
        this.equipoUsuarioControlador = equipoUsuarioControlador;

        setTitle("Listado de Equipos de Usuarios");
        setSize(800, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panelEquiposUser = new JPanel();
        panelEquiposUser.setLayout(new BoxLayout(panelEquiposUser, BoxLayout.Y_AXIS));
        panelEquiposUser.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JScrollPane scrollPane = new JScrollPane(panelEquiposUser);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);

        eliminarEquiposUsuarios();
    }

    public void eliminarEquiposUsuarios() {
        panelEquiposUser.removeAll();

        List<EquipoUsuario> equipos = equipoUsuarioControlador.obtenerEquiposUsuario();

        for (EquipoUsuario equipo : equipos) {
            JPanel filaPanel = new JPanel();
            filaPanel.setLayout(new BoxLayout(filaPanel, BoxLayout.X_AXIS));
            filaPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
            filaPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
            filaPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

            JTextField textField = new JTextField(equipo.getNombre_equipo() + " (Presupuesto: " + equipo.getPresupuesto() + ")");
            textField.setEditable(false);
            textField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

            JButton eliminarBtn = new JButton("Eliminar");
            eliminarBtn.setPreferredSize(new Dimension(100, 30));

            filaPanel.add(textField);
            filaPanel.add(Box.createRigidArea(new Dimension(10, 0))); // Espacio entre campo y botón
            filaPanel.add(eliminarBtn);

            panelEquiposUser.add(filaPanel);
        }

        panelEquiposUser.revalidate();
        panelEquiposUser.repaint();
        setVisible(true);
    }
}
