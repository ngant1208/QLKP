package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class Edit extends JFrame {

	private JPanel contentPane;
	private JTextField MKP;
	private JTextField TKP;
	private JTextField txMhd;
	private JTextField txSn;
	private JTextField txMn;
	private JTextField txht;
	private JTextField txTuoi;
	private JTextField txNs;
	private JTextField txnn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit frame = new Edit();
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
	public Edit() {
		setTitle("SỬA THÔNG TIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMKhuPh = new JLabel("Mã khu phố");
		lblMKhuPh.setBounds(40, 50, 90, 15);
		contentPane.add(lblMKhuPh);
		
		MKP = new JTextField();
		MKP.setText("");
		MKP.setBounds(140, 48, 254, 19);
		contentPane.add(MKP);
		MKP.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Tên khu phố ");
		lblNewLabel.setBounds(40, 75, 100, 15);
		contentPane.add(lblNewLabel);
		
		TKP = new JTextField();
		TKP.setBounds(140, 73, 254, 19);
		contentPane.add(TKP);
		TKP.setColumns(10);
		
		JPanel MS = new JPanel();
		MS.setBackground(Color.PINK);
		MS.setBounds(43, 114, 375, 227);
		contentPane.add(MS);
		MS.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Mã hộ dân");
		lblNewLabel_1.setBounds(5, 25, 100, 15);
		MS.add(lblNewLabel_1);
		
		txMhd = new JTextField();
		txMhd.setBounds(100, 23, 254, 19);
		MS.add(txMhd);
		txMhd.setColumns(10);
		
		JLabel lblSNh = new JLabel("Số nhà ");
		lblSNh.setBounds(5, 52, 70, 15);
		MS.add(lblSNh);
		
		txSn = new JTextField();
		txSn.setBounds(100, 54, 254, 82);
		MS.add(txSn);
		txSn.setColumns(10);
		
		JButton btnLu = new JButton("Lưu");
		btnLu.setBounds(264, 148, 70, 25);
		MS.add(btnLu);
		
		JButton btnHDnTrc = new JButton("hộ dân trước ");
		btnHDnTrc.setBounds(25, 190, 127, 25);
		MS.add(btnHDnTrc);
		
		JButton btnHDnSau = new JButton("Hộ dân sau");
		btnHDnSau.setBounds(217, 190, 117, 25);
		MS.add(btnHDnSau);
		
		JPanel cs = new JPanel();
		cs.setBackground(Color.CYAN);
		cs.setBounds(458, 50, 400, 291);
		contentPane.add(cs);
		cs.setLayout(null);
		
		JLabel lblMNgi = new JLabel("Mã người ");
		lblMNgi.setBounds(57, 40, 70, 15);
		cs.add(lblMNgi);
		
		JLabel lblHTn = new JLabel("Họ tên ");
		lblHTn.setBounds(57, 70, 70, 15);
		cs.add(lblHTn);
		
		JLabel lblTui = new JLabel("Tuổi ");
		lblTui.setBounds(57, 100, 70, 15);
		cs.add(lblTui);
		
		JLabel lblNmSinh = new JLabel("Năm sinh");
		lblNmSinh.setBounds(57, 130, 70, 15);
		cs.add(lblNmSinh);
		
		JLabel lblNghNghip = new JLabel("Nghề nghiệp");
		lblNghNghip.setBounds(57, 160, 100, 15);
		cs.add(lblNghNghip);
		
		txMn = new JTextField();
		txMn.setBounds(191, 40, 161, 19);
		cs.add(txMn);
		txMn.setColumns(10);
		
		txht = new JTextField();
		txht.setBounds(191, 70, 161, 19);
		cs.add(txht);
		txht.setColumns(10);
		
		txTuoi = new JTextField();
		txTuoi.setBounds(191, 100, 161, 19);
		cs.add(txTuoi);
		txTuoi.setColumns(10);
		
		txNs = new JTextField();
		txNs.setBounds(191, 130, 161, 19);
		cs.add(txNs);
		txNs.setColumns(10);
		
		txnn = new JTextField();
		txnn.setBounds(191, 160, 161, 19);
		cs.add(txnn);
		txnn.setColumns(10);
		
		JButton btnLu_1 = new JButton("Lưu");
		btnLu_1.setBounds(301, 191, 60, 25);
		cs.add(btnLu_1);
		
		JButton btnThnhVinTrc = new JButton("Thành viên trước");
		btnThnhVinTrc.setBounds(23, 225, 151, 25);
		cs.add(btnThnhVinTrc);
		
		JButton btnThnhVinSau = new JButton("Thành viên sau");
		btnThnhVinSau.setBounds(221, 225, 144, 25);
		cs.add(btnThnhVinSau);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 368, 816, 219);
		contentPane.add(scrollPane);
		
		JButton btnNewButton = new JButton("Lưu");
		btnNewButton.setBounds(570, 626, 117, 25);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(741, 626, 117, 25);
		contentPane.add(btnBack);
	}

}
