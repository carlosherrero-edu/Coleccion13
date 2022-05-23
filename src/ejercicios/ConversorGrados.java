package ejercicios;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ConversorGrados {

	private JFrame frmConversorDeTemperaturas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorGrados window = new ConversorGrados();
					window.frmConversorDeTemperaturas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConversorGrados() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConversorDeTemperaturas = new JFrame();
		frmConversorDeTemperaturas.setResizable(false);
		frmConversorDeTemperaturas.setTitle("Conversor de Temperaturas");
		frmConversorDeTemperaturas.setBounds(100, 100, 450, 300);
		frmConversorDeTemperaturas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConversorDeTemperaturas.getContentPane().setLayout(null);
		
		JLabel lbGradosC = new JLabel("0.0");
		lbGradosC.setHorizontalAlignment(SwingConstants.CENTER);
		lbGradosC.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lbGradosC.setBounds(24, 11, 112, 37);
		frmConversorDeTemperaturas.getContentPane().add(lbGradosC);
		
		JLabel lbLeyenda1 = new JLabel("\u00BAC =");
		lbLeyenda1.setHorizontalAlignment(SwingConstants.CENTER);
		lbLeyenda1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lbLeyenda1.setBounds(148, 11, 62, 37);
		frmConversorDeTemperaturas.getContentPane().add(lbLeyenda1);
		
		JLabel lbGradosF = new JLabel("32.0");
		lbGradosF.setHorizontalAlignment(SwingConstants.CENTER);
		lbGradosF.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lbGradosF.setBounds(238, 11, 112, 37);
		frmConversorDeTemperaturas.getContentPane().add(lbGradosF);
		
		JLabel lbLeyenda2 = new JLabel("\u00BAF");
		lbLeyenda2.setHorizontalAlignment(SwingConstants.CENTER);
		lbLeyenda2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lbLeyenda2.setBounds(362, 11, 62, 37);
		frmConversorDeTemperaturas.getContentPane().add(lbLeyenda2);
		
		JSlider sliderGrados = new JSlider();
		
		sliderGrados.setMajorTickSpacing(10);
		sliderGrados.setMinorTickSpacing(1);
		sliderGrados.setValue(0);
		sliderGrados.setPaintTicks(true);
		sliderGrados.setPaintLabels(true);
		sliderGrados.setMinimum(-30);
		sliderGrados.setMaximum(70);
		sliderGrados.setBounds(10, 59, 414, 44);
		frmConversorDeTemperaturas.getContentPane().add(sliderGrados);
		
		JPanel JPanel1 = new JPanel();
		JPanel1.setBorder(new TitledBorder(null, "Tipo de conversi\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPanel1.setBounds(76, 114, 293, 93);
		frmConversorDeTemperaturas.getContentPane().add(JPanel1);
		
		JRadioButton rbCaF = new JRadioButton("De grados Celsius a Faretheim");
		rbCaF.setSelected(true);
		JPanel1.add(rbCaF);
		
		JRadioButton rbFaC = new JRadioButton("De grados Faretheim a Celsius");
		JPanel1.add(rbFaC);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rbCaF);
		grupo.add(rbFaC);
		
		JCheckBox chIntervalo = new JCheckBox("Intervalo de -50 a 150");
		
		chIntervalo.setBounds(143, 224, 165, 23);
		frmConversorDeTemperaturas.getContentPane().add(chIntervalo);
		
		// métodos para el tratamiento de eventos
		
		sliderGrados.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				double gradosC=0.0;
				double gradosF=0.0;
				if (rbCaF.isSelected()) {
					gradosC= sliderGrados.getValue();
					gradosF = 32.0 + 9.0*gradosC/5.0;
				
				} else if (rbFaC.isSelected()) {
					gradosF= sliderGrados.getValue();
					gradosC= 5.0*(gradosF-32.0)/9.0;
					
				}
				lbGradosC.setText(String.format("%.2f", gradosC));
				lbGradosF.setText(String.format("%.2f", gradosF));
			}
		});
		
		chIntervalo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (chIntervalo.isSelected()) {
					
					sliderGrados.setMaximum(150);
					sliderGrados.setMinimum(-50);
					sliderGrados.setMajorTickSpacing(50);
					sliderGrados.setMinorTickSpacing(5);
					
				
			}  else {
				sliderGrados.setMaximum(70);
				sliderGrados.setMinimum(-30);
				sliderGrados.setMajorTickSpacing(10);
				sliderGrados.setMinorTickSpacing(1);
				
			}
		
		}
		});
	}
}