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
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;


public class FrameStd extends JFrame {

	private JPanel contentPane;
	public static JLabel lblid;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameStd frame = new FrameStd();
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
	public FrameStd(){
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
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setForeground(Color.BLACK);
		lblHome.setFont(new Font("Arial", Font.BOLD, 19));
		lblHome.setBounds(122, 25, 152, 28);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(25, 25, 112));
		panel_3.setBounds(0, 209, 329, 447);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel btnHome = new JPanel();
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnHome.setBackground(new Color(25, 25, 112));
				lblHome.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnHome.setBackground(Color.white);
				lblHome.setForeground(Color.black);
			}
		});
		btnHome.setBorder(new LineBorder(new Color(25, 25, 112), 2));
		btnHome.setBounds(0, 0, 329, 76);
		panel_3.add(btnHome);
		btnHome.setLayout(null);
		btnHome.setBackground(Color.WHITE);
		
		
		btnHome.add(lblHome);
		
		
		JLabel lblEc = new JLabel("Enrol course");
		lblEc.setForeground(Color.WHITE);
		lblEc.setFont(new Font("Arial", Font.BOLD, 19));
		lblEc.setBounds(90, 25, 179, 28);
		
		
		JPanel btnEc = new JPanel();
		btnEc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameSenroll f=new FrameSenroll();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameStd.this.dispose();
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
		btnEc.add(lblEc);
		
		JPanel btnAquiz = new JPanel();
		btnAquiz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameAquiz f=new FrameAquiz();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameStd.this.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAquiz.setBackground(new Color(0,0,139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAquiz.setBackground(new Color(25,25,112));
			}
		});
		btnAquiz.setLayout(null);
		btnAquiz.setBorder(new LineBorder(Color.WHITE));
		btnAquiz.setBackground(new Color(25, 25, 112));
		btnAquiz.setBounds(0, 151, 329, 76);
		panel_3.add(btnAquiz);
		
		JLabel lblAquiz = new JLabel("Attempt Quiz");
		lblAquiz.setForeground(Color.WHITE);
		lblAquiz.setFont(new Font("Arial", Font.BOLD, 19));
		lblAquiz.setBounds(92, 24, 178, 28);
		btnAquiz.add(lblAquiz);
		
		JPanel btnAi = new JPanel();
		btnAi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameQueries f=new FrameQueries();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameStd.this.dispose();
				
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
		
		JPanel btnProfile = new JPanel();
		btnProfile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnProfile.setBackground(new Color(0,0,139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnProfile.setBackground(new Color(25,25,112));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameEcheck f =new FrameEcheck();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameStd.this.dispose();
			}
		});
		btnProfile.setLayout(null);
		btnProfile.setBorder(new LineBorder(Color.WHITE));
		btnProfile.setBackground(new Color(25, 25, 112));
		btnProfile.setBounds(0, 301, 329, 76);
		panel_3.add(btnProfile);
		
		JLabel lblProfile = new JLabel("Enrolled Course");
		lblProfile.setForeground(Color.WHITE);
		lblProfile.setFont(new Font("Arial", Font.BOLD, 19));
		lblProfile.setBounds(79, 22, 152, 28);
		btnProfile.add(lblProfile);
		

		JLabel lblNewLabel_2_1_5 = new JLabel("Sign out");
		lblNewLabel_2_1_5.setForeground(Color.WHITE);
		lblNewLabel_2_1_5.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5.setBounds(110, 22, 152, 28);
		
		JPanel btnsignout = new JPanel();
		btnsignout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure want to logout?")==0) {
					FrameLOG framelogin=new FrameLOG();
					framelogin.setVisible(true);
					FrameStd.this.dispose();
					}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnsignout.setBackground(new Color(0,0,139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnsignout.setBackground(new Color(25,25,112));
			}
		});
		btnsignout.setLayout(null);
		btnsignout.setBorder(new LineBorder(Color.WHITE));
		btnsignout.setBackground(new Color(25, 25, 112));
		btnsignout.setBounds(0, 371, 329, 76);
		panel_3.add(btnsignout);
		btnsignout.add(lblNewLabel_2_1_5);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(25, 25, 112)));
		panel.setBounds(335, 209, 938, 430);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Important announcments");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 22));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(138, 11, 578, 79);
		panel.add(lblNewLabel_2);
		
		JPanel pnlbtn_1_6 = new JPanel();
		pnlbtn_1_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				byte b[]=new byte[3000];
				Socket sr;
				try {
					sr = new Socket("localhost",4556);
					InputStream fr=sr.getInputStream();
					FileOutputStream fo=new FileOutputStream("C:\\Users\\mhdha\\OneDrive\\Desktop\\Acedamic timetable.txt");
					fr.read(b,0,b.length);
					fo.write(b,0,b.length);
					JOptionPane.showMessageDialog(null,"File Dowloaded");
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null,"unable to download");
				}
				
			}
		});
		pnlbtn_1_6.setLayout(null);
		pnlbtn_1_6.setBorder(new LineBorder(Color.WHITE));
		pnlbtn_1_6.setBackground(new Color(25, 25, 112));
		pnlbtn_1_6.setBounds(27, 182, 227, 56);
		panel.add(pnlbtn_1_6);
		
		JLabel lblNewLabel_2_1_5_5_1 = new JLabel("Download");
		lblNewLabel_2_1_5_5_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_5_1.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_5_1.setBounds(54, 14, 152, 28);
		pnlbtn_1_6.add(lblNewLabel_2_1_5_5_1);
		
		JPanel pnlbtn_1_6_1 = new JPanel();
		pnlbtn_1_6_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				byte b[]=new byte[3000];
				Socket sr;
				try {
					sr = new Socket("localhost",4554);
					InputStream fr=sr.getInputStream();
					FileOutputStream fo=new FileOutputStream("C:\\Users\\mhdha\\OneDrive\\Desktop\\ESP list.txt");
					fr.read(b,0,b.length);
					fo.write(b,0,b.length);
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		pnlbtn_1_6_1.setLayout(null);
		pnlbtn_1_6_1.setBorder(new LineBorder(Color.WHITE));
		pnlbtn_1_6_1.setBackground(new Color(25, 25, 112));
		pnlbtn_1_6_1.setBounds(27, 363, 227, 56);
		panel.add(pnlbtn_1_6_1);
		
		JLabel lblNewLabel_2_1_5_5_1_1 = new JLabel("Download");
		lblNewLabel_2_1_5_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_5_1_1.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_5_1_1.setBounds(54, 14, 152, 28);
		pnlbtn_1_6_1.add(lblNewLabel_2_1_5_5_1_1);
		
		JPanel pnlbtn_1_6_2 = new JPanel();
		pnlbtn_1_6_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				byte b[]=new byte[3000];
				Socket sr;
				try {
					sr = new Socket("localhost",4552);
					InputStream fr=sr.getInputStream();
					FileOutputStream fo=new FileOutputStream("C:\\Users\\mhdha\\OneDrive\\Desktop\\Grading policy.txt");
					fr.read(b,0,b.length);
					fo.write(b,0,b.length);
					JOptionPane.showMessageDialog(null,"File Downloaded");
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null,"unable to download");
				}
				
				
				
			}
		});
		pnlbtn_1_6_2.setLayout(null);
		pnlbtn_1_6_2.setBorder(new LineBorder(Color.WHITE));
		pnlbtn_1_6_2.setBackground(new Color(25, 25, 112));
		pnlbtn_1_6_2.setBounds(346, 182, 227, 56);
		panel.add(pnlbtn_1_6_2);
		
		JLabel lblNewLabel_2_1_5_5_1_2 = new JLabel("Download");
		lblNewLabel_2_1_5_5_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_5_1_2.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_5_1_2.setBounds(54, 14, 152, 28);
		pnlbtn_1_6_2.add(lblNewLabel_2_1_5_5_1_2);
		
		JPanel pnlbtn_1_6_3 = new JPanel();
		pnlbtn_1_6_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				byte b[]=new byte[3000];
				Socket sr;
				try {
					sr = new Socket("localhost",4555);
					InputStream fr=sr.getInputStream();
					FileOutputStream fo=new FileOutputStream("C:\\Users\\mhdha\\OneDrive\\Desktop\\Fee cLearnce form.txt");
					fr.read(b,0,b.length);
					fo.write(b,0,b.length);
					JOptionPane.showMessageDialog(null,"File Downloaded");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null,"unable to download");
				}
				
			}
		});
		pnlbtn_1_6_3.setLayout(null);
		pnlbtn_1_6_3.setBorder(new LineBorder(Color.WHITE));
		pnlbtn_1_6_3.setBackground(new Color(25, 25, 112));
		pnlbtn_1_6_3.setBounds(346, 363, 227, 56);
		panel.add(pnlbtn_1_6_3);
		
		JLabel lblNewLabel_2_1_5_5_1_3 = new JLabel("Download");
		lblNewLabel_2_1_5_5_1_3.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_5_1_3.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_5_1_3.setBounds(54, 14, 152, 28);
		pnlbtn_1_6_3.add(lblNewLabel_2_1_5_5_1_3);
		
		JPanel pnlbtn_1_6_4 = new JPanel();
		pnlbtn_1_6_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				byte b[]=new byte[3000];
				Socket sr;
				try {
					sr = new Socket("localhost",4553);
					InputStream fr=sr.getInputStream();
					FileOutputStream fo=new FileOutputStream("C:\\Users\\mhdha\\OneDrive\\Desktop\\Acedamic calendar.txt");
					fr.read(b,0,b.length);
					fo.write(b,0,b.length);
					JOptionPane.showMessageDialog(null,"File Downloaded");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null,"unable to download");
				}
				
				
				
			}
		});
		pnlbtn_1_6_4.setLayout(null);
		pnlbtn_1_6_4.setBorder(new LineBorder(Color.WHITE));
		pnlbtn_1_6_4.setBackground(new Color(25, 25, 112));
		pnlbtn_1_6_4.setBounds(659, 182, 227, 56);
		panel.add(pnlbtn_1_6_4);
		
		JLabel lblNewLabel_2_1_5_5_1_4 = new JLabel("Download");
		lblNewLabel_2_1_5_5_1_4.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_5_1_4.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_5_1_4.setBounds(54, 14, 152, 28);
		pnlbtn_1_6_4.add(lblNewLabel_2_1_5_5_1_4);
		
		JPanel pnlbtn_1_6_5 = new JPanel();
		pnlbtn_1_6_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				byte b[]=new byte[3000];
				Socket sr;
				try {
					sr = new Socket("localhost",4557);
					InputStream fr=sr.getInputStream();
					FileOutputStream fo=new FileOutputStream("C:\\Users\\mhdha\\OneDrive\\Desktop\\Exam timetable.txt");
					fr.read(b,0,b.length);
					fo.write(b,0,b.length);
					JOptionPane.showMessageDialog(null,"File Downloaded");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null,"unable to download");
				}
				
			}
		});
		pnlbtn_1_6_5.setLayout(null);
		pnlbtn_1_6_5.setBorder(new LineBorder(Color.WHITE));
		pnlbtn_1_6_5.setBackground(new Color(25, 25, 112));
		pnlbtn_1_6_5.setBounds(659, 363, 227, 56);
		panel.add(pnlbtn_1_6_5);
		
		JLabel lblNewLabel_2_1_5_5_1_5 = new JLabel("Download");
		lblNewLabel_2_1_5_5_1_5.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_5_1_5.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_5_1_5.setBounds(54, 14, 152, 28);
		pnlbtn_1_6_5.add(lblNewLabel_2_1_5_5_1_5);
		
		JLabel lblNewLabel_3 = new JLabel("Acedamic Time Table");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(27, 93, 227, 78);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Grading Policy");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(346, 93, 227, 78);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Acedamic Calendar");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_2.setBounds(659, 93, 227, 78);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("ESP List");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_3.setBounds(27, 274, 227, 78);
		panel.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Fee Clearence form");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_4.setBounds(346, 274, 227, 78);
		panel.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Exam Time Table");
		lblNewLabel_3_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_5.setBounds(659, 274, 227, 78);
		panel.add(lblNewLabel_3_5);
		
		lblid = new JLabel("");
		lblid.setBounds(149, 174, 260, 24);
		contentPane.add(lblid);
		
		JLabel lblid_1 = new JLabel("User ID:");
		lblid_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblid_1.setBounds(52, 174, 87, 24);
		contentPane.add(lblid_1);
		
		
		
		
		
		
		
	}
}
