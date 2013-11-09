import javax.swing.JApplet;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Rectangle;


public class adminhome extends JApplet {

	/**
	 * Create the applet.
	 */
	public adminhome() {
		getContentPane().setLayout(null);
		
		JButton btnChangeAge = new JButton("Change Age");
		btnChangeAge.setBounds(6, 249, 117, 29);
		getContentPane().add(btnChangeAge);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(6, 208, 117, 29);
		getContentPane().add(btnDelete);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(6, 167, 117, 29);
		getContentPane().add(btnAdd);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(32, 32, 52, 27);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(110, 32, 52, 27);
		getContentPane().add(comboBox_1);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setBounds(23, 6, 61, 16);
		getContentPane().add(lblChild);
		
		JLabel lblLevel = new JLabel("Level");
		lblLevel.setBounds(101, 4, 61, 16);
		getContentPane().add(lblLevel);
		
		JLabel lblChooseTime = new JLabel("Choose Time");
		lblChooseTime.setBounds(125, 109, 82, 16);
		getContentPane().add(lblChooseTime);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(135, 132, 52, 27);
		getContentPane().add(comboBox_2);
		
		JLabel lblChooseMistakes = new JLabel("Mistakes Allowed");
		lblChooseMistakes.setBounds(146, 183, 141, 16);
		getContentPane().add(lblChooseMistakes);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(169, 209, 52, 27);
		getContentPane().add(comboBox_3);
		
		JButton btnRevert = new JButton("Revert");
		btnRevert.setBounds(146, 249, 117, 29);
		getContentPane().add(btnRevert);
		
		JButton btnFullStats = new JButton("Full Stats");
		btnFullStats.setBounds(305, 226, 117, 29);
		getContentPane().add(btnFullStats);
		
		JLabel lblNewLabel = new JLabel("Scores");
		lblNewLabel.setBounds(318, 16, 104, 179);
		getContentPane().add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("Top Scores/High Scores");
		lblNewLabel_1.setBounds(336, 50, 96, 216);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Admin Home");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblNewLabel_2.setBounds(210, 16, 200, 60);
		getContentPane().add(lblNewLabel_2);

	}
}
