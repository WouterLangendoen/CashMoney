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

public class checkSaldo extends JFrame {

	private JPanel contentPane;
	private JTextField txtGeldOpnemen;
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
					checkSaldo frame = new checkSaldo();
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
	public checkSaldo() {
		setTitle("Check saldo");
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
				geldOpnemen.main(null);				
			}
		});
		btnNewButton.setBounds(4, 16, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("B");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				snelPin.main(null);				
					
			}
		});
		btnNewButton_1.setBounds(4, 52, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				WindowBuilder.main(null);				
					
			}
		});
		btnNewButton_2.setBounds(4, 86, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("D");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				keuzeMenu.main(null);				
					
			}
		});
		btnNewButton_3.setBounds(4, 122, 97, 25);
		contentPane.add(btnNewButton_3);
		
		txtGeldOpnemen = new JTextField();
		txtGeldOpnemen.setText("Geld opnemen");
		txtGeldOpnemen.setBounds(113, 17, 116, 22);
		contentPane.add(txtGeldOpnemen);
		txtGeldOpnemen.setColumns(10);
		
		txtSnelEuro = new JTextField();
		txtSnelEuro.setText("Snel 70 euro");
		txtSnelEuro.setBounds(113, 53, 116, 22);
		contentPane.add(txtSnelEuro);
		txtSnelEuro.setColumns(10);
		
		txtAfbreken = new JTextField();
		txtAfbreken.setText("Afbreken");
		txtAfbreken.setBounds(113, 87, 116, 22);
		contentPane.add(txtAfbreken);
		txtAfbreken.setColumns(10);
		
		txtTerugNaarKeuze = new JTextField();
		txtTerugNaarKeuze.setText("Terug naar keuze menu");
		txtTerugNaarKeuze.setBounds(113, 123, 183, 24);
		contentPane.add(txtTerugNaarKeuze);
		txtTerugNaarKeuze.setColumns(10);
	}

}
