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
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollBar;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.SwingConstants;

public class FrameRegP extends JFrame {

	private JPanel contentPane;
	public static JTextField txtfname;
	private JTextField txtlname;
	private JTextField txtsurname;
	private JTextField txtemail;
	private JTextField txtmobile;
	private JTextField txtcity;
	private JTextField txtaddress;
	private JTextField txtnic;
	private JTextField txtgname;
	private JTextField txtgmobile;
	public static JTextField LOL;
	public static JTextField id;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameRegP frame = new FrameRegP();
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
	public FrameRegP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-6,0, 1350, 1200);
		contentPane = new JPanel();
		contentPane.setLocation(-35, -496);
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
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(204, 255, 250, 37);
		contentPane.add(panel_2_1);
		
		//id
		id=new JTextField();
		panel_2_1.add(id);

		
		txtfname = new JTextField();
		txtfname.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtfname.getText().equals("First Name")) {
					txtfname.setText("");
				}
				else {
					txtfname.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtfname.getText().equals("")) {
					txtfname.setText("First Name");
				}
			}
		});
		txtfname.setText("First Name");
		txtfname.setColumns(10);
		txtfname.setBorder(null);
		txtfname.setBackground(Color.WHITE);
		txtfname.setBounds(10, 11, 175, 20);
		panel_2_1.add(txtfname);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1_1.setBackground(Color.WHITE);
		panel_2_1_1.setBounds(204, 318, 250, 37);
		contentPane.add(panel_2_1_1);
		
		txtlname = new JTextField();
		txtlname.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtlname.getText().equals("Last Name")) {
					txtlname.setText("");
				}
				else {
					txtlname.selectAll();
				}
					
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtlname.getText().equals("")) {
					txtlname.setText("Last Name");
				}
			}
		});
		txtlname.setText("Last Name");
		txtlname.setColumns(10);
		txtlname.setBorder(null);
		txtlname.setBackground(Color.WHITE);
		txtlname.setBounds(10, 11, 175, 20);
		panel_2_1_1.add(txtlname);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setLayout(null);
		panel_2_1_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1_2.setBackground(Color.WHITE);
		panel_2_1_2.setBounds(204, 381, 250, 37);
		contentPane.add(panel_2_1_2);
		
		txtsurname = new JTextField();
		txtsurname.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtsurname.getText().equals("Surname")) {
					txtsurname.setText("");
				}
				else {
					txtsurname.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtsurname.getText().equals("")) {
					txtsurname.setText("Surname");
					
				}
			}
		});
		txtsurname.setText("Surname");
		txtsurname.setColumns(10);
		txtsurname.setBorder(null);
		txtsurname.setBackground(Color.WHITE);
		txtsurname.setBounds(10, 11, 175, 20);
		panel_2_1_2.add(txtsurname);
		
		JPanel panel_2_1_3 = new JPanel();
		panel_2_1_3.setLayout(null);
		panel_2_1_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1_3.setBackground(Color.WHITE);
		panel_2_1_3.setBounds(204, 436, 250, 37);
		contentPane.add(panel_2_1_3);
		
		txtemail = new JTextField();
		txtemail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtemail.getText().equals("Email")) {
					txtemail.setText("");
				}
				else {
					txtemail.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtemail.getText().equals("")) {
					txtemail.setText("Email");
				}
			}
		});
		txtemail.setText("Email");
		txtemail.setColumns(10);
		txtemail.setBorder(null);
		txtemail.setBackground(Color.WHITE);
		txtemail.setBounds(10, 11, 175, 20);
		panel_2_1_3.add(txtemail);
		
		JPanel panel_2_1_4 = new JPanel();
		panel_2_1_4.setLayout(null);
		panel_2_1_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1_4.setBackground(Color.WHITE);
		panel_2_1_4.setBounds(204, 496, 250, 37);
		contentPane.add(panel_2_1_4);
		
		txtmobile = new JTextField();
		txtmobile.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtmobile.getText().equals("Mobile")) {
					txtmobile.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtmobile.getText().equals("")) {
					txtmobile.setText("Mobile");
				}
			}
		});
		txtmobile.setText("Mobile");
		txtmobile.setColumns(10);
		txtmobile.setBorder(null);
		txtmobile.setBackground(Color.WHITE);
		txtmobile.setBounds(10, 11, 175, 20);
		panel_2_1_4.add(txtmobile);
		
		JPanel panel_2_1_5 = new JPanel();
		panel_2_1_5.setLayout(null);
		panel_2_1_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1_5.setBackground(Color.WHITE);
		panel_2_1_5.setBounds(513, 255, 250, 37);
		contentPane.add(panel_2_1_5);
		
		txtcity = new JTextField();
		txtcity.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtcity.getText().equals("City")){
					txtcity.setText("");
				}
				else {
					txtcity.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtcity.getText().equals("")) {
					txtcity.setText("City");
				}
			}
		});
		txtcity.setText("City");
		txtcity.setColumns(10);
		txtcity.setBorder(null);
		txtcity.setBackground(Color.WHITE);
		txtcity.setBounds(10, 11, 175, 20);
		panel_2_1_5.add(txtcity);
		
		JPanel panel_2_1_6 = new JPanel();
		panel_2_1_6.setLayout(null);
		panel_2_1_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1_6.setBackground(Color.WHITE);
		panel_2_1_6.setBounds(513, 318, 250, 37);
		contentPane.add(panel_2_1_6);
		
		txtaddress = new JTextField();
		txtaddress.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtaddress.getText().equals("Address")) {
					txtaddress.setText("");
				}
				else {
					txtaddress.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtaddress.getText().equals("")) {
					txtaddress.setText("Address");
				}
			}
		});
		txtaddress.setText("Address");
		txtaddress.setColumns(10);
		txtaddress.setBorder(null);
		txtaddress.setBackground(Color.WHITE);
		txtaddress.setBounds(10, 11, 175, 20);
		panel_2_1_6.add(txtaddress);
		
		JPanel panel_2_1_7 = new JPanel();
		panel_2_1_7.setLayout(null);
		panel_2_1_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1_7.setBackground(Color.WHITE);
		panel_2_1_7.setBounds(513, 381, 250, 37);
		contentPane.add(panel_2_1_7);
		
		txtnic = new JTextField();
		txtnic.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtnic.getText().equals("NIC")) {
					txtnic.setText("");
				}
				else {
					txtnic.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtnic.getText().equals("")) {
					txtnic.setText("NIC");
				}
			}
		});
		txtnic.setText("NIC");
		txtnic.setColumns(10);
		txtnic.setBorder(null);
		txtnic.setBackground(Color.WHITE);
		txtnic.setBounds(10, 11, 175, 20);
		panel_2_1_7.add(txtnic);
		
		JPanel panel_2_1_8 = new JPanel();
		panel_2_1_8.setLayout(null);
		panel_2_1_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1_8.setBackground(Color.WHITE);
		panel_2_1_8.setBounds(513, 436, 250, 37);
		contentPane.add(panel_2_1_8);
		
		txtgname = new JTextField();
		txtgname.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtgname.getText().equals("Guardian Name")) {
					txtgname.setText("");
				}
				else {
					txtgname.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtgname.getText().equals("")) {
					txtgname.setText("Guardian Name");
				}
			}
		});
		txtgname.setText("Guardian Name");
		txtgname.setColumns(10);
		txtgname.setBorder(null);
		txtgname.setBackground(Color.WHITE);
		txtgname.setBounds(10, 11, 175, 20);
		panel_2_1_8.add(txtgname);
		
		JPanel panel_2_1_9 = new JPanel();
		panel_2_1_9.setLayout(null);
		panel_2_1_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1_9.setBackground(Color.WHITE);
		panel_2_1_9.setBounds(513, 496, 250, 37);
		contentPane.add(panel_2_1_9);
		
		txtgmobile = new JTextField();
		txtgmobile.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtgmobile.getText().equals("Guardian Mobile")) {
					txtgmobile.setText("");
				}
				else {
					txtgmobile.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtgmobile.getText().equals("")) {
					txtgmobile.setText("Guardian Mobile");
				}
			}
		});
		txtgmobile.setText("Guardian Mobile");
		txtgmobile.setColumns(10);
		txtgmobile.setBorder(null);
		txtgmobile.setBackground(Color.WHITE);
		txtgmobile.setBounds(10, 11, 175, 20);
		panel_2_1_9.add(txtgmobile);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(25, 25, 112));
		panel_3.setBounds(888, 203, 250, 373);
		contentPane.add(panel_3);
		
		JPanel pnlbtn_1_2 = new JPanel();
		pnlbtn_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameRegister frameRegister=new FrameRegister();
				frameRegister.setVisible(true);
				FrameRegP.this.dispose();
			}
		});
		pnlbtn_1_2.setLayout(null);
		pnlbtn_1_2.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		pnlbtn_1_2.setBackground(new Color(25, 25, 112));
		pnlbtn_1_2.setBounds(0, 206, 250, 50);
		panel_3.add(pnlbtn_1_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Back");
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_1_2.setBounds(98, 11, 152, 28);
		pnlbtn_1_2.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("Hello, Users!");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(10, 44, 230, 66);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter  your  personal  details  and ");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(0, 121, 250, 50);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("let us know more about you!");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(0, 145, 240, 50);
		panel_3.add(lblNewLabel_3_1);
		
		JPanel pnlbtn_1_1 = new JPanel();
		pnlbtn_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					
					//String x=fr.txtId.getText();
					//Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
					Statement st=con.createStatement();
					//System.out.println("Inserting records");
					//UPDATE test.link SET Tname = 'Hasnian' WHERE (`Tid` = '1');
					String sql="update lms.student set stdfirstname='"+txtfname.getText()+"',stdlastname='"+txtlname.getText()+"',"
					+"stdsurname='"+txtsurname.getText()+"',stdemail='"+txtemail.getText()+"',stdmobile='"+txtmobile.getText()+"',"
					+ "stdcity='"+txtcity.getText()+"',stdaddress='"+txtaddress.getText()+"',stdnic='"+txtnic.getText()+"',"
					+ "guardianname='"+txtgname.getText()+"',guardiannum='"+txtgmobile.getText()+"'  where logid='"+LOL.getText()+"'";
					
//					
//							private JTextField txtemail;
//							private JTextField txtmobile;
//							private JTextField txtcity;
//							private JTextField txtaddress;
//							private JTextField txtnic;
//							private JTextField txtgname;
//							private JTextField txtgmobile;
							//,stdemail,"
							//+ "stdmobile,stdcity,stdaddress,stdnic,guardianname,guardiannum)" 
							//+ "values('"+txtfname.getText()+"','"+txtlname.getText()+"','"+txtsurname.getText()+"','"
							//+txtemail.getText()+"','"+txtmobile.getText() +"','"+txtcity.getText()+"','"+txtaddress.getText()
							//+"','"+txtnic.getText()+"','"+txtgname.getText()+"','"+txtgmobile.getText()+"') where logid=023-20-0174";
					//String st1="use test select * from link";
					st.executeUpdate(sql);
					//st.executeUpdate(st1);
					JOptionPane.showMessageDialog(null,"SIGN UP SUCCESSFUL");
					FrameStd f=new FrameStd();
					f.setVisible(true);
					f.lblid.setText(LOL.getText());
					FrameRegP.this.dispose();
				} catch (SQLException g) {
					
					// TODO Auto-generated catch block
					g.printStackTrace();
				}
				
			}
		});
		pnlbtn_1_1.setBorder(new LineBorder(Color.WHITE, 2));
		pnlbtn_1_1.setBounds(0, 279, 250, 50);
		panel_3.add(pnlbtn_1_1);
		pnlbtn_1_1.setLayout(null);
		pnlbtn_1_1.setBackground(new Color(25, 25, 112));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Sign up");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(95, 11, 152, 28);
		pnlbtn_1_1.add(lblNewLabel_2_1_1);
		
		LOL = new JTextField();
		LOL.setBounds(310, 615, 96, 20);
		contentPane.add(LOL);
		LOL.setColumns(10);
		
		textField = new JTextField();
		textField.setText("User Id :");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(204, 615, 96, 20);
		contentPane.add(textField);
		
		
		
		
		
	}
}
