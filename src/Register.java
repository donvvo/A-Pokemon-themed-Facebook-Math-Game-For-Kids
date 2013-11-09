import javax.swing.JApplet;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Register extends JApplet {
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField txtRetypePassword;
	private JTextField txtAnswer;
	private JLabel lblNewLabel;
	
	
	/**
	 * Create the applet.
	 */
	public Register() {
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		setBounds(0, 0, 800, 600);
		
		JLabel background = new JLabel("New label");
		background.setBounds(-19, -25, 800, 600);
		getContentPane().add(background);
		background.setIcon(new ImageIcon("/Users/vietcavo/Dropbox/2212/group assignment/tumblr_mvi2k1pRS31qeplxbo3_500.gif"));
		
		JButton btnSubmit = new JButton("submit");
		btnSubmit.setBounds(0, 0, 88, 29);
		getContentPane().add(btnSubmit);
		
		txtRetypePassword = new JTextField();
		txtRetypePassword.setBounds(0, 0, 134, 28);
		getContentPane().add(txtRetypePassword);
		txtRetypePassword.setText("retype password");
		txtRetypePassword.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(0, 0, 134, 28);
		getContentPane().add(txtPassword);
		txtPassword.setText("password");
		txtPassword.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(0, 0, 134, 28);
		getContentPane().add(txtUsername);
		txtUsername.setText("username");
		txtUsername.setColumns(10);
		
		txtAnswer = new JTextField();
		txtAnswer.setBounds(0, 0, 134, 28);
		getContentPane().add(txtAnswer);
		txtAnswer.setText("answer");
		txtAnswer.setColumns(10);
		
		lblNewLabel = new JLabel("Register Page");
		lblNewLabel.setBounds(0, 0, 175, 31);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		
		JComboBox securityQ = new JComboBox();
		securityQ.setBounds(0, 0, 52, 27);
		getContentPane().add(securityQ);
	}
}
