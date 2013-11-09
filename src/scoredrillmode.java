import javax.swing.JApplet;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;


public class scoredrillmode extends JApplet {

	/**
	 * Create the applet.
	 */
	public scoredrillmode() {
		getContentPane().setLayout(null);
		
		JButton btnPostScore = new JButton("Post Score");
		btnPostScore.setBounds(24, 147, 117, 29);
		getContentPane().add(btnPostScore);
		
		JButton btnPlayMinigame = new JButton("Play Mini-game");
		btnPlayMinigame.setBounds(24, 187, 142, 29);
		getContentPane().add(btnPlayMinigame);
		
		JButton btnNextLevel = new JButton("Next Level");
		btnNextLevel.setBounds(34, 228, 117, 29);
		getContentPane().add(btnNextLevel);
		
		JLabel lblNewLabel = new JLabel("Question/Answer/Correct");
		lblNewLabel.setBounds(6, 36, 181, 99);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BATMAN");
		lblNewLabel_1.setBounds(271, 125, 111, 91);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnQuit = new JButton("quit");
		btnQuit.setBounds(327, 22, 117, 29);
		getContentPane().add(btnQuit);
		
		JButton btnSkin = new JButton("skin");
		btnSkin.setBounds(327, 56, 117, 29);
		getContentPane().add(btnSkin);
		
		JLabel lblNewLabel_2 = new JLabel("Drill Mode Score page");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		lblNewLabel_2.setBounds(122, 261, 313, 36);
		getContentPane().add(lblNewLabel_2);

	}

}
