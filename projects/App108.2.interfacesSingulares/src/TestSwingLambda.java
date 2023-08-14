import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Java Swing es una librería integrada a Java
 * para generar interfaces de usuario y es derivada de AWT (Abstract Window-ToolKit)
 * 
 * Todo empienza con JFrame (ventana) que se configura 
 * y soporta que agreguemos otros componentes dentro
 * 
 * Un JPanel (lienzo o grupo de componentes) que agrupa subcomponentes
 * 
 * Un JButton (botón para pulsar) con sus configuraciones
 * 
 * Un JLabel (una etiqueta de texto) para representar texto
 * 
 * ... (existen muchos más)
 * 
 */

public class TestSwingLambda {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		JPanel panel1 = new JPanel();
		
		JButton button1 = new JButton("Pulsame");
		
		button1.addActionListener((ActionEvent event) -> {
			JOptionPane.showMessageDialog(button1, "Hola mundo :D", "Bienvenido a mi App", JOptionPane.ERROR_MESSAGE);
		});
		
		panel1.add(button1);
		
		frame.add(panel1);
		
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
}
