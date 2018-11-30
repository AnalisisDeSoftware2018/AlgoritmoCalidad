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
		frame.setBounds(100, 100, 461, 729+58);
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
		
		JLabel lblAdecuacion = new JLabel("Adecuación:");
		lblAdecuacion.setBounds(12, 129, 255, 16);
		frame.getContentPane().add(lblAdecuacion);
		
		JLabel lblEficiencia = new JLabel("EFICIENCIA");
		lblEficiencia.setForeground(Color.BLUE);
		lblEficiencia.setFont(lblEficiencia.getFont().deriveFont(lblEficiencia.getFont().getStyle() | Font.BOLD));
		lblEficiencia.setBounds(12, 129+29, 194, 16);
		frame.getContentPane().add(lblEficiencia);
		
		JLabel lblUtilizacinDeRecursos = new JLabel("Utilizaci\u00F3n de recursos:");
		lblUtilizacinDeRecursos.setBounds(12, 158+29, 255, 16);
		frame.getContentPane().add(lblUtilizacinDeRecursos);
		
		JLabel lblComportamientoFrenteAl = new JLabel("Comportamiento frente al tiempo:");
		lblComportamientoFrenteAl.setBounds(12, 187+29, 255, 16);
		frame.getContentPane().add(lblComportamientoFrenteAl);
		
		JLabel lblFiabilidad = new JLabel("FIABILIDAD");
		lblFiabilidad.setForeground(Color.BLUE);
		lblFiabilidad.setFont(lblFiabilidad.getFont().deriveFont(lblFiabilidad.getFont().getStyle() | Font.BOLD));
		lblFiabilidad.setBounds(12, 216+29, 194, 16);
		frame.getContentPane().add(lblFiabilidad);
		
		JLabel lblToleranciaAFallos = new JLabel("Tolerancia a fallos:");
		lblToleranciaAFallos.setBounds(12, 245+29, 255, 16);
		frame.getContentPane().add(lblToleranciaAFallos);
		
		JLabel lblCapacidadDeRecuperacin = new JLabel("Capacidad de recuperaci\u00F3n de errores:");
		lblCapacidadDeRecuperacin.setBounds(12, 274+29, 255, 16);
		frame.getContentPane().add(lblCapacidadDeRecuperacin);
		
		JLabel lblMantenibilidad = new JLabel("MANTENIBILIDAD");
		lblMantenibilidad.setForeground(Color.BLUE);
		lblMantenibilidad.setFont(lblMantenibilidad.getFont().deriveFont(lblMantenibilidad.getFont().getStyle() | Font.BOLD));
		lblMantenibilidad.setBounds(12, 303+29, 194, 16);
		frame.getContentPane().add(lblMantenibilidad);
		
		JLabel lblCapacidadDelCdigo = new JLabel("Capacidad del c\u00F3digo de ser analizado:");
		lblCapacidadDelCdigo.setBounds(12, 332+29, 255, 16);
		frame.getContentPane().add(lblCapacidadDelCdigo);
		
		JLabel lblCapacidadDelCdigo_1 = new JLabel("Capacidad del c\u00F3digo de ser cambiado:");
		lblCapacidadDelCdigo_1.setBounds(12, 361+29, 255, 16);
		frame.getContentPane().add(lblCapacidadDelCdigo_1);
		
		JLabel lblEstabilidad = new JLabel("Estabilidad:");
		lblEstabilidad.setBounds(12, 390+29, 255, 16);
		frame.getContentPane().add(lblEstabilidad);
		
		JLabel lblUsabilidad = new JLabel("USABILIDAD");
		lblUsabilidad.setForeground(Color.BLUE);
		lblUsabilidad.setFont(lblUsabilidad.getFont().deriveFont(lblUsabilidad.getFont().getStyle() | Font.BOLD));
		lblUsabilidad.setBounds(12, 419+29, 194, 16);
		frame.getContentPane().add(lblUsabilidad);
		
		JLabel lblCapacidadDeSer = new JLabel("Capacidad de ser entendido:");
		lblCapacidadDeSer.setBounds(12, 448+29, 255, 16);
		frame.getContentPane().add(lblCapacidadDeSer);
		
		JLabel lblCapacidadDeSer_1 = new JLabel("Capacidad de ser operado:");
		lblCapacidadDeSer_1.setBounds(12, 477+29, 255, 16);
		frame.getContentPane().add(lblCapacidadDeSer_1);
		
		JLabel lblCapacidadDeSer_2 = new JLabel("Capacidad de ser atractivo para el usuario:");
		lblCapacidadDeSer_2.setBounds(12, 506+29, 255, 16);
		frame.getContentPane().add(lblCapacidadDeSer_2);
		
		JLabel lblPortabilidad = new JLabel("PORTABILIDAD");
		lblPortabilidad.setForeground(Color.BLUE);
		lblPortabilidad.setFont(lblPortabilidad.getFont().deriveFont(lblPortabilidad.getFont().getStyle() | Font.BOLD));
		lblPortabilidad.setBounds(12, 535+29, 194, 16);
		frame.getContentPane().add(lblPortabilidad);
		
		JLabel lblAdaptabilidad = new JLabel("Adaptabilidad:");
		lblAdaptabilidad.setBounds(12, 564+29, 255, 16);
		frame.getContentPane().add(lblAdaptabilidad);
		
		JLabel lblInstalabilidad = new JLabel("Instalabilidad:");
		lblInstalabilidad.setBounds(12, 593+29, 255, 16);
		frame.getContentPane().add(lblInstalabilidad);
		
		JLabel lblCoexistencia = new JLabel("Coexistencia");
		lblCoexistencia.setBounds(12, 593+58, 255, 16);
		frame.getContentPane().add(lblCoexistencia);
		
		textField = new JTextField();
		textField.setFont(textField.getFont().deriveFont(textField.getFont().getStyle() | Font.BOLD));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setBounds(169, 691, 262, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox_0 = new JComboBox();
		comboBox_0.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_0.setBounds(297, 68, 134, 22);
		comboBox_0.setToolTipText("<html>Se medirá de acuerdo a la cantidad de características que cumpla el software. Las características son:<br>	Inicio de sesión de usuarios<br>	Uso de perfiles<br>	Asignación de permisos<br>	Encriptación de datos<br>Bueno [4] Debe cumplir con las 4 características<br>Regular [2;3] Debe cumplir de 2 a 3 características<br>Malo [0;1] Cumple 1 o ninguna característica<br><b>Debe ser bueno</b>.<br></html>");
		frame.getContentPane().add(comboBox_0);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_1.setBounds(297, 97, 134, 22);
		comboBox_1.setToolTipText("<html>Se medirá de acuerdo al error en los resultados.<br>Bueno [<=10^-9] Los resultados tendrán un error de 10 o menor.<br>Regular [10^-3;10^-8] Los resultados tendrán un error de entre 10  y 10 <br>Malo [>=10^-2] Los resultados tendrán un error de 10 o mayor.<br><b>No debe ser malo.</b><br></html>");
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_1p5 = new JComboBox();
		comboBox_1p5.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_1p5.setBounds(297, 126, 134, 22);
		comboBox_1p5.setToolTipText("<html>Se medirá de acuerdo a las funciones propuestas que se pueden realizar.</html>");
		frame.getContentPane().add(comboBox_1p5);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_2.setBounds(297, 155+29, 134, 22);
		comboBox_2.setToolTipText("<html>Se medirá de acuerdo al porcentaje de uso del procesador de una máquina estándar (Procesador y Sistema Operativo de 64 bits, 6gb de memoria RAM).<br>Bueno [0;15] El porcentaje del uso del procesador será entre el 0% y 15%<br>Regular [16;49] porcentaje del uso del procesador será entre el 16% y 49%<br>Malo [50;100] porcentaje del uso del procesador será entre el 50% y 100%<br><b>No debe ser malo.</b><br></html>");
		frame.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_3.setBounds(297, 187+29, 134, 22);
		comboBox_3.setToolTipText("<html>Se medirá el tiempo de respuesta del sistema ante una solicitud del usuario.<br>Bueno [0;2] El tiempo de respuesta del sistema es de 0 a 2 segundos.<br>Regular [3;5] El tiempo de respuesta del sistema es de 3 a 5 segundos.<br>Malo [>=6] El tiempo de respuesta del sistema es de 6 o mas segundos.<br><b>No debe ser malo.</b><br></html>");
		frame.getContentPane().add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_4.setBounds(297, 242+29, 134, 22);
		comboBox_4.setToolTipText("<html>Se medirá de acuerdo a la cantidad de características que cumpla el software. Las características son:<br>	Se cuenta con un archivo de log sobre las actividades que realiza el sistema.<br>	Cuando sucede un error se protegen los datos procesados.<br>Bueno [2] Debe cumplir con las 2 características.<br>Regular [1] Debe cumplir con 1 característica.<br>Malo [0] No cumple ninguna característica.<br><b>Debe ser bueno.</b><br></html>");
		frame.getContentPane().add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_5.setBounds(297, 271+29, 134, 22);
		comboBox_5.setToolTipText("<html>Se medirá de acuerdo a la cantidad de características que cumpla el software. Las características son:<br>	El sistema puede recuperarse frente a una falla.<br>	Reanuda sus actividades y vuelve al estado en el que se encontraba.<br>Bueno [2] Debe cumplir con las 2 características.<br>Regular [1] Debe cumplir con 1 característica.<br>Malo [0] No cumple ninguna característica.<br><b>Debe ser bueno</b><br></html>");
		frame.getContentPane().add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_6.setBounds(297, 329+29, 134, 22);
		comboBox_6.setToolTipText("<html>Se medirá de acuerdo al porcentaje de métodos con nombres representativos en el código<br>Bueno [85;100] Del 85 al 100% de los métodos deben tener nombres representativos.<br>Regular [60;84] Del 60 al 84% de los métodos deben tener nombres representativos.<br>Malo [<=59] El porcentaje de métodos con nombres representativos es de 59% o menos.<br><b>No debe ser malo.</b><br></html>");
		frame.getContentPane().add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_7.setBounds(297, 358+29, 134, 22);
		comboBox_7.setToolTipText("<html>Se medirá de acuerdo a la complejidad ciclomática<br>Bueno [<=10] La complejidad ciclomática es menor o igual a 10.<br>Regular [11;25] La complejidad ciclomática esta entre 11 y 25.<br>Malo [>=26] La complejidad ciclomática es mayor o igual a 26.<br><b>No debe ser malo.</b><br></html>");
		frame.getContentPane().add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_8.setBounds(297, 387+29, 134, 22);
		comboBox_8.setToolTipText("<html>Se medirá la cantidad de fallas por prueba del sistema<br>Bueno [0;1] Entre 0 a 1 error por prueba.<br>Regular [2;3] Entre 2 a 3 errores por prueba.<br>Malo [>=4] 4 o mas errores por prueba.<br><b>Debe ser bueno.</b><br></html>");
		frame.getContentPane().add(comboBox_8);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_9.setBounds(297, 445+29, 134, 22);
		comboBox_9.setToolTipText("<html>Se medirá de acuerdo a la cantidad de características que cumpla el software. Las características son:<br>	Cuenta con un manual de usuario incorporado al sistema con un menú.<br>	Posee una ayuda sobre la funcionalidad de cada proceso.<br>	Cuenta con un video explicativo por proceso.<br>Bueno [3] Debe cumplir con las 3 características.<br>Regular [1;2] Debe cumplir con 1 o 2 características.<br>Malo [0] No cumple ninguna característica.<br><b>No debe ser malo.</b><br></html>");
		frame.getContentPane().add(comboBox_9);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_10.setBounds(297, 474+29, 134, 22);
		comboBox_10.setToolTipText("<html>Se medirá el requerimiento del usuario para operar el sistema.<br>Bueno [3] El usuario puede operar el sistema sin asistencia.<br>Regular [2] El usuario requiere del manual o la ayuda para operar el sistema.<br>Malo [1] El usuario requiere asistencia de personal especializado para poder operar el sistema.<br><b>No debe ser malo.</b><br></html>");
		frame.getContentPane().add(comboBox_10);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_11.setBounds(297, 503+29, 134, 22);
		comboBox_11.setToolTipText("<html>Se medirán la cantidad de pasos que debe realizar el usuario para realizar una solicitud al sistema.<br>Bueno [1;3] De 1 a 3 pasos.<br>Regular [4;6] De 4 a 6 pasos.<br>Malo [>=7] 7 o más pasos.<br><b>No debe ser malo.</b><br></html>");
		frame.getContentPane().add(comboBox_11);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_12.setBounds(297, 561+29, 134, 22);
		comboBox_12.setToolTipText("<html>Se medirá de acuerdo a la cantidad de sistemas operativos con que es compatible el sistema.<br>Bueno [3] Compatible con 3 sistemas operativos (Windows, Linux y Solaris).<br>Regular [2] Compatible con 2 sistemas operativos (Windows y Linux).<br>Malo [1] Compatible con 1 sistema operativo (Windows).<br><b>Debe ser bueno.</b><br></html>");
		frame.getContentPane().add(comboBox_12);
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_13.setBounds(297, 590+29, 134, 22);
		comboBox_13.setToolTipText("<html>Se medirá de acuerdo a la cantidad de pasos que se requieren para la instalación del sistema.<br>Bueno [1;3] De 1 a 3 pasos.<br>Regular [4;8] De 4 a 8 pasos.<br>Malo [>=9] 9 o más pasos.<br><b>No debe ser malo.</b><br></html>");
		frame.getContentPane().add(comboBox_13);
		
		JComboBox comboBox_14 = new JComboBox();
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		comboBox_14.setBounds(297, 590+58, 134, 22);
		comboBox_14.setToolTipText("<html>Se medirá de acuerdo a la cantidad de fallos en la ejecución del software a la par de otros.</html>");
		frame.getContentPane().add(comboBox_14);
		
		JButton btnNewButton = new JButton("Analizar calidad");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(	!comboBox_0.getSelectedItem().toString().equals("Malo") && 	// Seguridad de Acceso
					!comboBox_1.getSelectedItem().toString().equals("Malo") && 	//	Exactitud de los Resultados
					comboBox_1p5.getSelectedItem().toString().equals("Bueno") &&//	Adecuacion
					!comboBox_2.getSelectedItem().toString().equals("Malo") &&	//	Utilizacion de los recursos
					!comboBox_3.getSelectedItem().toString().equals("Malo") &&	//	Comportamiento frente al tiempo
					comboBox_4.getSelectedItem().toString().equals("Bueno") &&	//	Tolerancia a fallos
					comboBox_5.getSelectedItem().toString().equals("Bueno") &&	//	Capacidad de recuperacion de errores
					!comboBox_6.getSelectedItem().toString().equals("Malo") &&	//	Capacidad del código de ser analizado
					!comboBox_7.getSelectedItem().toString().equals("Malo") &&	//	Capacidad del código de ser cambiado
					comboBox_8.getSelectedItem().toString().equals("Bueno") &&	//	Estabilidad
					!comboBox_9.getSelectedItem().toString().equals("Malo") &&	//	Capacidad de ser entendido
					!comboBox_10.getSelectedItem().toString().equals("Malo") &&	//	Capacidad de ser operado
					!comboBox_11.getSelectedItem().toString().equals("Malo") &&	//	Capacidad de ser atractivo para el usuario
					comboBox_12.getSelectedItem().toString().equals("Bueno") &&	//	Adaptabilidad
					!comboBox_13.getSelectedItem().toString().equals("Malo") &&	// Instabilidad
					!comboBox_14.getSelectedItem().toString().equals("Malo")
				) {
					textField.setText("SATISFACTORIO");
					textField.setForeground(Color.GREEN);
				} else {
					textField.setText("NO SATISFACTORIO");
					textField.setForeground(Color.RED);
				}
			}
		});
		btnNewButton.setBounds(12, 691, 145, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
