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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollBar;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class testq extends JFrame {

	private JPanel contentPane;
	public static JLabel lblid;
	static String a=null;
	private JTextField txttid;
	private JTextField txtrep;
	private JTextField txtsend;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testq frame = new testq();
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
	public testq() {
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
				pnlbtn_1.setBackground(new Color(0,0,139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlbtn_1.setBackground(new Color(25, 25, 112));	
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameInst f=new FrameInst();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				testq.this.dispose();
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
		
		JPanel pnlbtn_1_1 = new JPanel();
		pnlbtn_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameCC f=new FrameCC();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				testq.this.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlbtn_1_1.setBackground(new Color(0,0,139));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				pnlbtn_1_1.setBackground(new Color(25, 25, 112));
			}
		});
		pnlbtn_1_1.setLayout(null);
		pnlbtn_1_1.setBorder(new LineBorder(Color.WHITE));
		pnlbtn_1_1.setBackground(new Color(25, 25, 112));
		pnlbtn_1_1.setBounds(0, 74, 329, 76);
		panel_3.add(pnlbtn_1_1);
		
		JLabel lblNewLabel_2_1_5_4 = new JLabel("Create course");
		lblNewLabel_2_1_5_4.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_4.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_4.setBounds(90, 25, 179, 28);
		pnlbtn_1_1.add(lblNewLabel_2_1_5_4);
		
		JPanel pnlbtn_1_2 = new JPanel();
		pnlbtn_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlbtn_1_2.setBackground(new Color(0,0,139));
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
				testq.this.dispose();
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
		
		JLabel lblNewLabel_2_1_5_2 = new JLabel("Students Queries");
		lblNewLabel_2_1_5_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_5_2.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_2.setBounds(77, 24, 188, 28);
		
		
		
		JPanel pnlbtn_1_3 = new JPanel();
		pnlbtn_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlbtn_1_3.setBackground(new Color(0,0,139));
				lblNewLabel_2_1_5_2.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlbtn_1_3.setBackground(Color.WHITE);
				lblNewLabel_2_1_5_2.setForeground(Color.black);
			}
		});
		pnlbtn_1_3.setLayout(null);
		pnlbtn_1_3.setBorder(new LineBorder(new Color(0, 0, 139), 2));
		pnlbtn_1_3.setBackground(Color.WHITE);
		pnlbtn_1_3.setBounds(0, 227, 329, 76);
		panel_3.add(pnlbtn_1_3);
		pnlbtn_1_3.add(lblNewLabel_2_1_5_2);
		
		JPanel pnlbtn_1_4 = new JPanel();
		pnlbtn_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlbtn_1_4.setBackground(new Color(0,0,139));
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
				testq.this.dispose();
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
		lblNewLabel_2_1_5_1.setBounds(80, 22, 152, 28);
		pnlbtn_1_4.add(lblNewLabel_2_1_5_1);
		
		JPanel pnlbtn_1_5 = new JPanel();
		pnlbtn_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure want to logout?")==0) {
					FrameLOG framelogin=new FrameLOG();
					framelogin.setVisible(true);
					testq.this.dispose();
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
		
		JLabel lblNewLabel_3 = new JLabel("Student ID:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(209, 11, 156, 48);
		panel.add(lblNewLabel_3);
		
		txttid = new JTextField();
		txttid.setColumns(10);
		txttid.setBounds(351, 11, 401, 48);
		panel.add(txttid);
		
		JLabel lblNewLabel_3_1 = new JLabel("Response");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3_1.setBounds(209, 70, 156, 48);
		panel.add(lblNewLabel_3_1);
		
		txtrep = new JTextField();
		txtrep.setColumns(10);
		txtrep.setBounds(351, 70, 557, 48);
		panel.add(txtrep);
		
		JPanel Back = new JPanel();
		Back.setLayout(null);
		Back.setBorder(new LineBorder(Color.WHITE));
		Back.setBackground(new Color(25, 25, 112));
		Back.setBounds(263, 150, 234, 56);
		panel.add(Back);
		
		JLabel lblNewLabel_2_1_5_6 = new JLabel("Back");
		lblNewLabel_2_1_5_6.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_6.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_6.setBounds(90, 13, 134, 28);
		Back.add(lblNewLabel_2_1_5_6);
		
		JPanel Submit = new JPanel();
		Submit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
					Statement st=con.createStatement();
					String query="update queries set turn=0,recieve='"+txtrep.getText()+"' where stdid='"+txttid.getText()+"' and teachid='"+lblid.getText()+"'";
					st.executeUpdate(query);
					JOptionPane.showMessageDialog(null,"Message sent!");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					Connection con;
					try {
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
						Statement st=con.createStatement();
						String query="update queries set turn-0,recieve='"+txtrep.getText()+"' where stdid='"+txttid.getText()+"' and teachid='"+lblid.getText()+"'";
						st.executeUpdate(query);
						
						
					} catch (SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
						JOptionPane.showMessageDialog(null,"Please wait for previouse message response");
					}
			
					
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Message sent!");
				}
				
				
				
				
			}
		});
		Submit.setLayout(null);
		Submit.setBorder(new LineBorder(Color.WHITE));
		Submit.setBackground(new Color(25, 25, 112));
		Submit.setBounds(518, 150, 234, 56);
		panel.add(Submit);
		
		JLabel lblNewLabel_2_1_5_6_1 = new JLabel("Submit");
		lblNewLabel_2_1_5_6_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_6_1.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_6_1.setBounds(72, 13, 152, 28);
		Submit.add(lblNewLabel_2_1_5_6_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Message:");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3_1_1.setBounds(209, 224, 156, 48);
		panel.add(lblNewLabel_3_1_1);
		
		txtsend = new JTextField();
		txtsend.setText("Students queries...");
		txtsend.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtsend.setEditable(false);
		txtsend.setColumns(10);
		txtsend.setBounds(351, 227, 557, 48);
		panel.add(txtsend);
		
		
		JLabel lblNewLabel_2_1_5_6_1_1 = new JLabel("Check Response");
		lblNewLabel_2_1_5_6_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_6_1_1.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_6_1_1.setBounds(44, 11, 201, 28);
		
		
		JLabel lblid_1 = new JLabel("*Please retype Student id to check for response.");
		lblid_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblid_1.setEnabled(false);
		lblid_1.setBounds(263, 302, 401, 30);
		panel.add(lblid_1);
		
		JLabel lblid_1_1 = new JLabel("User ID:");
		lblid_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblid_1_1.setBounds(36, 174, 87, 24);
		contentPane.add(lblid_1_1);
		
		lblid = new JLabel();
		lblid.setBounds(133, 174, 264, 24);
		contentPane.add(lblid);
		JPanel CheckResponse = new JPanel();
		CheckResponse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
					String query="select sent from queries where stdid='"+txttid.getText()+"' and teachid='"+lblid.getText()+"'";
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(query);
					while(rs.next()) {
						String id=rs.getString("sent");
						txtsend.setText(id);
						
					}
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					
					
					
					
					JOptionPane.showMessageDialog(null,"Waiting for response");
				}
				
			}
		});
		CheckResponse.setLayout(null);
		CheckResponse.setBorder(new LineBorder(Color.WHITE));
		CheckResponse.setBackground(new Color(25, 25, 112));
		CheckResponse.setBounds(263, 342, 234, 56);
		panel.add(CheckResponse);
		CheckResponse.add(lblNewLabel_2_1_5_6_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 216, 341);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel Back_1 = new JPanel();
		Back_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					table.setModel(new DefaultTableModel());
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
					Statement st=con.createStatement();
					String query="select stdid as 'Messages From' from queries where turn=1 and teachid='"+lblid.getText()+"'";
					
					ResultSet rs=st.executeQuery(query);
					ResultSetMetaData rsmd=rs.getMetaData();
					DefaultTableModel model=(DefaultTableModel)table.getModel();
					
					int cols=rsmd.getColumnCount();
					String[] colname=new String[cols];
					for(int i=0;i<cols;i++) {
						colname[i]=rsmd.getColumnName(i+1);
						model.setColumnIdentifiers(colname);
					}
					String id,name,email;
					while(rs.next()) {
						id=rs.getString(1);
//						name=rs.getString(2);
//						email=rs.getString(3);
						String[] row= {id};
						model.addRow(row);
					}
					
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Back_1.setLayout(null);
		Back_1.setBorder(new LineBorder(Color.WHITE));
		Back_1.setBackground(new Color(25, 25, 112));
		Back_1.setBounds(10, 363, 216, 56);
		panel.add(Back_1);
		
		JLabel lblNewLabel_2_1_5_6_2 = new JLabel("Import message");
		lblNewLabel_2_1_5_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_5_6_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_6_2.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_6_2.setBounds(0, 11, 206, 34);
		Back_1.add(lblNewLabel_2_1_5_6_2);
		
		JLabel lblid_1_2 = new JLabel("This conversation is end-to-end encrypted.");
		lblid_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblid_1_2.setEnabled(false);
		lblid_1_2.setBounds(639, 389, 289, 30);
		panel.add(lblid_1_2);
		
		
		
		
		
		
	}
}
