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

public class FrameCC extends JFrame implements ActionListener{

	private JPanel contentPane;
	public static JLabel lblid;
	static String a=null;
	private JTextField course_id;
	private JTextField course_title;
	JCheckBox c1;
	JCheckBox c3;
	private JTextField pre_req;
	JComboBox comboBox;
	int credit=0;
	private JTextField pretit;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCC frame = new FrameCC();
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
	public FrameCC() {
		
		
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
				FrameCC.this.dispose();
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
				lblNewLabel_2_1_5_4.setForeground(Color.BLACK);
			}
		});
		pnlbtn_1_1.setLayout(null);
		pnlbtn_1_1.setBorder(new LineBorder(new Color(0, 0, 139), 2));
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
				FrameCQ f=new FrameCQ();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameCC.this.dispose();
			}
		});
		pnlbtn_1_2.setLayout(null);
		pnlbtn_1_2.setBorder(new LineBorder(Color.WHITE));
		pnlbtn_1_2.setBackground(new Color(25, 25, 112));
		pnlbtn_1_2.setBounds(0, 151, 329, 76);
		panel_3.add(pnlbtn_1_2);
		
		JLabel lblNewLabel_2_1_5_3 = new JLabel("Create Quiz");
		lblNewLabel_2_1_5_3.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_3.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_3.setBounds(92, 24, 178, 28);
		pnlbtn_1_2.add(lblNewLabel_2_1_5_3);
		
		JPanel pnlbtn_1_3 = new JPanel();
		pnlbtn_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				testq f=new testq();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameCC.this.dispose();
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
				FrameCC.this.dispose();
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
		lblNewLabel_2_1_5_1.setBounds(79, 22, 152, 28);
		pnlbtn_1_4.add(lblNewLabel_2_1_5_1);
		
		JPanel pnlbtn_1_5 = new JPanel();
		pnlbtn_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure want to logout?")==0) {
					FrameLOG framelogin=new FrameLOG();
					framelogin.setVisible(true);
					FrameCC.this.dispose();
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
		lblNewLabel_3_1.setBounds(10, 93, 156, 48);
		panel.add(lblNewLabel_3_1);
		
		course_id = new JTextField();
		course_id.setColumns(10);
		course_id.setBounds(176, 25, 401, 48);
		panel.add(course_id);
		
		course_title = new JTextField();
		course_title.setColumns(10);
		course_title.setBounds(176, 93, 635, 48);
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
		
		
		JLabel lblcreate = new JLabel("Create");
		lblcreate.setForeground(Color.WHITE);
		lblcreate.setFont(new Font("Arial", Font.BOLD, 19));
		lblcreate.setBounds(72, 13, 152, 28);
		
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Pre-Requisit ID");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3_1_1.setBounds(10, 228, 156, 48);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Credit Hour:");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_2.setBounds(10, 182, 156, 48);
		panel.add(lblNewLabel_3_2);
		
		c3 = new JCheckBox("Three ");
		c3.setSelected(false);
		c3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(c3.isSelected()) {
					c1.setSelected(false);
					credit=3;
				}
			}
		});
		c3.setBounds(219, 198, 99, 23);
		panel.add(c3);
		
		c1 = new JCheckBox("One");
		c1.setSelected(false);
		c1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(c1.isSelected()) {
					c3.setSelected(false);
					credit=1;
				}
				
			}
		});
		
		c1.setBounds(373, 198, 99, 23);
		panel.add(c1);
		
		JLabel lblid_1_1 = new JLabel("*Three credit hourse for Theory.");
		lblid_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblid_1_1.setEnabled(false);
		lblid_1_1.setBounds(478, 172, 367, 28);
		panel.add(lblid_1_1);
		
		JLabel lblid_1_1_1 = new JLabel("*One credit hourse for Lab.");
		lblid_1_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblid_1_1_1.setEnabled(false);
		lblid_1_1_1.setBounds(478, 194, 367, 28);
		panel.add(lblid_1_1_1);
		
		
		
		
		pre_req = new JTextField();
		pre_req.setColumns(10);
		pre_req.setBounds(176, 287, 401, 48);
		

		pretit = new JTextField();
		pretit.setEditable(false);
		pretit.setColumns(10);
		pretit.setBounds(176, 287, 401, 48);
		panel.add(pretit);
		
		
		comboBox= new JComboBox(a);
		comboBox.setBounds(176, 245, 296, 22);
		comboBox.addActionListener((ActionListener) this);
		panel.add(comboBox);
		
		
		
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
				if(!course_title.getText().isEmpty() && !course_id.getText().isEmpty() && !(credit==0)) {	
					
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
					Statement st=con.createStatement();
					String query="Insert into course(course_id,course_title,credit,pre_req) value('"+course_id.getText()+"','"+course_title.getText()+"',"+credit+",'"+pre_req.getText()+"')";
					String query2="insert into enroll value('"+lblid.getText()+"','"+course_id.getText()+"');";
					st.executeUpdate(query);
					st.executeUpdate(query2);
					JOptionPane.showMessageDialog(null,"Course created Sucessfully");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showInternalMessageDialog(null,"This corse id is already tekken");
				}
				
				}else {
					JOptionPane.showMessageDialog(null,"Please fill all require fields");
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
		
		JPanel Submit_1 = new JPanel();
		Submit_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
					String query="select course_title from course where course_id='"+comboBox.getSelectedItem()+"'";
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(query);
					while(rs.next()) {
						
						String ctitle=rs.getString("course_title");
						pretit.setText(ctitle);
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Submit_1.setLayout(null);
		Submit_1.setBorder(new LineBorder(Color.WHITE));
		Submit_1.setBackground(new Color(25, 25, 112));
		Submit_1.setBounds(599, 279, 234, 56);
		panel.add(Submit_1);
		
		JLabel lblCheckTitle = new JLabel("Check Title");
		lblCheckTitle.setForeground(Color.WHITE);
		lblCheckTitle.setFont(new Font("Arial", Font.BOLD, 19));
		lblCheckTitle.setBounds(59, 11, 152, 28);
		Submit_1.add(lblCheckTitle);
		
		JLabel lblid_1_1_2 = new JLabel("*If required.");
		lblid_1_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblid_1_1_2.setEnabled(false);
		lblid_1_1_2.setBounds(478, 239, 367, 28);
		panel.add(lblid_1_1_2);
		
		
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox) {
			pre_req.setText((String) comboBox.getSelectedItem());
			
		}
		
	}
}
