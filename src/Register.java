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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 760, 760);
		getContentPane().add(panel);
		
		JButton btnSubmit = new JButton("submit");
		panel.add(btnSubmit);
		
		txtRetypePassword = new JTextField();
		panel.add(txtRetypePassword);
		txtRetypePassword.setText("retype password");
		txtRetypePassword.setColumns(10);
		
		txtPassword = new JTextField();
		panel.add(txtPassword);
		txtPassword.setText("password");
		txtPassword.setColumns(10);
		
		txtUsername = new JTextField();
		panel.add(txtUsername);
		txtUsername.setText("username");
		txtUsername.setColumns(10);
		
		txtAnswer = new JTextField();
		panel.add(txtAnswer);
		txtAnswer.setText("answer");
		txtAnswer.setColumns(10);
		
		lblNewLabel = new JLabel("Register Page");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		
		JComboBox securityQ = new JComboBox();
		panel.add(securityQ);
		
		JLabel background = new JLabel("New label");
		background.setBounds(-19, -25, 584, 410);
		getContentPane().add(background);
		background.setIcon(new ImageIcon("/Users/vietcavo/Dropbox/2212/group assignment/tumblr_mvi2k1pRS31qeplxbo3_500.gif"));
	}
}
