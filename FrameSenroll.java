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

public class FrameSenroll extends JFrame{

	private JPanel contentPane;
	public static JLabel lblid;
	static String a=null;
	private JTextField course_id;
	private JTextField course_title;
	private JTextField pre_req;
	private JTextField pre_tit;
	private JTextField pre_id;
	private JTextField ins_name;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameSenroll frame = new FrameSenroll();
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
	public FrameSenroll() {
		
		
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
				FrameStd f=new FrameStd();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameSenroll.this.dispose();
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
		
		
		JLabel lblNewLabel_2_1_5_4 = new JLabel("Enrol course");
		lblNewLabel_2_1_5_4.setForeground(Color.BLACK);
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
				pnlbtn_1_1.setBackground(Color.white);
				lblNewLabel_2_1_5_4.setForeground(Color.black);
			}
		});
		pnlbtn_1_1.setLayout(null);
		pnlbtn_1_1.setBorder(new LineBorder(new Color(25, 25, 112), 2));
		pnlbtn_1_1.setBackground(Color.WHITE);
		pnlbtn_1_1.setBounds(0, 74, 329, 76);
		panel_3.add(pnlbtn_1_1);
		pnlbtn_1_1.add(lblNewLabel_2_1_5_4);
		
		JPanel pnlbtn_1_2 = new JPanel();
		pnlbtn_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlbtn_1_2.setBackground(new Color(0, 0, 139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlbtn_1_2.setBackground(new Color(25, 25, 112));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameAquiz f=new FrameAquiz();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameSenroll.this.dispose();
			}
		});
		pnlbtn_1_2.setLayout(null);
		pnlbtn_1_2.setBorder(new LineBorder(Color.WHITE));
		pnlbtn_1_2.setBackground(new Color(25, 25, 112));
		pnlbtn_1_2.setBounds(0, 151, 329, 76);
		panel_3.add(pnlbtn_1_2);
		
		JLabel lblNewLabel_2_1_5_3 = new JLabel("Attempt Quiz");
		lblNewLabel_2_1_5_3.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_3.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_3.setBounds(92, 24, 178, 28);
		pnlbtn_1_2.add(lblNewLabel_2_1_5_3);
		
		JPanel pnlbtn_1_3 = new JPanel();
		pnlbtn_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameQueries f=new FrameQueries();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameSenroll.this.dispose();
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
		
		JLabel lblNewLabel_2_1_5_2 = new JLabel("Ask instructor");
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
				FrameEcheck f=new FrameEcheck();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameSenroll.this.dispose();
			}
		});
		pnlbtn_1_4.setLayout(null);
		pnlbtn_1_4.setBorder(new LineBorder(Color.WHITE));
		pnlbtn_1_4.setBackground(new Color(25, 25, 112));
		pnlbtn_1_4.setBounds(0, 301, 329, 76);
		panel_3.add(pnlbtn_1_4);
		
		JLabel lblNewLabel_2_1_5_1 = new JLabel("Enrolled Course");
		lblNewLabel_2_1_5_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_1.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_1.setBounds(79, 22, 152, 28);
		pnlbtn_1_4.add(lblNewLabel_2_1_5_1);
		
		JPanel pnlbtn_1_5 = new JPanel();
		pnlbtn_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure want to logout?")==0) {
					FrameLOG framelogin=new FrameLOG();
					framelogin.setVisible(true);
					FrameSenroll.this.dispose();
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
		panel.setBounds(335, 209, 938, 430);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Course ID:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(10, 25, 156, 48);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Course Title:");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3_1.setBounds(10, 97, 156, 48);
		panel.add(lblNewLabel_3_1);
		
		course_id = new JTextField();
		course_id.setColumns(10);
		course_id.setBounds(176, 25, 401, 48);
		panel.add(course_id);
		
		course_title = new JTextField();
		course_title.setEditable(false);
		course_title.setColumns(10);
		course_title.setBounds(176, 97, 635, 48);
		panel.add(course_title);
		
		JPanel Back = new JPanel();
		Back.setLayout(null);
		Back.setBorder(new LineBorder(Color.WHITE));
		Back.setBackground(new Color(25, 25, 112));
		Back.setBounds(176, 363, 234, 56);
		panel.add(Back);
		
		JLabel lblNewLabel_2_1_5_6 = new JLabel("Back");
		lblNewLabel_2_1_5_6.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_6.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_6.setBounds(90, 13, 134, 28);
		Back.add(lblNewLabel_2_1_5_6);
		
		
		JLabel lblcreate = new JLabel("Enroll");
		lblcreate.setForeground(Color.WHITE);
		lblcreate.setFont(new Font("Arial", Font.BOLD, 19));
		lblcreate.setBounds(72, 13, 152, 28);
		
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Pre-Requisit ID");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3_1_1.setBounds(10, 228, 156, 48);
		panel.add(lblNewLabel_3_1_1);
		
		
		
		
		pre_req = new JTextField();
		pre_req.setColumns(10);
		pre_req.setBounds(176, 287, 401, 48);
		

		pre_tit = new JTextField();
		pre_tit.setEditable(false);
		pre_tit.setColumns(10);
		pre_tit.setBounds(176, 287, 401, 48);
		panel.add(pre_tit);
		
		
		
		JLabel lblid_1 = new JLabel("User ID:");
		lblid_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblid_1.setBounds(42, 178, 87, 24);
		contentPane.add(lblid_1);
		
		lblid = new JLabel();
		lblid.setBounds(139, 178, 264, 24);
		contentPane.add(lblid);
		
		
		JPanel Submit = new JPanel();
		Submit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!course_id.getText().isEmpty()) {	
					
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
					Statement st=con.createStatement();
					String query="Insert into std_enrol(course_id,logid) value('"+course_id.getText()+"','"+lblid.getText()+"')";
					st.executeUpdate(query);
					JOptionPane.showMessageDialog(null,"Enrolment Successful");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showInternalMessageDialog(null,"Please enter  a valid course id information");
				}
				
				}
					
				
			
				}
		});
		Submit.setLayout(null);
		Submit.setBorder(new LineBorder(Color.WHITE));
		Submit.setBackground(new Color(25, 25, 112));
		Submit.setBounds(431, 363, 234, 56);
		Submit.add(lblcreate);
		panel.add(Submit);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Pre-Requisit Title:");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3_1_1_1.setBounds(10, 287, 156, 48);
		panel.add(lblNewLabel_3_1_1_1);
		
		pre_id = new JTextField();
		pre_id.setEditable(false);
		pre_id.setColumns(10);
		pre_id.setBounds(176, 228, 401, 48);
		panel.add(pre_id);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Instructor Name:");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3_1_2.setBounds(10, 169, 156, 48);
		panel.add(lblNewLabel_3_1_2);
		
		ins_name = new JTextField();
		ins_name.setEditable(false);
		ins_name.setColumns(10);
		ins_name.setBounds(176, 169, 635, 48);
		panel.add(ins_name);
		
		JPanel Submit_1 = new JPanel();
		Submit_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
					String query="select course_title,pre_req from course where course_id='"+course_id.getText()+"'";
					String query1="select concat(i.fname,' ',i.lname) as 'Full Name' from enroll e join instructor i on e.ins_id=i.logid and e.course_id='"+course_id.getText()+"'";
					String query2 ="select course_title from course where course_id='"+pre_id.getText()+"'";
					Statement st=con.createStatement();
					Statement st1=con.createStatement();
					Statement st2=con.createStatement();
					ResultSet rs=st.executeQuery(query);
					ResultSet rs1=st1.executeQuery(query1);
					ResultSet rs2=st2.executeQuery(query2);
					while(rs.next()) {
						
						String ctitle=rs.getString("course_title");
						String pre=rs.getString("pre_req");
						course_title.setText(ctitle);
						pre_id.setText(pre);
						}
					while(rs1.next()) {
						String name=rs1.getString("Full Name");
						ins_name.setText(name);
					}
					pre_tit.setText(null);
					while (rs2.next()) {
						String course=rs2.getString("course_title");
						pre_tit.setText(course);
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null,"Please enter a valid course id");
				}
			}
		});
		Submit_1.setLayout(null);
		Submit_1.setBorder(new LineBorder(Color.WHITE));
		Submit_1.setBackground(new Color(25, 25, 112));
		Submit_1.setBounds(619, 17, 234, 56);
		panel.add(Submit_1);
		
		JLabel lblFindCourse = new JLabel("Find Course");
		lblFindCourse.setForeground(Color.WHITE);
		lblFindCourse.setFont(new Font("Arial", Font.BOLD, 19));
		lblFindCourse.setBounds(49, 11, 152, 28);
		Submit_1.add(lblFindCourse);
		
		
		
		
	}
}
