/**
 * @author Zhijiao Liu
 * 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.border.EmptyBorder;


public class Enter_UI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextField txtReadCard;
	JButton btnNewButton;
	JTextArea textArea;
	
	protected String IDInput;

	

	/**
	 * Create the frame.
	 */
	public Enter_UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 400, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		final JLabel lblWelcome = new JLabel("Welcome!");
		panel.add(lblWelcome);
		lblWelcome.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Please scan the card or press the button to get the ticket.");
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new GridLayout(5, 1, 10, 3));
		
		JPanel panel_5 = new JPanel();
		panel_3.add(panel_5);
		panel_5.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_3.add(panel_2);
		
		btnNewButton = new JButton("Ticket");
		panel_2.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textArea.append("text + newline");
				//textArea.setCaretPosition(textArea.getDocument().getLength());
			}
		});
		
		
		txtReadCard = new JTextField();
		txtReadCard.setText("Read Card");
		txtReadCard.setHorizontalAlignment(SwingConstants.CENTER);
		txtReadCard.setBackground(Color.BLACK);
		txtReadCard.setForeground(Color.WHITE);
		panel_3.add(txtReadCard);
		txtReadCard.setColumns(10);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(10, 10));
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6, BorderLayout.NORTH);
		
		JPanel panel_7 = new JPanel();
		panel_4.add(panel_7, BorderLayout.SOUTH);
		
		JPanel panel_8 = new JPanel();
		panel_4.add(panel_8, BorderLayout.WEST);
		
		JPanel panel_9 = new JPanel();
		panel_4.add(panel_9, BorderLayout.EAST);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setText("Welcome to our car park!\nHere is the entrance.");
		panel_4.add(textArea, BorderLayout.CENTER);
		
	   
		
		
	}
}
