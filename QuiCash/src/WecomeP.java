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

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class WecomeP {

	ImageIcon ii;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WecomeP window = new WecomeP();
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
	public WecomeP() {
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
		frame.setBounds(ss.width / 2 - frameSize.width / 2, ss.height/2 - frameSize.height/2,frameSize.width, frameSize.height);
		frame.getContentPane().setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		frame.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 360, 659);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbllogbut = new JLabel("");
		lbllogbut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbllogbut.setHorizontalAlignment(SwingConstants.CENTER);
		lbllogbut.setForeground(new Color(255, 255, 255));
		Image imgl = new ImageIcon(this.getClass().getResource("logbutdark.png")).getImage();
		lbllogbut.setIcon(new ImageIcon(imgl));
		
		lbllogbut.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				ii = new ImageIcon(this.getClass().getResource("loginbut.png"));
				lbllogbut.setIcon(ii);
			}
			public void mouseExited(MouseEvent e) {
				ii = new ImageIcon(this.getClass().getResource("logbutdark.png"));
				lbllogbut.setIcon(ii);
			}
			public void mouseClicked(MouseEvent e) {
				LoginP lp = new LoginP();
				lp.frame.setVisible(true);
				frame.dispose();
			}
		});
	    lbllogbut.setBounds(71, 232, 200, 75);
	    panel.add(lbllogbut);
	    
	    JLabel lblsignbut = new JLabel("");
	    lblsignbut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    lblsignbut.setHorizontalAlignment(SwingConstants.CENTER);
	    Image imgs = new ImageIcon(this.getClass().getResource("signbutdark.png")).getImage();
		lblsignbut.setIcon(new ImageIcon(imgs));
		
	    lblsignbut.addMouseListener(new MouseAdapter() {
	    	public void mouseEntered(MouseEvent e) {
	    		ii = new ImageIcon(this.getClass().getResource("signupbut.png"));
				lblsignbut.setIcon(ii);
	    	}
	    	public void mouseExited(MouseEvent e) {
	    		ii = new ImageIcon(this.getClass().getResource("signbutdark.png"));
				lblsignbut.setIcon(ii);
	    	}
	    	public void mouseClicked(MouseEvent e) {
	    		SignupP sp = new SignupP();
				sp.frame.setVisible(true);
				frame.dispose();
	    	}
	    });
        lblsignbut.setBounds(81, 305, 187, 75);
        panel.add(lblsignbut);
        
        JButton btnClose = new JButton("X");
        btnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnClose.setForeground(new Color(255, 255, 255));
        btnClose.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
        btnClose.setBorder(new ForBorder(10));
        btnClose.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        
        btnClose.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int response = JOptionPane.showConfirmDialog(null, "Do you want to continue action?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        		
        		if(response == JOptionPane.YES_OPTION) {
        			System.exit(0);
        		}
        		else {
        			WecomeP wp = new WecomeP();
        			wp.frame.setVisible(true);
        		}
        	}
        });
        btnClose.setBounds(310, 10, 40, 21);
        panel.add(btnClose);
     
		JLabel lbl1 = new JLabel("");
		lbl1.setBounds(0, 0, 542, 658);
		panel.add(lbl1);
		frame.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image img = new ImageIcon(this.getClass().getResource("WelcomePage.png")).getImage();
        lbl1.setIcon(new ImageIcon(img)); 
	}
}
