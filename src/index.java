import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;


public class index extends JApplet {
	private JTextField txtPassword;
	private JTextField txtUsername;

	/**
	 * Create the applet.
	 */
	public index() {
		getContentPane().setLayout(null);
		
		JButton btnForgotPassword = new JButton("forgot password ..");
		btnForgotPassword.setBounds(207, 174, 147, 29);
		getContentPane().add(btnForgotPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(90, 174, 117, 29);
		getContentPane().add(btnLogin);
		
		txtPassword = new JTextField();
		txtPassword.setText("password");
		txtPassword.setBounds(148, 118, 134, 28);
		getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setText("username ");
		txtUsername.setBounds(148, 83, 134, 28);
		getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(315, 252, 117, 29);
		getContentPane().add(btnQuit);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(188, 24, 47, 47);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login page");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblNewLabel_1.setBounds(14, 247, 228, 50);
		getContentPane().add(lblNewLabel_1);

	}
}
