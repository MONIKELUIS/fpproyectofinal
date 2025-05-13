package vista;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controlador.EscuchadorEventos;

public class VentaGeneral {

	/*
	 * metodo para llamar a una ventana
	 */
	public VentaGeneral() {
		// CONFIGURACION DEL MARCO
		JFrame jf = new JFrame("Tarea 2"); // cracion del marco
		JPanel jp = new JPanel(); // creacion del lienzo
		// jf.setLayout(new FlowLayout()); // establecer distribucion o esquema
		jp.setLayout(new FlowLayout(FlowLayout.CENTER));
		jp.setBackground(Color.gray.LIGHT_GRAY); // agregar color ala ventana

		// ** COMPONENTES **
		
		// Text area
				JTextArea jt = new JTextArea(2,15);
				jp.add(jt);
		// Botones
		
		JButton bt = new JButton("Enviar");
		bt.setName("#boton1");
		bt.addActionListener(new EscuchadorEventos(bt,jt ));
		JButton bt2 = new JButton("FIN");
		bt2.addActionListener(new EscuchadorEventos(bt2));
		bt2.setName("#boton2");
		jp.add(bt);
		jp.add(bt2);
			
		

		// CONFIGURACION DEL LIENZO
		jf.setContentPane(jp); // poner el lienzo en el marco
		jf.setSize(600, 400); // configuracion del tamaño del lienzos
		jf.setLocationRelativeTo(null); // centrar el lienzo en la pantalla
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE ); // cerrar la ventana
		
		// HACER VISIBLRE SIENPRE AL ULTIMO
		jf.setVisible(true); // hacer visible la ventana

	}

}
