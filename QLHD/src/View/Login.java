package View;
import Model.user;
//import sun.security.util.Length;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Controller.Cnnect;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Login extends JFrame implements ActionListener {

	public static JPanel contentPane;
	public static JTextField tk;
	private static JTextField mk;
	private JCheckBox qtrBox;
	private JCheckBox ndBox;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Login frame = new Login();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("LOGIN");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTiKhon = new JLabel("Tài Khoản");
		lblTiKhon.setBounds(87, 72, 70, 15);
		contentPane.add(lblTiKhon);
		
		JLabel lblMtKhu = new JLabel("Mật Khẩu");
		lblMtKhu.setBounds(87, 98, 70, 15);
		contentPane.add(lblMtKhu);
		
		tk = new JTextField();
		tk.setBounds(207, 70, 174, 20);
		contentPane.add(tk);
		tk.setColumns(10);
		
		
		mk = new JTextField();
		mk.setBounds(207, 97, 174, 20);
		contentPane.add(mk);
		mk.setColumns(50);
		

		JLabel lblPhnMmQun = new JLabel("Phần mềm quản lý khu phố");
		lblPhnMmQun.setBounds(125, 12, 267, 15);
		contentPane.add(lblPhnMmQun);
		
		qtrBox = new JCheckBox("Quản Trị");
		qtrBox.setBounds(89, 143, 129, 23);
		contentPane.add(qtrBox);
		
		ndBox = new JCheckBox("Người dùng");
		ndBox.setBounds(228, 143, 129, 23);
		contentPane.add(ndBox);
		
		JButton dangnhap = new JButton("Đăng nhập");
		dangnhap.setBounds(167, 198, 117, 25);
		contentPane.add(dangnhap);
		dangnhap.setActionCommand("DN");
		dangnhap.addActionListener(this);
	}
	
	//ham cho checkbox
	boolean resqt=false;
	boolean resnd=false;
	private boolean StateQtr() {
        qtrBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == 1) {
                   resqt=true;
                } 
            }
        });
        return resqt;
	}
	private boolean StateNd() {
        ndBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == 1) {
                   resnd=true;
                } 
            }
        });
        return resnd;
	}
	
	//ham kiểm tra
	public static void getinfromUS(){
		Cnnect cnnect=new Cnnect();
		String sql="SELECT * FROM USERIF WHERE Username='"+tk.getText()+"'";
		try {
			Connection con1=cnnect.getCNN();
			PreparedStatement pStatement=con1.prepareStatement(sql);
			ResultSet rSet=pStatement.executeQuery();
			if(rSet.next()) {
				JOptionPane.showMessageDialog(contentPane, "Đăng nhập thành công");
				
			}
			else {
				JOptionPane.showMessageDialog(contentPane, "Sai tài khoản hoặc mật khẩu");
				
			}
//			if(rSet.getString(1).equals(tk.getText())&&rSet.getString(2).equals(mk.getText())) {
//				JOptionPane.showMessageDialog(contentPane, "Đăng nhập thành công");
//				
//			}
//			else {
//				JOptionPane.showMessageDialog(contentPane, "Sai tài khoản hoặc mật khẩu");
//			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(contentPane, e.toString());
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if("DN".equals(arg0.getActionCommand())) {
			getinfromUS();
		}
	}
	

}
