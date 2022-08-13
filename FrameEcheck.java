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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTable;


public class FrameEcheck extends JFrame {

	private JPanel contentPane;
	public static JLabel lblid;
	private JLabel lblsign;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameEcheck frame = new FrameEcheck();
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
	public FrameEcheck(){
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
				FrameEcheck.this.dispose();
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
				FrameEcheck.this.dispose();
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
		lblAq.setForeground(Color.WHITE);
		lblAq.setFont(new Font("Arial", Font.BOLD, 19));
		lblAq.setBounds(92, 24, 178, 28);
		
		JPanel btnAq = new JPanel();
		btnAq.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAq.setBackground(new Color(0,0,139));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAq.setBackground(new Color(25,25,112));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameAquiz f=new FrameAquiz();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameEcheck.this.dispose();
			}
		});
		btnAq.setLayout(null);
		btnAq.setBorder(new LineBorder(new Color(25, 25, 112), 2));
		btnAq.setBackground(new Color(25, 25, 112));
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
				FrameEcheck.this.dispose();
				
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
		
		

		JLabel lblprofile = new JLabel("Enrolled Course");
		lblprofile.setForeground(Color.BLACK);
		lblprofile.setFont(new Font("Arial", Font.BOLD, 19));
		lblprofile.setBounds(77, 22, 152, 28);
		
		
		JPanel btnprofile = new JPanel();
		btnprofile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnprofile.setBackground(new Color(0,0,139));
				lblprofile.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnprofile.setBackground(Color.white);
				lblprofile.setForeground(Color.black);
			}
		});
		btnprofile.setLayout(null);
		btnprofile.setBorder(new LineBorder(new Color(25, 25, 112), 2));
		btnprofile.setBackground(Color.WHITE);
		btnprofile.setBounds(0, 301, 329, 76);
		panel_3.add(btnprofile);
		btnprofile.add(lblprofile);
		
		JPanel btnsign = new JPanel();
		btnsign.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure want to logout?")==0) {
					FrameLOG framelogin=new FrameLOG();
					framelogin.setVisible(true);
					FrameEcheck.this.dispose();
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
		panel.setBounds(339, 209, 938, 440);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel download6 = new JPanel();
		download6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				table.setModel(new DefaultTableModel());
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
					Statement st=con.createStatement();
					String query="select s.course_id,c.course_title,c.credit,c.pre_req from std_enrol s join course c on s.course_id=c.course_id and s.logid='"+lblid.getText()+"'";
					
					ResultSet rs=st.executeQuery(query);
					ResultSetMetaData rsmd=rs.getMetaData();
					DefaultTableModel model=(DefaultTableModel)table.getModel();
					
					int cols=rsmd.getColumnCount();
					String[] colname=new String[cols];
					for(int i=0;i<cols;i++) {
						colname[i]=rsmd.getColumnName(i+1);
						model.setColumnIdentifiers(colname);
					}
					String id_course,course_title,credit,prereq;
					while(rs.next()) {
						id_course=rs.getString(1);
						course_title=rs.getString(2);
						credit=rs.getString(3);
						prereq=rs.getString(4);
						String[] row= {id_course,course_title,credit,prereq};
						model.addRow(row);
						
					}
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		download6.setLayout(null);
		download6.setBorder(new LineBorder(Color.WHITE));
		download6.setBackground(new Color(25, 25, 112));
		download6.setBounds(179, 23, 227, 56);
		panel.add(download6);
		
		JLabel lblNewLabel_2_1_5_5_1_5 = new JLabel("Check Enrolled");
		lblNewLabel_2_1_5_5_1_5.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_5_1_5.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_5_1_5.setBounds(43, 11, 152, 28);
		download6.add(lblNewLabel_2_1_5_5_1_5);
		
		JPanel download6_1 = new JPanel();
		download6_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameSenroll f=new FrameSenroll();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameEcheck.this.dispose();
			}
		});
		download6_1.setLayout(null);
		download6_1.setBorder(new LineBorder(Color.WHITE));
		download6_1.setBackground(new Color(25, 25, 112));
		download6_1.setBounds(462, 23, 227, 56);
		panel.add(download6_1);
		
		JLabel lblNewLabel_2_1_5_5_1_5_1 = new JLabel("Enroll course");
		lblNewLabel_2_1_5_5_1_5_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_5_1_5_1.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_5_1_5_1.setBounds(54, 14, 152, 28);
		download6_1.add(lblNewLabel_2_1_5_5_1_5_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 112, 935, 338);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		lblid = new JLabel("");
		lblid.setBounds(149, 174, 260, 24);
		contentPane.add(lblid);
		
		JLabel lblid_1 = new JLabel("User ID:");
		lblid_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblid_1.setBounds(52, 174, 87, 24);
		contentPane.add(lblid_1);
		
		
		
		
		
		
		
	}
}
