


import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * Ejemplo de Ventana que utiliza un GridLayout para contener 3X2 elementos
 *
 */
public class Ejercicio6 {
	
	//constructor
	public Ejercicio6() {
	
		JFrame frame = new JFrame("Formulario de Autenticación");
		JPanel contentPane = (JPanel) frame.getContentPane();
		
		contentPane.setLayout(new GridLayout(6,1,10,10)); 
		
		//sección nombre
		JPanel nombre=new JPanel();
		JLabel lbNombre=new JLabel("Nombre", SwingConstants.LEFT);
		JTextField txNombre= new JTextField(30);
		nombre.add(lbNombre);
		nombre.add(txNombre);
		
		//sección apellidos
		JPanel apellido=new JPanel();
		JLabel lbApellidos=new JLabel("Apellidos");
		JTextField txApellidos= new JTextField(30);
		apellido.add(lbApellidos);
		apellido.add(txApellidos);
		
		//sección contaseña
		JPanel palabrapaso=new JPanel();
		JLabel lbContraseña=new JLabel("Contraseña");
		JPasswordField txContraseña= new JPasswordField(30);
		palabrapaso.add(lbContraseña);
		palabrapaso.add(txContraseña);
		
		//sección sexo
		JPanel genero=new JPanel();
		JLabel lbGenero=new JLabel("Género");
		JRadioButton rbHombre= new JRadioButton("H");
		JRadioButton rbMujer= new JRadioButton("M");
		ButtonGroup bgGenero= new ButtonGroup();
		bgGenero.add(rbMujer);
		bgGenero.add(rbHombre);
		genero.add(lbGenero);
		genero.add(rbHombre);
		genero.add(rbMujer);
		
		
		
		//sección conformidad
		JPanel conformidad=new JPanel();
		JLabel lbOK=new JLabel("¿Estás de Acuerdo?");
		JCheckBox chOK= new JCheckBox();
		conformidad.add(lbOK);
		conformidad.add(chOK);
		
		//sección botonera
		JPanel botonera=new JPanel();
		botonera.add(new JButton("Enviar"));
		
		//agregar cada panel
		contentPane.add(nombre);
		contentPane.add(apellido);
		contentPane.add(palabrapaso);
		contentPane.add(genero);
		contentPane.add(conformidad);
		contentPane.add(botonera);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,400);
		frame.setVisible(true);
	}
	
	public static void main(String args[]) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
		public void run() {
			Ejercicio6 gui = new Ejercicio6();
		}
		});
	} //fin main()
}