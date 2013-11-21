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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class adminhome extends JApplet {
	private JTable table;

	/**
	 * Create the applet.
	 */
	public adminhome() {
		getContentPane().setLayout(null);
		setBounds(0,0,800,600);
		
		
		JButton btnChangeAge = new JButton("");
		btnChangeAge.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnChangeAge.setIcon(new ImageIcon(adminhome.class.getResource("/Icons/Buttons/change-age.jpg")));
		btnChangeAge.setBounds(147, 533, 226, 34);
		getContentPane().add(btnChangeAge);
		
		JButton btnDelete = new JButton("");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setIcon(new ImageIcon(adminhome.class.getResource("/Icons/Buttons/delete.jpg")));
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnDelete.setBounds(335, 186, 147, 29);
		getContentPane().add(btnDelete);
		
		JButton btnAdd = new JButton("");
		btnAdd.setIcon(new ImageIcon(adminhome.class.getResource("/Icons/Buttons/add.jpg")));
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnAdd.setBounds(132, 235, 104, 41);
		getContentPane().add(btnAdd);
		
		JComboBox timeLimit = new JComboBox();
		timeLimit.setBounds(104, 147, 64, 27);
		getContentPane().add(timeLimit);
		
		JComboBox mistakes = new JComboBox();
		mistakes.setBounds(357, 147, 52, 27);
		getContentPane().add(mistakes);
		
		JComboBox childSelection = new JComboBox();
		childSelection.setBounds(39, 76, 117, 29);
		getContentPane().add(childSelection);
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(adminhome.class.getResource("/Icons/Buttons/back.jpg")));
		btnBack.setBounds(604, 449, 98, 29);
		getContentPane().add(btnBack);
		
		JButton btnFullStats = new JButton("Full Stats");
		btnFullStats.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnFullStats.setIcon(new ImageIcon(adminhome.class.getResource("/Icons/Buttons/view-stats.jpg")));
		btnFullStats.setBounds(460, 521, 217, 34);
		getContentPane().add(btnFullStats);
		
		JLabel lblNewLabel = new JLabel("Scores");
		lblNewLabel.setBounds(429, 159, 104, 179);
		getContentPane().add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("Top Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High Scores");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(313, 109, 253, 309);
		getContentPane().add(lblNewLabel_1);
		
		table = new JTable();
		table.setBackground(new Color(51, 0, 153));
		table.setBounds(68, 474, 183, -80);
		getContentPane().add(table);
					
					JLabel lblAdminScore = new JLabel("New label");
					lblAdminScore.setIcon(new ImageIcon(adminhome.class.getResource("/Icons/BackGrounds/admin-scores.jpg")));
					lblAdminScore.setBounds(0, 0, 800, 600);
					getContentPane().add(lblAdminScore);
					
						
						JLabel lblAdminChild = new JLabel("New label");
						lblAdminChild.setIcon(new ImageIcon(adminhome.class.getResource("/Icons/BackGrounds/admin-1.jpg")));
						lblAdminChild.setBounds(0, 0, 800, 600);
						getContentPane().add(lblAdminChild);
						
						JLabel lblAdminMain = new JLabel("New label");
						lblAdminMain.setIcon(new ImageIcon(adminhome.class.getResource("/Icons/BackGrounds/admin-edit.jpg")));
						lblAdminMain.setBounds(0, 0, 800, 600);
						getContentPane().add(lblAdminMain);

		
		
	}
}
