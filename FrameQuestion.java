import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;

public class FrameQuestion extends JFrame {

	private JPanel contentPane;
	public static JLabel quiz_id;
	public static JLabel lblid;
	private JTextField que1;
	private JTextField que2;
	private JTextField que3;
	private JTextField que4;
	private JTextField que5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameQuestion frame = new FrameQuestion();
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
	public FrameQuestion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-6,0, 1350, 1200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Question No 1:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(10, 66, 191, 48);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Question No 2:");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3_1.setBounds(10, 153, 191, 48);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Question No 3:");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3_2.setBounds(10, 226, 191, 48);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Question No 4:");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3_3.setBounds(10, 313, 191, 48);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Question No 5:");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3_4.setBounds(10, 390, 191, 48);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblid_1 = new JLabel("User ID:");
		lblid_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblid_1.setBounds(10, 27, 87, 24);
		contentPane.add(lblid_1);
		
		lblid = new JLabel();
		lblid.setBounds(107, 27, 264, 24);
		contentPane.add(lblid);
		lblid.setText(FrameCQ.lblid.getText());
		
		JLabel lblid_1_1 = new JLabel("Quiz ID:");
		lblid_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblid_1_1.setBounds(427, 27, 87, 24);
		contentPane.add(lblid_1_1);
		
		quiz_id = new JLabel();
		quiz_id.setBounds(524, 27, 264, 24);
		contentPane.add(quiz_id);
		
		JPanel Submit_1 = new JPanel();
		Submit_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
					String query1="update quizquestion set question='"+que1.getText()+"' where quiz_id='"+quiz_id.getText()+"' and question_no=1";
					String query2="update quizquestion set question='"+que2.getText()+"' where quiz_id='"+quiz_id.getText()+"' and question_no=2";
					String query3="update quizquestion set question='"+que3.getText()+"' where quiz_id='"+quiz_id.getText()+"' and question_no=3";
					String query4="update quizquestion set question='"+que4.getText()+"' where quiz_id='"+quiz_id.getText()+"' and question_no=4";
					String query5="update quizquestion set question='"+que5.getText()+"' where quiz_id='"+quiz_id.getText()+"' and question_no=5";
					Statement st=con.createStatement();
					st.executeUpdate(query1);
					st.executeUpdate(query2);
					st.executeUpdate(query3);
					st.executeUpdate(query4);
					st.executeUpdate(query5);
					JOptionPane.showMessageDialog(null,"Quiz is ready to take quiz id:"+quiz_id.getText());		
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Submit_1.setLayout(null);
		Submit_1.setBorder(new LineBorder(Color.WHITE));
		Submit_1.setBackground(new Color(25, 25, 112));
		Submit_1.setBounds(876, 595, 234, 56);
		contentPane.add(Submit_1);
		
		JLabel lblCheckTitle = new JLabel("Create Quiz");
		lblCheckTitle.setForeground(Color.WHITE);
		lblCheckTitle.setFont(new Font("Arial", Font.BOLD, 19));
		lblCheckTitle.setBounds(59, 11, 152, 28);
		Submit_1.add(lblCheckTitle);
		
		JPanel Submit_1_1 = new JPanel();
		Submit_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
					String query="delete from quizquestion where quiz_id='"+quiz_id.getText()+"'";
					Statement st=con.createStatement();
					st.executeUpdate(query);
					JOptionPane.showMessageDialog(null,"Quiz deleted from database where quid id="+quiz_id.getText());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		Submit_1_1.setLayout(null);
		Submit_1_1.setBorder(new LineBorder(Color.WHITE));
		Submit_1_1.setBackground(new Color(25, 25, 112));
		Submit_1_1.setBounds(526, 595, 234, 56);
		contentPane.add(Submit_1_1);
		
		JLabel lblAbortQuiz = new JLabel("Abort Quiz");
		lblAbortQuiz.setForeground(Color.WHITE);
		lblAbortQuiz.setFont(new Font("Arial", Font.BOLD, 19));
		lblAbortQuiz.setBounds(59, 11, 152, 28);
		Submit_1_1.add(lblAbortQuiz);
		
		JPanel Submit_1_2 = new JPanel();
		Submit_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameCQ f=new FrameCQ();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameQuestion.this.dispose();		
			}
		});
		Submit_1_2.setLayout(null);
		Submit_1_2.setBorder(new LineBorder(Color.WHITE));
		Submit_1_2.setBackground(new Color(25, 25, 112));
		Submit_1_2.setBounds(176, 595, 234, 56);
		contentPane.add(Submit_1_2);
		
		JLabel lblBack = new JLabel("Back");
		lblBack.setForeground(Color.WHITE);
		lblBack.setFont(new Font("Arial", Font.BOLD, 19));
		lblBack.setBounds(93, 11, 152, 28);
		Submit_1_2.add(lblBack);
		
		que1 = new JTextField();
		que1.setColumns(10);
		que1.setBounds(208, 66, 1048, 48);
		contentPane.add(que1);
		
		que2 = new JTextField();
		que2.setColumns(10);
		que2.setBounds(208, 153, 1048, 48);
		contentPane.add(que2);
		
		que3 = new JTextField();
		que3.setColumns(10);
		que3.setBounds(208, 226, 1048, 48);
		contentPane.add(que3);
		
		que4 = new JTextField();
		que4.setColumns(10);
		que4.setBounds(208, 313, 1048, 48);
		contentPane.add(que4);
		
		que5 = new JTextField();
		que5.setColumns(10);
		que5.setBounds(211, 390, 1048, 48);
		contentPane.add(que5);
	}
}
