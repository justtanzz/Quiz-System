package admin;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import exam.Login;

@SuppressWarnings("serial")
public class welcomewindow extends JFrame {

	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcomewindow frame = new welcomewindow();
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
	/**
	 * 
	 */
	public welcomewindow() {
		setTitle("Quiz System");
		setBackground(new Color(0,0,0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 960,540);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0xf5cfd2));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setResizable(false);
		setContentPane(contentPane);
		
		JPanel titlepanel = new JPanel();
		titlepanel.setBorder(new LineBorder(new Color(0x000000), 2, true));
		titlepanel.setBackground(new Color(0xFFFFFF));
		titlepanel.setBounds(19, 11, 906, 63);
		contentPane.add(titlepanel);
		titlepanel.setLayout(null);
		
		JLabel login = new JLabel("WELCOME TO QUIZ SYSTEM");
		login.setHorizontalAlignment(SwingConstants.CENTER);
		login.setFont(new Font("Calibri", Font.BOLD, 35));
		login.setForeground(new Color(0,0,0));
		login.setBounds(230,11,450,50);
		titlepanel.add(login);
		
		JPanel buttonpanel = new JPanel();
		buttonpanel.setBorder(new LineBorder(new Color(0x000000), 2, true));
		buttonpanel.setBackground(new Color(0xFFFFFF));
		buttonpanel.setBounds(19,100,906,365);
		buttonpanel.setLayout(null);
		buttonpanel.setForeground(new Color(0,0,0));
		contentPane.add(buttonpanel);
		
		JLabel userlabel = new JLabel("Username:");
		userlabel.setForeground(new Color(0x000000));
		userlabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		userlabel.setBounds(406,59,180,26);
		buttonpanel.add(userlabel);
		
		JTextField username = new JTextField();
		username.setFont(new Font("Calibri", Font.PLAIN, 16));
		username.setBounds(370,85,180,26);
		buttonpanel.add(username);
		
		JLabel passlabel = new JLabel("Password: ");
		passlabel.setForeground(new Color(0x000000));
		passlabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		passlabel.setBounds(406,135,180,26);
		buttonpanel.add(passlabel);
		
		JPasswordField password = new JPasswordField();
		password.setFont(new Font("Calibri", Font.PLAIN, 16));
		password.setBounds(370,165,180,26);
		buttonpanel.add(password);
		
		JButton loginbutton = new JButton("LOGIN");
		loginbutton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String userName = username.getText();
					String pass = new String(password.getPassword());
					Login login = new Login();
					if(login.isValid(userName, pass)) {
						dispose();
						ChooseTopic ct = new ChooseTopic();
						ct.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Invalid User Name or Password", "Login Error", JOptionPane.ERROR_MESSAGE);
						userlabel.setText(null);
						passlabel.setText(null);
					}
				}
		});
		loginbutton.setForeground(new Color(0,0,0));
		loginbutton.setBackground(UIManager.getColor("Button.background"));
		loginbutton.setFont(new Font("Calibri", Font.PLAIN, 28));
		loginbutton.setBounds(392,270,130,35);
		buttonpanel.add(loginbutton);
		
	}

}
