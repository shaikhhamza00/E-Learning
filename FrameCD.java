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

public class FrameCD extends JFrame{

	private JPanel contentPane;
	public static JLabel lblid;
	private JTextField course_id;
	static String[] course=new String[10];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCD frame = new FrameCD();
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
	public FrameCD() {setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JPanel Homebtn = new JPanel();
		Homebtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Homebtn.setBackground(new Color(0, 0, 139));
			}
			public void mouseExited(MouseEvent e) {
				Homebtn.setBackground(new Color(25, 25, 112));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameInst f=new FrameInst();
				f.setVisible(true);
				FrameCD.this.dispose();
			}
		});
		Homebtn.setBorder(new LineBorder(Color.WHITE));
		Homebtn.setBounds(0, 0, 329, 76);
		panel_3.add(Homebtn);
		Homebtn.setLayout(null);
		Homebtn.setBackground(new Color(25, 25, 112));
		
		JLabel Homelbl = new JLabel("Home");
		Homelbl.setForeground(Color.WHITE);
		Homelbl.setFont(new Font("Arial", Font.BOLD, 19));
		Homelbl.setBounds(122, 25, 152, 28);
		Homebtn.add(Homelbl);
		
		JLabel createclbl = new JLabel("Create course");
		createclbl.setBackground(Color.BLACK);
		createclbl.setForeground(Color.WHITE);
		createclbl.setFont(new Font("Arial", Font.BOLD, 19));
		createclbl.setBounds(90, 25, 179, 28);
		
		JPanel createcbtn = new JPanel();
		createcbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				createcbtn.setBackground(new Color(0, 0, 139));
				createclbl.setForeground(Color.white);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				createcbtn.setBackground(new Color(25, 25, 112));
				
			}
		});
		createcbtn.setLayout(null);
		createcbtn.setBorder(new LineBorder(new Color(0, 0, 139), 2));
		createcbtn.setBackground(new Color(25, 25, 112));
		createcbtn.setBounds(0, 74, 329, 76);
		panel_3.add(createcbtn);
		createcbtn.add(createclbl);
		
		JPanel createqbtn = new JPanel();
		createqbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				createqbtn.setBackground(new Color(0, 0, 139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				createqbtn.setBackground(new Color(25, 25, 112));
			}
		});
		createqbtn.setLayout(null);
		createqbtn.setBorder(new LineBorder(Color.WHITE));
		createqbtn.setBackground(new Color(25, 25, 112));
		createqbtn.setBounds(0, 151, 329, 76);
		panel_3.add(createqbtn);
		
		JLabel createqlbl = new JLabel("Create Quiz");
		createqlbl.setForeground(Color.WHITE);
		createqlbl.setFont(new Font("Arial", Font.BOLD, 19));
		createqlbl.setBounds(92, 24, 178, 28);
		createqbtn.add(createqlbl);
		
		JPanel stdqbtn = new JPanel();
		stdqbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameIq f=new FrameIq();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameCD.this.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				stdqbtn.setBackground(new Color(0, 0, 139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				stdqbtn.setBackground(new Color(25, 25, 112));	
			}
		});
		stdqbtn.setLayout(null);
		stdqbtn.setBorder(new LineBorder(Color.WHITE));
		stdqbtn.setBackground(new Color(25, 25, 112));		
		stdqbtn.setBounds(0, 227, 329, 76);
		panel_3.add(stdqbtn);
		
		JLabel stdqlbl = new JLabel("Students Queries");
		stdqlbl.setForeground(Color.WHITE);
		stdqlbl.setFont(new Font("Arial", Font.BOLD, 19));
		stdqlbl.setBounds(77, 24, 188, 28);
		stdqbtn.add(stdqlbl);

		JLabel courseinfolbl = new JLabel("Course enrolles");
		courseinfolbl.setForeground(Color.BLACK);
		courseinfolbl.setFont(new Font("Arial", Font.BOLD, 19));
		courseinfolbl.setBounds(77, 22, 152, 28);
		
		lblid = new JLabel();
		lblid.setBounds(139, 178, 264, 24);
		contentPane.add(lblid);
		
		JPanel courseinfo = new JPanel();
		courseinfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				courseinfo.setBackground(new Color(0,0,139));
				courseinfolbl.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				courseinfo.setBackground(Color.white);
				courseinfolbl.setForeground(Color.black);
			}
		});
		courseinfo.setLayout(null);
		courseinfo.setBorder(new LineBorder(new Color(0, 0, 139), 2));
		courseinfo.setBackground(Color.WHITE);
		courseinfo.setBounds(0, 301, 329, 76);
		panel_3.add(courseinfo);
		
		courseinfo.add(courseinfolbl);
		
		JPanel soutbtn = new JPanel();
		soutbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure want to logout?")==0) {
					FrameLOG framelogin=new FrameLOG();
					framelogin.setVisible(true);
					FrameCD.this.dispose();
					}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				soutbtn.setBackground(new Color(0,0,139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				soutbtn.setBackground(new Color(25, 25, 112));
			}
		});
		soutbtn.setLayout(null);
		soutbtn.setBorder(new LineBorder(Color.WHITE));
		soutbtn.setBackground(new Color(25, 25, 112));
		soutbtn.setBounds(0, 371, 329, 76);
		panel_3.add(soutbtn);
		
		JLabel soutlbl = new JLabel("Sign out");
		soutlbl.setForeground(Color.WHITE);
		soutlbl.setFont(new Font("Arial", Font.BOLD, 19));
		soutlbl.setBounds(110, 22, 152, 28);
		soutbtn.add(soutlbl);
		
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
		
		
		
		JLabel lblid_1 = new JLabel("User ID:");
		lblid_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblid_1.setBounds(42, 178, 87, 24);
		contentPane.add(lblid_1);
		
		
		JList list=new JList();
		
		
		JPanel Submit_1 = new JPanel();
		Submit_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
					String query="Select course_id from enroll where ins_id='"+lblid.getText()+"'";
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(query);
					int c=1;
					while(rs.next()) {
						
						course[c]=rs.getString("course_id");
						c++;
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				JList list=new JList();
			}
		});
		
		System.out.println(course[1]);
		System.out.println(course[2]);
		Submit_1.setLayout(null);
		Submit_1.setBorder(new LineBorder(Color.WHITE));
		Submit_1.setBackground(new Color(25, 25, 112));
		Submit_1.setBounds(655, 25, 234, 56);
		panel.add(Submit_1);
		
		JLabel lblCheckTitle = new JLabel("Check Enroles:");
		lblCheckTitle.setForeground(Color.WHITE);
		lblCheckTitle.setFont(new Font("Arial", Font.BOLD, 19));
		lblCheckTitle.setBounds(46, 11, 152, 28);
		Submit_1.add(lblCheckTitle);
		
		course_id = new JTextField();
		course_id.setColumns(10);
		course_id.setBounds(171, 25, 401, 48);
		panel.add(course_id);
		
		
		
		
		
	}
}
