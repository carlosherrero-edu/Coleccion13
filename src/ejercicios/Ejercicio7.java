package ejercicios;



import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

/**
 * Ejemplo de Ventana que utiliza un GridLayout para contener 3X2 elementos
 *
 */
public class Ejercicio7 {
	
	//constructor
	public Ejercicio7() {
	
		JFrame frame = new JFrame("Ejercicio  de creación de botones");
		JPanel contentPane = (JPanel) frame.getContentPane();
		JPanel interior= new JPanel();
		interior.setLayout(new GridLayout(5,5,10,10)); 
		
		//escuchador que asignaremos a cada botón
		ActionListener miEscuchador= new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton origen=(JButton)e.getSource();
				origen.setText("Pulsado");
		
				origen.setBackground(new Color(128,128,0));
				origen.setEnabled(false);
				
			}
			
		};
		
		
		JButton miBoton;
		for (int i=1; i<=25;i++) {
			miBoton= new JButton("Botón número "+i);
			miBoton.addActionListener(miEscuchador);		
			interior.add(miBoton);
		}
			
		contentPane.add(interior);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	
	public static void main(String args[]) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
		public void run() {
			Ejercicio7 gui = new Ejercicio7();
		}
		});
	} //fin main()
}