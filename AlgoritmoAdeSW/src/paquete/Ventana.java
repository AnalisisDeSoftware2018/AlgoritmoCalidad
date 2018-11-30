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
		
		JComboBox seguridadAcceso = new JComboBox();
		seguridadAcceso.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		seguridadAcceso.setBounds(297, 68, 134, 22);
		seguridadAcceso.setToolTipText("<html>Se medirá de acuerdo a la cantidad de características que cumpla el software. Las características son:<br>-	Registro de usuarios<br>-	Inicio de sesión de usuarios<br>-	Encriptación de datos<br>Bueno [10] Debe cumplir con las 3 características<br>Regular [6] Debe cumplir con 2 características<br>Malo [1] Cumple 1 o ninguna característica<br><b>No debe ser malo.</b><br></html>");
		frame.getContentPane().add(seguridadAcceso);
		
		JComboBox exactitudResultados = new JComboBox();
		exactitudResultados.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		exactitudResultados.setBounds(297, 97, 134, 22);
		exactitudResultados.setToolTipText("<html>Se medirá de acuerdo al error en los resultados.<br>Bueno [10] Los resultados tendrán un error de 10^-9 o menor.<br>Regular [6] Los resultados tendrán un error de entre 10^-3 y 10^-8 <br>Malo [1] Los resultados tendrán un error de 10^-2 o mayor.<br><b>No debe ser malo.</b><br></html>");
		frame.getContentPane().add(exactitudResultados);
		
		JComboBox utilRecursos = new JComboBox();
		utilRecursos.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		utilRecursos.setBounds(297, 155, 134, 22);
		utilRecursos.setToolTipText("<html>Se medirá de acuerdo al porcentaje de uso del procesador de una máquina estándar (Procesador y Sistema Operativo de 64 bits, 6gb de memoria RAM).<br>Bueno [10] El porcentaje del uso del procesador será entre el 0% y 15%<br>Regular [6] porcentaje del uso del procesador será entre el 16% y 49%<br>Malo [1] porcentaje del uso del procesador será entre el 50% y 100%<br><b>No debe ser malo.</b><br></html>");
		frame.getContentPane().add(utilRecursos);
		
		JComboBox compTiempo = new JComboBox();
		compTiempo.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		compTiempo.setBounds(297, 187, 134, 22);
		compTiempo.setToolTipText("<html>Se medirá el tiempo de respuesta del sistema ante una solicitud del usuario.<br>Bueno [10] El tiempo de respuesta del sistema es de 0 a 2 segundos.<br>Regular [6] El tiempo de respuesta del sistema es de 3 a 5 segundos.<br>Malo [1] El tiempo de respuesta del sistema es de 6 o mas segundos.<br><b>No debe ser malo.</b><br></html>");
		frame.getContentPane().add(compTiempo);
		
		JComboBox toleranciaFallos = new JComboBox();
		toleranciaFallos.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		toleranciaFallos.setBounds(297, 242, 134, 22);
		toleranciaFallos.setToolTipText("<html>Se medirá de acuerdo a la cantidad de características que cumpla el software. Las características son:<br>-	Se cuenta con un archivo de log sobre las actividades que realiza el sistema.<br>-	Cuando sucede un error se protegen los datos procesados.<br>Bueno [10] Debe cumplir con las 2 características.<br>Regular [6] Debe cumplir con 1 característica.<br>Malo [1] No cumple ninguna característica.<br><b>Debe ser bueno.</b><br></html>");
		frame.getContentPane().add(toleranciaFallos);
		
		JComboBox recuperacionErrores = new JComboBox();
		recuperacionErrores.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		recuperacionErrores.setBounds(297, 271, 134, 22);
		recuperacionErrores.setToolTipText("<html>Se medirá de acuerdo a la cantidad de características que cumpla el software. Las características son:<br>-	El sistema puede recuperarse frente a una falla.<br>-	Reanuda sus actividades y vuelve al estado en el que se encontraba.<br>Bueno [10] Debe cumplir con las 2 características.<br>Regular [6] Debe cumplir con 1 característica.<br>Malo [1] No cumple ninguna característica.<br><b>No debe ser malo.</b><br></html>");
		frame.getContentPane().add(recuperacionErrores);
		
		JComboBox codigoAnalizado = new JComboBox();
		codigoAnalizado.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		codigoAnalizado.setBounds(297, 329, 134, 22);
		codigoAnalizado.setToolTipText("<html>Se medirá de acuerdo al porcentaje de métodos con nombres representativos en el código<br>Bueno [10] Del 85 al 100% de los métodos deben tener nombres representativos.<br>Regular [6] Del 60 al 84% de los métodos deben tener nombres representativos.<br>Malo [1] El porcentaje de métodos con nombres representativos es de 59% o menos.<br><b>No debe ser malo.</b><br></html>");
		frame.getContentPane().add(codigoAnalizado);
		
		JComboBox codigoCambiado = new JComboBox();
		codigoCambiado.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		codigoCambiado.setBounds(297, 358, 134, 22);
		codigoCambiado.setToolTipText("<html>Se medirá de acuerdo a la complejidad ciclomática<br>Bueno [10] La complejidad ciclomática es menor o igual a 10.<br>Regular [6] La complejidad ciclomática esta entre 11 y 25.<br>Malo [1] La complejidad ciclomática es mayor o igual a 26.<br><b>No debe ser malo.</b><br></html>");
		frame.getContentPane().add(codigoCambiado);
		
		JComboBox estabilidad = new JComboBox();
		estabilidad.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		estabilidad.setBounds(297, 387, 134, 22);
		estabilidad.setToolTipText("<html>Se medirá la cantidad de fallas por prueba del sistema<br>Bueno [10] Entre 0 a 1 error por prueba.<br>Regular [6] Entre 2 a 3 errores por prueba.<br>Malo [1] 4 o mas errores por prueba.<br><b>Debe ser bueno.</b><br></html>");
		frame.getContentPane().add(estabilidad);
		
		JComboBox capacidadEntendido = new JComboBox();
		capacidadEntendido.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		capacidadEntendido.setBounds(297, 445, 134, 22);
		capacidadEntendido.setToolTipText("<html>Se medirá de acuerdo a la cantidad de características que cumpla el software. Las características son:<br>-	Cuenta con un manual de usuario incorporado al sistema con un menú.<br>-	Posee una ayuda sobre la funcionalidad de cada proceso.<br>-	Cuenta con un video explicativo por proceso.<br>Bueno [10] Debe cumplir con las 3 características.<br>Regular [6] Debe cumplir con 1 o 2 características.<br>Malo [1] No cumple ninguna característica.<br><b>No debe ser malo.</b><br></html>");
		frame.getContentPane().add(capacidadEntendido);
		
		JComboBox capacidadOperado = new JComboBox();
		capacidadOperado.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		capacidadOperado.setBounds(297, 474, 134, 22);
		capacidadOperado.setToolTipText("<html>Se medirá el requerimiento del usuario para operar el sistema.<br>Bueno [10] El usuario puede operar el sistema sin asistencia.<br>Regular [6] El usuario requiere del manual o la ayuda para operar el sistema.<br>Malo [1] El usuario requiere asistencia de personal especializado para poder operar el sistema.<br><b>No debe ser malo.</b><br></html>");
		frame.getContentPane().add(capacidadOperado);
		
		JComboBox capacidadAtractivo = new JComboBox();
		capacidadAtractivo.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		capacidadAtractivo.setBounds(297, 503, 134, 22);
		capacidadAtractivo.setToolTipText("<html>Se medirán la cantidad de pasos que debe realizar el usuario para realizar una solicitud al sistema.<br>Bueno [10] De 1 a 3 pasos.<br>Regular [6] De 4 a 6 pasos.<br>Malo [1] 7 o más pasos.<br><b>No debe ser malo.</b><br></html>");
		frame.getContentPane().add(capacidadAtractivo);
		
		JComboBox adaptabilidad = new JComboBox();
		adaptabilidad.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		adaptabilidad.setBounds(297, 561, 134, 22);
		adaptabilidad.setToolTipText("<html>Se medirá de acuerdo a la cantidad de sistemas operativos con que es compatible el sistema.<br>Bueno [10] Compatible con 3 sistemas operativos (Windows, Linux y macOS).<br>Regular [6] Compatible con 2 sistemas operativos (Windows y Linux).<br>Malo [1] Compatible con 1 sistema operativo (Windows).<br><b>Debe ser bueno.</b><br></html>");
		frame.getContentPane().add(adaptabilidad);
		
		JComboBox instalabilidad = new JComboBox();
		instalabilidad.setModel(new DefaultComboBoxModel(new String[] {"Bueno", "Regular", "Malo"}));
		instalabilidad.setBounds(297, 590, 134, 22);
		instalabilidad.setToolTipText("<html>Se medirá de acuerdo a la cantidad de pasos que se requieren para la instalación del sistema.<br>Bueno [10] De 1 a 3 pasos.<br>Regular [6] De 4 a 8 pasos.<br>Malo [1] 9 o más pasos.<br><b>No debe ser malo.</b><br></html>");
		frame.getContentPane().add(instalabilidad);
		
		JButton btnAnalizar = new JButton("Analizar calidad");
		btnAnalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(	!seguridadAcceso.getSelectedItem().toString().equals("Malo") &&
					!exactitudResultados.getSelectedItem().toString().equals("Malo") &&
					!utilRecursos.getSelectedItem().toString().equals("Malo") &&
					!compTiempo.getSelectedItem().toString().equals("Malo") &&
					toleranciaFallos.getSelectedItem().toString().equals("Bueno") &&
					!recuperacionErrores.getSelectedItem().toString().equals("Malo") &&
					!codigoAnalizado.getSelectedItem().toString().equals("Malo") &&
					!codigoCambiado.getSelectedItem().toString().equals("Malo") &&
					estabilidad.getSelectedItem().toString().equals("Bueno") &&
					!capacidadEntendido.getSelectedItem().toString().equals("Malo") &&
					!capacidadOperado.getSelectedItem().toString().equals("Malo") &&
					!capacidadAtractivo.getSelectedItem().toString().equals("Malo") &&
					adaptabilidad.getSelectedItem().toString().equals("Bueno") &&
					!instalabilidad.getSelectedItem().toString().equals("Malo") 
				) {
					textField.setText("SATISFACTORIO");
					textField.setForeground(Color.GREEN);
				} else {
					textField.setText("NO SATISFACTORIO");
					textField.setForeground(Color.RED);
				}
			}
		});
		btnAnalizar.setBounds(12, 633, 145, 25);
		frame.getContentPane().add(btnAnalizar);
	}
}
