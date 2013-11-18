import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;


public class childhomepage extends JApplet {

	/**
	 * Create the applet.
	 */
	public childhomepage() {
		
		JLabel lblNewLabel = new JLabel("top scores/high scores");
		lblNewLabel.setBounds(265, 34, 179, 118);
		
		JLabel lblLevel = new JLabel("level");
		lblLevel.setBounds(131, 41, 61, 16);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(141, 69, 52, 27);
		
		JButton btnDrillMode = new JButton("drill mode");
		btnDrillMode.setBounds(6, 151, 117, 29);
		
		JButton btnPlayMinigame = new JButton("play minigame");
		btnPlayMinigame.setBounds(6, 190, 117, 29);
		
		JButton btnFinalGame = new JButton("final game");
		btnFinalGame.setBounds(265, 230, 117, 29);
		getContentPane().setLayout(null);
		getContentPane().add(lblNewLabel);
		getContentPane().add(lblLevel);
		getContentPane().add(comboBox);
		getContentPane().add(btnDrillMode);
		getContentPane().add(btnPlayMinigame);
		getContentPane().add(btnFinalGame);
		
		JLabel lblChildHomepage = new JLabel("Child Homepage");
		lblChildHomepage.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblChildHomepage.setBounds(6, 261, 297, 33);
		getContentPane().add(lblChildHomepage);
	}
}
