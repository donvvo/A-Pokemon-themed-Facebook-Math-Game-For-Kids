import javax.swing.JApplet;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JTable;

import java.awt.SystemColor;
import java.util.List;


public class Register extends JApplet {
	
	private String username;
	private int securityQ;
	private String securityanswer;
	private String[] questions = {"Question 1" , "Question 2" , "Question 3"};
	private int f_uid = 123456789;
	private String f_name = "Mark";
	private String defaultPass = "cs2212";
	Parent parent;
	private int m_level;
	private int m_level_index;
	private List<String> children;
	
	
	private JLabel ProfessorOak;
	private JLabel OakPokeball;
	private JLabel BackGround;
	private JLabel Pikachu;
	private JTextField Username;
	private JTextField SecurityAnswer;
	private JComboBox SecurityQuestion;
	private JButton btnSubmit;
	private JTextArea txtrHelloThereWelcome;
	private JTextArea txtrThankyou;
	private JTextArea txtrCongratulationsYourChildrens;
	
	private JLabel BackGroundLevel2;
	private JLabel BackGroundLevel1;
	private JLabel BackGroundLevel3;
	private JLabel BackGroundLevel4;
	private JLabel BackGroundLevel5;
	private JLabel BackGroundLevel6;
	private JLabel BackGroundLevel7;
	private JLabel BackGroundLevel8;
	private JLabel BackGroundLevel9;
	private JLabel BackGroundLevel10;
	private JLabel BackGroundLevel11;
	private JLabel BackGroundLevel12;
	private JLabel Max_health_Enemy;
	private JLabel First_Mistake_Enemy;
	private JLabel Second_Mistake_Enemy;
	private JLabel Third_Mistake_Enemy;
	private JLabel Fourth_Mistake_Enemy;
	private JLabel Fifth_Mistake_Enemy;
	private JLabel Final_Mistake_Enemy;
	
	private int correct = 0;
	private int mistake = 0;
	private String[] Backgrounds = {"Background 1" , "Background 2" , "Background 3" , "Background 4" , "Background 5" , "Background 6" , "Background 7" , "Background 8" , "Background 9" , "Background 10" , "Background 11" , "Background 12"}; 
	private String[] Pokemon = {"Blastoise" , "Charizard" , "Gyrados" , "Mew" , "Mewtwo" , "Nidoking" , "Nidoqueen" , "Pidgeot" , "Pikachu" , "Poliwrath" , "Venasaur"};
	private String[] levels = {"1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "11" , "12"}; 
	private int lastbindex = 0;
	private int lastpindex = 0;
	private int lastlindex = 0;
	
	private JLabel Male_Player;
	private JLabel Female_Player;
	private JButton btnGender;
	private JLabel Second_Mistake_Player;
	private JLabel Third_Mistake_Player;
	private JLabel Fourth_Mistake_Player;
	private JLabel Fifth_Mistake_Player;
	private JLabel First_Mistake_Player;
	private JLabel Final_Mistake_Player;
	private JButton btnMistake;
	private JLabel Pokemon2;
	private JComboBox BackGroundSwitch;
	private JLabel Pokemon1;
	private JLabel Pokemon3;
	private JLabel Pokemon4;
	private JLabel Pokemon5;
	private JLabel Pokemon6;
	private JLabel Pokemon7;
	private JLabel Pokemon8;
	private JLabel Pokemon9;
	private JLabel Pokemon10;
	private JLabel Pokemon11;
	private JComboBox PokemonSwitch;
	private JLabel Level10;
	private JLabel Level1;
	private JLabel Level2;
	private JLabel Level3;
	private JLabel Level4;
	private JLabel Level5;
	private JLabel Level6;
	private JLabel Level7;
	private JLabel Level8;
	private JLabel Level9;
	private JLabel Level11;
	private JLabel Level12;
	private JComboBox LevelSwitch;
	private JPanel MiniGame;
	private JPanel Register;
	private JPanel DrillMode;
	private JTextArea txtrYouHaveNot;
	private JTextArea txtrYouHaveNot_1;
	private JPanel EmptyPanel;
	private JButton btnPlayMinigame;
	
	private String[] Skins = {"Choose Skin", "Tall Grass", "Cavernous Cave" , "Wet Water"};
	private JComboBox SkinDropDown;
	private JLabel lblNewLabel;
	private JTextField AnswerField;
	private JLabel GrassBackground;
	private JLabel CaveBackground;
	private JLabel WaterBackground;
	private JLabel GrassStarters;
	private JLabel FireStarters;
	private JLabel WaterStarters;
	private JButton EnterAnswerBtn;
	private JTextArea txtrCorrect;
	private JLabel Lives;
	private JLabel life_6;
	private JLabel life_5;
	private JLabel life_4;
	private JLabel life_3;
	private JLabel life_2;
	private JLabel lvl1;
	private JLabel lvl2;
	private JLabel lvl3;
	private JLabel lvl4;
	private JLabel lvl5;
	private JLabel lvl6;
	private JLabel lvl7;
	private JLabel lvl8;
	private JLabel lvl9;
	private JLabel lvl10;
	private JLabel lvl11;
	private JLabel lvl12;
	private JLabel mult_bottom1;
	private JLabel mult_bottom2;
	private JLabel mult_bottom3;
	private JLabel mult_bottom4;
	private JLabel mult_bottom5;
	private JLabel mult_bottom6;
	private JLabel mult_bottom7;
	private JLabel mult_bottom8;
	private JLabel mult_bottom9;
	private JLabel mult_bottom10;
	private JLabel mult_bottom11;
	private JLabel mult_bottom12;
	private JLabel mult_top1;
	private JLabel mult_top2;
	private JLabel mult_top3;
	private JLabel mult_top4;
	private JLabel mult_top5;
	private JLabel mult_top6;
	private JLabel mult_top7;
	private JLabel mult_top8;
	private JLabel mult_top9;
	private JLabel mult_top10;
	private JLabel mult_top11;
	private JLabel mult_top12;
	private JComboBox LevelSelect;
	private JButton btnFinalGame;
	private JButton btnDrillMode;
	private JButton btnAdminMode;
	private JPanel HomePage;
	private JLabel lblBackGroundGif;
	private JLabel lblLevel;
	private JLabel lblgameboyBack;
	private JLabel lblNewLabel_3;
	private JPanel AdminPage;
	private JButton btnChangeAge;
	private JButton btnDelete;
	private JButton btnAdd;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JButton btnRevert;
	private JButton btnFullStats;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_1;
	private JButton btnChild;
	private JLabel lblAdminChild;
	private JLabel lblAdminMain;
	private JLabel lblAdminScore;
	private JComboBox ChooseChild;
	private JLabel lblChooseChild;
	/**
	 * Create the applet.
	 */
	public Register() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setForeground(Color.BLACK);
		setBounds(0,0,800,600);
		getContentPane().setLayout(null);
		
		setBounds(0,0,800,600);
		setVisible(true);
		getContentPane().setLayout(null);
		
		Register = new JPanel();
		Register.setBackground(new Color(255, 255, 255));
		Register.setBounds(0, 0, 800, 600);
		Register.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 400, 800, 10);
		Register.add(separator);
		separator.setBackground(Color.BLACK);
		
		OakPokeball = new JLabel("");
		OakPokeball.setBounds(293, 137, 40, 40);
		Register.add(OakPokeball);
		OakPokeball.setIcon(new ImageIcon(Register.class.getResource("/Icons/Register/Oak Pokeball.png")));
		
		ProfessorOak = new JLabel("");
		ProfessorOak.setBounds(286, 0, 204, 315);
		Register.add(ProfessorOak);
		ProfessorOak.setIcon(new ImageIcon(Register.class.getResource("/Icons/Register/Professor Oak.png")));
		
		Pikachu = new JLabel("");
		Pikachu.setBounds(103, 205, 100, 110);
		Register.add(Pikachu);
		Pikachu.setIcon(new ImageIcon(Register.class.getResource("/Icons/Register/Pikachu.png")));
		
		BackGround = new JLabel("");
		BackGround.setBounds(0, 0, 800, 400);
		Register.add(BackGround);
		BackGround.setIcon(new ImageIcon(Register.class.getResource("/Icons/Register/Background.png")));
		
		Username = new JTextField();
		Username.setBounds(370, 566, 209, 23);
		Register.add(Username);
		Username.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Username.addActionListener(new enter());
		Username.setColumns(10);
		
		SecurityAnswer = new JTextField();
		SecurityAnswer.setBounds(261, 566, 209, 23);
		Register.add(SecurityAnswer);
		SecurityAnswer.setFocusable(false);
		SecurityAnswer.setVisible(false);
		SecurityAnswer.setEnabled(false);
		SecurityAnswer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		SecurityAnswer.addActionListener(new enter());
		SecurityAnswer.setColumns(10);
		
		SecurityQuestion = new JComboBox(questions);
		SecurityQuestion.setBounds(32, 566, 209, 23);
		Register.add(SecurityQuestion);
		SecurityQuestion.setEnabled(false);
		SecurityQuestion.setVisible(false);
		SecurityQuestion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(601, 566, 89, 23);
		Register.add(btnSubmit);
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtrHelloThereWelcome = new JTextArea();
		txtrHelloThereWelcome.setBounds(10, 413, 609, 176);
		Register.add(txtrHelloThereWelcome);
		txtrHelloThereWelcome.setEditable(false);
		txtrHelloThereWelcome.setFocusable(false);
		txtrHelloThereWelcome.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtrHelloThereWelcome.setText("Hello there! Welcome to the wonderful world of Mathematics.\r\nI am a Professor Oak and people call me the Pok\u00E9mon Prof! \r\nThis world is inhabited by creatures called Pok\u00E9mon who will\r\nhelp your child learn mathematics!\r\nFirst I will require your username that you will use \r\nto log-in to the system:");
		txtrHelloThereWelcome.setOpaque(false);
		
		txtrThankyou = new JTextArea();
		txtrThankyou.setVisible(false);
		txtrThankyou.setOpaque(false);
		txtrThankyou.setBounds(10, 413, 609, 176);
		Register.add(txtrThankyou);
		txtrThankyou.setEditable(false);
		txtrThankyou.setFocusable(false);
		txtrThankyou.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtrThankyou.setText("Thank-you! Now you must choose a security question from the \r\ndrop-down menu provided and an answer to said question. \r\nMake sure to choose a question and answer you will remember!");
		
		txtrCongratulationsYourChildrens = new JTextArea();
		txtrCongratulationsYourChildrens.setVisible(false);
		txtrCongratulationsYourChildrens.setOpaque(false);
		txtrCongratulationsYourChildrens.setBounds(10, 413, 624, 176);
		Register.add(txtrCongratulationsYourChildrens);
		txtrCongratulationsYourChildrens.setText("Congratulations! Your child's very own Pok\u00E9mon \r\nmathematical adventure is about to unfold! A world of dreams \r\nand adventures with Mathematics awaits! Your password is \r\ncurrently set to the default of cs2212. You can change that in \r\nthe Admin section. Now let's go and add your children!");
		txtrCongratulationsYourChildrens.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtrCongratulationsYourChildrens.setFocusable(false);
		txtrCongratulationsYourChildrens.setEditable(false);
		btnSubmit.addActionListener(new submit() );
		
		MiniGame = new JPanel();
		MiniGame.setVisible(false);
		MiniGame.setBounds(0, 0, 800, 600);
		MiniGame.setLayout(null);
		
		BackGroundLevel1 = new JLabel("BackGround1");
		BackGroundLevel1.setVisible(false);
		
		First_Mistake_Enemy = new JLabel("First Correct");
		First_Mistake_Enemy.setVisible(false);
		First_Mistake_Enemy.setIcon(new ImageIcon(Register.class.getResource("/Icons/Health_Avatar/First Hit - Enemy.png")));
		First_Mistake_Enemy.setBounds(106, 63, 92, 6);
		MiniGame.add(First_Mistake_Enemy);
		
		Second_Mistake_Enemy = new JLabel("Second Correct");
		Second_Mistake_Enemy.setVisible(false);
		Second_Mistake_Enemy.setIcon(new ImageIcon(Register.class.getResource("/Icons/Health_Avatar/Second Hit - Enemy.png")));
		Second_Mistake_Enemy.setBounds(106, 63, 92, 6);
		MiniGame.add(Second_Mistake_Enemy);
		
		Third_Mistake_Enemy = new JLabel("Third Correct");
		Third_Mistake_Enemy.setVisible(false);
		Third_Mistake_Enemy.setIcon(new ImageIcon(Register.class.getResource("/Icons/Health_Avatar/Third Hit - Enemy.png")));
		Third_Mistake_Enemy.setBounds(106, 63, 92, 6);
		MiniGame.add(Third_Mistake_Enemy);
		
		Fourth_Mistake_Enemy = new JLabel("Fourth Correct");
		Fourth_Mistake_Enemy.setVisible(false);
		Fourth_Mistake_Enemy.setIcon(new ImageIcon(Register.class.getResource("/Icons/Health_Avatar/Fourth Hit - Enemy.png")));
		Fourth_Mistake_Enemy.setBounds(106, 63, 92, 6);
		MiniGame.add(Fourth_Mistake_Enemy);
		
		Fifth_Mistake_Enemy = new JLabel("Fifth Correct");
		Fifth_Mistake_Enemy.setVisible(false);
		Fifth_Mistake_Enemy.setIcon(new ImageIcon(Register.class.getResource("/Icons/Health_Avatar/Fifth Hit - Enemy.png")));
		Fifth_Mistake_Enemy.setBounds(106, 63, 92, 6);
		MiniGame.add(Fifth_Mistake_Enemy);
		
		Final_Mistake_Enemy = new JLabel("Final Correct");
		Final_Mistake_Enemy.setVisible(false);
		Final_Mistake_Enemy.setIcon(new ImageIcon(Register.class.getResource("/Icons/Health_Avatar/Dead - Enemy.png")));
		Final_Mistake_Enemy.setBounds(106, 63, 92, 6);
		MiniGame.add(Final_Mistake_Enemy);
		
		First_Mistake_Player = new JLabel("First Mistake");
		First_Mistake_Player.setVisible(false);
		First_Mistake_Player.setIcon(new ImageIcon(Register.class.getResource("/Icons/Health_Avatar/First Hit - Player.png")));
		First_Mistake_Player.setBounds(604, 335, 92, 6);
		MiniGame.add(First_Mistake_Player);
		
		Second_Mistake_Player = new JLabel("Second Mistake");
		Second_Mistake_Player.setVisible(false);
		Second_Mistake_Player.setIcon(new ImageIcon(Register.class.getResource("/Icons/Health_Avatar/Second Hit - Player.png")));
		Second_Mistake_Player.setBounds(604, 335, 92, 6);
		MiniGame.add(Second_Mistake_Player);
		
		Third_Mistake_Player = new JLabel("Third Mistake");
		Third_Mistake_Player.setVisible(false);
		Third_Mistake_Player.setIcon(new ImageIcon(Register.class.getResource("/Icons/Health_Avatar/Third Hit - Player.png")));
		Third_Mistake_Player.setBounds(604, 335, 92, 6);
		MiniGame.add(Third_Mistake_Player);
		
		Fourth_Mistake_Player = new JLabel("Fourth Mistake");
		Fourth_Mistake_Player.setVisible(false);
		Fourth_Mistake_Player.setIcon(new ImageIcon(Register.class.getResource("/Icons/Health_Avatar/Fourth Hit - Player.png")));
		Fourth_Mistake_Player.setBounds(604, 335, 92, 6);
		MiniGame.add(Fourth_Mistake_Player);
		
		Fifth_Mistake_Player = new JLabel("Fifth Mistake");
		Fifth_Mistake_Player.setVisible(false);
		Fifth_Mistake_Player.setIcon(new ImageIcon(Register.class.getResource("/Icons/Health_Avatar/Fifth Hit - Player.png")));
		Fifth_Mistake_Player.setBounds(604, 335, 92, 6);
		MiniGame.add(Fifth_Mistake_Player);
		
		Final_Mistake_Player = new JLabel("Final Mistake");
		Final_Mistake_Player.setVisible(false);
		Final_Mistake_Player.setIcon(new ImageIcon(Register.class.getResource("/Icons/Health_Avatar/Dead - Player.png")));
		Final_Mistake_Player.setBounds(604, 335, 92, 6);
		MiniGame.add(Final_Mistake_Player);
		
		Level1 = new JLabel("1");
		Level1.setIcon(new ImageIcon(Register.class.getResource("/Icons/Level_Folder/1.png")));
		Level1.setVisible(false);
		Level1.setBounds(190, 42, 15, 12);
		MiniGame.add(Level1);
		
		Level2 = new JLabel("2");
		Level2.setIcon(new ImageIcon(Register.class.getResource("/Icons/Level_Folder/2.png")));
		Level2.setVisible(false);
		Level2.setBounds(190, 42, 15, 12);
		MiniGame.add(Level2);
		
		Level3 = new JLabel("3");
		Level3.setIcon(new ImageIcon(Register.class.getResource("/Icons/Level_Folder/3.png")));
		Level3.setVisible(false);
		Level3.setBounds(190, 42, 15, 12);
		MiniGame.add(Level3);
		
		Level4 = new JLabel("4");
		Level4.setIcon(new ImageIcon(Register.class.getResource("/Icons/Level_Folder/4.png")));
		Level4.setVisible(false);
		Level4.setBounds(190, 42, 15, 12);
		MiniGame.add(Level4);
		
		Level5 = new JLabel("5");
		Level5.setIcon(new ImageIcon(Register.class.getResource("/Icons/Level_Folder/5.png")));
		Level5.setVisible(false);
		Level5.setBounds(190, 42, 15, 12);
		MiniGame.add(Level5);
		
		Level6 = new JLabel("6");
		Level6.setIcon(new ImageIcon(Register.class.getResource("/Icons/Level_Folder/6.png")));
		Level6.setVisible(false);
		Level6.setBounds(190, 42, 15, 12);
		MiniGame.add(Level6);
		
		Level7 = new JLabel("7");
		Level7.setIcon(new ImageIcon(Register.class.getResource("/Icons/Level_Folder/7.png")));
		Level7.setVisible(false);
		Level7.setBounds(190, 42, 15, 12);
		MiniGame.add(Level7);
		
		Level8 = new JLabel("8");
		Level8.setIcon(new ImageIcon(Register.class.getResource("/Icons/Level_Folder/8.png")));
		Level8.setVisible(false);
		Level8.setBounds(190, 42, 15, 12);
		MiniGame.add(Level8);
		
		Level9 = new JLabel("9");
		Level9.setIcon(new ImageIcon(Register.class.getResource("/Icons/Level_Folder/9.png")));
		Level9.setVisible(false);
		Level9.setBounds(190, 42, 15, 12);
		MiniGame.add(Level9);
		
		Level10 = new JLabel("10");
		Level10.setVisible(false);
		Level10.setIcon(new ImageIcon(Register.class.getResource("/Icons/Level_Folder/10.png")));
		Level10.setBounds(190, 42, 15, 12);
		MiniGame.add(Level10);
		
		Level11 = new JLabel("11");
		Level11.setIcon(new ImageIcon(Register.class.getResource("/Icons/Level_Folder/11.png")));
		Level11.setVisible(false);
		Level11.setBounds(190, 42, 15, 12);
		MiniGame.add(Level11);
		
		Level12 = new JLabel("12");
		Level12.setIcon(new ImageIcon(Register.class.getResource("/Icons/Level_Folder/12.png")));
		Level12.setVisible(false);
		Level12.setBounds(190, 42, 15, 12);
		MiniGame.add(Level12);
		
		Max_health_Enemy = new JLabel("Max Health");
		Max_health_Enemy.setIcon(new ImageIcon(Register.class.getResource("/Icons/Health_Avatar/Enemy Health.png")));
		Max_health_Enemy.setBounds(28, 30, 200, 61);
		MiniGame.add(Max_health_Enemy);
		
		JLabel Max_Health_Player = new JLabel("Player Max Health");
		Max_Health_Player.setIcon(new ImageIcon(Register.class.getResource("/Icons/Health_Avatar/Player Health.png")));
		Max_Health_Player.setBounds(512, 303, 200, 74);
		MiniGame.add(Max_Health_Player);
		
		Male_Player = new JLabel("Male Player");
		Male_Player.setVisible(false);
		Male_Player.setIcon(new ImageIcon(Register.class.getResource("/Icons/Health_Avatar/Male Player.png")));
		Male_Player.setBounds(147, 239, 125, 161);
		MiniGame.add(Male_Player);
		
		Female_Player = new JLabel("Female Player");
		Female_Player.setIcon(new ImageIcon(Register.class.getResource("/Icons/Health_Avatar/Female Player.png")));
		Female_Player.setBounds(147, 236, 125, 164);
		MiniGame.add(Female_Player);
		
		Pokemon1 = new JLabel("Blastoise");
		Pokemon1.setVisible(false);
		Pokemon1.setIcon(new ImageIcon(Register.class.getResource("/Icons/Pokemon/Blastoise.png")));
		Pokemon1.setBounds(480, 30, 215, 215);
		MiniGame.add(Pokemon1);
		
		Pokemon2 = new JLabel("Charizard");
		Pokemon2.setVisible(false);
		Pokemon2.setIcon(new ImageIcon(Register.class.getResource("/Icons/Pokemon/Charizard.png")));
		Pokemon2.setBounds(480, 30, 215, 215);
		MiniGame.add(Pokemon2);
		
		Pokemon3 = new JLabel("Gyrados");
		Pokemon3.setIcon(new ImageIcon(Register.class.getResource("/Icons/Pokemon/Gyrados.png")));
		Pokemon3.setVisible(false);
		Pokemon3.setBounds(480, 30, 215, 215);
		MiniGame.add(Pokemon3);
		
		Pokemon4 = new JLabel("Mew");
		Pokemon4.setIcon(new ImageIcon(Register.class.getResource("/Icons/Pokemon/Mew.png")));
		Pokemon4.setVisible(false);
		Pokemon4.setBounds(480, 30, 215, 215);
		MiniGame.add(Pokemon4);
		
		Pokemon5 = new JLabel("Mewtwo");
		Pokemon5.setIcon(new ImageIcon(Register.class.getResource("/Icons/Pokemon/Mewtwo.png")));
		Pokemon5.setVisible(false);
		Pokemon5.setBounds(480, 30, 215, 215);
		MiniGame.add(Pokemon5);
		
		Pokemon6 = new JLabel("Nidoking");
		Pokemon6.setIcon(new ImageIcon(Register.class.getResource("/Icons/Pokemon/Nidoking.png")));
		Pokemon6.setVisible(false);
		Pokemon6.setBounds(480, 30, 215, 215);
		MiniGame.add(Pokemon6);
		
		Pokemon7 = new JLabel("Nidoqueen");
		Pokemon7.setIcon(new ImageIcon(Register.class.getResource("/Icons/Pokemon/Nidoqueen.png")));
		Pokemon7.setVisible(false);
		Pokemon7.setBounds(480, 30, 215, 215);
		MiniGame.add(Pokemon7);
		
		Pokemon8 = new JLabel("Pidgeot");
		Pokemon8.setIcon(new ImageIcon(Register.class.getResource("/Icons/Pokemon/Pidgeot.png")));
		Pokemon8.setVisible(false);
		Pokemon8.setBounds(480, 30, 215, 215);
		MiniGame.add(Pokemon8);
		
		Pokemon9 = new JLabel("Pikachu");
		Pokemon9.setIcon(new ImageIcon(Register.class.getResource("/Icons/Pokemon/Pikachu.png")));
		Pokemon9.setVisible(false);
		Pokemon9.setBounds(480, 30, 215, 215);
		MiniGame.add(Pokemon9);
		
		Pokemon10 = new JLabel("Poliwrath");
		Pokemon10.setIcon(new ImageIcon(Register.class.getResource("/Icons/Pokemon/Poliwrath.png")));
		Pokemon10.setVisible(false);
		Pokemon10.setBounds(480, 30, 215, 215);
		MiniGame.add(Pokemon10);
		
		Pokemon11 = new JLabel("Venasaur");
		Pokemon11.setIcon(new ImageIcon(Register.class.getResource("/Icons/Pokemon/Venasaur.png")));
		Pokemon11.setVisible(false);
		Pokemon11.setBounds(480, 30, 215, 215);
		MiniGame.add(Pokemon11);
		BackGroundLevel1.setIcon(new ImageIcon(Register.class.getResource("/Icons/BackGrounds/BackgroundLevel1.png")));
		BackGroundLevel1.setBounds(0, 0, 800, 400);
		MiniGame.add(BackGroundLevel1);
		
		BackGroundLevel2 = new JLabel("BackGround2");
		BackGroundLevel2.setVisible(false);
		BackGroundLevel2.setIcon(new ImageIcon(Register.class.getResource("/Icons/BackGrounds/BackgroundLevel2.png")));
		BackGroundLevel2.setBounds(0, 0, 800, 400);
		MiniGame.add(BackGroundLevel2);
		
		BackGroundLevel3 = new JLabel("BackGround3");
		BackGroundLevel3.setVisible(false);
		BackGroundLevel3.setIcon(new ImageIcon(Register.class.getResource("/Icons/BackGrounds/BackgroundLevel3.png")));
		BackGroundLevel3.setBounds(0, 0, 800, 400);
		MiniGame.add(BackGroundLevel3);
		
		BackGroundLevel4 = new JLabel("BackGround4");
		BackGroundLevel4.setVisible(false);
		BackGroundLevel4.setIcon(new ImageIcon(Register.class.getResource("/Icons/BackGrounds/BackgroundLevel4.png")));
		BackGroundLevel4.setBounds(0, 0, 800, 400);
		MiniGame.add(BackGroundLevel4);
		
		BackGroundLevel5 = new JLabel("BackGround5");
		BackGroundLevel5.setVisible(false);
		BackGroundLevel5.setIcon(new ImageIcon(Register.class.getResource("/Icons/BackGrounds/BackgroundLevel5.png")));
		BackGroundLevel5.setBounds(0, 0, 800, 400);
		MiniGame.add(BackGroundLevel5);
		
		BackGroundLevel6 = new JLabel("BackGround6");
		BackGroundLevel6.setVisible(false);
		BackGroundLevel6.setIcon(new ImageIcon(Register.class.getResource("/Icons/BackGrounds/BackgroundLevel6.png")));
		BackGroundLevel6.setBounds(0, 0, 800, 400);
		MiniGame.add(BackGroundLevel6);
		
		BackGroundLevel7 = new JLabel("BackGround7");
		BackGroundLevel7.setVisible(false);
		BackGroundLevel7.setIcon(new ImageIcon(Register.class.getResource("/Icons/BackGrounds/BackgroundLevel7.png")));
		BackGroundLevel7.setBounds(0, 0, 800, 400);
		MiniGame.add(BackGroundLevel7);
		
		BackGroundLevel8 = new JLabel("BackGround8");
		BackGroundLevel8.setVisible(false);
		BackGroundLevel8.setIcon(new ImageIcon(Register.class.getResource("/Icons/BackGrounds/BackgroundLevel8.png")));
		BackGroundLevel8.setBounds(0, 0, 800, 400);
		MiniGame.add(BackGroundLevel8);
		
		BackGroundLevel9 = new JLabel("BackGround9");
		BackGroundLevel9.setVisible(false);
		BackGroundLevel9.setIcon(new ImageIcon(Register.class.getResource("/Icons/BackGrounds/BackgroundLevel9.png")));
		BackGroundLevel9.setBounds(0, 0, 800, 400);
		MiniGame.add(BackGroundLevel9);
		
		BackGroundLevel10 = new JLabel("BackGround10");
		BackGroundLevel10.setVisible(false);
		BackGroundLevel10.setIcon(new ImageIcon(Register.class.getResource("/Icons/BackGrounds/BackgroundLevel10.png")));
		BackGroundLevel10.setBounds(0, 0, 800, 400);
		MiniGame.add(BackGroundLevel10);
		
		BackGroundLevel11 = new JLabel("BackGround11");
		BackGroundLevel11.setVisible(false);
		BackGroundLevel11.setIcon(new ImageIcon(Register.class.getResource("/Icons/BackGrounds/BackgroundLevel11.png")));
		BackGroundLevel11.setBounds(0, 0, 800, 400);
		MiniGame.add(BackGroundLevel11);
		
		BackGroundLevel12 = new JLabel("BackGround12");
		BackGroundLevel12.setVisible(false);
		BackGroundLevel12.setIcon(new ImageIcon(Register.class.getResource("/Icons/BackGrounds/BackgroundLevel12.png")));
		BackGroundLevel12.setBounds(0, 0, 800, 400);
		MiniGame.add(BackGroundLevel12);
		
		JButton btnAttackTest = new JButton("Correct Answer");
		btnAttackTest.addActionListener(new testaction() );
		btnAttackTest.setBounds(60, 445, 138, 23);
		MiniGame.add(btnAttackTest);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new reset());
		btnReset.setBounds(667, 538, 89, 23);
		MiniGame.add(btnReset);
		
		btnGender = new JButton("Set Gender");
		btnGender.addActionListener(new gender());
		btnGender.setBounds(60, 513, 138, 23);
		MiniGame.add(btnGender);
		
		btnMistake = new JButton("Mistake");
		btnMistake.addActionListener(new mistaketest());
		
		AdminPage = new JPanel();
		AdminPage.setBounds(0, 0, 800, 600);
		getContentPane().add(AdminPage);
		AdminPage.setLayout(null);
		
		btnChangeAge = new JButton("Change Age");
		btnChangeAge.setIcon(new ImageIcon(Register.class.getResource("/Icons/Buttons/change-age.jpg")));
		btnChangeAge.setBounds(79, 524, 222, 29);
		AdminPage.add(btnChangeAge);
		
		btnDelete = new JButton("Delete");
		btnDelete.setBounds(355, 200, 117, 29);
		AdminPage.add(btnDelete);
		
		btnAdd = new JButton("Add");
		btnAdd.setBounds(213, 200, 117, 29);
		AdminPage.add(btnAdd);
		
		comboBox = new JComboBox();
		comboBox.setBounds(249, 89, 52, 27);
		AdminPage.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(334, 89, 52, 27);
		AdminPage.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(155, 89, 52, 27);
		AdminPage.add(comboBox_2);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBounds(79, 89, 52, 27);
		AdminPage.add(comboBox_3);
		
		btnRevert = new JButton("Revert");
		btnRevert.setBounds(625, 235, 117, 29);
		AdminPage.add(btnRevert);
		
		btnFullStats = new JButton("Full Stats");
		btnFullStats.setIcon(new ImageIcon(Register.class.getResource("/Icons/Buttons/view-stats.jpg")));
		btnFullStats.setBounds(453, 521, 224, 34);
		AdminPage.add(btnFullStats);
		
		lblNewLabel_4 = new JLabel("Scores");
		lblNewLabel_4.setBounds(484, 70, 104, 179);
		AdminPage.add(lblNewLabel_4);
		
		
		lblNewLabel_1 = new JLabel("Top Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High ScoresTop Scores/High Scores");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(219, 113, 253, 309);
		AdminPage.add(lblNewLabel_1);
		
		
		
		btnChild = new JButton("Child 1");
		btnChild.setBounds(35, 146, 117, 29);
		AdminPage.add(btnChild);
		
		JTable table = new JTable();
		table.setBackground(new Color(51, 0, 153));
		table.setBounds(68, 474, 183, -80);
		AdminPage.add(table);
		
			
		lblAdminChild = new JLabel("New label");
		lblAdminChild.setIcon(new ImageIcon(Register.class.getResource("/Icons/BackGrounds/admin-1.jpg")));
		lblAdminChild.setBounds(0, 0, 800, 600);
		AdminPage.add(lblAdminChild);
		
		lblAdminMain = new JLabel("New label");
		lblAdminMain.setIcon(new ImageIcon(Register.class.getResource("/Icons/BackGrounds/admin-edit.jpg")));
		lblAdminMain.setBounds(0, 0, 800, 600);
		AdminPage.add(lblAdminMain);
		
		lblAdminScore = new JLabel("New label");
		lblAdminScore.setIcon(new ImageIcon(Register.class.getResource("/Icons/BackGrounds/admin-scores.jpg")));
		lblAdminScore.setBounds(0, 0, 800, 600);
		AdminPage.add(lblAdminScore);
		btnMistake.setBounds(60, 479, 138, 23);
		MiniGame.add(btnMistake);
		
		JLabel BottomBackgroundText = new JLabel("BlueBottom");
		BottomBackgroundText.setIcon(new ImageIcon(Register.class.getResource("/Icons/BackGrounds/BlueBottom.png")));
		BottomBackgroundText.setBounds(0, 400, 800, 200);
		MiniGame.add(BottomBackgroundText);
		
		getContentPane().add(MiniGame);
		MiniGame.setEnabled(false);
		
		HomePage = new JPanel();
		HomePage.setBounds(0, 0, 800, 600);
		getContentPane().add(HomePage);
		HomePage.setLayout(null);
		HomePage.setLayout(null);
		
		LevelSelect = new JComboBox(levels);
		LevelSelect.setSelectedIndex(0);
		LevelSelect.setBounds(297, 503, 52, 27);
		HomePage.add(LevelSelect);
		
		btnFinalGame = new JButton("Play Final Game");
		btnFinalGame.setBounds(412, 542, 117, 29);
		btnFinalGame.addActionListener(new PlayFinalGame());
		
		ChooseChild = new JComboBox();
		ChooseChild.setBounds(297, 440, 142, 20);
		ChooseChild.addActionListener(new child_choose());
		HomePage.add(ChooseChild);
		HomePage.add(btnFinalGame);
		
		btnPlayMinigame = new JButton("Play MiniGame");
		btnPlayMinigame.setBounds(278, 541, 117, 30);
		HomePage.add(btnPlayMinigame);
		btnPlayMinigame.addActionListener(new PlayMiniGame());
		
		btnDrillMode = new JButton("Play Drill Mode");
		btnDrillMode.setBounds(147, 542, 117, 29);
		btnDrillMode.addActionListener(new PlayDrillMode());
		HomePage.add(btnDrillMode);
		
		btnAdminMode = new JButton("Admin Mode");
		btnAdminMode.setBounds(539, 542, 117, 29);
		btnAdminMode.addActionListener(new AdminMode());
		HomePage.add(btnAdminMode);
		
		lblLevel = new JLabel("level");
		lblLevel.setFont(new Font("Pokemon Solid", Font.PLAIN, 14));
		lblLevel.setBounds(297, 485, 61, 16);
		HomePage.add(lblLevel);
		
		lblChooseChild = new JLabel("Choose Child");
		lblChooseChild.setFont(new Font("Pokemon Solid", Font.BOLD, 14));
		lblChooseChild.setBounds(297, 415, 109, 14);
		HomePage.add(lblChooseChild);
		
		lblBackGroundGif = new JLabel("New label");
		lblBackGroundGif.setIcon(new ImageIcon(Register.class.getResource("/Icons/BackGrounds/gif_562x514_48cee9.gif")));
		lblBackGroundGif.setBounds(147, 68, 562, 514);
		HomePage.add(lblBackGroundGif);
		
		lblgameboyBack = new JLabel("New label");
		lblgameboyBack.setFont(new Font("Pokemon Solid", Font.BOLD, 14));
		lblgameboyBack.setIcon(new ImageIcon(Register.class.getResource("/Icons/BackGrounds/gameboy.jpg")));
		lblgameboyBack.setBounds(0, 0, 800, 600);
		HomePage.add(lblgameboyBack);
		lblNewLabel_3 = new JLabel("top scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scores\ntop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scorestop scores/high scores");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3.setBounds(128, 316, 620, 146);
		HomePage.add(lblNewLabel_3);
		
		EmptyPanel = new JPanel();
		EmptyPanel.setBounds(0, 0, 800, 600);
		getContentPane().add(EmptyPanel);
		EmptyPanel.setLayout(null);
		getContentPane().add(Register);
		Register.setEnabled(true);
		
		txtrYouHaveNot = new JTextArea();
		txtrYouHaveNot.setVisible(false);
		txtrYouHaveNot.setFocusable(false);
		txtrYouHaveNot.setEditable(false);
		txtrYouHaveNot.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtrYouHaveNot.setText("You have not entered a username. Please try again.");
		txtrYouHaveNot.setOpaque(false);
		txtrYouHaveNot.setBounds(10, 413, 609, 176);
		Register.add(txtrYouHaveNot);
		
		txtrYouHaveNot_1 = new JTextArea();
		txtrYouHaveNot_1.setVisible(false);
		txtrYouHaveNot_1.setText("You have not entered an answer to the security question. \r\nPlease try again.");
		txtrYouHaveNot_1.setOpaque(false);
		txtrYouHaveNot_1.setEnabled(false);
		txtrYouHaveNot_1.setEditable(false);
		txtrYouHaveNot_1.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtrYouHaveNot_1.setFocusable(false);
		txtrYouHaveNot_1.setBounds(10, 413, 609, 176);
		Register.add(txtrYouHaveNot_1);
		
		DrillMode = new JPanel();
		DrillMode.setEnabled(false);
		DrillMode.setVisible(false);
		DrillMode.setBounds(0, 0, 800, 600);
		getContentPane().add(DrillMode);
		DrillMode.setLayout(null);
		
		JSeparator separator1 = new JSeparator();
		separator1.setBackground(Color.BLACK);
		separator1.setForeground(Color.BLACK);
		separator1.setBounds(325, 300, 100, 5);
		DrillMode.add(separator1);
		
		SkinDropDown = new JComboBox(Skins);
		SkinDropDown.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SkinDropDown.setSelectedIndex(0);
		SkinDropDown.addActionListener(new changeskin());
		SkinDropDown.setBounds(0, 0, 164, 30);
		DrillMode.add(SkinDropDown);
		
		mult_top12 = new JLabel("");
		mult_top12.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/12.png")));
		mult_top12.setBounds(345, 225, 78, 30);
		DrillMode.add(mult_top12);
		
		mult_top11 = new JLabel("");
		mult_top11.setVisible(false);
		mult_top11.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/11.png")));
		mult_top11.setBounds(345, 225, 78, 30);
		DrillMode.add(mult_top11);
		
		mult_top10 = new JLabel("");
		mult_top10.setVisible(false);
		mult_top10.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/10.png")));
		mult_top10.setBounds(345, 225, 78, 30);
		DrillMode.add(mult_top10);
		
		mult_bottom12 = new JLabel("");
		
		mult_top9 = new JLabel("");
		mult_top9.setVisible(false);
		mult_top9.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/9.png")));
		mult_top9.setBounds(381, 225, 42, 30);
		DrillMode.add(mult_top9);
		
		mult_top8 = new JLabel("");
		mult_top8.setVisible(false);
		mult_top8.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/8.png")));
		mult_top8.setBounds(381, 225, 42, 30);
		DrillMode.add(mult_top8);
		
		mult_top7 = new JLabel("");
		mult_top7.setVisible(false);
		mult_top7.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/7.png")));
		mult_top7.setBounds(381, 225, 42, 30);
		DrillMode.add(mult_top7);
		
		mult_top6 = new JLabel("");
		mult_top6.setVisible(false);
		mult_top6.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/6.png")));
		mult_top6.setBounds(381, 225, 42, 30);
		DrillMode.add(mult_top6);
		
		mult_top5 = new JLabel("");
		mult_top5.setVisible(false);
		mult_top5.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/5.png")));
		mult_top5.setBounds(381, 225, 42, 30);
		DrillMode.add(mult_top5);
		
		mult_top4 = new JLabel("");
		mult_top4.setVisible(false);
		mult_top4.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/4.png")));
		mult_top4.setBounds(381, 225, 42, 30);
		DrillMode.add(mult_top4);
		
		mult_top3 = new JLabel("");
		mult_top3.setVisible(false);
		mult_top3.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/3.png")));
		mult_top3.setBounds(381, 225, 42, 30);
		DrillMode.add(mult_top3);
		
		mult_top2 = new JLabel("");
		mult_top2.setVisible(false);
		mult_top2.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/2.png")));
		mult_top2.setBounds(381, 225, 42, 30);
		DrillMode.add(mult_top2);
		
		mult_top1 = new JLabel("");
		mult_top1.setVisible(false);
		mult_top1.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/1.png")));
		mult_top1.setBounds(381, 225, 42, 30);
		DrillMode.add(mult_top1);
		mult_bottom12.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/12.png")));
		mult_bottom12.setBounds(345, 265, 78, 30);
		DrillMode.add(mult_bottom12);
		
		mult_bottom11 = new JLabel("");
		mult_bottom11.setVisible(false);
		mult_bottom11.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/11.png")));
		mult_bottom11.setBounds(345, 265, 78, 30);
		DrillMode.add(mult_bottom11);
		
		mult_bottom10 = new JLabel("");
		mult_bottom10.setVisible(false);
		mult_bottom10.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/10.png")));
		mult_bottom10.setBounds(345, 265, 78, 30);
		DrillMode.add(mult_bottom10);
		
		mult_bottom9 = new JLabel("");
		mult_bottom9.setVisible(false);
		mult_bottom9.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/9.png")));
		mult_bottom9.setBounds(381, 265, 42, 30);
		DrillMode.add(mult_bottom9);
		
		mult_bottom8 = new JLabel("");
		mult_bottom8.setVisible(false);
		mult_bottom8.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/8.png")));
		mult_bottom8.setBounds(381, 265, 42, 30);
		DrillMode.add(mult_bottom8);
		
		mult_bottom7 = new JLabel("");
		mult_bottom7.setVisible(false);
		mult_bottom7.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/7.png")));
		mult_bottom7.setBounds(381, 265, 42, 30);
		DrillMode.add(mult_bottom7);
		
		mult_bottom6 = new JLabel("");
		mult_bottom6.setVisible(false);
		mult_bottom6.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/6.png")));
		mult_bottom6.setBounds(381, 265, 42, 30);
		DrillMode.add(mult_bottom6);
		
		mult_bottom5 = new JLabel("");
		mult_bottom5.setVisible(false);
		mult_bottom5.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/5.png")));
		mult_bottom5.setBounds(381, 265, 42, 30);
		DrillMode.add(mult_bottom5);
		
		mult_bottom4 = new JLabel("");
		mult_bottom4.setVisible(false);
		mult_bottom4.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/4.png")));
		mult_bottom4.setBounds(381, 265, 42, 30);
		DrillMode.add(mult_bottom4);
		
		mult_bottom3 = new JLabel("");
		mult_bottom3.setVisible(false);
		mult_bottom3.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/3.png")));
		mult_bottom3.setBounds(381, 265, 42, 30);
		DrillMode.add(mult_bottom3);
		
		mult_bottom2 = new JLabel("");
		mult_bottom2.setVisible(false);
		mult_bottom2.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/2.png")));
		mult_bottom2.setBounds(381, 265, 42, 30);
		DrillMode.add(mult_bottom2);
		
		mult_bottom1 = new JLabel("");
		mult_bottom1.setVisible(false);
		mult_bottom1.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/1.png")));
		mult_bottom1.setBounds(381, 265, 42, 30);
		DrillMode.add(mult_bottom1);
		
		JLabel multiply_sign = new JLabel("");
		multiply_sign.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/multiply_sign.png")));
		multiply_sign.setBounds(330, 280, 15, 15);
		DrillMode.add(multiply_sign);
		
		lvl12 = new JLabel("");
		lvl12.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/12.png")));
		lvl12.setBounds(205, 0, 78, 30);
		DrillMode.add(lvl12);
		
		lvl11 = new JLabel("");
		lvl11.setVisible(false);
		lvl11.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/11.png")));
		lvl11.setBounds(205, 0, 78, 30);
		DrillMode.add(lvl11);
		
		lvl10 = new JLabel("");
		lvl10.setVisible(false);
		lvl10.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/10.png")));
		lvl10.setBounds(205, 0, 78, 30);
		DrillMode.add(lvl10);
		
		lvl9 = new JLabel("");
		lvl9.setVisible(false);
		lvl9.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/9.png")));
		lvl9.setBounds(205, 0, 42, 30);
		DrillMode.add(lvl9);
		
		lvl8 = new JLabel("");
		lvl8.setVisible(false);
		lvl8.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/8.png")));
		lvl8.setBounds(205, 0, 42, 30);
		DrillMode.add(lvl8);
		
		lvl7 = new JLabel("");
		lvl7.setVisible(false);
		lvl7.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/7.png")));
		lvl7.setBounds(205, 0, 42, 30);
		DrillMode.add(lvl7);
		
		lvl6 = new JLabel("");
		lvl6.setVisible(false);
		lvl6.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/6.png")));
		lvl6.setBounds(205, 0, 42, 30);
		DrillMode.add(lvl6);
		
		lvl5 = new JLabel("");
		lvl5.setVisible(false);
		lvl5.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/5.png")));
		lvl5.setBounds(205, 0, 42, 30);
		DrillMode.add(lvl5);
		
		lvl4 = new JLabel("");
		lvl4.setVisible(false);
		lvl4.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/4.png")));
		lvl4.setBounds(205, 0, 42, 30);
		DrillMode.add(lvl4);
		
		lvl3 = new JLabel("");
		lvl3.setVisible(false);
		lvl3.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/3.png")));
		lvl3.setBounds(205, 0, 42, 30);
		DrillMode.add(lvl3);
		
		lvl2 = new JLabel("");
		lvl2.setVisible(false);
		lvl2.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/2.png")));
		lvl2.setBounds(205, 0, 42, 30);
		DrillMode.add(lvl2);
		
		lvl1 = new JLabel("");
		lvl1.setVisible(false);
		lvl1.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/1.png")));
		lvl1.setBounds(205, 0, 42, 30);
		DrillMode.add(lvl1);
		
		JLabel lvl_txt = new JLabel("");
		lvl_txt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lvl_txt.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/LVL pic.png")));
		lvl_txt.setBounds(165, 0, 34, 30);
		DrillMode.add(lvl_txt);
		
		life_6 = new JLabel("");
		life_6.setVisible(false);
		life_6.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/pokeball.png")));
		life_6.setBounds(603, 0, 25, 30);
		DrillMode.add(life_6);
		
		life_5 = new JLabel("");
		life_5.setVisible(false);
		life_5.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/pokeball.png")));
		life_5.setBounds(572, 0, 25, 30);
		DrillMode.add(life_5);
		
		life_4 = new JLabel("");
		life_4.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/pokeball.png")));
		life_4.setBounds(540, 0, 25, 30);
		DrillMode.add(life_4);
		
		life_3 = new JLabel("");
		life_3.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/pokeball.png")));
		life_3.setBounds(510, 0, 25, 30);
		DrillMode.add(life_3);
		
		life_2 = new JLabel("");
		life_2.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/pokeball.png")));
		life_2.setBounds(480, 0, 25, 30);
		DrillMode.add(life_2);
		
		Lives = new JLabel("");
		Lives.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/Lives.png")));
		Lives.setBounds(445, 0, 185, 30);
		DrillMode.add(Lives);
		
		lblNewLabel = new JLabel("Remaining Lives:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(312, 0, 137, 30);
		DrillMode.add(lblNewLabel);
		
		JSeparator BottomSeparator = new JSeparator();
		BottomSeparator.setBounds(0, 500, 800, 2);
		DrillMode.add(BottomSeparator);
		
		JSeparator TopSeparator = new JSeparator();
		TopSeparator.setBounds(0, 35, 800, 2);
		DrillMode.add(TopSeparator);
		
		txtrCorrect = new JTextArea();
		txtrCorrect.setBackground(UIManager.getColor("Button.background"));
		txtrCorrect.setMargin(new Insets(10, 2, 2, 2));
		txtrCorrect.setEditable(false);
		txtrCorrect.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtrCorrect.setText("Wrong!\r\nCorrect answer is 144\r\n");
		txtrCorrect.setBounds(500, 500, 300, 100);
		DrillMode.add(txtrCorrect);
		
		EnterAnswerBtn = new JButton("Enter");
		EnterAnswerBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		EnterAnswerBtn.setBounds(390, 525, 100, 50);
		DrillMode.add(EnterAnswerBtn);
		
		AnswerField = new JTextField();
		AnswerField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		AnswerField.setBounds(280, 525, 100, 50);
		DrillMode.add(AnswerField);
		AnswerField.setColumns(10);
		
		WaterStarters = new JLabel("");
		WaterStarters.setVisible(false);
		WaterStarters.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/Water_Starters.png")));
		WaterStarters.setBounds(11, 505, 256, 90);
		DrillMode.add(WaterStarters);
		
		FireStarters = new JLabel("");
		FireStarters.setVisible(false);
		FireStarters.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/Fire_Starters.png")));
		FireStarters.setBounds(6, 505, 268, 90);
		DrillMode.add(FireStarters);
		
		GrassStarters = new JLabel("");
		GrassStarters.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/Grass_Starters.png")));
		GrassStarters.setBounds(2, 505, 275, 90);
		DrillMode.add(GrassStarters);
		
		GrassBackground = new JLabel("");
		GrassBackground.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/GrassBackground.png")));
		GrassBackground.setBounds(0, 37, 800, 463);
		DrillMode.add(GrassBackground);
		
		CaveBackground = new JLabel("");
		CaveBackground.setVisible(false);
		CaveBackground.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/CaveBackground.png")));
		CaveBackground.setBounds(0, 37, 800, 463);
		DrillMode.add(CaveBackground);
		
		WaterBackground = new JLabel("");
		WaterBackground.setVisible(false);
		WaterBackground.setIcon(new ImageIcon(Register.class.getResource("/Icons/Drill_Mode/WaterBackground.png")));
		WaterBackground.setBounds(0, 37, 800, 463);
		DrillMode.add(WaterBackground);	
		
		GrassBackground.setVisible(true);
		WaterBackground.setVisible(false);
		CaveBackground.setVisible(false);
		
		GrassStarters.setVisible(true);
		WaterStarters.setVisible(false);
		FireStarters.setVisible(false);
		
		firstruntime();

	}
	
	public void firstruntime() {
		EmptyPanel.setEnabled(true);
		EmptyPanel.setVisible(true);
		Register.setEnabled(false);
		Register.setVisible(false);
		MiniGame.setEnabled(false);
		MiniGame.setVisible(false);
		DrillMode.setEnabled(false);
		DrillMode.setVisible(false);
		HomePage.setEnabled(false);
		HomePage.setVisible(false);
		AdminPage.setEnabled(false);
		AdminPage.setVisible(false);
		
		parent = new Parent(f_uid);
		if (parent.getStatus() == 0){
			EmptyPanel.setEnabled(false);
			EmptyPanel.setVisible(false);
			Register.setEnabled(true);
			Register.setVisible(true);
		}
		else if (parent.getStatus() == 1){
			EmptyPanel.setEnabled(false);
			EmptyPanel.setVisible(false);
			HomePage.setEnabled(true);
			HomePage.setVisible(true);
			ChooseChild.removeAllItems();
			ChooseChild.addItem("Choose Child");
			for (int i=0; i<parent.ListChildren(f_uid).length; i++){
				ChooseChild.addItem(parent.ListChildren(f_uid)[i]);
			}
			ChooseChild.setSelectedIndex(0);
		}
		
		else {
			System.out.println("doesn't work");
		}
	}
	public void subruntime(){
		EmptyPanel.setEnabled(false);
		EmptyPanel.setVisible(false);
		Register.setEnabled(false);
		Register.setVisible(false);
		MiniGame.setEnabled(false);
		MiniGame.setVisible(false);
		DrillMode.setEnabled(false);
		DrillMode.setVisible(false);
		HomePage.setEnabled(true);
		HomePage.setVisible(true);
		AdminPage.setEnabled(false);
		AdminPage.setVisible(false);

		System.out.println(ChooseChild.getItemCount() - 1);
		System.out.println(parent.ListChildren(f_uid).length);
		if ((ChooseChild.getItemCount() - 1) < parent.ListChildren(f_uid).length){
			System.out.println("it came in here");
			int missing = parent.ListChildren(f_uid).length - (ChooseChild.getItemCount() - 1);
			for (int i=(parent.ListChildren(f_uid).length - missing); i<parent.ListChildren(f_uid).length; i++){
				ChooseChild.addItem(parent.ListChildren(f_uid)[i]);
			}
		}
	/*	if ((ChooseChild.getItemCount() - 1) > parent.ListChildren(f_uid).length){
			ChooseChild.removeAllItems();
			for (int i=0; i<parent.ListChildren(f_uid).length; i++){
				ChooseChild.addItem(parent.ListChildren(f_uid)[i]);
			}
		}*/
		ChooseChild.setSelectedIndex(0); 
		
	}
	
	private class PlayMiniGame implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
				m_level_index = LevelSelect.getSelectedIndex();
				if (m_level_index != 0){
					
					HomePage.setEnabled(false);
					HomePage.setVisible(false);
					MiniGame.setVisible(true);
					MiniGame.setEnabled(true);
				
					invisLevel();
					invisBackground();
					invisPokemon();
				}
	

			
			if (m_level_index == 1){
				BackGroundLevel1.setVisible(true);
				Level1.setVisible(true);
			}
					
			else if (m_level_index == 2) {
				BackGroundLevel2.setVisible(true);
				Level2.setVisible(true);
			}
					
			else if (m_level_index == 3) {
				BackGroundLevel3.setVisible(true);
				Level3.setVisible(true);
			}
					
			else if (m_level_index == 4) {
				BackGroundLevel4.setVisible(true);
				Level4.setVisible(true);
			}
			
			else if (m_level_index == 5){
				BackGroundLevel5.setVisible(true);
				Level5.setVisible(true);
			}
					
			else if (m_level_index == 6){
				BackGroundLevel6.setVisible(true);
				Level6.setVisible(true);
			}
					
			else if (m_level_index == 7) {
				BackGroundLevel7.setVisible(true);
				Level7.setVisible(true);
			}
					
			else if (m_level_index == 8){
				BackGroundLevel8.setVisible(true);
				Level8.setVisible(true);
			}
					
			else if (m_level_index == 9) {
				BackGroundLevel9.setVisible(true);
				Level9.setVisible(true);
			}
					
			else if (m_level_index == 10){
				BackGroundLevel10.setVisible(true);
				Level10.setVisible(true);
			}	
				
			else if (m_level_index == 11){
				BackGroundLevel11.setVisible(true);
				Level11.setVisible(true);
			}
				
			else if (m_level_index == 12){
				BackGroundLevel12.setVisible(true);
				Level12.setVisible(true);
			}
			CreaterandomPokemon();
		}		
	}
	
	private void CreaterandomPokemon(){
		int pokemon = (int)(Math.random()*1000)%11 + 1;
		invisPokemon();
		if (pokemon == 1){
			Pokemon1.setVisible(true);
		}
		else if (pokemon == 2){
			Pokemon2.setVisible(true);
		}
		else if (pokemon == 3){
			Pokemon3.setVisible(true);
		}
		else if (pokemon == 4){
			Pokemon4.setVisible(true);
		}
		else if (pokemon == 5){
			Pokemon5.setVisible(true);
		}
		else if (pokemon == 6){
			Pokemon6.setVisible(true);
		}
		else if (pokemon == 7){
			Pokemon7.setVisible(true);
		}
		else if (pokemon == 8){
			Pokemon8.setVisible(true);
		}
		else if (pokemon == 9){
			Pokemon9.setVisible(true);
		}
		else if (pokemon == 10){
			Pokemon10.setVisible(true);
		}
		else if (pokemon == 11){
			Pokemon11.setVisible(true);
		}
	}

	private class enter implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (Username.isVisible()){
				if (Username.getText().isEmpty()){
					txtrHelloThereWelcome.setVisible(false);
					txtrHelloThereWelcome.setEnabled(false);
					txtrYouHaveNot.setVisible(true);
					txtrYouHaveNot.setEnabled(true);
					Username.requestFocus();
				}
				else {
					username = Username.getText();
					txtrYouHaveNot.setVisible(false);
					txtrYouHaveNot.setEnabled(false);
					Username.setFocusable(false);
					Username.setVisible(false);
					Username.setEnabled(false);
					SecurityQuestion.setVisible(true);
					SecurityQuestion.setEnabled(true);
					SecurityAnswer.setVisible(true);
					SecurityAnswer.setEnabled(true);
					SecurityAnswer.setFocusable(true);
					SecurityAnswer.requestFocus();
					txtrHelloThereWelcome.setVisible(false);
					txtrHelloThereWelcome.setEnabled(false);
					txtrThankyou.setVisible(true);
					txtrThankyou.setEnabled(true);
				}
			}
			
			else if (!Username.isVisible() && SecurityAnswer.isVisible()){
				if (SecurityAnswer.getText().isEmpty()){
					txtrThankyou.setVisible(false);
					txtrThankyou.setEnabled(false);
					txtrYouHaveNot_1.setVisible(true);
					txtrYouHaveNot_1.setEnabled(true);
					SecurityAnswer.setFocusable(true);
					SecurityAnswer.requestFocus();

				}
				
				else {
					securityQ = SecurityQuestion.getSelectedIndex();
					securityanswer = SecurityAnswer.getText();
					txtrYouHaveNot_1.setVisible(false);
					txtrYouHaveNot_1.setEnabled(false);
					SecurityQuestion.setVisible(false);
					SecurityQuestion.setEnabled(false);
					SecurityAnswer.setVisible(false);
					SecurityAnswer.setEnabled(false);
					txtrThankyou.setVisible(false);
					txtrThankyou.setEnabled(false);
					txtrCongratulationsYourChildrens.setVisible(true);
					txtrCongratulationsYourChildrens.setEnabled(true);
					parent.CreateProfile(f_uid, f_name, username, defaultPass, securityQ, securityanswer);
				}
			}
		}
	}
	
	private class submit implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (Username.isVisible()){			
				if (Username.getText().isEmpty()){
					txtrHelloThereWelcome.setVisible(false);
					txtrHelloThereWelcome.setEnabled(false);
					txtrYouHaveNot.setVisible(true);
					txtrYouHaveNot.setEnabled(true);
					Username.requestFocus();
				}
				else {
					username = Username.getText();	
					Username.setVisible(false);
					Username.setEnabled(false);
					SecurityQuestion.setVisible(true);
					SecurityQuestion.setEnabled(true);
					SecurityAnswer.setVisible(true);
					SecurityAnswer.setEnabled(true);
					SecurityAnswer.setFocusable(true);
					txtrHelloThereWelcome.setVisible(false);
					txtrHelloThereWelcome.setEnabled(false);
					txtrThankyou.setVisible(true);
					txtrThankyou.setEnabled(true);
				}
			}
			
			else if (!Username.isVisible() && SecurityAnswer.isVisible()){
				securityQ = SecurityQuestion.getSelectedIndex();
				securityanswer = SecurityAnswer.getSelectedText();
				SecurityQuestion.setVisible(false);
				SecurityQuestion.setEnabled(false);
				SecurityAnswer.setVisible(false);
				SecurityAnswer.setEnabled(false);
				txtrThankyou.setVisible(false);
				txtrThankyou.setEnabled(false);
				txtrCongratulationsYourChildrens.setVisible(true);
				txtrCongratulationsYourChildrens.setEnabled(true);
				parent.CreateProfile(f_uid, f_name, username, defaultPass, securityQ, securityanswer);
				
			}
			
			else if (!Username.isVisible() && !SecurityAnswer.isVisible() && txtrCongratulationsYourChildrens.isVisible()){
				Register.setEnabled(false);
				Register.setVisible(false);
				AdminPage.setEnabled(true);
				AdminPage.setVisible(true);
			}
		}
	}

	private class PlayDrillMode implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			HomePage.setEnabled(false);
			HomePage.setVisible(false);
			DrillMode.setEnabled(true);
			DrillMode.setEnabled(true);
		}
	}
	
	private class PlayFinalGame implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			
		}
	}
	
	private class AdminMode implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			HomePage.setEnabled(false);
			HomePage.setVisible(false);
			AdminPage.setEnabled(true);
			AdminPage.setVisible(true);
			
		}
	}
		
	private class child_choose implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			child_index(ChooseChild.getSelectedItem());
		}
	}
	
	private void child_index (Object name) {
		String c_name = name.toString();
		m_level = parent.get_m_level(parent.parent_ID, c_name);
		
		if (m_level == 0){
			LevelSelect.removeAllItems();
			LevelSelect.addItem("Please Choose Child");
		}
		else {
			
			LevelSelect.removeAllItems();
			LevelSelect.addItem("Choose MiniGame Level");
			int count = 0;
			for (int i=1; i<=m_level; i++){
				LevelSelect.addItem(i);
				count++;
			}
			LevelSelect.setSelectedIndex(count);
		}
	}
	
	private void invisLevel(){
		
		Level1.setVisible(false);
		Level2.setVisible(false);
		Level3.setVisible(false);
		Level4.setVisible(false);
		Level5.setVisible(false);
		Level6.setVisible(false);
		Level7.setVisible(false);
		Level8.setVisible(false);
		Level9.setVisible(false);
		Level10.setVisible(false);
		Level11.setVisible(false);
		Level12.setVisible(false);
	}
	
	private void invisBackground(){
		
		BackGroundLevel1.setVisible(false);
		BackGroundLevel2.setVisible(false);
		BackGroundLevel3.setVisible(false);
		BackGroundLevel4.setVisible(false);
		BackGroundLevel5.setVisible(false);
		BackGroundLevel6.setVisible(false);
		BackGroundLevel7.setVisible(false);
		BackGroundLevel8.setVisible(false);
		BackGroundLevel9.setVisible(false);
		BackGroundLevel10.setVisible(false);
		BackGroundLevel11.setVisible(false);
		BackGroundLevel12.setVisible(false);
	}
	
	private void invisPokemon(){
			Pokemon1.setVisible(false);
			Pokemon2.setVisible(false);
			Pokemon3.setVisible(false);
			Pokemon4.setVisible(false);
			Pokemon5.setVisible(false);
			Pokemon6.setVisible(false);
			Pokemon7.setVisible(false);
			Pokemon8.setVisible(false);
			Pokemon9.setVisible(false);
			Pokemon10.setVisible(false);
			Pokemon11.setVisible(false);
		
	}
	
	private class testaction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (correct == 0){
				First_Mistake_Enemy.setVisible(true);
				correct++;
			}
			else if (correct == 1){
				Second_Mistake_Enemy.setVisible(true);
				First_Mistake_Enemy.setVisible(false);
				correct++;
			}
			else if (correct == 2){
				Third_Mistake_Enemy.setVisible(true);
				Second_Mistake_Enemy.setVisible(false);
				correct++;
			}
			else if (correct == 3){
				Fourth_Mistake_Enemy.setVisible(true);
				Third_Mistake_Enemy.setVisible(false);
				correct++;
			}
			else if (correct == 4){
				Fifth_Mistake_Enemy.setVisible(true);
				Fourth_Mistake_Enemy.setVisible(false);
				correct++;
			}
			else if (correct == 5){
				Final_Mistake_Enemy.setVisible(true);
				Fifth_Mistake_Enemy.setVisible(false);
				correct++;
			}
			
		}
	}
	
	private class reset implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			First_Mistake_Enemy.setVisible(false);
			Second_Mistake_Enemy.setVisible(false);
			Third_Mistake_Enemy.setVisible(false);
			Fourth_Mistake_Enemy.setVisible(false);
			Fifth_Mistake_Enemy.setVisible(false);
			Final_Mistake_Enemy.setVisible(false);
			First_Mistake_Player.setVisible(false);
			Second_Mistake_Player.setVisible(false);
			Third_Mistake_Player.setVisible(false);
			Fourth_Mistake_Player.setVisible(false);
			Fifth_Mistake_Player.setVisible(false);
			Final_Mistake_Player.setVisible(false);
			LevelSelect.setSelectedIndex(0);
			ChooseChild.setSelectedIndex(0);
			subruntime();
		}
	}
	
	private class gender implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (Male_Player.isVisible()){
				Female_Player.setVisible(true);
				Male_Player.setVisible(false);
			}
			else if (Female_Player.isVisible()){
				Male_Player.setVisible(true);
				Female_Player.setVisible(false);
			}
		}
	}
	
	private class mistaketest implements ActionListener

	{
		public void actionPerformed(ActionEvent e)
		{
			if (mistake == 0){
				First_Mistake_Player.setVisible(true);
				mistake++;
			}
			else if (mistake == 1){
				Second_Mistake_Player.setVisible(true);
				First_Mistake_Player.setVisible(false);
				mistake++;
			}
			else if (mistake == 2){
				Third_Mistake_Player.setVisible(true);
				Second_Mistake_Player.setVisible(false);
				mistake++;
			}
			else if (mistake == 3){
				Fourth_Mistake_Player.setVisible(true);
				Third_Mistake_Player.setVisible(false);
				mistake++;
			}
			else if (mistake == 4){
				Fifth_Mistake_Player.setVisible(true);
				Fourth_Mistake_Player.setVisible(false);
				mistake++;
			}
			else if (mistake == 5){
				Final_Mistake_Player.setVisible(true);
				Fifth_Mistake_Player.setVisible(false);
				mistake++;
			}
			
		}
	}
	
	private class changeskin implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			skinindex(SkinDropDown.getSelectedIndex());
		}
	}
	
	private void skinindex(int index)
	{
		
		if (index==1)
		{
			GrassBackground.setVisible(true);
			WaterBackground.setVisible(false);
			CaveBackground.setVisible(false);
			
			GrassStarters.setVisible(true);
			WaterStarters.setVisible(false);
			FireStarters.setVisible(false);
		}
		else if (index==2)
		{
			GrassBackground.setVisible(false);
			WaterBackground.setVisible(false);
			CaveBackground.setVisible(true);
			
			GrassStarters.setVisible(false);
			WaterStarters.setVisible(false);
			FireStarters.setVisible(true);
		}
		else if (index==3)
		{
			GrassBackground.setVisible(false);
			WaterBackground.setVisible(true);
			CaveBackground.setVisible(false);
			
			GrassStarters.setVisible(false);
			WaterStarters.setVisible(true);
			FireStarters.setVisible(false);
		}
	}
}
