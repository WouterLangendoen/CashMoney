package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class geldOpnemen extends JFrame {

	private JPanel contentPane;
	private JTextField txtCheckSaldo;
	private JTextField txtSnelEuro;
	private JTextField txtAfbreken;
	private JTextField txtTerugNaarKeuze;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					geldOpnemen frame = new geldOpnemen();
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
	public geldOpnemen() {
		setTitle("Geld Opnemen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				checkSaldo.main(null);				
					
			}
		});
		btnNewButton.setBounds(12, 33, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("B");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				snelPin.main(null);				
					
			}
		});
		btnNewButton_1.setBounds(12, 71, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				WindowBuilder.main(null);				
					
			}
		});
		btnNewButton_2.setBounds(12, 109, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("D");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				keuzeMenu.main(null);				
					
			}
		});
		btnNewButton_3.setBounds(12, 147, 97, 25);
		contentPane.add(btnNewButton_3);
		
		txtCheckSaldo = new JTextField();
		txtCheckSaldo.setText("Check Saldo");
		txtCheckSaldo.setBounds(136, 34, 116, 22);
		contentPane.add(txtCheckSaldo);
		txtCheckSaldo.setColumns(10);
		
		txtSnelEuro = new JTextField();
		txtSnelEuro.setText("Snel 70 euro");
		txtSnelEuro.setBounds(136, 72, 116, 22);
		contentPane.add(txtSnelEuro);
		txtSnelEuro.setColumns(10);
		
		txtAfbreken = new JTextField();
		txtAfbreken.setText("Afbreken");
		txtAfbreken.setBounds(136, 110, 116, 22);
		contentPane.add(txtAfbreken);
		txtAfbreken.setColumns(10);
		
		txtTerugNaarKeuze = new JTextField();
		txtTerugNaarKeuze.setText("Terug naar keuze menu");
		txtTerugNaarKeuze.setBounds(136, 148, 145, 24);
		contentPane.add(txtTerugNaarKeuze);
		txtTerugNaarKeuze.setColumns(10);
	}
}
