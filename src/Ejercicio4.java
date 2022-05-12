


import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

/**
 * Ejemplo de Ventana que utiliza un GridLayout para contener 3X2 elementos
 *
 */
public class Ejercicio4 {
	
	//constructor
	public Ejercicio4() {
	
		JFrame frame = new JFrame("Ejercicio  de creación de botones");
		JPanel contentPane = (JPanel) frame.getContentPane();
		JPanel interior= new JPanel();
		interior.setLayout(new GridLayout(5,5,10,10)); 
		
		for (int i=1; i<=25;i++) {
			interior.add(new JButton("Botón número "+i));
		}
			
		contentPane.add(interior);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,200);
		frame.setVisible(true);
	}
	
	public static void main(String args[]) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
		public void run() {
			Ejercicio4 gui = new Ejercicio4();
		}
		});
	} //fin main()
}