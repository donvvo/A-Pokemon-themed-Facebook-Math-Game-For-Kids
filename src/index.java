import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;


public class index extends JApplet {
	private JTextField txtPassword;
	private JTextField txtUsername;

	/**
	 * Create the applet.
	 */
	public index() {
		getContentPane().setLayout(null);
		setBounds(0,0,800,600);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(537, 537, 117, 29);
		getContentPane().add(btnQuit);
		
		JButton btnForgotPassword = new JButton("forgot password ..");
		btnForgotPassword.setBounds(306, 309, 147, 29);
		getContentPane().add(btnForgotPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(319, 275, 117, 29);
		getContentPane().add(btnLogin);
		
		txtPassword = new JTextField();
		txtPassword.setText("password");
		txtPassword.setBounds(319, 239, 134, 28);
		getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setText("username ");
		txtUsername.setBounds(319, 202, 134, 28);
		getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(index.class.getResource("/Icons/BackGrounds/gif_589x394_a594d0.gif")));
		lblNewLabel_1.setBounds(109, 77, 583, 388);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(index.class.getResource("/Icons/BackGrounds/black-bar2 copy.jpg")));
		lblNewLabel_4.setBounds(694, 62, 106, 442);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(index.class.getResource("/Icons/BackGrounds/black-bar.jpg")));
		lblNewLabel.setBounds(0, 0, 800, 74);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(index.class.getResource("/Icons/BackGrounds/black-bar2.jpg")));
		lblNewLabel_3.setBounds(0, 73, 106, 431);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(index.class.getResource("/Icons/BackGrounds/black-bar copy.jpg")));
		lblNewLabel_2.setBounds(0, 467, 800, 133);
		getContentPane().add(lblNewLabel_2);

	}
}
