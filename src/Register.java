import javax.swing.JApplet;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Register extends JApplet {
	
	private String username;
	private int securityQ;
	private String securityanswer;
	private String[] questions = {"Question 1" , "Question 2" , "Question 3"};
	public Register mg;
	
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
	private String[] levels = {"Level 1" , "Level 2" , "Level 3" , "Level 4" , "Level 5" , "Level 6" , "Level 7" , "Level 8" , "Level 9" , "Level 10" , "Level 11" , "Level 12"}; 
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
	/**
	 * Create the applet.
	 */
	public Register() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setForeground(Color.BLACK);
		setBounds(0,0,800,600);
		getContentPane().setLayout(null);
		
		MiniGame = new JPanel();
		MiniGame.setVisible(false);
		MiniGame.setBounds(0, 0, 800, 600);
		MiniGame.setLayout(null);
		
		setBounds(0,0,800,600);
		setVisible(true);
		getContentPane().setLayout(null);
		
		BackGroundLevel1 = new JLabel("BackGround1");
		
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
		Level1.setVisible(true);
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
		btnMistake.setBounds(60, 479, 138, 23);
		MiniGame.add(btnMistake);
		
		
		BackGroundSwitch = new JComboBox(Backgrounds);
		BackGroundSwitch.setSelectedIndex(0);
		BackGroundSwitch.addActionListener(new switchBackground());
		BackGroundSwitch.setBounds(234, 446, 162, 20);
		MiniGame.add(BackGroundSwitch);
		
		PokemonSwitch = new JComboBox(Pokemon);
		PokemonSwitch.setSelectedIndex(0);
		PokemonSwitch.addActionListener(new switchpokemon());
		PokemonSwitch.setBounds(234, 480, 162, 20);
		MiniGame.add(PokemonSwitch);
		
		LevelSwitch = new JComboBox(levels);
		LevelSwitch.setSelectedIndex(0);
		LevelSwitch.addActionListener(new switchlevel());
		
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
		txtrCongratulationsYourChildrens.setText("Congratulations! Your child(ren)(s) very own Pok\u00E9mon \r\nmathematical adventure is about to unfold! A world of dreams \r\nand adventures with Mathematics awaits! Your password is \r\ncurrently set to the default of cs2212. You can change that in \r\nthe Admin section. Now let's go and add your children!");
		txtrCongratulationsYourChildrens.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtrCongratulationsYourChildrens.setFocusable(false);
		txtrCongratulationsYourChildrens.setEditable(false);
		btnSubmit.addActionListener(new submit() );
		getContentPane().add(Register);
		Register.setEnabled(true);
		LevelSwitch.setBounds(234, 514, 162, 20);
		MiniGame.add(LevelSwitch);
		
		JLabel BottomBackgroundText = new JLabel("BlueBottom");
		BottomBackgroundText.setIcon(new ImageIcon(Register.class.getResource("/Icons/BackGrounds/BlueBottom.png")));
		BottomBackgroundText.setBounds(0, 400, 800, 200);
		MiniGame.add(BottomBackgroundText);
		
		getContentPane().add(MiniGame);
		MiniGame.setEnabled(false);
		
		DrillMode = new JPanel();
		DrillMode.setEnabled(false);
		DrillMode.setVisible(false);
		DrillMode.setBounds(0, 0, 800, 600);
		getContentPane().add(DrillMode);
		DrillMode.setLayout(null);

	}
	
	private class enter implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (Username.isVisible()){
				username = Username.getSelectedText();
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
				
			}
		}
	}
	
	private class submit implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (Username.isVisible()){
				username = Username.getSelectedText();
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
				
			}
			
			else if (!Username.isVisible() && !SecurityAnswer.isVisible() && txtrCongratulationsYourChildrens.isVisible()){
				Register.setEnabled(false);
				Register.setVisible(false);
				MiniGame.setEnabled(true);
				MiniGame.setVisible(true);
			}
		}
	}
	
	private class switchlevel implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			levelindex(LevelSwitch.getSelectedIndex());
		}
	}
	
	private class switchBackground implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			backgroundindex(BackGroundSwitch.getSelectedIndex());
		}
	}
	
	private class switchpokemon implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			pokemonindex(PokemonSwitch.getSelectedIndex());
		}
	}
	
	private void levelindex(int index){
		if (index == 0){
			Level1.setVisible(true);
		}
		else if (index == 1){
			Level2.setVisible(true);
		}
		else if (index == 2){
			Level3.setVisible(true);
		}
		else if (index == 3){
			Level4.setVisible(true);
		}
		else if (index == 4){
			Level5.setVisible(true);
		}
		else if (index == 5){
			Level6.setVisible(true);
		}
		else if (index == 6){
			Level7.setVisible(true);
		}
		else if (index == 7){
			Level8.setVisible(true);
		}
		else if (index == 8){
			Level9.setVisible(true);
		}
		else if (index == 9){
			Level10.setVisible(true);
		}
		else if (index == 10){
			Level11.setVisible(true);
		}
		else if (index == 11){
			Level12.setVisible(true);
		}
		
		if (lastlindex == 0 && lastlindex != index){
			Level1.setVisible(false);
		}
		else if (lastlindex == 1 && lastlindex != index){
			Level2.setVisible(false);
		}
		else if (lastlindex == 2 && lastlindex != index){
			Level3.setVisible(false);
		}
		else if (lastlindex == 3 && lastlindex != index){
			Level4.setVisible(false);
		}
		else if (lastlindex == 4 && lastlindex != index){
			Level5.setVisible(false);
		}
		else if (lastlindex == 5 && lastlindex != index){
			Level6.setVisible(false);
		}
		else if (lastlindex == 6 && lastlindex != index){
			Level7.setVisible(false);
		}
		else if (lastlindex == 7 && lastlindex != index){
			Level8.setVisible(false);
		}
		else if (lastlindex == 8 && lastlindex != index){
			Level9.setVisible(false);
		}
		else if (lastlindex == 9 && lastlindex != index){
			Level10.setVisible(false);
		}
		else if (lastlindex == 10 && lastlindex != index){
			Level11.setVisible(false);
		}
		else if (lastlindex == 11 && lastlindex != index){
			Level12.setVisible(false);
		}
		lastlindex = index;
		
	}
	
	private void backgroundindex(int index){
		if (index == 0){
			BackGroundLevel1.setVisible(true);
		}
		else if (index == 1){
			BackGroundLevel2.setVisible(true);
		}
		else if (index == 2){
			BackGroundLevel3.setVisible(true);
		}
		else if (index == 3){
			BackGroundLevel4.setVisible(true);
		}
		else if (index == 4){
			BackGroundLevel5.setVisible(true);
		}
		else if (index == 5){
			BackGroundLevel6.setVisible(true);
		}
		else if (index == 6){
			BackGroundLevel7.setVisible(true);
		}
		else if (index == 7){
			BackGroundLevel8.setVisible(true);
		}
		else if (index == 8){
			BackGroundLevel9.setVisible(true);
		}
		else if (index == 9){
			BackGroundLevel10.setVisible(true);
		}
		else if (index == 10){
			BackGroundLevel11.setVisible(true);
		}
		else if (index == 11){
			BackGroundLevel12.setVisible(true);
		}
		
		if (lastbindex == 0 && lastbindex != index){
			BackGroundLevel1.setVisible(false);
		}
		else if (lastbindex == 1 && lastbindex != index){
			BackGroundLevel2.setVisible(false);
		}
		else if (lastbindex == 2 && lastbindex != index){
			BackGroundLevel3.setVisible(false);
		}
		else if (lastbindex == 3 && lastbindex != index){
			BackGroundLevel4.setVisible(false);
		}
		else if (lastbindex == 4 && lastbindex != index){
			BackGroundLevel5.setVisible(false);
		}
		else if (lastbindex == 5 && lastbindex != index){
			BackGroundLevel6.setVisible(false);
		}
		else if (lastbindex == 6 && lastbindex != index){
			BackGroundLevel7.setVisible(false);
		}
		else if (lastbindex == 7 && lastbindex != index){
			BackGroundLevel8.setVisible(false);
		}
		else if (lastbindex == 8 && lastbindex != index){
			BackGroundLevel9.setVisible(false);
		}
		else if (lastbindex == 9 && lastbindex != index){
			BackGroundLevel10.setVisible(false);
		}
		else if (lastbindex == 10 && lastbindex != index){
			BackGroundLevel11.setVisible(false);
		}
		else if (lastbindex == 11 && lastbindex != index){
			BackGroundLevel12.setVisible(false);
		}
		lastbindex = index;
		
	}
	
	private void pokemonindex(int index){
		if (index == 0){
			Pokemon1.setVisible(true);
		}
		else if (index == 1){
			Pokemon2.setVisible(true);
		}
		else if (index == 2){
			Pokemon3.setVisible(true);
		}
		else if (index == 3){
			Pokemon4.setVisible(true);
		}
		else if (index == 4){
			Pokemon5.setVisible(true);
		}
		else if (index == 5){
			Pokemon6.setVisible(true);
		}
		else if (index == 6){
			Pokemon7.setVisible(true);
		}
		else if (index == 7){
			Pokemon8.setVisible(true);
		}
		else if (index == 8){
			Pokemon9.setVisible(true);
		}
		else if (index == 9){
			Pokemon10.setVisible(true);
		}
		else if (index == 10){
			Pokemon11.setVisible(true);
		}
		
		if (lastpindex == 0 && lastpindex != index){
			Pokemon1.setVisible(false);
		}
		else if (lastpindex == 1 && lastpindex != index){
			Pokemon2.setVisible(false);
		}
		else if (lastpindex == 2 && lastpindex != index){
			Pokemon3.setVisible(false);
		}
		else if (lastpindex == 3 && lastpindex != index){
			Pokemon4.setVisible(false);
		}
		else if (lastpindex == 4 && lastpindex != index){
			Pokemon5.setVisible(false);
		}
		else if (lastpindex == 5 && lastpindex != index){
			Pokemon6.setVisible(false);
		}
		else if (lastpindex == 6 && lastpindex != index){
			Pokemon7.setVisible(false);
		}
		else if (lastpindex == 7 && lastpindex != index){
			Pokemon8.setVisible(false);
		}
		else if (lastpindex == 8 && lastpindex != index){
			Pokemon9.setVisible(false);
		}
		else if (lastpindex == 9 && lastpindex != index){
			Pokemon10.setVisible(false);
		}
		else if (lastpindex == 10 && lastpindex != index){
			Pokemon11.setVisible(false);
		}
		lastpindex = index;
		
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
			correct = 0;
			mistake = 0;
			
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
}
