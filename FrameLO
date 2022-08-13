import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class FrameLO extends JFrame {

	private JPanel contentPane;
	static String a=null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLO frame = new FrameLO();
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
	public FrameLO() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(430, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		
		JLabel lblNewLabel = new JLabel("SIGN UP AS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(133, 38, 166, 38);
		contentPane.add(lblNewLabel);
		
		JPanel pnlbtn_1 = new JPanel();
		pnlbtn_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameRegister f=new FrameRegister();
				f.setVisible(true);
				FrameLO.this.dispose();
				FrameLogin fl=new FrameLogin();
				fl.dispose();
				a="1";
				f.lblNewLabel_4.setText(a);
			}
		});
		pnlbtn_1.setLayout(null);
		pnlbtn_1.setBackground(new Color(25, 25, 112));
		pnlbtn_1.setBounds(89, 114, 250, 50);
		contentPane.add(pnlbtn_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("INSTRUCTOR");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(88, 11, 152, 28);
		pnlbtn_1.add(lblNewLabel_2_1);
		
		JPanel pnlbtn_1_1 = new JPanel();
		pnlbtn_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameRegister f=new FrameRegister();
				f.setVisible(true);
				FrameLO.this.dispose();
				FrameLogin fl=new FrameLogin();
				fl.dispose();
				a="0";
				f.lblNewLabel_4.setText(a);
			}
		});
		pnlbtn_1_1.setLayout(null);
		pnlbtn_1_1.setBackground(new Color(25, 25, 112));
		pnlbtn_1_1.setBounds(89, 195, 250, 50);
		contentPane.add(pnlbtn_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("STUDENT");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(88, 11, 152, 28);
		pnlbtn_1_1.add(lblNewLabel_2_1_1);
		
		JPanel pnlbtn_1_1_1 = new JPanel();
		pnlbtn_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameLOG fr=new FrameLOG();
				fr.setVisible(true);
				FrameLO.this.dispose();
			}
		});
		pnlbtn_1_1_1.setLayout(null);
		pnlbtn_1_1_1.setBackground(new Color(25, 25, 112));
		pnlbtn_1_1_1.setBounds(133, 261, 175, 28);
		contentPane.add(pnlbtn_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("BACK");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_1_1_1.setBounds(63, 0, 152, 28);
		pnlbtn_1_1_1.add(lblNewLabel_2_1_1_1);
	}
}
