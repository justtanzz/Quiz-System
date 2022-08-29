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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import exam.CheckAnswers;
import exam.Database;
public class GKQuestion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GKQuestion frame = new GKQuestion();
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
	public GKQuestion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 956,820);
		setTitle("General Knowledge Questions");
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(new Color(0xf5cfd2));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel quesPanel = new JPanel();
		quesPanel.setBackground(new Color(0xFFFFFF));
		quesPanel.setBounds(13,8,900,760);
		quesPanel.setBorder(new LineBorder(new Color(0x000000),3,true));
		quesPanel.setLayout(null);
		contentPane.add(quesPanel);
		
		JLabel ques1 = new JLabel("1. In what year was the first-ever Wimbledon Championship held?");
		ques1.setForeground(new Color(0x000000));
		ques1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ques1.setBounds(13,11,478,22);
		quesPanel.add(ques1);
		
		JLabel ques2 = new JLabel("2. Hg is the chemical symbol of which element?");
		ques2.setForeground(new Color(0,0,0));
		ques2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ques2.setBounds(13,11,478,162);
		quesPanel.add(ques2);
		
		JLabel ques3 = new JLabel("3. Which email service is owned by Microsoft?");
		ques3.setForeground(new Color(0,0,0));
		ques3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ques3.setBounds(13,11,478,302);
		quesPanel.add(ques3);
		
		JLabel ques4 = new JLabel("4. Which country produces the most coffee in the world?");
		ques4.setForeground(new Color(0,0,0));
		ques4.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ques4.setBounds(13,11,478,442);
		quesPanel.add(ques4);
		
		JLabel ques5 = new JLabel("5. In which city was Jim Morrison buried?");
		ques5.setForeground(new Color(0,0,0));
		ques5.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ques5.setBounds(13,11,478,582);
		quesPanel.add(ques5);
		
		JLabel ques6 = new JLabel("6. Which song by Luis Fonsi and Daddy Yankee has the most views (of all time) on YouTube?");
		ques6.setForeground(new Color(0,0,0));
		ques6.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ques6.setBounds(13,11,876,722);
		quesPanel.add(ques6);
		
		JLabel ques7 = new JLabel("7. Which was the first official state in the US?");
		ques7.setForeground(new Color(0x000000));
		ques7.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ques7.setBounds(13,11,478,862);
		quesPanel.add(ques7);
		
		JLabel ques8 = new JLabel("8. What is the capital city of Spain? ");
		ques8.setForeground(new Color(0,0,0));
		ques8.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ques8.setBounds(13,11,478,1002);
		quesPanel.add(ques8);
		
		JLabel ques9 = new JLabel("9. What is the painting “La Gioconda” more usually known as?");
		ques9.setForeground(new Color(0,0,0));
		ques9.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ques9.setBounds(13,11,478,1142);
		quesPanel.add(ques9);
		
		JLabel ques10 = new JLabel("10. What is Chandler’s last name in the sitcom Friends?");
		ques10.setForeground(new Color(0,0,0));
		ques10.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ques10.setBounds(13,11,478,1282);
		quesPanel.add(ques10);
		
		JTextField ans1 = new JTextField();
		ans1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ans1.setBackground(new Color(0xf8dc07));
		ans1.setBounds(13,45,478,22);
		quesPanel.add(ans1);
		
		JTextField ans2 = new JTextField();
		ans2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ans2.setBackground(new Color(0xf8dc07));
		ans2.setBounds(13,115,478,22);
		quesPanel.add(ans2);
		
		JTextField ans3 = new JTextField();
		ans3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ans3.setBackground(new Color(0xf8dc07));
		ans3.setBounds(13,185,478,22);
		quesPanel.add(ans3);
		
		JTextField ans4 = new JTextField();
		ans4.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ans4.setBackground(new Color(0xf8dc07));
		ans4.setBounds(13,255,478,22);
		quesPanel.add(ans4);
		
		JTextField ans5 = new JTextField();
		ans5.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ans5.setBackground(new Color(0xf8dc07));
		ans5.setBounds(13,325,478,22);
		quesPanel.add(ans5);
		
		JTextField ans6 = new JTextField();
		ans6.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ans6.setBackground(new Color(0xf8dc07));
		ans6.setBounds(13,395,478,22);
		quesPanel.add(ans6);
		
		JTextField ans7 = new JTextField();
		ans7.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ans7.setBackground(new Color(0xf8dc07));
		ans7.setBounds(13,465,478,22);
		quesPanel.add(ans7);
		
		JTextField ans8 = new JTextField();
		ans8.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ans8.setBackground(new Color(0xf8dc07));
		ans8.setBounds(13,535,478,22);
		quesPanel.add(ans8);
		
		JTextField ans9 = new JTextField();
		ans9.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ans9.setBackground(new Color(0xf8dc07));
		ans9.setBounds(13,605,478,22);
		quesPanel.add(ans9);
		
		JTextField ans10 = new JTextField();
		ans10.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ans10.setBackground(new Color(0xf8dc07));
		ans10.setBounds(13,675,478,22);
		quesPanel.add(ans10);
		
		JButton nextButton = new JButton("NEXT");
		nextButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Database db = new Database(ans1.getText(), ans2.getText(), ans3.getText(),ans4.getText(), ans5.getText(),
						ans6.getText(), ans7.getText(), ans8.getText(), ans9.getText(), ans10.getText());
				db.saveInfo();
				dispose();
				CheckAnswers ca = new CheckAnswers(ans1.getText(), ans2.getText(), ans3.getText(),ans4.getText(), ans5.getText(),
						ans6.getText(), ans7.getText(), ans8.getText(), ans9.getText(), ans10.getText());
				int points = ca.checkGK();
				Score score = new Score(points);
				score.setVisible(true);
			}
			
		});
		nextButton.setForeground(new Color(0,0,0));
		nextButton.setFont(new Font("Calibri", Font.BOLD, 25));
		nextButton.setBackground(UIManager.getColor("Button.background"));
		nextButton.setBounds(700, 695, 118, 48);
		quesPanel.add(nextButton);
		
		JButton backbutton = new JButton("BACK");
		backbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ChooseTopic ct = new ChooseTopic();
				ct.setVisible(true);
			}
		});
		backbutton.setForeground(new Color(0,0,0));
		backbutton.setFont(new Font("Calibri", Font.BOLD, 25));
		backbutton.setBackground(UIManager.getColor("Button.background"));
		backbutton.setBounds(550, 695, 118, 48);
		quesPanel.add(backbutton);
	}

}
