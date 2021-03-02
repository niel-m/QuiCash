import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class LoginP {

	JFrame frame;
	private JTextField textUser;
	private JPasswordField passField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginP window = new LoginP();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Dimension ss = Toolkit.getDefaultToolkit ().getScreenSize ();
		Dimension frameSize = new Dimension (400, 700);
		
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(ss.width / 2 - frameSize.width / 2, ss.height/2 - frameSize.height/2,419, 740);
		frame.getContentPane().setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		frame.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 361, 660);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textUser = new JTextField();
		textUser.setHorizontalAlignment(SwingConstants.LEFT);
		textUser.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		textUser.setBounds(98, 190, 192, 39);
		textUser.setBorder(null);
		textUser.setBackground(new Color(240, 255, 240));
		
		textUser.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				if(textUser.getText().equals("Username")) {
					textUser.setText("");
				}
				else {
					textUser.selectAll();
				}
			}
			public void focusLost(FocusEvent e) {
				if(textUser.getText().equals(""))
					textUser.setText("Username");
			}
		});
		textUser.setText("Username");
		textUser.setToolTipText("");
		panel.add(textUser);
		textUser.setColumns(10);
		
		passField = new JPasswordField();
		passField.setHorizontalAlignment(SwingConstants.LEFT);
		passField.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		passField.setBounds(98, 270, 192, 39);
		passField.setBorder(null);
		passField.setBackground(new Color(240, 255, 240));
		
		passField.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				if(passField.getText().equals("Password")) {
					passField.setEchoChar('*');
					passField.setText("");
				}
				else {
					passField.selectAll();
				}
			}
			public void focusLost(FocusEvent e) {
				if(passField.getText().equals(""))
					passField.setText("Password");
					passField.setEchoChar((char)0);
			}
		});
		passField.setEchoChar((char)0);
		passField.setText("Password");
		passField.setToolTipText("");
		panel.add(passField);
		
		JButton btnClose = new JButton("X");
		btnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnClose.setForeground(new Color(105, 105, 105));
		btnClose.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnClose.setBorder(new ForBorder(10));
        btnClose.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int response = JOptionPane.showConfirmDialog(null, "Do you want to continue action?", "Confirmation on exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				
				if(response == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
				else {
					LoginP lp = new LoginP();
					lp.frame.setVisible(true);
				}
			}
			
		});
		btnClose.setBounds(310, 10, 40, 21);
		panel.add(btnClose);
		
		JLabel lbl1 = new JLabel("");
		lbl1.setBounds(0, 0, 360, 658);
		panel.add(lbl1);
		Image img = new ImageIcon(this.getClass().getResource("LoginPageFinal.png")).getImage();
		lbl1.setIcon(new ImageIcon(img));
		
	}
}
