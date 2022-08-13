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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class FrameRegister extends JFrame {

	private JPanel contentPane;
	public static JTextField txtId;
	private JPasswordField txtPass;
	private JPasswordField txtPass1;
	static String a=null;
	static JTextField id;
	static String b;
	public static JLabel lblNewLabel_4;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameRegister frame = new FrameRegister();
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
	public FrameRegister() {
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
		lblNewLabel.setBounds(32, 34, 205, 195);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("E-Learning SUKKUR IBA Khairpur Campus");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1.setBounds(289, 60, 920, 118);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(422, 281, 250, 37);
		contentPane.add(panel);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(236, 628, 49, 14);
		contentPane.add(lblNewLabel_4);
		
		
		//id
		id=new JTextField();
		panel.add(id);
		
		txtId = new JTextField();
		txtId.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtId.getText().equals("Enter your Id")) {
					txtId.setText("");
				}
				else {
					txtId.selectAll();
					a=txtId.getText();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtId.getText().equals("")) {
					txtId.setText("Enter your Id");
				}
			}
		});
		txtId.setText("Enter your Id");
		txtId.setColumns(10);
		txtId.setBorder(null);
		txtId.setBackground(Color.WHITE);
		txtId.setBounds(10, 11, 175, 20);
		panel.add(txtId);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(422, 373, 250, 37);
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
		txtPass.setBounds(10, 11, 181, 20);
		panel_1.add(txtPass);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(422, 460, 250, 37);
		contentPane.add(panel_2);
		
		txtPass1 = new JPasswordField();
		txtPass1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPass1.getText().equals("Confirm Password")) {
					txtPass1.setText("");
					//txtPass.setEchoChar((char)0);
					txtPass1.setEchoChar('*');
				}
					
				else {
					txtPass1.selectAll();
				}
				
			}
			
					
			@Override
			public void focusLost(FocusEvent e) {
				if(txtPass1.getText().equals("")) {
				txtPass1.setText("Confirm Password");
				txtPass1.setEchoChar((char)0);
			}
			}
		});
		txtPass1.setEchoChar((char)0);
		txtPass1.setBorder(null);
		txtPass1.setText("Confirm Password");
		txtPass1.setBounds(10, 11, 181, 20);
		panel_2.add(txtPass1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(25, 25, 112));
		panel_3.setBounds(802, 219, 250, 373);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel pnlbtn_1 = new JPanel();
		pnlbtn_1.setBorder(new LineBorder(Color.WHITE));
		pnlbtn_1.setBounds(0, 206, 250, 50);
		panel_3.add(pnlbtn_1);
		pnlbtn_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameLogin fg = new FrameLogin();
				fg.setVisible(true);
				FrameRegister.this.dispose();
//				FrameRegP x=new FrameRegP();
//				FrameRegP.txtfname.setText("HI");
//				JOptionPane.showMessageDialog(null, FrameRegP.txtfname.getText());
			}
		});
		pnlbtn_1.setLayout(null);
		pnlbtn_1.setBackground(new Color(25, 25, 112));
		
		JLabel lblNewLabel_2_1 = new JLabel("Back");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(95, 11, 152, 28);
		pnlbtn_1.add(lblNewLabel_2_1);
		
		JPanel pnlbtn_1_1 = new JPanel();
		pnlbtn_1_1.setBorder(new LineBorder(Color.WHITE));
		pnlbtn_1_1.setBounds(0, 281, 250, 50);
		panel_3.add(pnlbtn_1_1);
		pnlbtn_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Getting user acknowledgment
			
			
			if(lblNewLabel_4.getText().equals("0")) {
			
				if(txtPass.getText().equals(txtPass1.getText())) {
					FrameRegP frp=new FrameRegP();
					
					frp.LOL.setText(txtId.getText());
					Connection con = null;
					try {
						
						if(txtId.getText().equals(null)) {
							
						}else {}
						
						
						
						
						try {
							
							//Class.forName("com.mysql.jdbc.Driver");
							con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
							String query="select logid from student";
							Statement st=con.createStatement();
							ResultSet rs=st.executeQuery(query);
							while(rs.next()) {
								
								String id=rs.getString("logid");
								//String fname=rs.getString("Tname");
								
								if(txtId.getText().equals(id)) {
									//System.out.println("Primary key violating");
									JOptionPane.showMessageDialog(null,"This user ID is already taken");
									
								}else {
									
								}
								//System.out.format("%s, \n", id);
							}
							st.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						finally{
							try {
								if(con!=null)
									con.close();
							}
						catch(SQLException e2 ) { 
							e2.printStackTrace();}
						}	

						
						//Class.forName("com.mysql.jdbc.Driver");
						con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
						Statement st=con.createStatement();
						//System.out.println("Inserting records");
						String sql="Insert into student(logid,logpass) value('"+txtId.getText()+"','"+txtPass.getText()+"')";
						//String st1="use test select * from link";
						st.executeUpdate(sql);
						frp.setVisible(true);
						FrameRegister.this.dispose();
						//st.executeUpdate(st1);
						
					} catch (SQLException g) {
						
						// TODO Auto-generated catch block
						g.printStackTrace();
					}
					
					

				}else {
					JOptionPane.showMessageDialog(null,"Confirmation password Failed!");
				}
				
				
			}
			else if(lblNewLabel_4.getText().equals("1")) {
				if(txtPass.getText().equals(txtPass1.getText())) {
					FrameIreg frp=new FrameIreg();
					frp.LOL.setText(txtId.getText());
					Connection con=null;
					try {
						con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
						String query="select logid from instructor";
						Statement st=con.createStatement();
						ResultSet rs=st.executeQuery(query);
						String id;
						while(rs.next()) {
							id=rs.getString("logid");
							if(txtId.getText().equals(id)) {
								JOptionPane.showMessageDialog(null,"This user ID is already taken");
							}
						}
						st.close();
					} catch(SQLException e2) {
						e2.printStackTrace();
					}finally{
						if(con!=null) {
							try {
								con.close();
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							
					try {
						con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
						Statement st=con.createStatement();
						String query="Insert into instructor(logid,logpass) value('"+txtId.getText()+"','"+txtPass.getText()+"')";
						st.executeUpdate(query);
						frp.setVisible(true);
						FrameRegister.this.dispose();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
							
							
							
						}
					}
					
					

			}else {
				JOptionPane.showMessageDialog(null,"Password Confirmation Failed!");
			}
				
			}
			}
		});
		
		pnlbtn_1_1.setLayout(null);
		pnlbtn_1_1.setBackground(new Color(25, 25, 112));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Next");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(95, 11, 152, 28);
		pnlbtn_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hello, Users!");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 44, 230, 66);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter your credential details and");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(0, 121, 250, 50);
		panel_3.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_3_1 = new JLabel("Start journey with us!");
		lblNewLabel_3_1.setBounds(10, 145, 240, 50);
		panel_3.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		
		
		
		
	}
}
