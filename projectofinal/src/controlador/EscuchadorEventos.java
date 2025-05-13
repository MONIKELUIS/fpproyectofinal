package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class EscuchadorEventos implements ActionListener {

	private JButton boton;
	private JTextArea textArea;

	/*
	 * Constructor para JButton
	 */
	public EscuchadorEventos(JButton boton) {
		this.boton = boton;
	}

	/*
	 * Constructor para textArea
	 */
	public EscuchadorEventos(JButton boton, JTextArea textArea) {
		this.textArea = textArea;
	}

	public void actionPerformed(ActionEvent e) {

		JButton boton = (JButton) e.getSource();

		String btname = boton.getName().toLowerCase();

		switch (btname) {
		case "#boton1":
			if (textArea.getText().equalsIgnoreCase("ucam")) {
				boton.setText(textArea.getText());
				boton.setEnabled(false);
				textArea.setEnabled(false);

			} else {
				boton.setText(textArea.getText());
			}
			break;

		case "#boton2":
			System.exit(0);
			break;
		default:
			break;
		}

		System.out.println("Boton pulsado");
	}

}
