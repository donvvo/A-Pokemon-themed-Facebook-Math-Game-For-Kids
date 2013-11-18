import javax.swing.JApplet;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class adminhome extends JApplet {
	private JTable table;

	/**
	 * Create the applet.
	 */
	public adminhome() {
		getContentPane().setLayout(null);
		setBounds(0,0,800,600);
		
		
		JButton btnChangeAge = new JButton("Change Age");
		btnChangeAge.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnChangeAge.setIcon(new ImageIcon(adminhome.class.getResource("/Icons/Buttons/change-age.jpg")));
		btnChangeAge.setBounds(79, 524, 222, 29);
		getContentPane().add(btnChangeAge);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnDelete.setBounds(355, 200, 117, 29);
		getContentPane().add(btnDelete);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnAdd.setBounds(213, 200, 117, 29);
		getContentPane().add(btnAdd);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(249, 89, 52, 27);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(334, 89, 52, 27);
		getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(155, 89, 52, 27);
		getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(79, 89, 52, 27);
		getContentPane().add(comboBox_3);
		
		JButton btnRevert = new JButton("Revert");
		btnRevert.setBounds(625, 235, 117, 29);
		getContentPane().add(btnRevert);
		
		JButton btnFullStats = new JButton("Full Stats");
		btnFullStats.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnFullStats.setIcon(new ImageIcon(adminhome.class.getResource("/Icons/Buttons/view-stats.jpg")));
		btnFullStats.setBounds(453, 521, 224, 34);
		getContentPane().add(btnFullStats);
		
		JLabel lblNewLabel = new JLabel("Scores");
		lblNewLabel.setBounds(484, 70, 104, 179);
		getContentPane().add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("Top Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High Scores");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(219, 113, 253, 309);
		getContentPane().add(lblNewLabel_1);
		
		table = new JTable();
		table.setBackground(new Color(51, 0, 153));
		table.setBounds(68, 474, 183, -80);
		getContentPane().add(table);
		
		JButton btnChild = new JButton("Child 1");
		btnChild.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnChild.setBounds(35, 146, 117, 29);
		getContentPane().add(btnChild);
		
			
			JLabel lblAdminChild = new JLabel("New label");
			lblAdminChild.setIcon(new ImageIcon(adminhome.class.getResource("/Icons/BackGrounds/admin-1.jpg")));
			lblAdminChild.setBounds(0, 0, 800, 600);
			getContentPane().add(lblAdminChild);
			
			JLabel lblAdminMain = new JLabel("New label");
			lblAdminMain.setIcon(new ImageIcon(adminhome.class.getResource("/Icons/BackGrounds/admin-edit.jpg")));
			lblAdminMain.setBounds(0, 0, 800, 600);
			getContentPane().add(lblAdminMain);
			
			JLabel lblAdminScore = new JLabel("New label");
			lblAdminScore.setIcon(new ImageIcon(adminhome.class.getResource("/Icons/BackGrounds/admin-scores.jpg")));
			lblAdminScore.setBounds(0, 0, 800, 600);
			getContentPane().add(lblAdminScore);

		
		
	}
}
