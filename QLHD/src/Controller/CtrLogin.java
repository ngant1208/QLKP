package Controller;
import java.awt.EventQueue;
//import Model.user;
import View.Login;

public class CtrLogin {
	public static void main(String[]args) {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Login frame = new Login();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
		
		
}
	
}