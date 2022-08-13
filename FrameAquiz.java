import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


public class FrameAquiz extends JFrame {

	private JPanel contentPane;
	public static JLabel lblid;
	private JTextField quiz_id;
	private JTextField Q1;
	private JTextField A1;
	private JTextField Q2;
	private JTextField A2;
	private JTextField Q3;
	private JTextField A3;
	private JTextField Q4;
	private JTextField A4;
	private JTextField Q5;
	private JTextField A5;
	private JLabel lblsign;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameAquiz frame = new FrameAquiz();
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
	public FrameAquiz(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-6,0, 1350, 1200);
		contentPane = new JPanel();
		contentPane.setLocation(-46, -318);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mhdha\\Downloads\\allfiles\\logo.png"));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(32, 3, 205, 195);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("E-Learning SUKKUR IBA Khairpur Campus");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1.setBounds(289, 29, 920, 118);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(25, 25, 112));
		panel_3.setBounds(0, 209, 329, 447);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel btnHome = new JPanel();
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameStd f=new FrameStd();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameAquiz.this.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnHome.setBackground(new Color(0,0,139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnHome.setBackground(new Color(25,25,112));
			}
		});
		btnHome.setBorder(new LineBorder(Color.WHITE));
		btnHome.setBounds(0, 0, 329, 76);
		panel_3.add(btnHome);
		btnHome.setLayout(null);
		btnHome.setBackground(new Color(25, 25, 112));
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setForeground(Color.WHITE);
		lblHome.setFont(new Font("Arial", Font.BOLD, 19));
		lblHome.setBounds(122, 25, 152, 28);
		btnHome.add(lblHome);
		
		JPanel btnEc = new JPanel();
		btnEc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameSenroll f=new FrameSenroll();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameAquiz.this.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnEc.setBackground(new Color(0,0,139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnEc.setBackground(new Color(25,25,112));
			}
		});
		btnEc.setLayout(null);
		btnEc.setBorder(new LineBorder(Color.WHITE));
		btnEc.setBackground(new Color(25, 25, 112));
		btnEc.setBounds(0, 74, 329, 76);
		panel_3.add(btnEc);
		
		JLabel lblEc = new JLabel("Enrol course");
		lblEc.setForeground(Color.WHITE);
		lblEc.setFont(new Font("Arial", Font.BOLD, 19));
		lblEc.setBounds(90, 25, 179, 28);
		btnEc.add(lblEc);
		

		JLabel lblAq = new JLabel("Attempt Quiz");
		lblAq.setForeground(Color.BLACK);
		lblAq.setFont(new Font("Arial", Font.BOLD, 19));
		lblAq.setBounds(92, 24, 178, 28);
		
		JPanel btnAq = new JPanel();
		btnAq.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAq.setBackground(new Color(0,0,139));
				lblAq.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAq.setBackground(Color.white);
				lblAq.setForeground(Color.black);
			}
		});
		btnAq.setLayout(null);
		btnAq.setBorder(new LineBorder(new Color(25, 25, 112), 2));
		btnAq.setBackground(Color.WHITE);
		btnAq.setBounds(0, 151, 329, 76);
		panel_3.add(btnAq);
		btnAq.add(lblAq);
		
		JPanel btnAi = new JPanel();
		btnAi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameQueries f=new FrameQueries();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameAquiz.this.dispose();
				
			}
			@Override
			
			public void mouseEntered(MouseEvent e) {
				btnAi.setBackground(new Color(0,0,139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAi.setBackground(new Color(25,25,112));
			}
		});
		btnAi.setLayout(null);
		btnAi.setBorder(new LineBorder(Color.WHITE));
		btnAi.setBackground(new Color(25, 25, 112));
		btnAi.setBounds(0, 227, 329, 76);
		panel_3.add(btnAi);
		
		JLabel lblAi = new JLabel("Ask instructor");
		lblAi.setForeground(Color.WHITE);
		lblAi.setFont(new Font("Arial", Font.BOLD, 19));
		lblAi.setBounds(77, 24, 188, 28);
		btnAi.add(lblAi);
		
		JPanel btnprofile = new JPanel();
		btnprofile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnprofile.setBackground(new Color(0,0,139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnprofile.setBackground(new Color(25,25,112));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameEcheck f=new FrameEcheck();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameAquiz.this.dispose();
			}
		});
		btnprofile.setLayout(null);
		btnprofile.setBorder(new LineBorder(Color.WHITE));
		btnprofile.setBackground(new Color(25, 25, 112));
		btnprofile.setBounds(0, 301, 329, 76);
		panel_3.add(btnprofile);
		
		JLabel lblprofile = new JLabel("Enrolled Course");
		lblprofile.setForeground(Color.WHITE);
		lblprofile.setFont(new Font("Arial", Font.BOLD, 19));
		lblprofile.setBounds(71, 22, 152, 28);
		btnprofile.add(lblprofile);
		
		JPanel btnsign = new JPanel();
		btnsign.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure want to logout?")==0) {
					FrameLOG framelogin=new FrameLOG();
					framelogin.setVisible(true);
					FrameAquiz.this.dispose();
					}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnsign.setBackground(new Color(0,0,139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnsign.setBackground(new Color(25,25,112));
			}
		});
		btnsign.setLayout(null);
		btnsign.setBorder(new LineBorder(Color.WHITE));
		btnsign.setBackground(new Color(25, 25, 112));
		btnsign.setBounds(0, 371, 329, 76);
		panel_3.add(btnsign);
		
		lblsign = new JLabel("Sign out");
		lblsign.setForeground(Color.WHITE);
		lblsign.setFont(new Font("Arial", Font.BOLD, 19));
		lblsign.setBounds(110, 22, 152, 28);
		btnsign.add(lblsign);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(25, 25, 112)));
		panel.setBounds(339, 202, 938, 447);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("Quiz ID:");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3_1.setBounds(10, 11, 113, 48);
		panel.add(lblNewLabel_3_1);
		
		quiz_id = new JTextField();
		quiz_id.setColumns(10);
		quiz_id.setBounds(101, 15, 352, 37);
		panel.add(quiz_id);
		
		
		
		
		JPanel Submit_1 = new JPanel();
		Submit_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String ttt1="";
				String ttt2="";
				String ttt3="";
				String qid="";
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
					String quiz="Select quiz_id from quizquestion where question_no=1 and quiz_id='"+quiz_id.getText()+"'";
					Statement sq=con.createStatement();
					ResultSet rq=sq.executeQuery(quiz);
					
					while(rq.next()) {
						qid+=rq.getString("quiz_id");
					
					}
					
					if(qid.equals(quiz_id.getText())) {
					String d1="select curdate()";
					String d2="select attempt_date from quizquestion where question_no=1 and quiz_id='"+quiz_id.getText()+"'";
					String date1="",date2="";
					Statement dd1=con.createStatement();
					ResultSet dr=dd1.executeQuery(d1);
					while(dr.next()) {
						date1+=dr.getString("curdate()");
						
					}
					
					ResultSet dr1=dd1.executeQuery(d2);
					while(dr1.next()) {
						date2+=dr1.getString("attempt_date");
						
					}
					
					if(date1.equals(date2)) {
						
						String t1="select current_time()";
						String t2="select qstart from quizquestion where quiz_id='"+quiz_id.getText()+"' and question_no=1";
						String t3="select qend from quizquestion where quiz_id='"+quiz_id.getText()+"' and question_no=1";
						Statement tt1=con.createStatement();
						ResultSet trs=tt1.executeQuery(t1);
						while(trs.next()) {
							ttt1+=trs.getString("current_time()");
						}
						Statement tt2=con.createStatement();
						ResultSet trs2=tt2.executeQuery(t2);
						while(trs2.next()) {
							ttt2+=trs2.getString("qstart");
							JOptionPane.showMessageDialog(null,"Quiz start time:"+ttt2);
						}
						
						Statement tt3=con.createStatement();
						ResultSet trs3=tt3.executeQuery(t3);
						while(trs3.next()) {
							ttt3+=trs3.getString("qend");
							JOptionPane.showMessageDialog(null,"Quiz end time:"+ttt3);
						}
					
						if(ttt1.compareTo(ttt2) < 0) {
							JOptionPane.showMessageDialog(null,"Quiz isn't begin yet!");
						}
						else if(ttt1.compareTo(ttt3) > 0) {
							JOptionPane.showMessageDialog(null,"Quiz time is up");
						}
						else {
							String query1="select question from quizquestion where question_no=1 and quiz_id='"+quiz_id.getText()+"'";
							String query2="select question from quizquestion where question_no=2 and quiz_id='"+quiz_id.getText()+"'";
							String query3="select question from quizquestion where question_no=3 and quiz_id='"+quiz_id.getText()+"'";
							String query4="select question from quizquestion where question_no=4 and quiz_id='"+quiz_id.getText()+"'";
							String query5="select question from quizquestion where question_no=5 and quiz_id='"+quiz_id.getText()+"'";
							Statement st=con.createStatement();
							ResultSet rs1=st.executeQuery(query1);					
							while(rs1.next()) {
								String q=rs1.getString("question");
								Q1.setText(q);
							}
							ResultSet rs2=st.executeQuery(query2);
							while(rs2.next()) {
								String q=rs2.getString("question");
								Q2.setText(q);
							}
							ResultSet rs3=st.executeQuery(query3);
							while(rs3.next()) {
								String q=rs3.getString("question");
								Q3.setText(q);
							}
							ResultSet rs4=st.executeQuery(query4);
							while(rs4.next()) {
								String q=rs4.getString("question");
								Q4.setText(q);
							}
							ResultSet rs5=st.executeQuery(query5);
							while(rs5.next()) {
								String q=rs5.getString("question");
								Q5.setText(q);
							}
							
							// Inserting
							String std="";
							String check="select std_id from quizanswer where quiz_id='"+quiz_id.getText()+"' and std_id='"+lblid.getText()+"' and question_no=1";
							Statement s=con.createStatement();
							ResultSet r=s.executeQuery(check);
							while(r.next()) {
								std+=r.getString("std_id");
							}
							if(std.equals(lblid.getText())) {
								JOptionPane.showMessageDialog(null,"Quiz Already attempted");
								Q1.setText("");
								Q2.setText("");
								Q3.setText("");
								Q4.setText("");
								Q5.setText("");
							}
							else {
								String i1="insert into quizanswer(std_id,quiz_id,question_no) values ('"+lblid.getText()+"','"+quiz_id.getText()+"',1)";
								String i2="insert into quizanswer(std_id,quiz_id,question_no) values ('"+lblid.getText()+"','"+quiz_id.getText()+"',2)";
								String i3="insert into quizanswer(std_id,quiz_id,question_no) values ('"+lblid.getText()+"','"+quiz_id.getText()+"',3)";
								String i4="insert into quizanswer(std_id,quiz_id,question_no) values ('"+lblid.getText()+"','"+quiz_id.getText()+"',4)";
								String i5="insert into quizanswer(std_id,quiz_id,question_no) values ('"+lblid.getText()+"','"+quiz_id.getText()+"',5)";
								Statement it=con.createStatement();
								it.executeUpdate(i1);
								it.executeUpdate(i2);
								it.executeUpdate(i3);
								it.executeUpdate(i4);
								it.executeUpdate(i5);
							}
						}
					}}else {
						JOptionPane.showMessageDialog(null, "No such course exist in database");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Quiz id is invaid");
				}
				
				
			}
		});
		Submit_1.setLayout(null);
		Submit_1.setBorder(new LineBorder(Color.WHITE));
		Submit_1.setBackground(new Color(25, 25, 112));
		Submit_1.setBounds(463, 11, 200, 48);
		panel.add(Submit_1);
		
		JLabel lblCheckTitle = new JLabel("Attempt Quiz");
		lblCheckTitle.setForeground(Color.WHITE);
		lblCheckTitle.setFont(new Font("Arial", Font.BOLD, 19));
		lblCheckTitle.setBounds(38, 11, 152, 28);
		Submit_1.add(lblCheckTitle);
		
		Q1 = new JTextField();
		Q1.setEditable(false);
		Q1.setBounds(10, 63, 901, 37);
		panel.add(Q1);
		Q1.setColumns(10);
		
		A1 = new JTextField();
		A1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		A1.setText("Write your answer here...");
		A1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(A1.getText().equals("Write your answer here...")) {
					A1.setText("");

				}
				else {
					A1.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(A1.getText().equals("")) {
					A1.setText("Write your answer here...");
				}
			}
		});
		A1.setColumns(10);
		A1.setBounds(10, 99, 901, 37);
		panel.add(A1);
		
		Q2 = new JTextField();
		Q2.setEditable(false);
		Q2.setColumns(10);
		Q2.setBounds(10, 135, 901, 37);
		panel.add(Q2);
		
		A2 = new JTextField();
		A2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(A2.getText().equals("Write your answer here...")) {
					A2.setText("");

				}
				else {
					A2.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(A2.getText().equals("")) {
					A2.setText("Write your answer here...");
				}
			}		});
		A2.setText("Write your answer here...");
		A2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		A2.setColumns(10);
		A2.setBounds(10, 171, 901, 37);
		panel.add(A2);
		
		Q3 = new JTextField();
		Q3.setEditable(false);
		Q3.setColumns(10);
		Q3.setBounds(10, 207, 901, 37);
		panel.add(Q3);
		
		A3 = new JTextField();
		A3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(A3.getText().equals("Write your answer here...")) {
					A3.setText("");

				}
				else {
					A3.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(A3.getText().equals("")) {
					A3.setText("Write your answer here...");
				}
			}
		});
		A3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		A3.setText("Write your answer here...");
		A3.setColumns(10);
		A3.setBounds(10, 243, 901, 37);
		panel.add(A3);
		
		Q4 = new JTextField();
		Q4.setEditable(false);
		Q4.setColumns(10);
		Q4.setBounds(10, 278, 901, 37);
		panel.add(Q4);
		
		A4 = new JTextField();
		A4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(A4.getText().equals("Write your answer here...")) {
					A4.setText("");

				}
				else {
					A4.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(A4.getText().equals("")) {
					A4.setText("Write your answer here...");
				}
			}
		});
		A4.setText("Write your answer here...");
		A4.setFont(new Font("Tahoma", Font.ITALIC, 11));
		A4.setColumns(10);
		A4.setBounds(10, 315, 901, 37);
		panel.add(A4);
		
		Q5 = new JTextField();
		Q5.setEditable(false);
		Q5.setColumns(10);
		Q5.setBounds(10, 351, 901, 37);
		panel.add(Q5);
		
		A5 = new JTextField();
		A5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(A5.getText().equals("Write your answer here...")) {
					A5.setText("");

				}
				else {
					A5.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(A5.getText().equals("")) {
					A5.setText("Write your answer here...");
				}
			}		});
		A5.setText("Write your answer here...");
		A5.setFont(new Font("Tahoma", Font.ITALIC, 11));
		A5.setColumns(10);
		A5.setBounds(10, 388, 901, 37);
		panel.add(A5);
		
		JPanel Submit_1_1 = new JPanel();
		Submit_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(A1.getText().equals("Write your answer here...") || A2.getText().equals("Write your answer here...") || 
				A3.getText().equals("Write your answer here...") ||A4.getText().equals("Write your answer here...") 
				||A5.getText().equals("Write your answer here...")) {
				JOptionPane.showMessageDialog(null, "Please attempt all answer");	
					
				}
				else {
					String query1="update quizanswer set answer='"+A1.getText()+"' where quiz_id='"+quiz_id.getText()+"' and question_no=1 and std_id='"+lblid.getText()+"'";
					String query2="update quizanswer set answer='"+A2.getText()+"' where quiz_id='"+quiz_id.getText()+"' and question_no=2 and std_id='"+lblid.getText()+"'";
					String query3="update quizanswer set answer='"+A3.getText()+"' where quiz_id='"+quiz_id.getText()+"' and question_no=3 and std_id='"+lblid.getText()+"'";
					String query4="update quizanswer set answer='"+A4.getText()+"' where quiz_id='"+quiz_id.getText()+"' and question_no=4 and std_id='"+lblid.getText()+"'";
					String query5="update quizanswer set answer='"+A5.getText()+"' where quiz_id='"+quiz_id.getText()+"' and question_no=5 and std_id='"+lblid.getText()+"'";
					
					try {
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
						Statement st=con.createStatement();
						st.executeUpdate(query1);
						st.executeUpdate(query2);
						st.executeUpdate(query3);
						st.executeUpdate(query4);
						st.executeUpdate(query5);
						JOptionPane.showMessageDialog(null, "Quiz attempted successfully");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "Failed to save response");
					}
					
					
					
					
				}
				
				
				
			}
		});
		Submit_1_1.setLayout(null);
		Submit_1_1.setBorder(new LineBorder(Color.WHITE));
		Submit_1_1.setBackground(new Color(25, 25, 112));
		Submit_1_1.setBounds(697, 11, 200, 48);
		panel.add(Submit_1_1);
		
		JLabel lblSubmitQuiz = new JLabel("Submit Quiz");
		lblSubmitQuiz.setForeground(Color.WHITE);
		lblSubmitQuiz.setFont(new Font("Arial", Font.BOLD, 19));
		lblSubmitQuiz.setBounds(38, 11, 152, 28);
		Submit_1_1.add(lblSubmitQuiz);
		
		lblid = new JLabel("");
		lblid.setBounds(149, 174, 260, 24);
		contentPane.add(lblid);
		
		JLabel lblid_1 = new JLabel("User ID:");
		lblid_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblid_1.setBounds(52, 174, 87, 24);
		contentPane.add(lblid_1);
		
		
		JLabel lblNewLabel_2 = new JLabel("*Quiz is available at once.");
		lblNewLabel_2.setBounds(1073, 174, 204, 27);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 17));
		
		
		
		
		
		
		
	}
}
