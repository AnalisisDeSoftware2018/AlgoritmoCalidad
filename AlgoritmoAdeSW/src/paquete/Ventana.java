package paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Ventana {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
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
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
		frame = new JFrame("Algoritmo de Calidad");
		frame.setBounds(100, 100, 461, 729);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("Seleccione las opciones deseadas.");
		lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(lblNewLabel.getFont().getStyle() | Font.ITALIC));
		lblNewLabel.setBounds(12, 13, 419, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFuncionabilidad = new JLabel("FUNCIONABILIDAD");
		lblFuncionabilidad.setForeground(Color.BLUE);
		lblFuncionabilidad.setFont(lblFuncionabilidad.getFont().deriveFont(lblFuncionabilidad.getFont().getStyle() | Font.BOLD));
		lblFuncionabilidad.setBounds(12, 42, 194, 16);
		frame.getContentPane().add(lblFuncionabilidad);
		
		JLabel lblSeguridadDeAcceso = new JLabel("Seguridad de acceso:");
		lblSeguridadDeAcceso.setBounds(12, 71, 255, 16);
		frame.getContentPane().add(lblSeguridadDeAcceso);
		
		JLabel lblExactitudDeLos = new JLabel("Exactitud de los resultados:");
		lblExactitudDeLos.setBounds(12, 100, 255, 16);
		frame.getContentPane().add(lblExactitudDeLos);
		
		JLabel lblEficiencia = new JLabel("EFICIENCIA");
		lblEficiencia.setForeground(Color.BLUE);
		lblEficiencia.setFont(lblEficiencia.getFont().deriveFont(lblEficiencia.getFont().getStyle() | Font.BOLD));
		lblEficiencia.setBounds(12, 129, 194, 16);
		frame.getContentPane().add(lblEficiencia);
		
		JLabel lblUtilizacinDeRecursos = new JLabel("Utilizaci\u00F3n de recursos:");
		lblUtilizacinDeRecursos.setBounds(12, 158, 255, 16);
		frame.getContentPane().add(lblUtilizacinDeRecursos);
		
		JLabel lblComportamientoFrenteAl = new JLabel("Comportamiento frente al tiempo:");
		lblComportamientoFrenteAl.setBounds(12, 187, 255, 16);
		frame.getContentPane().add(lblComportamientoFrenteAl);
		
		JLabel lblFiabilidad = new JLabel("FIABILIDAD");
		lblFiabilidad.setForeground(Color.BLUE);
		lblFiabilidad.setFont(lblFiabilidad.getFont().deriveFont(lblFiabilidad.getFont().getStyle() | Font.BOLD));
		lblFiabilidad.setBounds(12, 216, 194, 16);
		frame.getContentPane().add(lblFiabilidad);
		
		JLabel lblToleranciaAFallos = new JLabel("Tolerancia a fallos:");
		lblToleranciaAFallos.setBounds(12, 245, 255, 16);
		frame.getContentPane().add(lblToleranciaAFallos);
		
		JLabel lblCapacidadDeRecuperacin = new JLabel("Capacidad de recuperaci\u00F3n de errores:");
		lblCapacidadDeRecuperacin.setBounds(12, 274, 255, 16);
		frame.getContentPane().add(lblCapacidadDeRecuperacin);
		
		JLabel lblMantenibilidad = new JLabel("MANTENIBILIDAD");
		lblMantenibilidad.setForeground(Color.BLUE);
		lblMantenibilidad.setFont(lblMantenibilidad.getFont().deriveFont(lblMantenibilidad.getFont().getStyle() | Font.BOLD));
		lblMantenibilidad.setBounds(12, 303, 194, 16);
		frame.getContentPane().add(lblMantenibilidad);
		
		JLabel lblCapacidadDelCdigo = new JLabel("Capacidad del c\u00F3digo de ser analizado:");
		lblCapacidadDelCdigo.setBounds(12, 332, 255, 16);
		frame.getContentPane().add(lblCapacidadDelCdigo);
		
		JLabel lblCapacidadDelCdigo_1 = new JLabel("Capacidad del c\u00F3digo de ser cambiado:");
		lblCapacidadDelCdigo_1.setBounds(12, 361, 255, 16);
		frame.getContentPane().add(lblCapacidadDelCdigo_1);
		
		JLabel lblEstabilidad = new JLabel("Estabilidad:");
		lblEstabilidad.setBounds(12, 390, 255, 16);
		frame.getContentPane().add(lblEstabilidad);
		
		JLabel lblUsabilidad = new JLabel("USABILIDAD");
		lblUsabilidad.setForeground(Color.BLUE);
		lblUsabilidad.setFont(lblUsabilidad.getFont().deriveFont(lblUsabilidad.getFont().getStyle() | Font.BOLD));
		lblUsabilidad.setBounds(12, 419, 194, 16);
		frame.getContentPane().add(lblUsabilidad);
		
		JLabel lblCapacidadDeSer = new JLabel("Capacidad de ser entendido:");
		lblCapacidadDeSer.setBounds(12, 448, 255, 16);
		frame.getContentPane().add(lblCapacidadDeSer);
		
		JLabel lblCapacidadDeSer_1 = new JLabel("Capacidad de ser operado:");
		lblCapacidadDeSer_1.setBounds(12, 477, 255, 16);
		frame.getContentPane().add(lblCapacidadDeSer_1);
		
		JLabel lblCapacidadDeSer_2 = new JLabel("Capacidad de ser atractivo para el usuario:");
		lblCapacidadDeSer_2.setBounds(12, 506, 255, 16);
		frame.getContentPane().add(lblCapacidadDeSer_2);
		
		JLabel lblPortabilidad = new JLabel("PORTABILIDAD");
		lblPortabilidad.setForeground(Color.BLUE);
		lblPortabilidad.setFont(lblPortabilidad.getFont().deriveFont(lblPortabilidad.getFont().getStyle() | Font.BOLD));
		lblPortabilidad.setBounds(12, 535, 194, 16);
		frame.getContentPane().add(lblPortabilidad);
		
		JLabel lblAdaptabilidad = new JLabel("Adaptabilidad:");
		lblAdaptabilidad.setBounds(12, 564, 255, 16);
		frame.getContentPane().add(lblAdaptabilidad);
		
		JLabel lblInstalabilidad = new JLabel("Instalabilidad:");
		lblInstalabilidad.setBounds(12, 593, 255, 16);
		frame.getContentPane().add(lblInstalabilidad);
		
		textField = new JTextField();
		textField.setFont(textField.getFont().deriveFont(textField.getFont().getStyle() | Font.BOLD));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setBounds(169, 633, 262, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox_0 = new JComboBox();
		comboBox_0.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_0.setBounds(297, 68, 134, 22);
		frame.getContentPane().add(comboBox_0);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_1.setBounds(297, 97, 134, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_2.setBounds(297, 155, 134, 22);
		frame.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_3.setBounds(297, 187, 134, 22);
		frame.getContentPane().add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_4.setBounds(297, 242, 134, 22);
		frame.getContentPane().add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_5.setBounds(297, 271, 134, 22);
		frame.getContentPane().add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_6.setBounds(297, 329, 134, 22);
		frame.getContentPane().add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_7.setBounds(297, 358, 134, 22);
		frame.getContentPane().add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_8.setBounds(297, 387, 134, 22);
		frame.getContentPane().add(comboBox_8);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_9.setBounds(297, 445, 134, 22);
		frame.getContentPane().add(comboBox_9);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_10.setBounds(297, 474, 134, 22);
		frame.getContentPane().add(comboBox_10);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_11.setBounds(297, 503, 134, 22);
		frame.getContentPane().add(comboBox_11);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_12.setBounds(297, 561, 134, 22);
		frame.getContentPane().add(comboBox_12);
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_13.setBounds(297, 590, 134, 22);
		frame.getContentPane().add(comboBox_13);
		
		JButton btnNewButton = new JButton("Analizar calidad");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(	comboBox_0.getSelectedItem().toString().equals("Bueno") &&
					!comboBox_1.getSelectedItem().toString().equals("Malo") &&
					!comboBox_2.getSelectedItem().toString().equals("Malo") &&
					!comboBox_3.getSelectedItem().toString().equals("Malo") &&
					comboBox_4.getSelectedItem().toString().equals("Bueno") &&
					comboBox_5.getSelectedItem().toString().equals("Bueno") &&
					!comboBox_6.getSelectedItem().toString().equals("Malo") &&
					!comboBox_7.getSelectedItem().toString().equals("Malo") &&
					comboBox_8.getSelectedItem().toString().equals("Bueno") &&
					!comboBox_9.getSelectedItem().toString().equals("Malo") &&
					!comboBox_10.getSelectedItem().toString().equals("Malo") &&
					!comboBox_11.getSelectedItem().toString().equals("Malo") &&
					comboBox_12.getSelectedItem().toString().equals("Bueno") &&
					!comboBox_13.getSelectedItem().toString().equals("Malo") 
				) {
					textField.setText("SATISFACTORIO");
					textField.setForeground(Color.GREEN);
				} else {
					textField.setText("NO SATISFACTORIO");
					textField.setForeground(Color.RED);
				}
			}
		});
		btnNewButton.setBounds(12, 633, 145, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
