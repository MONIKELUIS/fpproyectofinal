package vista;

import controlador.EquipoControlador;
import controlador.JugadorControlador;
import modelo.Equipo;
import modelo.Jugador;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VentanaPrincipal extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel panelEquipos;
	private EquipoControlador equipoControlador;
	private JugadorControlador jugadorControlador;

	public VentanaPrincipal(EquipoControlador equipoControlador, JugadorControlador jugadorControlador) {
		this.equipoControlador = equipoControlador;
		this.jugadorControlador = jugadorControlador;

		setTitle("Equipos");
		setSize(800, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		panelEquipos = new JPanel();
		add(panelEquipos);

		mostrarEquipos();
	}

	public void mostrarEquipos() {
	    panelEquipos.removeAll(); // remueve todo lo que este antes
	    
	    ArrayList<String> imagenes = new ArrayList<String>();
	    imagenes.add("media/avatar1.jpg");
	    imagenes.add("media/avatar2.jpg");
	    imagenes.add("media/avatar3.jpg");
	    imagenes.add("media/avatar4.jpg");
	    imagenes.add("media/avatar5.jpg");
	    
	    List<Equipo> equipos = equipoControlador.obtenerEquipos();
	    JComboBox<Equipo> comboEquipos = new JComboBox<>(equipos.toArray(new Equipo[0]));
	    comboEquipos.setFont(new Font("SansSerif", Font.PLAIN, 18));

	    // Panel donde se mostrarán los jugadores
	    JPanel panelJugadores = new JPanel();
	    panelJugadores.setLayout(new BoxLayout(panelJugadores, BoxLayout.Y_AXIS));

	    JScrollPane scrollPane = new JScrollPane(panelJugadores);
	    scrollPane.setPreferredSize(new Dimension(600, 400));

	    // Acción al seleccionar equipo
	    comboEquipos.addActionListener(e -> {
	        Equipo seleccionado = (Equipo) comboEquipos.getSelectedItem();
	        if (seleccionado != null) {
	            int idEquipo = seleccionado.getId();
	            List<Jugador> jugadores = jugadorControlador.obtenerJugadores(idEquipo);

	            // Limpiar panel anterior
	            panelJugadores.removeAll();

	            for (int i = 0; i < jugadores.size(); i++) {
	                Jugador j = jugadores.get(i);

	                // Determina el nombre de la imagen según la posición
	                int numImagen = (i % 5) + 1; // Si hay más de 5 jugadores, se cicla
	                String ruta = "media/avatar" + numImagen + ".jpg";

	                JPanel fila = new JPanel(new FlowLayout(FlowLayout.LEFT));
	                JLabel label = new JLabel(j.toString());
	                JButton btnVer = new JButton("Ver");

	                btnVer.addActionListener(ev -> {
	                    ImageIcon icono = new ImageIcon(ruta);

	                    // Escalar la imagen (opcional)
	                    Image img = icono.getImage().getScaledInstance(590, 600, Image.SCALE_SMOOTH);
	                    ImageIcon iconoEscalado = new ImageIcon(img);

	                    JOptionPane.showMessageDialog(this,
	                        new JLabel(iconoEscalado),
	                        "Imagen de " + j.getNombre_jugador(), JOptionPane.PLAIN_MESSAGE);
	                });

	                fila.add(label);
	                fila.add(btnVer);
	                panelJugadores.add(fila);
	            }


	            panelJugadores.revalidate();
	            panelJugadores.repaint();
	        }
	    });

	    // Inicializar con el primer equipo
	    if (!equipos.isEmpty()) {
	        comboEquipos.setSelectedIndex(0);
	        comboEquipos.getActionListeners()[0].actionPerformed(null); // Simula clic
	    }

	    JPanel panelCombo = new JPanel();
	    panelCombo.add(new JLabel("Equipo:"));
	    panelCombo.add(comboEquipos);

	    panelEquipos.setLayout(new BorderLayout());
	    panelEquipos.add(panelCombo, BorderLayout.NORTH);
	    panelEquipos.add(scrollPane, BorderLayout.CENTER);

	    panelEquipos.revalidate();
	    panelEquipos.repaint();
	    setVisible(true);
	}

}
