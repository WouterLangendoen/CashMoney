package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class keuzeMenu extends JFrame {

	private JPanel contentPane;
	private JTextField txtCheckSaldo;
	private JTextField txtGeldOpnemen;
	private JTextField txtSnelEuro;
	private JTextField txtAfbreken;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					keuzeMenu frame = new keuzeMenu();
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
	public keuzeMenu() {
		setTitle("Keuzemenu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			contentPane.setVisible(false);
			dispose();
			checkSaldo.main(null);				
				
			}
		});
		btnA.setBounds(12, 42, 97, 25);
		contentPane.add(btnA);
		
		JButton btnNewButton = new JButton("B\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				geldOpnemen.main(null);	
			}
		});
		btnNewButton.setBounds(12, 74, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				snelPin.main(null);				
					
			}
		});
		btnNewButton_1.setBounds(12, 108, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("D");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				WindowBuilder.main(null);				
					
			}
		});
		btnNewButton_2.setBounds(12, 140, 97, 25);
		contentPane.add(btnNewButton_2);
		
		txtCheckSaldo = new JTextField();
		txtCheckSaldo.setText("Check saldo");
		txtCheckSaldo.setBounds(119, 43, 116, 22);
		contentPane.add(txtCheckSaldo);
		txtCheckSaldo.setColumns(10);
		
		txtGeldOpnemen = new JTextField();
		txtGeldOpnemen.setText("Geld opnemen");
		txtGeldOpnemen.setBounds(119, 75, 116, 22);
		contentPane.add(txtGeldOpnemen);
		txtGeldOpnemen.setColumns(10);
		
		txtSnelEuro = new JTextField();
		txtSnelEuro.setText("Snel 70 euro");
		txtSnelEuro.setBounds(119, 109, 116, 22);
		contentPane.add(txtSnelEuro);
		txtSnelEuro.setColumns(10);
		
		txtAfbreken = new JTextField();
		txtAfbreken.setText("Afbreken");
		txtAfbreken.setBounds(119, 143, 116, 22);
		contentPane.add(txtAfbreken);
		txtAfbreken.setColumns(10);
	}

}
