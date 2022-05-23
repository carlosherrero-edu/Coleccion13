package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frame;
	private JTextField ctDato1;
	private JTextField ctResultado;
	private JTextField ctDato2;
	//valores numéricos introducidos por teclado
	private double dato1,dato2, resul;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel elDato1 = new JLabel("Dato 1");
		elDato1.setBounds(35, 29, 97, 29);
		frame.getContentPane().add(elDato1);
		
		JLabel elDato2 = new JLabel("Dato 2");
		elDato2.setBounds(35, 105, 97, 40);
		frame.getContentPane().add(elDato2);
		
		JLabel elResultado = new JLabel("Resultado:");
		elResultado.setBounds(35, 186, 107, 40);
		frame.getContentPane().add(elResultado);
		
		JLabel elErrorDato1 = new JLabel("Error: Dato1 incorrecto");
		elErrorDato1.setBounds(81, 80, 227, 29);
		elErrorDato1.setVisible(false);
		frame.getContentPane().add(elErrorDato1);
		
		JLabel elErrorDato2 = new JLabel("Error: Dato2 incorrecto");
		elErrorDato2.setBounds(81, 156, 227, 29);
		elErrorDato2.setVisible(false);
		frame.getContentPane().add(elErrorDato2);
		
		ctDato1 = new JTextField();
		ctDato1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				elErrorDato1.setVisible(false);
				try {
					dato1= Double.parseDouble(ctDato1.getText());
				} catch (NumberFormatException ex) {
					elErrorDato1.setVisible(true);
					ctDato1.requestFocus();
					ctDato1.selectAll();
				}
			}
			@Override
			public void focusGained(FocusEvent e) {
				javax.swing.JTextField cajaTexto=(javax.swing.JTextField)e.getSource();
				cajaTexto.selectAll();
			}
		});
		ctDato1.setText("0.0");
		ctDato1.setHorizontalAlignment(SwingConstants.RIGHT);
		ctDato1.setBounds(118, 33, 155, 25);
		frame.getContentPane().add(ctDato1);
		ctDato1.setColumns(10);
		
		ctResultado = new JTextField();
		ctResultado.setEditable(false);
		ctResultado.setText("0.0");
		ctResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		ctResultado.setColumns(10);
		ctResultado.setBounds(118, 194, 155, 25);
		frame.getContentPane().add(ctResultado);
		
		ctDato2 = new JTextField();
		ctDato2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {

				elErrorDato2.setVisible(false);
				try {
					dato2= Double.parseDouble(ctDato2.getText());
				} catch (NumberFormatException ex) {
					elErrorDato2.setVisible(true);
					ctDato1.requestFocus();
					ctDato1.selectAll();
				}
			
			}
			@Override
			public void focusGained(FocusEvent e) {
				javax.swing.JTextField cajaTexto=(javax.swing.JTextField)e.getSource();
				cajaTexto.selectAll();
			}
		});
		ctDato2.setText("0.0");
		ctDato2.setHorizontalAlignment(SwingConstants.RIGHT);
		ctDato2.setColumns(10);
		ctDato2.setBounds(118, 113, 155, 25);
		frame.getContentPane().add(ctDato2);
		
		JButton btSumar = new JButton("Sumar");
	
		btSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resul= dato1+dato2;
				ctResultado.setText(Double.toString(resul));
			}
		});
		btSumar.setBounds(320, 32, 89, 23);
		frame.getContentPane().add(btSumar);
		
		JButton btRestar = new JButton("Restar");
		btRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resul= dato1-dato2;
				ctResultado.setText(Double.toString(resul));
			}
		});
		btRestar.setBounds(318, 83, 89, 23);
		frame.getContentPane().add(btRestar);
		
		JButton btMultiplicar = new JButton("Multiplicar");
		btMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resul= dato1*dato2;
				ctResultado.setText(Double.toString(resul));
			}
		});
		btMultiplicar.setBounds(320, 127, 89, 23);
		frame.getContentPane().add(btMultiplicar);
		
		JButton btDividir = new JButton("Dividir");
		btDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resul= dato1/dato2;
				ctResultado.setText(Double.toString(resul));
			}
		});
		btDividir.setBounds(320, 174, 89, 23);
		frame.getContentPane().add(btDividir);
		
		JButton btCopiar = new JButton("Copiar");
		btCopiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctDato1.setText(ctResultado.getText());
				dato1=resul;
			}
		});
		btCopiar.setHorizontalAlignment(SwingConstants.RIGHT);
		btCopiar.setBounds(320, 227, 89, 23);
		frame.getContentPane().add(btCopiar);
	}
}