package mx.com.lanzadorDeVentanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class menu extends JFrame  {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public menu() {


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitulo = new JLabel("Bienvenido al conversor universal");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 0, 434, 47);
		contentPane.add(lblTitulo);

		JButton btnDivisas = new JButton("Divisas");
		
		btnDivisas.setForeground(new Color(255, 255, 255));
		btnDivisas.setBackground(new Color(0, 128, 64));
		btnDivisas.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDivisas.setBounds(10, 59, 162, 38);
		contentPane.add(btnDivisas);

		JButton btnTemperatura = new JButton("Temperatura");
		
		btnTemperatura.setForeground(new Color(255, 255, 255));
		btnTemperatura.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTemperatura.setBackground(new Color(128, 0, 0));
		btnTemperatura.setBounds(10, 127, 162, 38);
		contentPane.add(btnTemperatura);

		JButton btnMedidas = new JButton("Medidas");
		btnMedidas.setForeground(new Color(255, 255, 255));
		btnMedidas.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMedidas.setBackground(new Color(255, 128, 0));
		btnMedidas.setBounds(10, 194, 162, 38);
		contentPane.add(btnMedidas);
		/**
		 * AQUI ESTAN LOS ACCION LISTENERS PARA ABRIR DESDE EL MENU LAS VENTANAS
		 */
		btnTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Temperaturas temperaturas = new Temperaturas();
				temperaturas.setVisible(true);
			}
		});
		btnDivisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Divisas divisas = new Divisas();
				divisas.setVisible(true);
			}});
		btnMedidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Medidas medidas = new Medidas();
				medidas.setVisible(true);
			}
		});
	}
}
