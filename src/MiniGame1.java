import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class MiniGame1 extends JApplet {

	/**
	 * Create the applet.
	 */
	public MiniGame1() {

		setBounds(0,0,800,600);
		getContentPane().setLayout(null);
		
		JLabel BackGround1 = new JLabel("BackGround1");
		BackGround1.setIcon(new ImageIcon(MiniGame1.class.getResource("/Icons/Background1.png")));
		BackGround1.setBounds(0, 0, 800, 400);
		getContentPane().add(BackGround1);
		//edit to test pushes
	}
}
