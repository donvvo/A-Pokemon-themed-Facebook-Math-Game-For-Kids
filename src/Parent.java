import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;


public class Parent extends JApplet {

	/**
	 * Create the applet.
	 */
	public Parent() {
		getContentPane().setLayout(null);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.setBounds(95, 227, 117, 29);
		getContentPane().add(btnPlay);
		
		JButton btnAdminMode = new JButton("Admin Mode");
		btnAdminMode.setBounds(314, 253, 117, 29);
		getContentPane().add(btnAdminMode);
		
		JButton btnSkins = new JButton("Skins");
		btnSkins.setBounds(314, 26, 117, 29);
		getContentPane().add(btnSkins);
		
		JButton btnLeaderboard = new JButton("Leaderboard");
		btnLeaderboard.setBounds(95, 268, 117, 29);
		getContentPane().add(btnLeaderboard);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setBounds(95, 31, 61, 16);
		getContentPane().add(lblChild);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(89, 60, 52, 27);
		getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Parent page");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblNewLabel.setBounds(85, 121, 328, 58);
		getContentPane().add(lblNewLabel);

	}
}
