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
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.components.JLocaleChooser;

public class FrameCQ extends JFrame{

	private JPanel contentPane;
	public static JLabel lblid;
	private JTextField course_id;
	private JTextField quiz_id;
	private JTextField pre_req;
	int credit=0;
	int x=0,y=0;
	private JTextField stime;
	private JTextField etime;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCQ frame = new FrameCQ();
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
	public FrameCQ() {
		
		
		String[] a=new String[120];
		a[0]="null";
		
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
				String query="Select course_id from course";
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(query);
				int c=1;
				while(rs.next()) {
					
					a[c]=rs.getString("course_id");
					c++;
				}
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
		
			
		
		
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
		
		JPanel pnlbtn_1 = new JPanel();
		pnlbtn_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlbtn_1.setBackground(new Color(0, 0, 139));
			}
			public void mouseExited(MouseEvent e) {
				pnlbtn_1.setBackground(new Color(25, 25, 112));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameInst f=new FrameInst();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameCQ.this.dispose();
			}
		});
		pnlbtn_1.setBorder(new LineBorder(Color.WHITE));
		pnlbtn_1.setBounds(0, 0, 329, 76);
		panel_3.add(pnlbtn_1);
		pnlbtn_1.setLayout(null);
		pnlbtn_1.setBackground(new Color(25, 25, 112));
		
		JLabel lblNewLabel_2_1_5_5 = new JLabel("Home");
		lblNewLabel_2_1_5_5.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_5.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_5.setBounds(122, 25, 152, 28);
		pnlbtn_1.add(lblNewLabel_2_1_5_5);
		
		JLabel lblNewLabel_2_1_5_4 = new JLabel("Create course");
		lblNewLabel_2_1_5_4.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_4.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_4.setBounds(90, 25, 179, 28);
		
		JPanel pnlbtn_1_1 = new JPanel();
		pnlbtn_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlbtn_1_1.setBackground(new Color(0, 0, 139));
				lblNewLabel_2_1_5_4.setForeground(Color.white);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				pnlbtn_1_1.setBackground(new Color(25, 25, 112));
				lblNewLabel_2_1_5_4.setForeground(Color.white);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			FrameCC f=new FrameCC();
			f.setVisible(true);
			f.lblid.setText(lblid.getText());
			FrameCQ.this.dispose();
			
			}
		});
		pnlbtn_1_1.setLayout(null);
		pnlbtn_1_1.setBorder(new LineBorder(new Color(0, 0, 139), 2));
		pnlbtn_1_1.setBackground(new Color(25, 25, 112));
		pnlbtn_1_1.setBounds(0, 74, 329, 76);
		panel_3.add(pnlbtn_1_1);
		pnlbtn_1_1.add(lblNewLabel_2_1_5_4);
		

		JLabel lblNewLabel_2_1_5_3 = new JLabel("Create Quiz");
		lblNewLabel_2_1_5_3.setForeground(Color.BLACK);
		lblNewLabel_2_1_5_3.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_3.setBounds(92, 24, 178, 28);
		
		JPanel pnlbtn_1_2 = new JPanel();
		pnlbtn_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlbtn_1_2.setBackground(new Color(0, 0, 139));
				lblNewLabel_2_1_5_3.setForeground(Color.white);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlbtn_1_2.setBackground(Color.white);
				lblNewLabel_2_1_5_3.setForeground(Color.black);
			}
		});
		pnlbtn_1_2.setLayout(null);
		pnlbtn_1_2.setBorder(new LineBorder(Color.WHITE));
		pnlbtn_1_2.setBackground(Color.WHITE);
		pnlbtn_1_2.setBounds(0, 151, 329, 76);
		panel_3.add(pnlbtn_1_2);
		pnlbtn_1_2.add(lblNewLabel_2_1_5_3);
		
		JPanel pnlbtn_1_3 = new JPanel();
		pnlbtn_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				testq f=new testq();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameCQ.this.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlbtn_1_3.setBackground(new Color(0, 0, 139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlbtn_1_3.setBackground(new Color(25, 25, 112));	
			}
		});
		pnlbtn_1_3.setLayout(null);
		pnlbtn_1_3.setBorder(new LineBorder(Color.WHITE));
		pnlbtn_1_3.setBackground(new Color(25, 25, 112));		
		pnlbtn_1_3.setBounds(0, 227, 329, 76);
		panel_3.add(pnlbtn_1_3);
		
		JLabel lblNewLabel_2_1_5_2 = new JLabel("Students Queries");
		lblNewLabel_2_1_5_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_2.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_2.setBounds(77, 24, 188, 28);
		pnlbtn_1_3.add(lblNewLabel_2_1_5_2);
		
		JPanel pnlbtn_1_4 = new JPanel();
		pnlbtn_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlbtn_1_4.setBackground(new Color(0, 0, 139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlbtn_1_4.setBackground(new Color(25, 25, 112));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameStdenrol f=new FrameStdenrol();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameCQ.this.dispose();
			}
		});
		pnlbtn_1_4.setLayout(null);
		pnlbtn_1_4.setBorder(new LineBorder(Color.WHITE));
		pnlbtn_1_4.setBackground(new Color(25, 25, 112));
		pnlbtn_1_4.setBounds(0, 301, 329, 76);
		panel_3.add(pnlbtn_1_4);
		
		JLabel lblNewLabel_2_1_5_1 = new JLabel("Course enrolles");
		lblNewLabel_2_1_5_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_1.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_1.setBounds(75, 22, 152, 28);
		pnlbtn_1_4.add(lblNewLabel_2_1_5_1);
		
		JPanel pnlbtn_1_5 = new JPanel();
		pnlbtn_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure want to logout?")==0) {
					FrameLOG framelogin=new FrameLOG();
					framelogin.setVisible(true);
					FrameCQ.this.dispose();
					}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlbtn_1_5.setBackground(new Color(0,0,139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlbtn_1_5.setBackground(new Color(25, 25, 112));
			}
		});
		pnlbtn_1_5.setLayout(null);
		pnlbtn_1_5.setBorder(new LineBorder(Color.WHITE));
		pnlbtn_1_5.setBackground(new Color(25, 25, 112));
		pnlbtn_1_5.setBounds(0, 371, 329, 76);
		panel_3.add(pnlbtn_1_5);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Sign out");
		lblNewLabel_2_1_5.setForeground(Color.WHITE);
		lblNewLabel_2_1_5.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5.setBounds(110, 22, 152, 28);
		pnlbtn_1_5.add(lblNewLabel_2_1_5);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(25, 25, 112)));
		panel.setBounds(325, 209, 920, 430);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Course ID:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(24, 25, 123, 48);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Quiz ID:");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3_1.setBounds(453, 25, 156, 48);
		panel.add(lblNewLabel_3_1);
		
		course_id = new JTextField();
		course_id.setColumns(10);
		course_id.setBounds(140, 29, 280, 48);
		panel.add(course_id);
		
		quiz_id = new JTextField();
		quiz_id.setColumns(10);
		quiz_id.setBounds(534, 29, 352, 48);
		panel.add(quiz_id);
		
		
		
		pre_req = new JTextField();
		pre_req.setColumns(10);
		pre_req.setBounds(176, 287, 401, 48);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(179, 108, 205, 153);
		Date before=calendar.getDate();	
		panel.add(calendar);
		JPanel Submit_1_1 = new JPanel();
		Submit_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameInst f=new FrameInst();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameCQ.this.dispose();
			}
		});
		
		
		JLabel lblid_1 = new JLabel("User ID:");
		lblid_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblid_1.setBounds(42, 178, 87, 24);
		contentPane.add(lblid_1);
		
		lblid = new JLabel();
		lblid.setBounds(139, 178, 264, 24);
		contentPane.add(lblid);
		
		
		JPanel Submit_1 = new JPanel();
		Submit_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				x=0;
				y=0;
			
				int l=0,m=0,n=0,o=0,p=0;
				if(stime.getText().isEmpty()  || etime.getText().isEmpty() || course_id.getText().isEmpty() || quiz_id.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"Please fill all the requirments");
				}
				else {
				
				try {
					Connection con;
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
					String query="select course_id from course";
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(query);
					while(rs.next()) {
						
						String id=rs.getString("course_id");
						
						if(course_id.getText().equals(id)) {
							x=1;
						}
						//System.out.format("%s, \n", id);
					}
					st.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					Connection con;
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
					String query="select quiz_id from quizquestion";
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(query);
					while(rs.next()) {
						
						String id=rs.getString("quiz_id");
						
						if(quiz_id.getText().equals(id)) {
							y=1;
							
						}
						//System.out.format("%s, \n", id);
					}
					st.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				if(x==0) {
					JOptionPane.showMessageDialog(null,"No Such course exist!");
				}
				else {l++;}
				
				if(y==1) {
					JOptionPane.showMessageDialog(null,"This quiz id is already in system try another");
				}else {m++;}
				
				if(stime.getText().compareTo(etime.getText()) > 0) {
					
				}
				else {n++;}
				
				Date after=calendar.getDate();
				if(before.compareTo(after) > 0) {
					JOptionPane.showMessageDialog(null,"You can't select passed date");
				}else {o++;}
				
				
				if(etime.getText().compareTo(stime.getText()) <= 0) {
					JOptionPane.showMessageDialog(null,"Error in Time corresponding");
				}
				else {
					p++;
				}
				
				
				if(l==1 && m==1 && n==1 && o==1 && p==1) {
					try {
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
						String query1="insert into quizquestion(course_id,quiz_id,attempt_date,qstart,qend,question_no) value('"+course_id.getText()+"','"+quiz_id.getText()
						+"','"+(calendar.getDate().getYear()+1900)+"-"+((calendar.getDate().getMonth()+1))+"-"+calendar.getDate().getDate()+"','"+stime.getText()+"','"+etime.getText()+"',1)";
						String query2="insert into quizquestion(course_id,quiz_id,attempt_date,qstart,qend,question_no) value('"+course_id.getText()+"','"+quiz_id.getText()
						+"','"+(calendar.getDate().getYear()+1900)+"-"+((calendar.getDate().getMonth()+1))+"-"+calendar.getDate().getDate()+"','"+stime.getText()+"','"+etime.getText()+"',2)";
						String query3="insert into quizquestion(course_id,quiz_id,attempt_date,qstart,qend,question_no) value('"+course_id.getText()+"','"+quiz_id.getText()
						+"','"+(calendar.getDate().getYear()+1900)+"-"+((calendar.getDate().getMonth()+1))+"-"+calendar.getDate().getDate()+"','"+stime.getText()+"','"+etime.getText()+"',3)";
						String query4="insert into quizquestion(course_id,quiz_id,attempt_date,qstart,qend,question_no) value('"+course_id.getText()+"','"+quiz_id.getText()
						+"','"+(calendar.getDate().getYear()+1900)+"-"+((calendar.getDate().getMonth()+1))+"-"+calendar.getDate().getDate()+"','"+stime.getText()+"','"+etime.getText()+"',4)";
						String query5="insert into quizquestion(course_id,quiz_id,attempt_date,qstart,qend,question_no) value('"+course_id.getText()+"','"+quiz_id.getText()
						+"','"+(calendar.getDate().getYear()+1900)+"-"+((calendar.getDate().getMonth()+1))+"-"+calendar.getDate().getDate()+"','"+stime.getText()+"','"+etime.getText()+"',5)";
						
						
						
						Statement st=con.createStatement();
						st.executeUpdate(query1);
						st.executeUpdate(query2);
						st.executeUpdate(query3);
						st.executeUpdate(query4);
						st.executeUpdate(query5);
						JOptionPane.showMessageDialog(null,"Quiz successfully created quiz id="+quiz_id.getText());
						FrameQuestion f=new FrameQuestion();
						f.setVisible(true);
						f.lblid.setToolTipText(lblid.getText());
						f.quiz_id.setText(quiz_id.getText());
						FrameCQ.this.dispose();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				
				
				}//else
			}
		});
		Submit_1.setLayout(null);
		Submit_1.setBorder(new LineBorder(Color.WHITE));
		Submit_1.setBackground(new Color(25, 25, 112));
		Submit_1.setBounds(496, 348, 234, 56);
		panel.add(Submit_1);
		
		JLabel lblCheckTitle = new JLabel("Create Quiz");
		lblCheckTitle.setForeground(Color.WHITE);
		lblCheckTitle.setFont(new Font("Arial", Font.BOLD, 19));
		lblCheckTitle.setBounds(59, 11, 152, 28);
		Submit_1.add(lblCheckTitle);
		
		JLabel lblNewLabel_3_2 = new JLabel("Select Date:");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3_2.setBounds(24, 155, 123, 48);
		panel.add(lblNewLabel_3_2);
		
		
		Submit_1_1.setLayout(null);
		Submit_1_1.setBorder(new LineBorder(Color.WHITE));
		Submit_1_1.setBackground(new Color(25, 25, 112));
		Submit_1_1.setBounds(217, 348, 234, 56);
		panel.add(Submit_1_1);
		
		JLabel lblBack = new JLabel("Back");
		lblBack.setForeground(Color.WHITE);
		lblBack.setFont(new Font("Arial", Font.BOLD, 19));
		lblBack.setBounds(82, 11, 152, 28);
		Submit_1_1.add(lblBack);
		
		JLabel lblNewLabel_3_3 = new JLabel("Start Time:");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3_3.setBounds(453, 136, 123, 48);
		panel.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("End Time:");
		lblNewLabel_3_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3_3_1.setBounds(453, 212, 123, 48);
		panel.add(lblNewLabel_3_3_1);
		
		stime = new JTextField();
		stime.setColumns(10);
		stime.setBounds(558, 136, 328, 48);
		panel.add(stime);
		
		etime = new JTextField();
		etime.setColumns(10);
		etime.setBounds(558, 212, 328, 48);
		panel.add(etime);
		
		JLabel lblNewLabel_2 = new JLabel("Time Order: HH:MM:SS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(558, 88, 249, 34);
		panel.add(lblNewLabel_2);
		
	
		
		
	}
}
