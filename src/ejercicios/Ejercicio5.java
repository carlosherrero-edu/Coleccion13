package ejercicios;


import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;
/**
 * Ejemplo de contenedor que utilizar BorderLayout para disponer sus elementos
 *
 */
public class Ejercicio5 {
	
	//constructor
	public Ejercicio5() {
		JFrame frame = new JFrame("Mi segundo Layout. Ejercicio 5");
		JPanel contentPane = (JPanel) frame.getContentPane();
		JPanel interior= new JPanel();
		
		BorderLayout disposicion= new BorderLayout(30,10);
		interior.setLayout(disposicion);    
		
		interior.add(new JButton("Botón 5"), BorderLayout.NORTH);
		interior.add(new JButton("Botón 8"), BorderLayout.EAST);
		interior.add(new JButton("Botón 7"), BorderLayout.SOUTH);
		interior.add(new JButton("Botón 6"), BorderLayout.WEST);
		//configuraci´çon del panel centro
		JPanel centro= new JPanel();
		centro.setLayout(new GridLayout(2,2,10,10));
		for (int i=1; i<=4; i++) {
			centro.add(new JButton("Botón "+i));
		}
		//agregro este panel al interior
		interior.add(centro, BorderLayout.CENTER);
		
		contentPane.add(interior);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,200);
		frame.setVisible(true);
	}
	
	public static void main(String args[]) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
		public void run() {
			Ejercicio5 gui = new Ejercicio5();
		}
		});
	} //fin main()
}