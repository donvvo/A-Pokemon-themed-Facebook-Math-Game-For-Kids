import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;


public class childhomepage extends JApplet {

	/**
	 * Create the applet.
	 */
	public childhomepage() {
		setBounds(0, 0, 800, 600);
		
		JLabel lblLevel = new JLabel("level");
		lblLevel.setBounds(297, 475, 61, 16);
		getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("top scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scores\ntop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scores");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(128, 316, 620, 146);
		getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(297, 503, 52, 27);
		getContentPane().add(comboBox);
		
		JButton btnFinalGame = new JButton("final game");
		btnFinalGame.setBounds(412, 542, 117, 29);
		getContentPane().add(btnFinalGame);
		
		JButton btnPlayMinigame = new JButton("play minigame");
		btnPlayMinigame.setBounds(283, 542, 117, 29);
		getContentPane().add(btnPlayMinigame);
		
		JButton btnDrillMode = new JButton("drill mode");
		btnDrillMode.setBackground(Color.BLUE);
		btnDrillMode.setBounds(147, 542, 117, 29);
		getContentPane().add(btnDrillMode);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(childhomepage.class.getResource("/Icons/BackGrounds/gif_562x514_48cee9.gif")));
		lblNewLabel_2.setBounds(147, 68, 562, 514);
		getContentPane().add(lblNewLabel_2);
		getContentPane().add(lblLevel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(childhomepage.class.getResource("/Icons/BackGrounds/gameboy.jpg")));
		lblNewLabel_1.setBounds(0, 0, 800, 600);
		getContentPane().add(lblNewLabel_1);
		
		

	}
}
