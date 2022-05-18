
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 * Ejemplo de tratamiento de eventos de Ventana, heredando de WindowAdapter
 * En este caso, sólo necesitamos sobreescribir los métodos que vayamos a necesitar
 *  *
 */
public class Ejercicio8 {
	
	public Ejercicio8() { 
		JFrame frame = new JFrame("Ventanas anidadas"); 
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		frame.addWindowListener (new WindowAdapter(){
			
			public void windowOpened(WindowEvent e) {
				JFrame frame = (JFrame)e.getSource(); 

				JOptionPane.showMessageDialog(frame, "Bienvenido a este programa");
				
			}
			
			public void windowClosing(WindowEvent e) {
		
				JFrame ventanaHija= new JFrame ("Ventana hija");
				ventanaHija.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ventanaHija.setSize(400,100);
				ventanaHija.setVisible(true);
				
				
			}
			
		});
	
		
		frame.setSize(400,100); 
		frame.setVisible(true);
	}
	
	public static void main(String args[]) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
		public void run() {
			Ejercicio8 gui = new Ejercicio8();
		}
		});
	} //fin main()
}