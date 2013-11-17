import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;


public class drillmode extends JApplet {
	private JTextField txtAnswer;

	/**
	 * Create the applet.
	 */
	public drillmode() {
		getContentPane().setBackground(new Color(238, 238, 238));
		getContentPane().setLayout(null);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(new Color(51, 102, 255));
		btnSubmit.setForeground(Color.DARK_GRAY);
		btnSubmit.setBounds(275, 107, 151, 63);
		getContentPane().add(btnSubmit);
		
		JLabel lblQuestion = new JLabel("question");
		lblQuestion.setBounds(62, 112, 61, 16);
		getContentPane().add(lblQuestion);
		
		txtAnswer = new JTextField();
		txtAnswer.setText("answer");
		txtAnswer.setBounds(134, 106, 134, 28);
		getContentPane().add(txtAnswer);
		txtAnswer.setColumns(10);
		
		JLabel lblDrillMode = new JLabel("Drill Mode");
		lblDrillMode.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblDrillMode.setBounds(40, 0, 207, 77);
		getContentPane().add(lblDrillMode);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Users/vietcavo/Desktop/Poke-Ball-256.png"));
		lblNewLabel.setBounds(346, -1, 49, 63);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("/Users/vietcavo/Desktop/Poke-Ball-256.png"));
		label.setBounds(393, -2, 49, 63);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("/Users/vietcavo/Desktop/Poke-Ball-256.png"));
		label_1.setBounds(298, -2, 49, 63);
		getContentPane().add(label_1);
	}
}
