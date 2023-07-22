package mx.com.lanzadorDeVentanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;

import mx.com.metodosYDatos.*;



@SuppressWarnings("serial")
public class Divisas extends JFrame implements datos {

	private JPanel contentPane;
	private JTextField txtCantidad;
	JLabel lblDe,lblCantidad,lblA,lblResultado;
	JButton btnConvertir,btnRegresarMenu;
	JComboBox<String> cbxMoneda1;
	static JComboBox<String> cbxMoneda2;



	/**
	 * Create the frame.
	 */
	public Divisas() {
		setTitle("Divisas");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblDe = new JLabel("DE :");
		lblDe.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDe.setForeground(Color.WHITE);
		lblDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblDe.setBounds(10, 29, 46, 14);
		contentPane.add(lblDe);

		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setBounds(10, 84, 46, 14);
		contentPane.add(lblCantidad);

		lblA = new JLabel("A :");
		lblA.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblA.setForeground(Color.WHITE);
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setBounds(10, 137, 46, 14);
		contentPane.add(lblA);

		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResultado.setForeground(Color.WHITE);
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(10, 186, 414, 64);
		contentPane.add(lblResultado);

		btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(323, 133, 89, 23);
		contentPane.add(btnConvertir);

		btnRegresarMenu = new JButton("Regresar");
		btnRegresarMenu.setBounds(323, 39, 89, 23);
		contentPane.add(btnRegresarMenu);

		cbxMoneda1 = new JComboBox<String>();
		cbxMoneda1.setModel(new DefaultComboBoxModel<>(divisasString));
		cbxMoneda1.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbxMoneda1.setBounds(66, 25, 173, 22);
		contentPane.add(cbxMoneda1);

		cbxMoneda2 = new JComboBox<String>();
		cbxMoneda2.setModel(new DefaultComboBoxModel<>(divisasString));
		cbxMoneda2.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbxMoneda2.setBounds(66, 133, 173, 22);
		contentPane.add(cbxMoneda2);

		txtCantidad = new JTextField();
		txtCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtCantidad.setBounds(66, 81, 173, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);

		/**
		 * Logica para que en el textField solo acepte numeros
		 */
		((AbstractDocument) txtCantidad.getDocument()).setDocumentFilter(new DocumentFilter() {
			@Override
			public void insertString(FilterBypass fb, int offset, String string, javax.swing.text.AttributeSet attrribute)
					throws javax.swing.text.BadLocationException { if (string.matches("/d+")) { super.insertString(fb, offset, string, attrribute); } }

			@Override
			public void replace(FilterBypass fb, int offset, int length, String text, javax.swing.text.AttributeSet attrs) 
					throws javax.swing.text.BadLocationException {
				if (text.matches("\\d+")) {
					super.replace(fb, offset, length, text, attrs);
				}
			}
		});

		/**
		 * accion para regresar al menu
		 */
		btnRegresarMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new menu();
				dispose();

			}
		});



		/**
		 * Accion en el boton  convertir para que  ejecute su funcion 	
		 */
		btnConvertir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String opcionSeleccionadaOrigen = cbxMoneda1.getSelectedItem().toString();
				String opcionSeleccionadaDestino = cbxMoneda2.getSelectedItem().toString();


				String cantidadMonedasString = txtCantidad.getText();
				double cantidadMonedas = Double.parseDouble(cantidadMonedasString);
				double resultado = Math.round(cantidadMonedas * 1000.0)/1000.0;


				//aqui se combierte la cantidad ingresada de string a double
				try {
					cantidadMonedas = Double.parseDouble(cantidadMonedasString);
					System.out.println("La cantidad de monedas es: " + cantidadMonedas);
				} catch (NumberFormatException e1) {
					System.out.println("El valor ingresado en txtCantidad no es válido para convertir a double.");
				}

				/**
				 * Aqui se cambia el valor de la segunda opcion segun el string
				 * 
				 */
				double opcion1 = divisasValor[0];
				double opcion2 = divisasValor[0];

				int indice = Arrays.asList(divisasString).indexOf(opcionSeleccionadaOrigen);
				if (indice != -1) {
					opcion1 = divisasValor[indice];
				}
				int indice2 = Arrays.asList(divisasString).indexOf(opcionSeleccionadaDestino);
				if (indice2 != -1) {
					opcion2 = divisasValor[indice2];
				}

				lblResultado.setText(cantidadMonedasString+opcionSeleccionadaOrigen+" Es igual a "+Double.toString(metodos.funcionDivisas(opcion1, opcion2, cantidadMonedas, resultado))+" en "+opcionSeleccionadaDestino);
				System.out.println("res en ventana "+" opcion 1 es "+opcion1+" opcion 2 es "+ opcion2+" cantidad es "+ cantidadMonedas+" resultado es "+resultado);	
			}
		});
	}
}
