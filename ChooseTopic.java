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
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class ChooseTopic extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseTopic frame = new ChooseTopic();
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
	public ChooseTopic() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 960,540);
		setTitle("Choose your topic");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(new Color(0xf5cfd2));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel topicPanel = new JPanel();
		topicPanel.setBackground(new Color(0xFFFFFF));
		topicPanel.setBounds(68,48,800,400);
		topicPanel.setBorder(new LineBorder(new Color(0x000000),3,true));
		topicPanel.setLayout(null);
		contentPane.add(topicPanel);
		
		JLabel choosetopic = new JLabel("Pick a category from the following:");
		choosetopic.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		choosetopic.setHorizontalAlignment(SwingConstants.CENTER);
		choosetopic.setBounds(23,30,450,40);
		topicPanel.add(choosetopic);
		
		JButton math = new JButton("Math");
		math.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
					MathQuestion mq = new MathQuestion();
					mq.setVisible(true);
				}
		});
		math.setForeground(new Color(0x000000));
		math.setBackground(UIManager.getColor("Button.background"));
		math.setHorizontalAlignment(SwingConstants.CENTER);
		math.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		math.setBounds(58,83,255,30);
		topicPanel.add(math);
		
		JButton gk = new JButton("General Knowledge");
		gk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				GKQuestion gkq = new GKQuestion();
				gkq.setVisible(true);
			}
		});
		gk.setForeground(new Color(0x000000));
		gk.setBackground(UIManager.getColor("Button.background"));
		gk.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		gk.setHorizontalAlignment(SwingConstants.CENTER);
		gk.setBounds(58,135,255,30);
		topicPanel.add(gk);
		
		JButton literature = new JButton("Literature");
		literature.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				LitQuestion lq = new LitQuestion();
				lq.setVisible(true);
			}
			
		});
		literature.setForeground(new Color(0x000000));
		literature.setBackground(UIManager.getColor("Button.background"));
		literature.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		literature.setHorizontalAlignment(SwingConstants.CENTER);
		literature.setBounds(58,187,255,30);
		topicPanel.add(literature);
		
		JLabel newlabel = new JLabel("There are 5 points per question. Good luck!");
		newlabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		newlabel.setHorizontalAlignment(SwingConstants.LEFT);
		newlabel.setBounds(54,300,450,40);
		topicPanel.add(newlabel);
	}

}
