/**
 * @author Zhijiao Liu
 * 
 */


import javax.swing.*;

import java.awt.*;

import javax.swing.border.EmptyBorder;


public class Payment_UI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JPanel panel ;
	public JPanel panel_2;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextArea textArea;

	/**
	 * Launch the application.
	 */
		/**
	 * Create the frame.
	 */
	public Payment_UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 400, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblPaymentStation = new JLabel("Payment Station");
		panel.add(lblPaymentStation);
		lblPaymentStation.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4, BorderLayout.NORTH);
		
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5, BorderLayout.SOUTH);
		
		JPanel panel_6 = new JPanel();
		panel_2.add(panel_6, BorderLayout.WEST);
		
		JPanel panel_7 = new JPanel();
		panel_2.add(panel_7, BorderLayout.EAST);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setText("Welcome to our car park!\nHere is the payment station");
		panel_2.add(textArea, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_3.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.WHITE);
		textField_1.setBackground(Color.BLACK);
		panel_8.add(textField_1, BorderLayout.CENTER);
		textField_1.setColumns(10);
		
		JPanel panel_10 = new JPanel();
		panel_8.add(panel_10, BorderLayout.NORTH);
		
		JPanel panel_11 = new JPanel();
		panel_8.add(panel_11, BorderLayout.SOUTH);
		
		JPanel panel_12 = new JPanel();
		panel_8.add(panel_12, BorderLayout.WEST);
		
		JPanel panel_13 = new JPanel();
		panel_8.add(panel_13, BorderLayout.EAST);
		
		JPanel panel_9 = new JPanel();
		panel_3.add(panel_9);
		panel_9.setLayout(new GridLayout(1, 2, 0, 0));
		
		JTextArea txtrPleaseScanYour = new JTextArea();
		txtrPleaseScanYour.setEditable(false);
		txtrPleaseScanYour.setBackground(UIManager.getColor("Button.background"));
		txtrPleaseScanYour.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtrPleaseScanYour.setText("Please scan \r\nyour card/ticket \r\nfirst, then finish \r\nthe payment.");
		panel_9.add(txtrPleaseScanYour);
		
		JPanel panel_14 = new JPanel();
		panel_9.add(panel_14);
		panel_14.setLayout(new GridLayout(0, 3, 5, 10));
		
		JPanel panel_15 = new JPanel();
		panel_14.add(panel_15);
		
		JPanel panel_16 = new JPanel();
		panel_14.add(panel_16);
		panel_16.setLayout(new BorderLayout(0, 0));
		
		textField_2 = new JTextField();
		panel_16.add(textField_2, BorderLayout.EAST);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(Color.WHITE);
		textField_2.setBackground(Color.BLACK);
		textField_2.setColumns(4);
		
		JPanel panel_17 = new JPanel();
		panel_16.add(panel_17, BorderLayout.NORTH);
		
		JPanel panel_18 = new JPanel();
		panel_16.add(panel_18, BorderLayout.SOUTH);
	}

}
