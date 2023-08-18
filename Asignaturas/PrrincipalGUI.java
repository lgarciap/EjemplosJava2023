import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class PrrincipalGUI {

	private Semestre semestre;
	
	private JFrame ventana;
	private JTextField tfNombre;
	private JTextField tfNota;
	private JButton btnAgregarMateria;
	private JPanel pResultados;
	private JLabel lblIngresoMaterias;
	private JLabel lblPromedio;
	private JButton btnMejorCurso;
	private JLabel lblMejorCurso;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		PrrincipalGUI window = new PrrincipalGUI();
		window.ventana.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public PrrincipalGUI() {
		semestre = new Semestre();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Oyente escucha = new Oyente();
		
		ventana = new JFrame();
		ventana.setTitle("Gestor de Semestre");
		ventana.setBounds(100, 100, 563, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pDatos = new JPanel();
		pDatos.setBorder(new TitledBorder(null, "Ingreso de datos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		ventana.getContentPane().add(pDatos, BorderLayout.NORTH);
		
		JLabel lblMateria = new JLabel("Nombre de la materia:");
		pDatos.add(lblMateria);
		
		tfNombre = new JTextField();
		pDatos.add(tfNombre);
		tfNombre.setColumns(10);
		
		JLabel lblNota = new JLabel("Nota: ");
		pDatos.add(lblNota);
		
		tfNota = new JTextField();
		pDatos.add(tfNota);
		tfNota.setColumns(10);
		
		btnAgregarMateria = new JButton("Agregar");
		btnAgregarMateria.addActionListener(escucha);
		pDatos.add(btnAgregarMateria);
		
		pResultados = new JPanel();
		pResultados.setBorder(new TitledBorder(null, "Resultados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ventana.getContentPane().add(pResultados, BorderLayout.CENTER);
		pResultados.setLayout(new GridLayout(4, 1, 0, 0));
		
		lblIngresoMaterias = new JLabel("<html>");
		lblIngresoMaterias.setSize(0, 200);
		pResultados.add(lblIngresoMaterias);
		
		lblPromedio = new JLabel("");
		pResultados.add(lblPromedio);
		
		btnMejorCurso = new JButton("Mejor Curso");
		pResultados.add(btnMejorCurso);
		btnMejorCurso.addActionListener(escucha);
		
		lblMejorCurso = new JLabel("");
		pResultados.add(lblMejorCurso);
	}
	
	private class Oyente implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == btnAgregarMateria) {
				String materiaCompleta = "Nombre: " + tfNombre.getText()+ " Nota : " + tfNota.getText();
				lblIngresoMaterias.setText(lblIngresoMaterias.getText() + materiaCompleta + "<br/>");
				semestre.agregarAsignatura(tfNombre.getText(), Double.parseDouble( tfNota.getText()));
				//lblIngresoMaterias.setText(semestre.toString());
				tfNombre.setText(null);
				tfNota.setText("");
				if (semestre.getCantAsig() >= 5) {
					btnAgregarMateria.setEnabled(false);
				}
				double prom = semestre.calcularPromedio();
				lblPromedio.setText("Promedio: "+Double.toString(prom));
			}
			if (e.getSource() == btnMejorCurso) {
				lblMejorCurso.setText(semestre.mejorClase());
			}
		}
		
	}

}
