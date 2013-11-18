import javax.swing.JApplet;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Font;


public class scores extends JApplet {
	private JTable table;

	/**
	 * Create the applet.
	 */
	public scores() {
		getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(29, 35, 95, 27);
		getContentPane().add(comboBox);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setBounds(44, 7, 61, 16);
		getContentPane().add(lblChild);
		
		table = new JTable();
		table.setBounds(6, 74, 427, 220);
		getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("Scores");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblNewLabel.setBounds(152, 19, 269, 47);
		getContentPane().add(lblNewLabel);

	}
}
