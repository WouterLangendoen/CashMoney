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

public class snelPin extends JFrame {

	private JPanel contentPane;
	private JTextField txtGeldOpnemen;
	private JTextField txtCheckSaldo;
	private JTextField txtAfbreken;
	private JTextField txtTerugNaarKeuzemenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					snelPin frame = new snelPin();
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
	public snelPin() {
		setTitle("Snel 70 euro ");
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
		btnNewButton.setBounds(12, 25, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("B");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				geldOpnemen.main(null);				
					}
		});
		btnNewButton_1.setBounds(12, 67, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				WindowBuilder.main(null);				
					}
		});
		btnNewButton_2.setBounds(12, 105, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("D");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				keuzeMenu.main(null);				
					}
		});
		btnNewButton_3.setBounds(12, 143, 97, 25);
		contentPane.add(btnNewButton_3);
		
		txtGeldOpnemen = new JTextField();
		txtGeldOpnemen.setText("Check Saldo");
		txtGeldOpnemen.setBounds(136, 26, 116, 22);
		contentPane.add(txtGeldOpnemen);
		txtGeldOpnemen.setColumns(10);
		
		txtCheckSaldo = new JTextField();
		txtCheckSaldo.setText("Geld Opnemen");
		txtCheckSaldo.setBounds(136, 68, 116, 22);
		contentPane.add(txtCheckSaldo);
		txtCheckSaldo.setColumns(10);
		
		txtAfbreken = new JTextField();
		txtAfbreken.setText("Afbreken");
		txtAfbreken.setBounds(136, 106, 116, 22);
		contentPane.add(txtAfbreken);
		txtAfbreken.setColumns(10);
		
		txtTerugNaarKeuzemenu = new JTextField();
		txtTerugNaarKeuzemenu.setText("Terug naar keuzemenu");
		txtTerugNaarKeuzemenu.setBounds(136, 144, 140, 24);
		contentPane.add(txtTerugNaarKeuzemenu);
		txtTerugNaarKeuzemenu.setColumns(10);
	}

}
