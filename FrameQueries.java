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

import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;


public class FrameQueries extends JFrame {

	private JPanel contentPane;
	static String a=null;
	public static JLabel lblid;
	private JTextField txttid;
	private JTextField txtmsg;
	private JTextField txtreply;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameQueries frame = new FrameQueries();
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
	public FrameQueries() {
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
				FrameQueries.this.dispose();
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
		
		JLabel lblNewLabel_2_1_5_5 = new JLabel("Home");
		lblNewLabel_2_1_5_5.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_5.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_5.setBounds(122, 25, 152, 28);
		btnHome.add(lblNewLabel_2_1_5_5);
		
		JPanel btnEc = new JPanel();
		btnEc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameSenroll f=new FrameSenroll();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameQueries.this.dispose();
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
		
		JLabel lblNewLabel_2_1_5_4 = new JLabel("Enrol course");
		lblNewLabel_2_1_5_4.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_4.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_4.setBounds(90, 25, 179, 28);
		btnEc.add(lblNewLabel_2_1_5_4);
		
		JPanel btnAq = new JPanel();
		btnAq.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameAquiz f=new FrameAquiz();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameQueries.this.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAq.setBackground(new Color(0,0,139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAq.setBackground(new Color(25,25,112));
			}
		});
		btnAq.setLayout(null);
		btnAq.setBorder(new LineBorder(Color.WHITE));
		btnAq.setBackground(new Color(25, 25, 112));
		btnAq.setBounds(0, 151, 329, 76);
		panel_3.add(btnAq);
		
		JLabel lblNewLabel_2_1_5_3 = new JLabel("Attempt Quiz");
		lblNewLabel_2_1_5_3.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_3.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_3.setBounds(92, 24, 178, 28);
		btnAq.add(lblNewLabel_2_1_5_3);
		

		JLabel lblAi = new JLabel("Ask instructor");
		lblAi.setForeground(Color.BLACK);
		lblAi.setFont(new Font("Arial", Font.BOLD, 19));
		lblAi.setBounds(77, 24, 188, 28);
		
		JPanel btnAi = new JPanel();
		btnAi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			btnAi.setBackground(new Color(0,0,139));
			lblAi.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAi.setBackground(Color.white);
				lblAi.setForeground(Color.black);
			}
		});
		btnAi.setLayout(null);
		btnAi.setBorder(new LineBorder(new Color(25, 25, 112), 2));
		btnAi.setBackground(Color.WHITE);
		btnAi.setBounds(0, 227, 329, 76);
		panel_3.add(btnAi);
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
				FrameQueries.this.dispose();
			}
		});
		btnprofile.setLayout(null);
		btnprofile.setBorder(new LineBorder(Color.WHITE));
		btnprofile.setBackground(new Color(25, 25, 112));
		btnprofile.setBounds(0, 301, 329, 76);
		panel_3.add(btnprofile);
		
		JLabel lblNewLabel_2_1_5_1 = new JLabel("Enrolled Course");
		lblNewLabel_2_1_5_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_1.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_1.setBounds(86, 23, 152, 28);
		btnprofile.add(lblNewLabel_2_1_5_1);
		
		JPanel btnsign = new JPanel();
		btnsign.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure want to logout?")==0) {
					FrameLOG framelogin=new FrameLOG();
					framelogin.setVisible(true);
					FrameQueries.this.dispose();
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
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Sign out");
		lblNewLabel_2_1_5.setForeground(Color.WHITE);
		lblNewLabel_2_1_5.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5.setBounds(110, 22, 152, 28);
		btnsign.add(lblNewLabel_2_1_5);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(25, 25, 112)));
		panel.setBounds(335, 209, 938, 430);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Instructor ID:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(54, 53, 156, 48);
		panel.add(lblNewLabel_3);
		
		txttid = new JTextField();
		txttid.setBounds(220, 53, 401, 48);
		panel.add(txttid);
		txttid.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Message:");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3_1.setBounds(54, 144, 156, 48);
		panel.add(lblNewLabel_3_1);
		
		txtmsg = new JTextField();
		txtmsg.setColumns(10);
		txtmsg.setBounds(220, 144, 635, 48);
		panel.add(txtmsg);
		
		JPanel Back = new JPanel();
		Back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameStd f=new FrameStd();
				f.setVisible(true);
				FrameQueries.this.dispose();
			}
		});
		Back.setLayout(null);
		Back.setBorder(new LineBorder(Color.WHITE));
		Back.setBackground(new Color(25, 25, 112));
		Back.setBounds(220, 219, 234, 56);
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
					String query="insert into queries(stdid,teachid,sent,turn) value('"+lblid.getText()+"','"+txttid.getText()+"','"+txtmsg.getText()+"',1)";
					st.executeUpdate(query);
					JOptionPane.showMessageDialog(null,"Message sent!");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					try {
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
						Statement st=con.createStatement();
						String query="update queries set sent='"+txtmsg.getText()+"',turn=1 where stdid='"+lblid.getText()+"' and teachid='"+txttid.getText()+"'";
						st.executeUpdate(query);
						JOptionPane.showMessageDialog(null,"Message sent!");
					} catch (SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
						JOptionPane.showMessageDialog(null, "No Such Converstaion exist");
					}
					
	
				}
				
			}
		});
		Submit.setLayout(null);
		Submit.setBorder(new LineBorder(Color.WHITE));
		Submit.setBackground(new Color(25, 25, 112));
		Submit.setBounds(475, 219, 234, 56);
		panel.add(Submit);
		
		JLabel lblNewLabel_2_1_5_6_1 = new JLabel("Submit");
		lblNewLabel_2_1_5_6_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_6_1.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_6_1.setBounds(72, 13, 152, 28);
		Submit.add(lblNewLabel_2_1_5_6_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Response:");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3_1_1.setBounds(54, 286, 156, 48);
		panel.add(lblNewLabel_3_1_1);
		
		txtreply = new JTextField();
			
		txtreply.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtreply.setText("Waiting for Instructor response...");
		
		txtreply.setEditable(false);
		txtreply.setColumns(10);
		txtreply.setBounds(220, 289, 635, 48);
		panel.add(txtreply);
		
		JPanel checkResponse = new JPanel();
		checkResponse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
					String query="select recieve from queries where stdid='"+lblid.getText()+"' and teachid='"+txttid.getText()+"'";
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(query);
					while(rs.next()) {
						
						String id=rs.getString("recieve");
						txtreply.setText(id);
					}
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					
					JOptionPane.showMessageDialog(null,"Waiting for response");
				}
			}
		});
		
		
		
		
		checkResponse.setLayout(null);
		checkResponse.setBorder(new LineBorder(Color.WHITE));
		checkResponse.setBackground(new Color(25, 25, 112));
		checkResponse.setBounds(220, 363, 234, 56);
		panel.add(checkResponse);
		
		JLabel lblNewLabel_2_1_5_6_1_1 = new JLabel("Check Response");
		lblNewLabel_2_1_5_6_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_6_1_1.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_6_1_1.setBounds(44, 11, 201, 28);
		checkResponse.add(lblNewLabel_2_1_5_6_1_1);
		
		JLabel lblid_1 = new JLabel("*Please retype instructor id to check for response.");
		lblid_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblid_1.setEnabled(false);
		lblid_1.setBounds(464, 366, 463, 53);
		panel.add(lblid_1);
		
		lblid = new JLabel("");
		lblid.setBounds(312, 184, 162, 14);
		contentPane.add(lblid);
		
		JLabel lblNewLabel_2_1 = new JLabel("User ID:");
		lblNewLabel_2_1.setBounds(194, 184, 103, 14);
		contentPane.add(lblNewLabel_2_1);
		
		
		
		
		
		
		
	}
}
