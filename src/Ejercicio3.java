

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *Ejemplo de ventana con un contenedor JPanel y un elemento JLabel en su interior
 *
 */
public class Ejercicio3 {
	
	//constructor
	public  Ejercicio3() {
		JFrame frame = new JFrame("Ejercicio 3");
		JPanel contentPane = (JPanel) frame.getContentPane();
		JButton miBoton= new JButton("Púlsame, por favor...");
		ImageIcon icono=new ImageIcon("images/iesclara.png");
		miBoton.setIcon(icono);
		contentPane.add(miBoton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,200);
		frame.setVisible(true);
	}
	
	public static void main(String args[]) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
		public void run() {
			Ejercicio3 gui = new Ejercicio3();
		}
		});
	} //fin main()
}