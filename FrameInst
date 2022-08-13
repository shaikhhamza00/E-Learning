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

public class FrameInst extends JFrame {

	private JPanel contentPane;
	public static JLabel lblid;
	static String a=null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameInst frame = new FrameInst();
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
	public FrameInst() {
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
		
		JLabel lblNewLabel_2_1_5_5 = new JLabel("Home");
		lblNewLabel_2_1_5_5.setForeground(Color.BLACK);
		lblNewLabel_2_1_5_5.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_5.setBounds(122, 25, 152, 28);
		
		
		JPanel pnlbtn_1 = new JPanel();
		pnlbtn_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlbtn_1.setBackground(new Color(0,0,139));
				lblNewLabel_2_1_5_5.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlbtn_1.setBackground(Color.WHITE);
				lblNewLabel_2_1_5_5.setForeground(Color.black);
			}
		});
		pnlbtn_1.setBorder(new LineBorder(new Color(0, 0, 139), 2));
		pnlbtn_1.setBounds(0, 0, 329, 76);
		panel_3.add(pnlbtn_1);
		pnlbtn_1.setLayout(null);
		pnlbtn_1.setBackground(Color.WHITE);
		pnlbtn_1.add(lblNewLabel_2_1_5_5);
		
		JPanel pnlbtn_1_1 = new JPanel();
		pnlbtn_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameCC f=new FrameCC();
				f.setVisible(true);
				f.lblid.setText(lblid.getText());
				FrameInst.this.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlbtn_1_1.setBackground(new Color(0,0,139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlbtn_1_1.setBackground(new Color(25,25,112));
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
				FrameInst.this.dispose();
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
				FrameInst.this.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlbtn_1_3.setBackground(new Color(0,0,139));
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
				FrameInst.this.dispose();
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
		lblNewLabel_2_1_5_1.setBounds(77, 22, 152, 28);
		pnlbtn_1_4.add(lblNewLabel_2_1_5_1);
		
		JPanel pnlbtn_1_5 = new JPanel();
		pnlbtn_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure want to logout?")==0) {
					FrameLOG framelogin=new FrameLOG();
					framelogin.setVisible(true);
					FrameInst.this.dispose();
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
		
		JPanel download1 = new JPanel();
		download1.addMouseListener(new MouseAdapter() {
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
		download1.setLayout(null);
		download1.setBorder(new LineBorder(Color.WHITE));
		download1.setBackground(new Color(25, 25, 112));
		download1.setBounds(10, 182, 227, 56);
		panel.add(download1);
		
		JLabel lblNewLabel_2_1_5_5_1 = new JLabel("Download");
		lblNewLabel_2_1_5_5_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_5_1.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_5_1.setBounds(54, 14, 152, 28);
		download1.add(lblNewLabel_2_1_5_5_1);
		
		JPanel download4 = new JPanel();
		download4.addMouseListener(new MouseAdapter() {
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
		download4.setLayout(null);
		download4.setBorder(new LineBorder(Color.WHITE));
		download4.setBackground(new Color(25, 25, 112));
		download4.setBounds(10, 363, 227, 56);
		panel.add(download4);
		
		JLabel lblNewLabel_2_1_5_5_1_1 = new JLabel("Download");
		lblNewLabel_2_1_5_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_5_1_1.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_5_1_1.setBounds(54, 14, 152, 28);
		download4.add(lblNewLabel_2_1_5_5_1_1);
		
		JPanel download5 = new JPanel();
		download5.addMouseListener(new MouseAdapter() {
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
		download5.setLayout(null);
		download5.setBorder(new LineBorder(Color.WHITE));
		download5.setBackground(new Color(25, 25, 112));
		download5.setBounds(329, 363, 227, 56);
		panel.add(download5);
		
		JLabel lblNewLabel_2_1_5_5_1_3 = new JLabel("Download");
		lblNewLabel_2_1_5_5_1_3.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_5_1_3.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_5_1_3.setBounds(54, 14, 152, 28);
		download5.add(lblNewLabel_2_1_5_5_1_3);
		
		JPanel download2 = new JPanel();
		download2.addMouseListener(new MouseAdapter() {
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
		download2.setLayout(null);
		download2.setBorder(new LineBorder(Color.WHITE));
		download2.setBackground(new Color(25, 25, 112));
		download2.setBounds(329, 182, 227, 56);
		panel.add(download2);
		
		JLabel lblNewLabel_2_1_5_5_1_2 = new JLabel("Download");
		lblNewLabel_2_1_5_5_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_5_1_2.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_5_1_2.setBounds(54, 14, 152, 28);
		download2.add(lblNewLabel_2_1_5_5_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("Acedamic Time Table");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 93, 227, 78);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("ESP List");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_3.setBounds(10, 274, 227, 78);
		panel.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Fee Clearence form");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_4.setBounds(329, 274, 227, 78);
		panel.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("Grading Policy");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(329, 93, 227, 78);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2 = new JLabel("Important announcments");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 22));
		lblNewLabel_2.setBounds(121, 11, 578, 79);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Acedamic Calendar");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_2.setBounds(642, 93, 227, 78);
		panel.add(lblNewLabel_3_2);
		
		JPanel download3 = new JPanel();
		download3.addMouseListener(new MouseAdapter() {
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
		download3.setLayout(null);
		download3.setBorder(new LineBorder(Color.WHITE));
		download3.setBackground(new Color(25, 25, 112));
		download3.setBounds(642, 182, 227, 56);
		panel.add(download3);
		
		JLabel lblNewLabel_2_1_5_5_1_4 = new JLabel("Download");
		lblNewLabel_2_1_5_5_1_4.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_5_1_4.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_5_1_4.setBounds(54, 14, 152, 28);
		download3.add(lblNewLabel_2_1_5_5_1_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Exam Time Table");
		lblNewLabel_3_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_5.setBounds(642, 274, 227, 78);
		panel.add(lblNewLabel_3_5);
		
		JPanel download6 = new JPanel();
		download6.addMouseListener(new MouseAdapter() {
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
		download6.setLayout(null);
		download6.setBorder(new LineBorder(Color.WHITE));
		download6.setBackground(new Color(25, 25, 112));
		download6.setBounds(642, 363, 227, 56);
		panel.add(download6);
		
		JLabel lblNewLabel_2_1_5_5_1_5 = new JLabel("Download");
		lblNewLabel_2_1_5_5_1_5.setForeground(Color.WHITE);
		lblNewLabel_2_1_5_5_1_5.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_2_1_5_5_1_5.setBounds(54, 14, 152, 28);
		download6.add(lblNewLabel_2_1_5_5_1_5);
		
		JLabel lblid_1 = new JLabel("User ID:");
		lblid_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblid_1.setBounds(42, 178, 87, 24);
		contentPane.add(lblid_1);
		
		lblid = new JLabel();
		lblid.setBounds(139, 178, 264, 24);
		contentPane.add(lblid);
		
		
		
		
		
		
		
	}
}
