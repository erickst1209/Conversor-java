package mx.com.lanzadorDeVentanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;

import mx.com.metodosYDatos.*;

import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;

@SuppressWarnings("serial")
public class Medidas extends JFrame implements datos {
	private JPanel contentPane;
	private JTextField textField;
	JLabel lblPanelMain,lblOrigen,lblDestino,lblCantidad,lblResultado;
	JButton btnRegresarMenu,btnRegresar,btnConvertir;
	JRadioButton checkLongitud,checkArea,checkPeso,checkTiempo,checkVolumen,checkVelocidad,checkPrecion;
	JComboBox<Object> cbxDestino,cbxOrigen;
	ButtonGroup checks = new ButtonGroup();
	DefaultComboBoxModel<String> modelLongitud = new DefaultComboBoxModel<>(longitud);


	/**
	 * Create the frame.
	 */
	public Medidas() {
		setTitle("Medidas");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 417);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		checks.add(checkLongitud);
		checks.add(checkArea);
		checks.add(checkPeso);
		checks.add(checkPrecion);
		checks.add(checkTiempo);
		checks.add(checkVelocidad);
		checks.add(checkVolumen);

		lblPanelMain = new JLabel("seleccion el metodo de medida");
		lblPanelMain.setHorizontalAlignment(SwingConstants.CENTER);
		lblPanelMain.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblPanelMain.setBounds(0, 0, 434, 40);
		contentPane.add(lblPanelMain);

		btnRegresarMenu = new JButton("Regresar ");
		btnRegresarMenu.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegresarMenu.setBounds(335, 42, 89, 23);
		contentPane.add(btnRegresarMenu);

		checkLongitud = new JRadioButton("Longitud");
		checkLongitud.setSelected(false);
		checkLongitud.getActionCommand();
		checkLongitud.setHorizontalAlignment(SwingConstants.LEFT);
		checkLongitud.setFont(new Font("Tahoma", Font.BOLD, 11));
		checkLongitud.setBackground(new Color(255, 128, 0));
		checkLongitud.setBounds(325, 72, 109, 23);
		contentPane.add(checkLongitud);

		checkArea = new JRadioButton("Area");
		checkArea.setHorizontalAlignment(SwingConstants.LEFT);
		checkArea.setSelected(false);
		checkArea.getActionCommand();
		checkArea.setFont(new Font("Tahoma", Font.BOLD, 11));
		checkArea.setBackground(new Color(255, 128, 0));
		checkArea.setBounds(325, 95, 109, 23);
		contentPane.add(checkArea);

		checkPeso = new JRadioButton("Peso y masa");
		checkPeso.setSelected(false);
		checkPeso.getActionCommand();
		checkPeso.setFont(new Font("Tahoma", Font.BOLD, 11));
		checkPeso.setBackground(new Color(255, 128, 0));
		checkPeso.setBounds(325, 117, 109, 23);
		contentPane.add(checkPeso);

		checkTiempo = new JRadioButton("Tiempo");
		checkTiempo.setSelected(false);
		checkTiempo.getActionCommand();
		checkTiempo.setFont(new Font("Tahoma", Font.BOLD, 11));
		checkTiempo.setBackground(new Color(255, 128, 0));
		checkTiempo.setBounds(325, 139, 109, 23);
		contentPane.add(checkTiempo);

		checkVolumen = new JRadioButton("volumen");
		checkVolumen.setSelected(false);
		checkVolumen.getActionCommand();
		checkVolumen.setFont(new Font("Tahoma", Font.BOLD, 11));
		checkVolumen.setBackground(new Color(255, 128, 0));
		checkVolumen.setBounds(325, 161, 109, 23);
		contentPane.add(checkVolumen);

		checkVelocidad = new JRadioButton("Velocidad");
		checkVelocidad.setSelected(false);
		checkVelocidad.getActionCommand();
		checkVelocidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		checkVelocidad.setBackground(new Color(255, 128, 0));
		checkVelocidad.setBounds(325, 183, 109, 23);
		contentPane.add(checkVelocidad);

		checkPrecion = new JRadioButton("Precion");
		checkPrecion.setSelected(false);
		checkPrecion.getActionCommand();
		checkPrecion.setFont(new Font("Tahoma", Font.BOLD, 11));
		checkPrecion.setBackground(new Color(255, 128, 0));
		checkPrecion.setBounds(325, 206, 109, 23);
		contentPane.add(checkPrecion);

		btnConvertir = new JButton("Convertir");
		btnConvertir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConvertir.setBounds(108, 223, 89, 23);
		contentPane.add(btnConvertir);

		lblOrigen = new JLabel("DE :");
		lblOrigen.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrigen.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOrigen.setBounds(10, 51, 46, 14);
		contentPane.add(lblOrigen);

		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCantidad.setBounds(10, 103, 59, 14);
		contentPane.add(lblCantidad);

		lblDestino = new JLabel("A :");
		lblDestino.setHorizontalAlignment(SwingConstants.CENTER);
		lblDestino.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDestino.setBounds(10, 144, 46, 14);
		contentPane.add(lblDestino);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(77, 98, 130, 20);
		contentPane.add(textField);

		cbxOrigen = new JComboBox<Object>();
		cbxOrigen.setModel(new DefaultComboBoxModel<>());
		cbxOrigen.setBounds(77, 50, 130, 22);
		contentPane.add(cbxOrigen);

		cbxDestino = new JComboBox<Object>();
		cbxDestino.setModel(new DefaultComboBoxModel<>());
		cbxDestino.setBounds(75, 141, 130, 22);
		contentPane.add(cbxDestino);

		lblResultado = new JLabel("");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResultado.setBounds(0, 280, 434, 98);
		contentPane.add(lblResultado);
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
		 * accion para agregar los elementos de la unidad longitud.		
		 */
		checkLongitud.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cbxOrigen.removeAllItems();
				cbxDestino.removeAllItems();
				cbxOrigen.addItem(" Metros ");
				cbxOrigen.addItem(" Kilometros ");
				cbxOrigen.addItem(" Centimetros ");
				cbxOrigen.addItem(" Pulgadas ");
				cbxOrigen.addItem(" Pies ");
				cbxOrigen.addItem(" Yardas ");
				cbxOrigen.addItem(" Millas ");

				cbxDestino.addItem(" Metros ");
				cbxDestino.addItem(" Kilometros ");
				cbxDestino.addItem(" Centimetros ");
				cbxDestino.addItem(" Pulgadas ");
				cbxDestino.addItem(" Pies ");
				cbxDestino.addItem(" Yardas ");
				cbxDestino.addItem(" Millas ");

				if(checkLongitud.isSelected()) {
					checkArea.setVisible(false);
					checkPeso.setVisible(false);
					checkTiempo.setVisible(false);
					checkVolumen.setVisible(false);
					checkVelocidad.setVisible(false);
					checkPrecion.setVisible(false);
				}else {
					checkArea.setVisible(true);
					checkPeso.setVisible(true);
					checkTiempo.setVisible(true);
					checkVolumen.setVisible(true);
					checkVelocidad.setVisible(true);
					checkPrecion.setVisible(true);
				}

			}
		});
		/**
		 * accion para agregar los elementos de la unidad area.		
		 */
		checkArea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cbxOrigen.removeAllItems();
				cbxDestino.removeAllItems();
				cbxOrigen.addItem(" M² ");
				cbxOrigen.addItem(" Km² ");
				cbxOrigen.addItem(" Cm² ");
				cbxOrigen.addItem(" Hectareas ");
				cbxOrigen.addItem(" Acres ");
				cbxOrigen.addItem(" Ft² ");
				cbxOrigen.addItem(" Yd² ");

				cbxDestino.addItem(" M² ");
				cbxDestino.addItem(" Km² ");
				cbxDestino.addItem(" Cm² ");
				cbxDestino.addItem(" Hectareas ");
				cbxDestino.addItem(" Acres ");
				cbxDestino.addItem(" Ft² ");
				cbxDestino.addItem(" Yd² ");

				if(checkArea.isSelected()) {
					checkLongitud.setVisible(false);
					checkPeso.setVisible(false);
					checkTiempo.setVisible(false);
					checkVolumen.setVisible(false);
					checkVelocidad.setVisible(false);
					checkPrecion.setVisible(false);
				}else {
					checkLongitud.setVisible(true);
					checkPeso.setVisible(true);
					checkTiempo.setVisible(true);
					checkVolumen.setVisible(true);
					checkVelocidad.setVisible(true);
					checkPrecion.setVisible(true);
				}
			}
		});
		/**
		 * accion para agregar los elementos de la unidad volumen.		
		 */
		checkVolumen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cbxOrigen.removeAllItems();
				cbxDestino.removeAllItems();
				cbxOrigen.addItem(" M³ ");
				cbxOrigen.addItem(" Cm³ ");
				cbxOrigen.addItem(" Litros ");
				cbxOrigen.addItem(" mL ");
				cbxOrigen.addItem(" Ft³ ");
				cbxOrigen.addItem(" Galones ");
				cbxOrigen.addItem(" Fl oz ");

				cbxDestino.addItem(" M³ ");
				cbxDestino.addItem(" Cm³ ");
				cbxDestino.addItem(" Litros ");
				cbxDestino.addItem(" mL ");
				cbxDestino.addItem(" Ft³ ");
				cbxDestino.addItem(" Galones ");
				cbxDestino.addItem(" Fl oz ");

				if(checkVolumen.isSelected()) {
					checkLongitud.setVisible(false);
					checkPeso.setVisible(false);
					checkTiempo.setVisible(false);
					checkArea.setVisible(false);
					checkVelocidad.setVisible(false);
					checkPrecion.setVisible(false);
				}else {
					checkLongitud.setVisible(true);
					checkPeso.setVisible(true);
					checkTiempo.setVisible(true);
					checkArea.setVisible(true);
					checkVelocidad.setVisible(true);
					checkPrecion.setVisible(true);
				}
			}
		});
		/**
		 * accion para agregar los elementos de la unidad peso.		
		 */
		checkPeso.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cbxOrigen.removeAllItems();
				cbxDestino.removeAllItems();
				cbxOrigen.addItem(" Gramos ");
				cbxOrigen.addItem(" Kilogramos ");
				cbxOrigen.addItem(" Toneladas ");
				cbxOrigen.addItem(" Oz ");
				cbxOrigen.addItem(" Libras ");
				cbxOrigen.addItem(" Quintal ");
				cbxOrigen.addItem(" Tonelada Metrica ");

				cbxDestino.addItem(" Gramos ");
				cbxDestino.addItem(" Kilogramos ");
				cbxDestino.addItem(" Toneladas ");
				cbxDestino.addItem(" Oz ");
				cbxDestino.addItem(" Libras ");
				cbxDestino.addItem(" Quintal ");
				cbxDestino.addItem(" Tonelada Metrica ");

				if(checkPeso.isSelected()) {
					checkLongitud.setVisible(false);
					checkVolumen.setVisible(false);
					checkTiempo.setVisible(false);
					checkArea.setVisible(false);
					checkVelocidad.setVisible(false);
					checkPrecion.setVisible(false);
				}else {
					checkLongitud.setVisible(true);
					checkVolumen.setVisible(true);
					checkTiempo.setVisible(true);
					checkArea.setVisible(true);
					checkVelocidad.setVisible(true);
					checkPrecion.setVisible(true);
				}
			}
		});
		/**
		 * accion para agregar los elementos de la unidad tiempo.		
		 */
		checkTiempo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cbxOrigen.removeAllItems();
				cbxDestino.removeAllItems();
				cbxOrigen.addItem(" Segundos ");
				cbxOrigen.addItem(" Minutos ");
				cbxOrigen.addItem(" Horas ");
				cbxOrigen.addItem(" Dias ");
				cbxOrigen.addItem(" Semanas ");
				cbxOrigen.addItem(" Meses ");
				cbxOrigen.addItem(" Años ");

				cbxDestino.addItem(" Segundos ");
				cbxDestino.addItem(" Minutos ");
				cbxDestino.addItem(" Horas ");
				cbxDestino.addItem(" Dias ");
				cbxDestino.addItem(" Semanas ");
				cbxDestino.addItem(" Meses ");
				cbxDestino.addItem(" Años ");

				if(checkTiempo.isSelected()) {
					checkLongitud.setVisible(false);
					checkVolumen.setVisible(false);
					checkPeso.setVisible(false);
					checkArea.setVisible(false);
					checkVelocidad.setVisible(false);
					checkPrecion.setVisible(false);
				}else {
					checkLongitud.setVisible(true);
					checkVolumen.setVisible(true);
					checkPeso.setVisible(true);
					checkArea.setVisible(true);
					checkVelocidad.setVisible(true);
					checkPrecion.setVisible(true);
				}
			}
		});
		/**
		 * accion para agregar los elementos de la unidad velocidad.		
		 */
		checkVelocidad.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cbxOrigen.removeAllItems();
				cbxDestino.removeAllItems();
				cbxOrigen.addItem(" M/S ");
				cbxOrigen.addItem(" Km/S ");
				cbxOrigen.addItem(" Mph ");
				cbxOrigen.addItem(" Nudos ");
				cbxOrigen.addItem(" Pies por Segundo ");


				cbxDestino.addItem(" M/S ");
				cbxDestino.addItem(" Km/S ");
				cbxDestino.addItem(" Mph ");
				cbxDestino.addItem(" Nudos ");
				cbxDestino.addItem(" Pies por Segundo ");

				if(checkVelocidad.isSelected()) {
					checkLongitud.setVisible(false);
					checkVolumen.setVisible(false);
					checkPeso.setVisible(false);
					checkArea.setVisible(false);
					checkTiempo.setVisible(false);
					checkPrecion.setVisible(false);
				}else {
					checkLongitud.setVisible(true);
					checkVolumen.setVisible(true);
					checkPeso.setVisible(true);
					checkArea.setVisible(true);
					checkTiempo.setVisible(true);
					checkPrecion.setVisible(true);
				}
			}
		});
		/**
		 * accion para agregar los elementos de la unidad precion.		
		 */
		checkPrecion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cbxOrigen.removeAllItems();
				cbxDestino.removeAllItems();
				cbxOrigen.addItem(" Pascales ");
				cbxOrigen.addItem(" Bar ");
				cbxOrigen.addItem(" Psi ");
				cbxOrigen.addItem(" mmHg ");
				cbxOrigen.addItem(" Atmosfera ");
				cbxOrigen.addItem(" Kilopascales ");


				cbxDestino.addItem(" Pascales ");
				cbxDestino.addItem(" Bar ");
				cbxDestino.addItem(" Psi ");
				cbxDestino.addItem(" mmHg ");
				cbxDestino.addItem(" Atmosfera ");
				cbxDestino.addItem(" Kilopascales ");

				if(checkPrecion.isSelected()) {
					checkLongitud.setVisible(false);
					checkVolumen.setVisible(false);
					checkPeso.setVisible(false);
					checkArea.setVisible(false);
					checkVelocidad.setVisible(false);
					checkTiempo.setVisible(false);
				}else {
					checkLongitud.setVisible(true);
					checkVolumen.setVisible(true);
					checkPeso.setVisible(true);
					checkArea.setVisible(true);
					checkVelocidad.setVisible(true);
					checkTiempo.setVisible(true);
				}
			}
		});

		/**
		 * Logica para que en el textField solo acepte numeros
		 */
		((AbstractDocument) textField.getDocument()).setDocumentFilter(new DocumentFilter() {
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
		 * Accion en el boton  convertir para que  cada radiobuttom ejecute su funcion dependiendo la unidad de medida	
		 */
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//variables
				String opcionOrigen = cbxOrigen.getSelectedItem().toString();
				String opcionDestino = cbxDestino.getSelectedItem().toString();
				String cantidadString = textField.getText();
				double cantidadDouble = Double.parseDouble(cantidadString);
				double resultado = Math.round(cantidadDouble * 1000.0)/1000.0;
				//aqui convertimos la cantidad de string a double y se lanza una exception en caso de que no sea valida
				try {
					cantidadDouble = Double.parseDouble(cantidadString);
					System.out.println("La cantidad de monedas es: " + cantidadDouble);
				} catch (NumberFormatException e1) {
					System.out.println("El valor ingresado en txtCantidad no es válido para convertir a double.");
				}


				/**
				 * aqui checamos cuando el usuario selecciona un opcion en las medidas  y segun la seleccionada ejecuta la funcion
				 */
				if(checkLongitud.isSelected()) {
					if(opcionOrigen == opcionDestino) {
						lblResultado.setText(" Por favor selecciona unidades diferentes ");
					}else {
						lblResultado.setText(cantidadString + opcionOrigen + " es igual a " + Double.toString(metodos.funcionLongitud(opcionOrigen, opcionDestino,cantidadDouble,resultado)) + " en " + opcionDestino);
						System.out.println(" si funciona ");}
				}else if(checkArea.isSelected()) {
					if(opcionOrigen == opcionDestino) {
						lblResultado.setText(" Por favor selecciona unidades diferentes ");
					}else {
						lblResultado.setText(cantidadString + opcionOrigen + " es igual a " + Double.toString(metodos.funcionArea(opcionOrigen, opcionDestino,cantidadDouble,resultado)) + " en " + opcionDestino);
						System.out.println(" si funciona ");}
				}else if(checkVolumen.isSelected()) {
					if(opcionOrigen == opcionDestino) {
						lblResultado.setText(" Por favor selecciona unidades diferentes ");
					}else {
						lblResultado.setText(cantidadString + opcionOrigen + " es igual a " + Double.toString(metodos.funcionVolumen(opcionOrigen, opcionDestino,cantidadDouble,resultado)) + " en " + opcionDestino);
						System.out.println(" si funciona ");}
				}else if(checkPeso.isSelected()) {
					if(opcionOrigen == opcionDestino) {
						lblResultado.setText(" Por favor selecciona unidades diferentes ");
					}else {
						lblResultado.setText(cantidadString + opcionOrigen + " es igual a " + Double.toString(metodos.funcionPesoYmasa(opcionOrigen, opcionDestino,cantidadDouble,resultado)) + " en " + opcionDestino);
						System.out.println(" si funciona ");}
				}else if(checkTiempo.isSelected()) {
					if(opcionOrigen == opcionDestino) {
						lblResultado.setText(" Por favor selecciona unidades diferentes ");
					}else {
						lblResultado.setText(cantidadString + opcionOrigen + " es igual a " + Double.toString(metodos.funcionTiempo(opcionOrigen, opcionDestino,cantidadDouble,resultado)) + " en " + opcionDestino);
						System.out.println(" si funciona ");}
				}else if(checkVelocidad.isSelected()) {
					if(opcionOrigen == opcionDestino) {
						lblResultado.setText(" Por favor selecciona unidades diferentes ");
					}else {
						lblResultado.setText(cantidadString + opcionOrigen + " es igual a " + Double.toString(metodos.funcionVelocidad(opcionOrigen, opcionDestino,cantidadDouble,resultado)) + " en " + opcionDestino);
						System.out.println(" si funciona ");}
				}else if(checkPrecion.isSelected()) {
					if(opcionOrigen == opcionDestino) {
						lblResultado.setText(" Por favor selecciona unidades diferentes ");
					}else {
						lblResultado.setText(cantidadString + opcionOrigen + " es igual a " + Double.toString(metodos.funcionPrecion(opcionOrigen, opcionDestino,cantidadDouble,resultado)) + " en " + opcionDestino);
						System.out.println(" si funciona ");}
				}
			}
		});
	}
}
