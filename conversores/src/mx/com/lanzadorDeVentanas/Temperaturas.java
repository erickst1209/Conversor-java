package mx.com.lanzadorDeVentanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;

import mx.com.metodosYDatos.*;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Temperaturas extends JFrame implements datos{

	private JPanel contentPane;
	private JTextField txtCantidad;
	JLabel lblOrigen,lblCantidad,lblDestino,lblResultado;
	JComboBox<String> cbxOrigen,cbxDestino;
	JButton btnRegresar,btnConvertir;



	/**
	 * Create the frame.
	 */
	public Temperaturas() {
		setTitle("Temperaturas");
		setResizable(false);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblOrigen = new JLabel("DE :");
		lblOrigen.setForeground(new Color(255, 255, 255));
		lblOrigen.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOrigen.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrigen.setBounds(10, 11, 78, 24);
		contentPane.add(lblOrigen);

		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCantidad.setBounds(10, 78, 78, 24);
		contentPane.add(lblCantidad);

		lblDestino = new JLabel("A :");
		lblDestino.setHorizontalAlignment(SwingConstants.CENTER);
		lblDestino.setForeground(Color.WHITE);
		lblDestino.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDestino.setBounds(10, 138, 78, 24);
		contentPane.add(lblDestino);

		lblResultado = new JLabel("");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setForeground(Color.WHITE);
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResultado.setBounds(10, 173, 414, 77);
		contentPane.add(lblResultado);

		cbxOrigen = new JComboBox<String>();
		cbxOrigen.setModel(new DefaultComboBoxModel<>(grados));
		cbxOrigen.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbxOrigen.setBounds(98, 12, 138, 22);
		contentPane.add(cbxOrigen);

		cbxDestino = new JComboBox<String>();
		cbxDestino.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbxDestino.setModel(new DefaultComboBoxModel<>(grados));
		cbxDestino.setBounds(98, 139, 138, 22);
		contentPane.add(cbxDestino);

		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad.setBounds(98, 78, 138, 24);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);

		btnRegresar = new JButton("Regresar");

		btnRegresar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegresar.setBounds(305, 12, 89, 23);
		contentPane.add(btnRegresar);

		btnConvertir = new JButton("Convertir");

		btnConvertir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConvertir.setBounds(305, 139, 89, 23);
		contentPane.add(btnConvertir);

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
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new menu();
				dispose();
			}
		});

		/**
		 * Accion en el boton  convertir para que ejecute su funcion 	
		 */
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//variables
				String opcionSeleccionadaOrigen = cbxOrigen.getSelectedItem().toString();
				String opcionSeleccionadaDestino = cbxDestino.getSelectedItem().toString();
				String cantidad = txtCantidad.getText();
				double cantidadDouble = Double.parseDouble(cantidad);

				//aqui convertimos la cantidad de string a double y se lanza una exception en caso de que no sea valida
				try {
					cantidadDouble = Double.parseDouble(cantidad);
					System.out.println("La cantidad de monedas es: " + cantidadDouble);
				} catch (NumberFormatException e1) {
					System.out.println("El valor ingresado en txtCantidad no es válido para convertir a double.");
				}

				int indice = Arrays.asList(divisasString).indexOf(opcionSeleccionadaOrigen);
				if (indice != -1) {
				}
				int indice2 = Arrays.asList(divisasString).indexOf(opcionSeleccionadaDestino);
				if (indice2 != -1) {


				}
				double resultado = Math.round(cantidadDouble * 1000.0)/1000.0;
				lblResultado.setText(cantidad+opcionSeleccionadaOrigen+" Es igual a "+Double.toString(metodos.funcionTemperatura(opcionSeleccionadaOrigen,opcionSeleccionadaDestino, cantidadDouble, resultado))+" en "+opcionSeleccionadaDestino);
			}
		});

	}
}
