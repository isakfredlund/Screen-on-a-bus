package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class gui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
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
	public gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBuss = new JLabel("Buss");
		lblBuss.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBuss.setBounds(10, 138, 46, 19);
		contentPane.add(lblBuss);
		
		JLabel lblAvgngstider = new JLabel("Avg\u00E5ngstider");
		lblAvgngstider.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAvgngstider.setBounds(268, 138, 97, 19);
		contentPane.add(lblAvgngstider);
		
		JLabel lblHllplatser = new JLabel("L\u00E4ge");
		lblHllplatser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHllplatser.setBounds(543, 140, 74, 15);
		contentPane.add(lblHllplatser);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 168, 68, 19);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(10, 198, 68, 19);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		textArea_2.setBounds(10, 228, 68, 19);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setEditable(false);
		textArea_3.setBounds(10, 258, 68, 19);
		contentPane.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setEditable(false);
		textArea_4.setBounds(268, 168, 87, 19);
		contentPane.add(textArea_4);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setEditable(false);
		textArea_5.setBounds(268, 198, 87, 19);
		contentPane.add(textArea_5);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setEditable(false);
		textArea_6.setBounds(268, 228, 87, 19);
		contentPane.add(textArea_6);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setEditable(false);
		textArea_7.setBounds(268, 258, 87, 19);
		contentPane.add(textArea_7);
		
		JTextArea textArea_8 = new JTextArea();
		textArea_8.setBounds(543, 168, 74, 19);
		contentPane.add(textArea_8);
		
		JTextArea textArea_9 = new JTextArea();
		textArea_9.setBounds(543, 198, 74, 19);
		contentPane.add(textArea_9);
		
		JTextArea textArea_10 = new JTextArea();
		textArea_10.setBounds(542, 228, 75, 19);
		contentPane.add(textArea_10);
		
		JTextArea textArea_11 = new JTextArea();
		textArea_11.setBounds(543, 258, 74, 19);
		contentPane.add(textArea_11);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Niklas\\Desktop\\skane.gif"));
		lblNewLabel_2.setBounds(0, 0, 667, 37);
		contentPane.add(lblNewLabel_2);
		
		JTextArea textArea_12 = new JTextArea();
		textArea_12.setBounds(195, 160, 9, -21);
		contentPane.add(textArea_12);
		
		JTextArea textArea_13 = new JTextArea();
		textArea_13.setEditable(false);
		textArea_13.setBounds(230, 66, 168, 45);
		contentPane.add(textArea_13);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00E4sta h\u00E5llplats:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(108, 92, 97, 19);
		contentPane.add(lblNewLabel_1);
	}

}
