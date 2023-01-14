package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Addhd extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField Textmkp;
	private JTextField Texttpk;
	private JTextField Textmhd;
	private JTextField Textsn;
	private JTextField Textmn;
	private JTextField Textht;
	private JTextField Textt;
	private JTextField Textns;
	private JTextField Textnn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addhd frame = new Addhd();
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
	public Addhd() {
		setTitle("Thêm thông tin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(29, 20, 400, 490);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblMKhuPh = new JLabel("Mã khu phố");
		lblMKhuPh.setBounds(40, 24, 100, 15);
		panel.add(lblMKhuPh);
		
		Textmkp = new JTextField();
		Textmkp.setBounds(140, 23, 230, 19);
		panel.add(Textmkp);
		Textmkp.setColumns(10);
		
		JLabel lblTnKhuPh = new JLabel("Tên khu phố");
		lblTnKhuPh.setBounds(40, 65, 100, 15);
		panel.add(lblTnKhuPh);
		
		Texttpk = new JTextField();
		Texttpk.setBounds(140, 62, 230, 19);
		panel.add(Texttpk);
		Texttpk.setColumns(10);
		
		JPanel hd = new JPanel();
		hd.setBackground(Color.GREEN);
		hd.setBounds(10, 90, 378, 353);
		panel.add(hd);
		hd.setLayout(null);
		
		JLabel lblMHDn = new JLabel("Mã hộ dân ");
		lblMHDn.setBounds(30, 12, 100, 15);
		hd.add(lblMHDn);
		
		JLabel lblSNh = new JLabel("Số nhà");
		lblSNh.setBounds(30, 39, 70, 15);
		hd.add(lblSNh);
		
		Textmhd = new JTextField();
		Textmhd.setBounds(130, 10, 230, 19);
		hd.add(Textmhd);
		Textmhd.setColumns(10);
		
		Textsn = new JTextField();
		Textsn.setBounds(130, 39, 230, 19);
		hd.add(Textsn);
		Textsn.setColumns(10);
		
		JButton btnTipTcNhp_1 = new JButton("Tiếp tục nhập hộ dân ");
		btnTipTcNhp_1.setBackground(Color.YELLOW);
		btnTipTcNhp_1.setBounds(105, 313, 243, 25);
		hd.add(btnTipTcNhp_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 81, 346, 220);
		hd.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblMNgi = new JLabel("Mã người");
		lblMNgi.setBounds(10, 10, 70, 15);
		panel_1.add(lblMNgi);
		
		Textmn = new JTextField();
		Textmn.setBounds(110, 8, 230, 19);
		panel_1.add(Textmn);
		Textmn.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Họ và tên");
		lblNewLabel.setBounds(10, 40, 70, 15);
		panel_1.add(lblNewLabel);
		
		Textht = new JTextField();
		Textht.setBounds(110, 40, 230, 19);
		panel_1.add(Textht);
		Textht.setColumns(10);
		
		JLabel lblTui = new JLabel("Tuổi ");
		lblTui.setBounds(10, 75, 70, 15);
		panel_1.add(lblTui);
		
		Textt = new JTextField();
		Textt.setBounds(110, 72, 230, 19);
		panel_1.add(Textt);
		Textt.setColumns(10);
		
		JLabel lblNmSinh = new JLabel("Năm sinh ");
		lblNmSinh.setBounds(10, 108, 70, 15);
		panel_1.add(lblNmSinh);
		
		Textns = new JTextField();
		Textns.setBounds(110, 104, 230, 19);
		panel_1.add(Textns);
		Textns.setColumns(10);
		
		JLabel lblNghNghip = new JLabel("Nghề nghiệp");
		lblNghNghip.setBounds(10, 136, 100, 15);
		panel_1.add(lblNghNghip);
		
		Textnn = new JTextField();
		Textnn.setBounds(110, 136, 230, 19);
		panel_1.add(Textnn);
		Textnn.setColumns(10);
		
		JButton btnTipTcNhp = new JButton("Tiếp tục nhập thành viên ");
		btnTipTcNhp.setBackground(Color.YELLOW);
		btnTipTcNhp.setBounds(87, 177, 240, 25);
		panel_1.add(btnTipTcNhp);
		
		JButton btnHonThnhNhp = new JButton("Hoàn thành nhập khu phố");
		btnHonThnhNhp.setBounds(10, 452, 251, 25);
		panel.add(btnHonThnhNhp);
		btnHonThnhNhp.setActionCommand("HT");
		btnHonThnhNhp.addActionListener(this); 
		
		
		JButton btnThot = new JButton("Thoát");
		btnThot.setBounds(271, 452, 117, 25);
		panel.add(btnThot);
		btnThot.setActionCommand("Thoat");
		btnThot.addActionListener(this);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(456, 40, 421, 470);
		contentPane.add(scrollPane);
		
		String column[]= {"TenKhuPho","MaKhuPho"};
		JTable b=new JTable();
		scrollPane.add(b);
		
		
		JLabel lblThngTinVa = new JLabel("Thông tin vừa nhập");
		lblThngTinVa.setBounds(459, 20, 200, 15);
		contentPane.add(lblThngTinVa);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if("HT".equals(arg0.getActionCommand())) {
			
		}
		if("Thoat".equals(arg0.getActionCommand())){
			
		}
		
	}
}
