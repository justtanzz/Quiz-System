package admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import exam.CheckAnswers;
import exam.Database;

public class MathQuestion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MathQuestion frame = new MathQuestion();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public MathQuestion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 956,820);
		setTitle("Math Questions");
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
		
		JLabel ques1 = new JLabel("1. A line that cuts a pair of parallel lines is called: ");
		ques1.setForeground(new Color(0x000000));
		ques1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ques1.setBounds(13,11,478,22);
		quesPanel.add(ques1);
		
		JLabel ques2 = new JLabel("2. An angle whose value is ____, is called complete angle.");
		ques2.setForeground(new Color(0,0,0));
		ques2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ques2.setBounds(13,11,478,162);
		quesPanel.add(ques2);
		
		JLabel ques3 = new JLabel("3. The areas of two similar triangles are 81 sq. cm and 49 sq. cm. Find the ratio of their corresponding heights.");
		ques3.setForeground(new Color(0,0,0));
		ques3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ques3.setBounds(13,11,780,302);
		quesPanel.add(ques3);
		
		JLabel ques4 = new JLabel("4. A shopkeeper purchases 15 mangoes for Rs. 10 and sells them at 10 mangoes for Rs. 15. Thus, he earns a profit of:");
		ques4.setForeground(new Color(0,0,0));
		ques4.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ques4.setBounds(13,11,800,442);
		quesPanel.add(ques4);
		
		JLabel ques5 = new JLabel("5. 4950/6 + 112 x 1.75 = ? x 2");
		ques5.setForeground(new Color(0,0,0));
		ques5.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ques5.setBounds(13,11,478,582);
		quesPanel.add(ques5);
		
		JLabel ques6 = new JLabel("6. If a certain sum of money can become 5 times of its principal in 10 years, then the rate of interest is:");
		ques6.setForeground(new Color(0,0,0));
		ques6.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ques6.setBounds(13,11,876,722);
		quesPanel.add(ques6);
		
		JLabel ques7 = new JLabel("7. Find out the least number which when multiplied by 45, the result becomes a perfect square.");
		ques7.setForeground(new Color(0x000000));
		ques7.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ques7.setBounds(13,11,678,862);
		quesPanel.add(ques7);
		
		JLabel ques8 = new JLabel("8. (175)2 – (75)2 = ?");
		ques8.setForeground(new Color(0,0,0));
		ques8.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ques8.setBounds(13,11,478,1002);
		quesPanel.add(ques8);
		
		JLabel ques9 = new JLabel("9. The sum of two numbers is 24 and the sum of their squares is 386, then one number is:");
		ques9.setForeground(new Color(0,0,0));
		ques9.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ques9.setBounds(13,11,678,1142);
		quesPanel.add(ques9);
		
		JLabel ques10 = new JLabel("10. A wheel rotates 15 times each minute. How many degrees will it rotate in 12 seconds of time?");
		ques10.setForeground(new Color(0,0,0));
		ques10.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ques10.setBounds(13,11,694,1302);
		quesPanel.add(ques10);
		
		JComboBox ans1 = new JComboBox(new String[]{"Tangent", "Chord", "Traversal", "Intersector"});
		ans1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ans1.setEnabled(true);
		ans1.setBackground(new Color(0xf8dc07));
		ans1.setBounds(13,45,278,22);
		quesPanel.add(ans1);
		
		JComboBox ans2 = new JComboBox(new String[] {"180°", "240°", "360°", "None of the above"});
		ans2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ans2.setEnabled(true);
		ans2.setBackground(new Color(0xf8dc07));
		ans2.setBounds(13,115,278,22);
		quesPanel.add(ans2);
		
		JComboBox ans3 = new JComboBox(new String[] {"9:7", "7:9","6:5", "81:49"});
		ans3.setEnabled(true);
		ans3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ans3.setBackground(new Color(0xf8dc07));
		ans3.setBounds(13,185,278,22);
		quesPanel.add(ans3);
		
		JComboBox ans4 = new JComboBox(new String[] {"50%", "75%", "80%", "125%"});
		ans4.setEnabled(true);
		ans4.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ans4.setBackground(new Color(0xf8dc07));
		ans4.setBounds(13,255,278,22);
		quesPanel.add(ans4);
		
		JComboBox ans5 = new JComboBox(new String[] {"510.5", "505.2", "515.5", "None of the above"});
		ans5.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ans5.setBackground(new Color(0xf8dc07));
		ans5.setBounds(13,325,278,22);
		quesPanel.add(ans5);
		
		JComboBox ans6 = new JComboBox(new String[] {"20%", "30%", "40%", "50%"});
		ans6.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ans6.setBackground(new Color(0xf8dc07));
		ans6.setBounds(13,395,278,22);
		quesPanel.add(ans6);
		
		JComboBox ans7 = new JComboBox(new String[] {"9", "15", "5", "None of the above"});
		ans7.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ans7.setBackground(new Color(0xf8dc07));
		ans7.setBounds(13,465,278,22);
		quesPanel.add(ans7);
		
		JComboBox ans8 = new JComboBox(new String[] {"5000", "20000", "25000", "None of the above"});
		ans8.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ans8.setBackground(new Color(0xf8dc07));
		ans8.setBounds(13,535,278,22);
		quesPanel.add(ans8);
		
		JComboBox ans9 = new JComboBox(new String[] {"17", "19", "9", "11"});
		ans9.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ans9.setBackground(new Color(0xf8dc07));
		ans9.setBounds(13,605,278,22);
		quesPanel.add(ans9);
		
		JComboBox ans10 = new JComboBox(new String[] {"360°", "720°", "1080°", "None of the above"});
		ans10.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ans10.setBackground(new Color(0xf8dc07));
		ans10.setBounds(13,675,278,22);
		quesPanel.add(ans10);
		
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
		JButton nextButton = new JButton("NEXT");
		nextButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Database db = new Database((String)ans1.getSelectedItem(), (String)ans2.getSelectedItem(), (String)ans3.getSelectedItem(),(String)ans4.getSelectedItem(), (String)ans5.getSelectedItem(),
						(String)ans6.getSelectedItem(), (String)ans7.getSelectedItem(), (String)ans8.getSelectedItem(), (String)ans9.getSelectedItem(), (String)ans10.getSelectedItem());
				db.saveInfo();
				dispose();
				CheckAnswers ca = new CheckAnswers((String)ans1.getSelectedItem(), (String)ans2.getSelectedItem(), (String)ans3.getSelectedItem(),(String)ans4.getSelectedItem(), (String)ans5.getSelectedItem(),
						(String)ans6.getSelectedItem(), (String)ans7.getSelectedItem(), (String)ans8.getSelectedItem(), (String)ans9.getSelectedItem(), (String)ans10.getSelectedItem());
				int points = ca.checkMath();
				Score score = new Score(points);
				score.setVisible(true);
			}
			
		});
		nextButton.setForeground(new Color(0,0,0));
		nextButton.setFont(new Font("Calibri", Font.BOLD, 25));
		nextButton.setBackground(UIManager.getColor("Button.background"));
		nextButton.setBounds(700, 695, 118, 48);
		quesPanel.add(nextButton);
	}

}
