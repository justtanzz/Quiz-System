package admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class Score extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Score frame = new Score(0);
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
	public Score(int score) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 956,420);
		setTitle("Literature Questions");
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(new Color(0xf5cfd2));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel scorePanel = new JPanel();
		scorePanel.setBackground(new Color(0xFFFFFF));
		scorePanel.setBounds(13,8,900,360);
		scorePanel.setBorder(new LineBorder(new Color(0x000000),3,true));
		scorePanel.setLayout(null);
		contentPane.add(scorePanel);
		
		JLabel points = new JLabel("TOTAL POINTS:");
		points.setForeground(new Color(0,0,0));
		points.setFont(new Font("Times New Roman", Font.BOLD, 50));
		points.setBounds(45,65,450,100);
		scorePanel.add(points);
		
		JLabel showscore = new JLabel(String.valueOf(score));
		showscore.setForeground(new Color(0,0,0));
		showscore.setFont(new Font("Times New Roman", Font.BOLD, 50));
		showscore.setBounds(455,65,100,100);
		scorePanel.add(showscore);
		
		JButton home = new JButton("HOME");
		home.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				welcomewindow ww = new welcomewindow();
				ww.setVisible(true);
			}
		});
		home.setForeground(new Color(0,0,0));
		home.setFont(new Font("Times New Roman", Font.BOLD, 27));
		home.setBackground(UIManager.getColor("Button.background"));
		home.setBounds(363,185,190,45);
		scorePanel.add(home);
	}

}
