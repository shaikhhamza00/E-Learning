import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.border.LineBorder;

import com.mysql.cj.jdbc.Driver;

import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class FrameLOG extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	static JTextField id;
	private JPasswordField txtPass;
	int a=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLOG frame = new FrameLOG();
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
	public FrameLOG() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-5, 0, 1800, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mhdha\\Downloads\\allfiles\\logo.png"));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setBounds(33, 29, 205, 195);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("E-Learning SUKKUR IBA Khairpur Campus");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1.setBounds(290, 55, 920, 118);
		contentPane.add(lblNewLabel_1);
		
		JPanel pnlbtn = new JPanel();
		pnlbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtID.getText().equals(null) || txtPass.getText().equals(null) || txtID.getText().equals("Enter your Id") || txtPass.getText().equals("Enter Password")) {
					JOptionPane.showMessageDialog(null,"Please fill all the required info");}
				else if(!(txtID.getText().equals(null) || txtPass.getText().equals(null) || txtID.getText().equals("Enter your Id") || txtPass.getText().equals("Enter Password"))) {
					//JOptionPane.showMessageDialog(null, "Logined");
					try {
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
						String query="select logid,logpass from student where logid='"+txtID.getText()+"'";
						Statement st=con.createStatement();
						ResultSet rs=st.executeQuery(query);
						while(rs.next()) {
						
						String id=rs.getString("logid");
						String pass=rs.getString("logpass");
						if(txtID.getText().equals(id) && txtPass.getText().equals(pass)) {
								//System.out.println("Primary key violating");
						JOptionPane.showMessageDialog(null,"Student Login Successfull");
						FrameStd f=new FrameStd();
						f.setVisible(true);
						FrameLOG.this.dispose();
						f.lblid.setText(txtID.getText());
						a++;		
						}
						else {
						JOptionPane.showMessageDialog(null,"Email or Password is Invalid");
						}
						}
						Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
						String query2="select logid,logpass from instructor where logid='"+txtID.getText()+"'";
						Statement st2=con.createStatement();
						ResultSet rs2=st2.executeQuery(query2);
						while(rs2.next()) {
							
							String id=rs2.getString("logid");
							String pass=rs2.getString("logpass");
							if(txtID.getText().equals(id) && txtPass.getText().equals(pass)) {
									//System.out.println("Primary key violating");
							JOptionPane.showMessageDialog(null,"Instructor Login Successfull");
							
							FrameInst f=new FrameInst();
							f.setVisible(true);
							f.lblid.setText(txtID.getText());
							FrameLOG.this.dispose();
							a++;		
							}
							else {
							JOptionPane.showMessageDialog(null,"Email or Password is Invalid");
							}
							}
						
						
						if(a==0) {
						JOptionPane.showMessageDialog(null, "No such user exist!");}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "No such user exist!");
					}
					
				}
		}
		});
		
		pnlbtn.setLayout(null);
		pnlbtn.setBackground(new Color(25, 25, 112));
		pnlbtn.setBounds(286, 453, 250, 50);
		contentPane.add(pnlbtn);
		
		JLabel lblNewLabel_2 = new JLabel("LOG IN");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2.setBounds(95, 11, 152, 28);
		pnlbtn.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(286, 279, 250, 37);
		contentPane.add(panel);
		
		//id
		id=new JTextField();
		panel.add(id);
		
		txtID = new JTextField();
		txtID.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtID.getText().equals("Enter your Id")) {
					txtID.setText("");

				}
				else {
					txtID.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtID.getText().equals("")) {
					txtID.setText("Enter your Id");
				}
			}
		});
		txtID.setText("Enter your Id");
		txtID.setColumns(10);
		txtID.setBorder(null);
		txtID.setBackground(Color.WHITE);
		txtID.setBounds(10, 11, 175, 20);
		panel.add(txtID);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(286, 361, 250, 37);
		contentPane.add(panel_1);
		
		txtPass = new JPasswordField();
		txtPass.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPass.getText().equals("Enter Password")) {
					txtPass.setText("");
					//txtPass.setEchoChar((char)0);
					txtPass.setEchoChar('*');
				}
					
				else {
					txtPass.selectAll();
				}
				
			}
			
					
			@Override
			public void focusLost(FocusEvent e) {
				if(txtPass.getText().equals("")) {
				txtPass.setText("Enter Password");
				txtPass.setEchoChar((char)0);
			}
			}
		});
		txtPass.setEchoChar((char)0);
		txtPass.setBorder(null);
		txtPass.setText("Enter Password");
		txtPass.setBounds(10, 11, 180, 20);
		panel_1.add(txtPass);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\mhdha\\OneDrive\\Desktop\\DATA\\Line.png"));
		lblNewLabel_3.setBounds(698, 207, 5, 381);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Don't Have An Account?");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(830, 301, 279, 50);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Create your Free account to get uptodate with new routines.");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(731, 362, 503, 37);
		contentPane.add(lblNewLabel_5);
		
		JPanel pnlbtn_1 = new JPanel();
		pnlbtn_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameLO f=new FrameLO();
				f.setVisible(true);
				FrameLOG.this.dispose();
			}
		});
		pnlbtn_1.setLayout(null);
		pnlbtn_1.setBackground(new Color(25, 25, 112));
		pnlbtn_1.setBounds(859, 453, 250, 50);
		contentPane.add(pnlbtn_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Create Account");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(50, 11, 152, 28);
		pnlbtn_1.add(lblNewLabel_2_1);
	}
}
