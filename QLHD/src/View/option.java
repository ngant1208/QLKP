package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;

public class option extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					option frame = new option();
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
	public option() {
		setTitle("OPTIONS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPleaseSelectAn = new JLabel("PLEASE SELECT AN OPTION");
		lblPleaseSelectAn.setBounds(146, 12, 218, 15);
		contentPane.add(lblPleaseSelectAn);
		
		JPanel panel = new JPanel();
		panel.setBounds(76, 37, 315, 202);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnSaThngTin = new JButton("SỬA THÔNG TIN HỘ DÂN ");
		btnSaThngTin.setBackground(Color.PINK);
		btnSaThngTin.setBounds(0, 0, 315, 63);
		panel.add(btnSaThngTin);
		
		JButton btnThmThngTin = new JButton("THÊM THÔNG TIN HỘ DÂN");
		btnThmThngTin.setBackground(Color.GREEN);
		btnThmThngTin.setBounds(0, 62, 315, 70);
		panel.add(btnThmThngTin);
		
		JButton btnTmKimThng = new JButton("TÌM KIẾM THÔNG TIN ");
		btnTmKimThng.setBackground(Color.YELLOW);
		btnTmKimThng.setBounds(0, 132, 315, 70);
		panel.add(btnTmKimThng);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
