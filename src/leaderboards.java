import javax.swing.JApplet;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;


public class leaderboards extends JApplet {
	private JTable table;

	/**
	 * Create the applet.
	 */
	public leaderboards() {
		getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(155, 186, 121, -52);
		getContentPane().add(table);
		
		JLabel lblLevel = new JLabel("level");
		lblLevel.setBounds(181, 6, 61, 16);
		getContentPane().add(lblLevel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(191, 24, 52, 27);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(34, 208, 52, 27);
		getContentPane().add(comboBox_1);
		
		JLabel lblAge = new JLabel("age");
		lblAge.setBounds(25, 170, 61, 16);
		getContentPane().add(lblAge);
		
		JLabel lblAverage = new JLabel("average");
		lblAverage.setBounds(102, 170, 61, 16);
		getContentPane().add(lblAverage);
		
		JLabel lblNewLabel = new JLabel("Leaderboards");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblNewLabel.setBounds(155, 208, 252, 86);
		getContentPane().add(lblNewLabel);

	}

}
