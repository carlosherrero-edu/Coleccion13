import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class Ejercicio9 {

	private JFrame frmFormulario;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio9 window = new Ejercicio9();
					window.frmFormulario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio9() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFormulario = new JFrame();
		frmFormulario.setTitle("Formulario de Autenticación");
		frmFormulario.setBounds(100, 100, 323, 258);
		frmFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFormulario.getContentPane().setLayout(null);
		
		JPanel miPanel = new JPanel();
		miPanel.setBounds(0, 11, 434, 215);
		frmFormulario.getContentPane().add(miPanel);
		miPanel.setLayout(new GridLayout(4, 1, 0, 10));
		
		JPanel pnNombre = new JPanel();
		miPanel.add(pnNombre);
		pnNombre.setLayout(null);
		
		JLabel lbNombre = new JLabel("Nombre:");
		lbNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbNombre.setBounds(10, 11, 69, 24);
		pnNombre.add(lbNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(101, 14, 175, 20);
		pnNombre.add(txtNombre);
		txtNombre.setColumns(10);
		
		JPanel pnApellidos = new JPanel();
		miPanel.add(pnApellidos);
		pnApellidos.setLayout(null);
		
		JLabel lbApellidos = new JLabel("Apellidos:");
		lbApellidos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbApellidos.setBounds(10, 11, 69, 24);
		pnApellidos.add(lbApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(99, 11, 175, 20);
		pnApellidos.add(txtApellidos);
		
		JPanel pnPassword = new JPanel();
		miPanel.add(pnPassword);
		pnPassword.setLayout(null);
		
		JLabel lbContraseña = new JLabel("Contrase\u00F1a:");
		lbContraseña.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbContraseña.setBounds(10, 11, 88, 24);
		pnPassword.add(lbContraseña);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(101, 14, 172, 21);
		pnPassword.add(txtPassword);
		
		JPanel pnEnviar = new JPanel();
		miPanel.add(pnEnviar);
		pnEnviar.setLayout(null);
		
		JButton bntEnviar = new JButton("Enviar");
		bntEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre =txtNombre.getText();
				String apellidos =txtApellidos.getText();
				System.out.println("Bienvenido, "+nombre+" "+apellidos);
				char[] contraseña=txtPassword.getPassword();
				/*
				 * Por seguridad, todos los caracteres de la contraseña por asterisco
				 * dejando solamente los 2 primeros y los 2 últimos
				 */
				for (int i=2; i< contraseña.length-2; i++) {
					contraseña[i]='*';
				}
				System.out.println("TU contraseña es : "+ Arrays.toString(contraseña));
				
			}
		});
		bntEnviar.setFont(new Font("Tahoma", Font.BOLD, 12));
		bntEnviar.setBounds(110, 11, 97, 24);
		pnEnviar.add(bntEnviar);
	}
}
