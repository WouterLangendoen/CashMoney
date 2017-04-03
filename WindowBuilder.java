package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JLabel;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Window.Type;

public class WindowBuilder {

	
	private JFrame frmStartScherm;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilder window = new WindowBuilder();
					window.frmStartScherm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public WindowBuilder() {
		initialize();
	}
		
		
		

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStartScherm = new JFrame();
		frmStartScherm.setTitle("Start scherm");
		frmStartScherm.getContentPane().setBackground(Color.WHITE);
		frmStartScherm.setBounds(100, 100, 1318, 750);
		frmStartScherm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmStartScherm.getContentPane().setLayout(null);
		
		JLabel lblCashmoney = new JLabel("Hallo, welkom bij de bank CashMoney. Voordat u uw pas scant en daadwerkelijk wilt gaan pinnen, willen wij u graag waarschuwen voor skimmers door middel van de volgende punten.\r\n");
		lblCashmoney.setBounds(25, 64, 1192, 47);
		lblCashmoney.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmStartScherm.getContentPane().add(lblCashmoney);
		
		JLabel lblCheckEerstOf = new JLabel("Check eerst of er geen nep scanner over de echte scanner zit.Kijk even goed om u heen of er geen mensen van een afstandje meekijken.");
		lblCheckEerstOf.setBounds(25, 124, 1125, 28);
		lblCheckEerstOf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmStartScherm.getContentPane().add(lblCheckEerstOf);
		
		JButton btnIkBegrijpHet = new JButton("Ik begrijp het, ik wil naar het volgende scherm");
		btnIkBegrijpHet.setBounds(431, 333, 338, 33);
		btnIkBegrijpHet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmStartScherm.dispose();
				scanPas t=new scanPas();
				t.setVisible(true);
				
			}
		});
		frmStartScherm.getContentPane().add(btnIkBegrijpHet);
	}
}
