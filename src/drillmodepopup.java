import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;


public class drillmodepopup extends JApplet {

	/**
	 * Create the applet.
	 */
	public drillmodepopup() {
		getContentPane().setLayout(null);
		setBounds(0,0,800,600);
		
		JLabel lblNewLabel = new JLabel("Correct/Incorrect\nIf incorrect, show answer");
		lblNewLabel.setBounds(44, 121, 356, 78);
		getContentPane().add(lblNewLabel);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(287, 231, 117, 29);
		getContentPane().add(btnNext);
		
		JLabel lblDrillModePopup = new JLabel("Drill mode popup");
		lblDrillModePopup.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblDrillModePopup.setBounds(24, 10, 294, 53);
		getContentPane().add(lblDrillModePopup);

	}

}
