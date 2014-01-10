


	import javax.swing.*;

	import java.awt.Color;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
import java.util.Random;
public class Calculator implements  ActionListener, SwingConstants{

	    // Definition of global values and items that are part of the GUI.
	
		boolean enemyBoosted = false;
		boolean userBoosted = false;
		int userHPAmount = 0;
		int enemyHPAmount = 0;
		int userAttackAmount = 0;
		int userSkillAmount = 0;
		int userSpeedAmount = 0;
		int userDefenseAmount = 0;
		int userLuckAmount = 0;
		int userTriangleAmount = 0;
		int userWeaponMightAmount = 0;
		int userWeaponCritChanceAmount = 0;
		int userTerrainBonusAmount = 0;
		int enemyTerrainBonusAmount = 0;
		int userSupportAmount = 0;
		int userWeaponAccuracyAmount = 0;
		int enemyAttackAmount = 0;
		int enemySkillAmount = 0;
		int enemySpeedAmount = 0;
		int enemyDefenseAmount = 0;
		int enemyLuckAmount = 0;
		int enemyTriangleAmount = 0;
		int enemyWeaponMightAmount = 0;
		int enemyWeaponCritChanceAmount = 0;
		int enemySupportAmount = 0;
		int enemyWeaponAccuracyAmount = 0;
		int enemyClassCritAmount = 0;
		int userClassCritAmount = 0;
		int userLevelAmount = 0;
		int enemyLevelAmount = 0;
		int currentExpAmount = 0;
		int userAttackGrowthAmount = 0;
		int userSkillGrowthAmount = 0;
		int userDefenseGrowthAmount = 0;
		int userResistanceGrowthAmount = 0;
		int userLuckGrowthAmount = 0;
		int userSpeedGrowthAmount = 0;
		int userHPGrowthAmount = 0;
		int isAttackerAmount = 0;
		int temp = 0;
		String userAttackHit = "";
		String enemyAttackHit = "";
		String userAttackDouble = "";
		String enemyAttackDouble = "";
		String[] weaponsList = {"Iron Sword", "Steel Sword", "Silver Sword", "Iron Blade", "Steel Blade", "Silver Blade", "Longsword", "Wyrmslayer", "Armorslayer", "Lance Reaver", "Brave Sword", "Killing Edge", "Tizona", "Light Brand", "Rune Sword", "Wind Sword", "Iron Lance", "Steel Lance", "Silver Lance", "Slim Lance", "Killer Lance", "Brave Lance", "Javelin", "Short Spear", "Spear", "Horseslayer", "Axe Reaver", "Rhongomiant", "Reginleif", "Ascalon", "Iron Axe", "Steel Axe", "Silver Axe", "Killer Axe", "Brave Axe", "Hammer", "Halberd", "Sword Reaver", "Hand Axe", "Tomahawk", "Perun", "Iron Bow", "Steel Bow", "Silver Bow", "Short Bow", "Longbow", "Killer Bow", "Brave Bow", "Gandiva", "Fire", "Thunder", "Elfire", "Aircali", "Bolting", "Fimbulv", "Zephyr", "Flux", "Nosferatu", "Luna", "Eclipse", "Fenrir", "Nephtys", "Lightning", "Shine", "Divine", "Purge", "Aura", "Eos", "No Weapon"};

		JComboBox<String> userWeapons, enemyWeapons;


	    JPanel titlePanel, dataPanel, buttonPanel;
	    JLabel redLabel, blueLabel, growthsLabel;
	    JLabel randomTextLabel;
	    JLabel userWeaponLabel, enemyWeaponLabel;
	    JLabel userAttackGrowthLabel, userSkillGrowthLabel, userHPGrowthLabel, userDefenseGrowthLabel;
	    JLabel userSpeedGrowthLabel, userLuckGrowthLabel, userResistanceGrowthLabel;
	    JLabel userAttackGrowthLabelAmount, userSkillGrowthLabelAmount, userHPGrowthLabelAmount, userDefenseGrowthLabelAmount;
	    JLabel userSpeedGrowthLabelAmount, userLuckGrowthLabelAmount, userResistanceGrowthLabelAmount;
	    JLabel userAttackLabel, userSkillLabel, userSpeedLabel, userDefenseLabel, userLuckLabel, userTriangleLabel, userWeaponMightLabel;
	    JLabel userWeaponCritChanceLabel, userTerrainBonusLabel, enemyTerrainBonusLabel, userSupportLabel, userWeaponAccuracyLabel, userHPLabel;
	    JLabel enemyAttackLabel, enemySkillLabel, enemySpeedLabel, enemyDefenseLabel, enemyLuckLabel, enemyTriangleLabel, enemyWeaponMightLabel;
	    JLabel enemyWeaponCritChanceLabel, enemySupportLabel, enemyWeaponAccuracyLabel, enemyHPLabel;
	    JLabel userClassCritLabel, enemyClassCritLabel;
	    JLabel expGained, userLevelLabel, enemyLevelLabel, currentEXPLabel, text1Label, text2Label, text3Label, text4Label;
	    JTextField userHP, enemyHP;
	    JTextField userAttack, userSkill, userSpeed, userDefense, userLuck, userTriangle, userWeaponMight;
	    JTextField userWeaponCritChance, userTerrainBonus, enemyTerrainBonus, userSupport, userWeaponAccuracy;
	    JTextField enemyAttack, enemySkill, enemySpeed, enemyDefense, enemyLuck, enemyTriangle, enemyWeaponMight;
	    JTextField enemyWeaponCritChance, enemySupport, enemyWeaponAccuracy;
	    JTextField userClassCrit, enemyClassCrit, userLevel, enemyLevel, currentEXP;
	    JTextField userAttackGrowth, userSkillGrowth, userHPGrowth, userDefenseGrowth;
	    JTextField userSpeedGrowth, userLuckGrowth, userResistanceGrowth;
	    JCheckBox isUser;
	    JButton calculateButton, resetButton, switchButton;

	    public JPanel createContentPane (){

	        // We create a bottom JPanel to place everything on.
	        JPanel totalGUI = new JPanel();
	        totalGUI.setLayout(null);

	        // Creation of a Panel to contain the title labels
	        titlePanel = new JPanel();
	        titlePanel.setLayout(null);
	        titlePanel.setLocation(10, 0);
	        titlePanel.setSize(800, 30);
	        totalGUI.add(titlePanel);

	        blueLabel = new JLabel("Attacker");
	        blueLabel.setLocation(0, 0);
	        blueLabel.setSize(120, 30);
	        blueLabel.setHorizontalAlignment(0);
	        blueLabel.setForeground(Color.blue);
	        titlePanel.add(blueLabel);

	        redLabel = new JLabel("Defender");
	        redLabel.setLocation(270, 0);
	        redLabel.setSize(120, 30);
	        redLabel.setHorizontalAlignment(0);
	        redLabel.setForeground(Color.red);
	        titlePanel.add(redLabel);
	        
	        growthsLabel = new JLabel("User Growths");
	        growthsLabel.setLocation(500, 0);
	        growthsLabel.setSize(120, 30);
	        growthsLabel.setHorizontalAlignment(0);
	        growthsLabel.setForeground(Color.green);
	        titlePanel.add(growthsLabel);
	        
	        isUser = new JCheckBox("User Controlled?");
	        isUser.setLocation(120, 0);
	        isUser.setSize(120, 30);
	        titlePanel.add(isUser);

	        // Creation of a Panel to contain the score labels.
	        dataPanel = new JPanel();
	        dataPanel.setLayout(null);
	        dataPanel.setLocation(10, 40);
	        dataPanel.setSize(900, 500);
	        totalGUI.add(dataPanel);
	        
	        userWeaponLabel = new JLabel("Weapon: ");
	        userWeaponLabel.setLocation(0, 450);
	        userWeaponLabel.setSize(80, 30);
	        userWeaponLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userWeaponLabel);
	        
	        enemyWeaponLabel = new JLabel("Weapon: ");
	        enemyWeaponLabel.setLocation(250, 450);
	        enemyWeaponLabel.setSize(80, 30);
	        enemyWeaponLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyWeaponLabel);

			userWeapons = new JComboBox<String>(weaponsList);
			userWeapons.setSelectedIndex(0);
			userWeapons.addActionListener(this);
			userWeapons.setLocation(80, 450);
			userWeapons.setSize(120, 30);
			dataPanel.add(userWeapons);
			
			enemyWeapons = new JComboBox<String>(weaponsList);
			enemyWeapons.setSelectedIndex(0);
			enemyWeapons.addActionListener(this);
			enemyWeapons.setLocation(330,450);
			enemyWeapons.setSize(120, 30);
			dataPanel.add(enemyWeapons);
	        
	        userLevelLabel = new JLabel("Level");
	        userLevelLabel.setLocation(0,0);
	        userLevelLabel.setSize(120, 30);
	        userLevelLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userLevelLabel);
	        
	        enemyLevelLabel = new JLabel("Level");
	        enemyLevelLabel.setLocation(250,0);
	        enemyLevelLabel.setSize(120, 30);
	        enemyLevelLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyLevelLabel);

	        userHPLabel = new JLabel("HP");
	        userHPLabel.setLocation(0, 30);
	        userHPLabel.setSize(120, 30);
	        userHPLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userHPLabel);
	        
	        userAttackLabel = new JLabel("Attack/Magic");
	        userAttackLabel.setLocation(0, 60);
	        userAttackLabel.setSize(120, 30);
	        userAttackLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userAttackLabel);
	        
	        userSkillLabel = new JLabel("Skill");
	        userSkillLabel.setLocation(0, 90);
	        userSkillLabel.setSize(120, 30);
	        userSkillLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userSkillLabel);

	        userSpeedLabel = new JLabel("Speed");
	        userSpeedLabel.setLocation(0, 120);
	        userSpeedLabel.setSize(120, 30);
	        userSpeedLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userSpeedLabel);
	        
	        userDefenseLabel = new JLabel("Defense/Res");
	        userDefenseLabel.setLocation(0, 150);
	        userDefenseLabel.setSize(120, 30);
	        userDefenseLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userDefenseLabel);
	        
	        userLuckLabel = new JLabel("Luck");
	        userLuckLabel.setLocation(0, 180);
	        userLuckLabel.setSize(120, 30);
	        userLuckLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userLuckLabel);
	        
	        userTriangleLabel = new JLabel("Triangle Advantage?");
	        userTriangleLabel.setLocation(0, 210);
	        userTriangleLabel.setSize(120, 30);
	        userTriangleLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userTriangleLabel);

	        userWeaponMightLabel = new JLabel("Weapon's Might");
	        userWeaponMightLabel.setLocation(0, 240);
	        userWeaponMightLabel.setSize(120, 30);
	        userWeaponMightLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userWeaponMightLabel);
	        
	        userWeaponCritChanceLabel = new JLabel("Weapon's Crit");
	        userWeaponCritChanceLabel.setLocation(0, 270);
	        userWeaponCritChanceLabel.setSize(120, 30);
	        userWeaponCritChanceLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userWeaponCritChanceLabel);
	        
	        userWeaponAccuracyLabel = new JLabel("Weapon's Accuracy");
	        userWeaponAccuracyLabel.setLocation(0, 300);
	        userWeaponAccuracyLabel.setSize(120, 30);
	        userWeaponAccuracyLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userWeaponAccuracyLabel);
	        
	        userSupportLabel = new JLabel("Support Level");
	        userSupportLabel.setLocation(0, 330);
	        userSupportLabel.setSize(120, 30);
	        userSupportLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userSupportLabel);
	        
	        userClassCritLabel = new JLabel("Class Crit");
	        userClassCritLabel.setLocation(0, 360);
	        userClassCritLabel.setSize(120, 30);
	        userClassCritLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userClassCritLabel);
	        
	        userTerrainBonusLabel = new JLabel("Terrain Bonus");
	        userTerrainBonusLabel.setLocation(0, 390);
	        userTerrainBonusLabel.setSize(120, 30);
	        userTerrainBonusLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userTerrainBonusLabel);
	        
	        currentEXPLabel = new JLabel("Current EXP");
	        currentEXPLabel.setLocation(0, 420);
	        currentEXPLabel.setSize(120, 30);
	        currentEXPLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(currentEXPLabel);
	        
	        text1Label = new JLabel("");
	        text1Label.setLocation(500, 210);
	        text1Label.setSize(400,30);
	        text1Label.setHorizontalAlignment(LEFT);
	        dataPanel.add(text1Label);
	        
	        text2Label = new JLabel("");
	        text2Label.setLocation(500, 240);
	        text2Label.setSize(400,30);
	        text2Label.setHorizontalAlignment(LEFT);
	        dataPanel.add(text2Label);
	        
	        text3Label = new JLabel("");
	        text3Label.setLocation(500, 270);
	        text3Label.setSize(400,30);
	        text3Label.setHorizontalAlignment(LEFT);
	        dataPanel.add(text3Label);
	        
	        text4Label = new JLabel("");
	        text4Label.setLocation(500, 300);
	        text4Label.setSize(400,30);
	        text4Label.setHorizontalAlignment(LEFT);
	        dataPanel.add(text4Label);
	        
	        enemyTerrainBonusLabel = new JLabel("Terrain Bonus");
	        enemyTerrainBonusLabel.setLocation(250, 390);
	        enemyTerrainBonusLabel.setSize(120, 30);
	        enemyTerrainBonusLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyTerrainBonusLabel);
	        
	        enemyClassCritLabel = new JLabel("Class Crit");
	        enemyClassCritLabel.setLocation(250, 360);
	        enemyClassCritLabel.setSize(120, 30);
	        enemyClassCritLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyClassCritLabel);
	        
	        enemyHPLabel = new JLabel("HP");
	        enemyHPLabel.setLocation(250, 30);
	        enemyHPLabel.setSize(120, 30);
	        enemyHPLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyHPLabel);
	        
	        enemyAttackLabel = new JLabel("Attack/Magic");
	        enemyAttackLabel.setLocation(250, 60);
	        enemyAttackLabel.setSize(120, 30);
	        enemyAttackLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyAttackLabel);
	        
	        enemySkillLabel = new JLabel("Skill");
	        enemySkillLabel.setLocation(250, 90);
	        enemySkillLabel.setSize(120, 30);
	        enemySkillLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemySkillLabel);

	        enemySpeedLabel = new JLabel("Speed");
	        enemySpeedLabel.setLocation(250, 120);
	        enemySpeedLabel.setSize(120, 30);
	        enemySpeedLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemySpeedLabel);
	        
	        enemyDefenseLabel = new JLabel("Defense/Res");
	        enemyDefenseLabel.setLocation(250, 150);
	        enemyDefenseLabel.setSize(120, 30);
	        enemyDefenseLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyDefenseLabel);
	        
	        enemyLuckLabel = new JLabel("Luck");
	        enemyLuckLabel.setLocation(250, 180);
	        enemyLuckLabel.setSize(120, 30);
	        enemyLuckLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyLuckLabel);
	        
	        enemyTriangleLabel = new JLabel("Triangle Advantage?");
	        enemyTriangleLabel.setLocation(250, 210);
	        enemyTriangleLabel.setSize(120, 30);
	        enemyTriangleLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyTriangleLabel);

	        enemyWeaponMightLabel = new JLabel("Weapon's Might");
	        enemyWeaponMightLabel.setLocation(250, 240);
	        enemyWeaponMightLabel.setSize(120, 30);
	        enemyWeaponMightLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyWeaponMightLabel);
	        
	        enemyWeaponCritChanceLabel = new JLabel("Weapon's Crit");
	        enemyWeaponCritChanceLabel.setLocation(250, 270);
	        enemyWeaponCritChanceLabel.setSize(120, 30);
	        enemyWeaponCritChanceLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyWeaponCritChanceLabel);
	        
	        enemyWeaponAccuracyLabel = new JLabel("Weapon's Accuracy");
	        enemyWeaponAccuracyLabel.setLocation(250, 300);
	        enemyWeaponAccuracyLabel.setSize(120, 30);
	        enemyWeaponAccuracyLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyWeaponAccuracyLabel);
	        
	        randomTextLabel = new JLabel("");
	        randomTextLabel.setLocation(420, 360);
	        randomTextLabel.setSize(400, 120);
	        randomTextLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(randomTextLabel);
	        
	        enemySupportLabel = new JLabel("Support Level");
	        enemySupportLabel.setLocation(250, 330);
	        enemySupportLabel.setSize(120, 30);
	        enemySupportLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemySupportLabel);
	        
	        userAttackGrowthLabelAmount = new JLabel("+0");
	        userAttackGrowthLabelAmount.setLocation(640, 30);
	        userAttackGrowthLabelAmount.setSize(120, 30);
	        userAttackGrowthLabelAmount.setHorizontalAlignment(LEFT);
	        dataPanel.add(userAttackGrowthLabelAmount);

	        userSkillGrowthLabelAmount = new JLabel("+0");
	        userSkillGrowthLabelAmount.setLocation(640, 60);
	        userSkillGrowthLabelAmount.setSize(120, 30);
	        userSkillGrowthLabelAmount.setHorizontalAlignment(LEFT);
	        dataPanel.add(userSkillGrowthLabelAmount);
	        
	        userHPGrowthLabelAmount = new JLabel("+0");
	        userHPGrowthLabelAmount.setLocation(640, 0);
	        userHPGrowthLabelAmount.setSize(120, 30);
	        userHPGrowthLabelAmount.setHorizontalAlignment(LEFT);
	        dataPanel.add(userHPGrowthLabelAmount);
	        
	        userDefenseGrowthLabelAmount = new JLabel("+0");
	        userDefenseGrowthLabelAmount.setLocation(640, 150);
	        userDefenseGrowthLabelAmount.setSize(120, 30);
	        userDefenseGrowthLabelAmount.setHorizontalAlignment(LEFT);
	        dataPanel.add(userDefenseGrowthLabelAmount);
	        
	        userSpeedGrowthLabelAmount = new JLabel("+0");
	        userSpeedGrowthLabelAmount.setLocation(640, 90);
	        userSpeedGrowthLabelAmount.setSize(120, 30);
	        userSpeedGrowthLabelAmount.setHorizontalAlignment(LEFT);
	        dataPanel.add(userSpeedGrowthLabelAmount);
	        
	        userLuckGrowthLabelAmount = new JLabel("+0");
	        userLuckGrowthLabelAmount.setLocation(640, 120);
	        userLuckGrowthLabelAmount.setSize(120, 30);
	        userLuckGrowthLabelAmount.setHorizontalAlignment(LEFT);
	        dataPanel.add(userLuckGrowthLabelAmount);
	        
	        userResistanceGrowthLabelAmount = new JLabel("+0");
	        userResistanceGrowthLabelAmount.setLocation(640, 180);
	        userResistanceGrowthLabelAmount.setSize(120, 30);
	        userResistanceGrowthLabelAmount.setHorizontalAlignment(LEFT);
	        dataPanel.add(userResistanceGrowthLabelAmount);

	        
	        userAttackGrowthLabel = new JLabel("Attack/Mag");
	        userAttackGrowthLabel.setLocation(480, 30);
	        userAttackGrowthLabel.setSize(120, 30);
	        userAttackGrowthLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userAttackGrowthLabel);

	        userSkillGrowthLabel = new JLabel("Skill");
	        userSkillGrowthLabel.setLocation(480, 60);
	        userSkillGrowthLabel.setSize(120, 30);
	        userSkillGrowthLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userSkillGrowthLabel);
	        
	        userHPGrowthLabel = new JLabel("HP");
	        userHPGrowthLabel.setLocation(480, 0);
	        userHPGrowthLabel.setSize(120, 30);
	        userHPGrowthLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userHPGrowthLabel);
	        
	        userDefenseGrowthLabel = new JLabel("Defense");
	        userDefenseGrowthLabel.setLocation(480, 150);
	        userDefenseGrowthLabel.setSize(120, 30);
	        userDefenseGrowthLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userDefenseGrowthLabel);
	        
	        userSpeedGrowthLabel = new JLabel("Speed");
	        userSpeedGrowthLabel.setLocation(480, 90);
	        userSpeedGrowthLabel.setSize(120, 30);
	        userSpeedGrowthLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userSpeedGrowthLabel);
	        
	        userLuckGrowthLabel = new JLabel("Luck");
	        userLuckGrowthLabel.setLocation(480, 120);
	        userLuckGrowthLabel.setSize(120, 30);
	        userLuckGrowthLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userLuckGrowthLabel);
	        
	        userResistanceGrowthLabel = new JLabel("Resistance");
	        userResistanceGrowthLabel.setLocation(480, 180);
	        userResistanceGrowthLabel.setSize(120, 30);
	        userResistanceGrowthLabel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userResistanceGrowthLabel);
	        
	        userAttackGrowth = new JTextField("0");
	        userAttackGrowth.setLocation(600, 30);
	        userAttackGrowth.setSize(40, 30);
	        userAttackGrowth.setHorizontalAlignment(LEFT);
	        dataPanel.add(userAttackGrowth);
	        
	        userSkillGrowth = new JTextField("0");
	        userSkillGrowth.setLocation(600, 60);
	        userSkillGrowth.setSize(40, 30);
	        userSkillGrowth.setHorizontalAlignment(LEFT);
	        dataPanel.add(userSkillGrowth);
	        
	        userHPGrowth = new JTextField("0");
	        userHPGrowth.setLocation(600, 0);
	        userHPGrowth.setSize(40, 30);
	        userHPGrowth.setHorizontalAlignment(LEFT);
	        dataPanel.add(userHPGrowth);
	        
	        userDefenseGrowth = new JTextField("0");
	        userDefenseGrowth.setLocation(600, 150);
	        userDefenseGrowth.setSize(40, 30);
	        userDefenseGrowth.setHorizontalAlignment(LEFT);
	        dataPanel.add(userDefenseGrowth);
	        
	        userSpeedGrowth = new JTextField("0");
	        userSpeedGrowth.setLocation(600, 90);
	        userSpeedGrowth.setSize(40, 30);
	        userSpeedGrowth.setHorizontalAlignment(LEFT);
	        dataPanel.add(userSpeedGrowth);
	        
	        userLuckGrowth = new JTextField("0");
	        userLuckGrowth.setLocation(600, 120);
	        userLuckGrowth.setSize(40, 30);
	        userLuckGrowth.setHorizontalAlignment(LEFT);
	        dataPanel.add(userLuckGrowth);
	        
	        userResistanceGrowth = new JTextField("0");
	        userResistanceGrowth.setLocation(600, 180);
	        userResistanceGrowth.setSize(40, 30);
	        userResistanceGrowth.setHorizontalAlignment(LEFT);
	        dataPanel.add(userResistanceGrowth);
	        
	        
	        currentEXP = new JTextField("0");
	        currentEXP.setLocation(120, 420);
	        currentEXP.setSize(40, 30);
	        currentEXP.setHorizontalAlignment(LEFT);
	        dataPanel.add(currentEXP);
	        
	        userLevel = new JTextField("0");
	        userLevel.setLocation(120, 0);
	        userLevel.setSize(40, 30);
	        userLevel.setHorizontalAlignment(LEFT);
	        dataPanel.add(userLevel);
	        
	        enemyLevel = new JTextField("0");
	        enemyLevel.setLocation(370,0);
	        enemyLevel.setSize(40,30);
	        enemyLevel.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyLevel);
	        
	        enemyHP = new JTextField("0");
	        enemyHP.setLocation(370, 30);
	        enemyHP.setSize(40, 30);
	        enemyHP.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyHP);
	        
	        enemyAttack = new JTextField("0");
	        enemyAttack.setLocation(370, 60);
	        enemyAttack.setSize(40, 30);
	        enemyAttack.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyAttack);
	        
	        enemySkill = new JTextField("0");
	        enemySkill.setLocation(370, 90);
	        enemySkill.setSize(40, 30);
	        enemySkill.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemySkill);

	        enemySpeed = new JTextField("0");
	        enemySpeed.setLocation(370, 120);
	        enemySpeed.setSize(40, 30);
	        enemySpeed.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemySpeed);
	        
	        enemyDefense = new JTextField("0");
	        enemyDefense.setLocation(370, 150);
	        enemyDefense.setSize(40, 30);
	        enemyDefense.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyDefense);
	        
	        enemyLuck = new JTextField("0");
	        enemyLuck.setLocation(370, 180);
	        enemyLuck.setSize(40, 30);
	        enemyLuck.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyLuck);
	        
	        enemyTriangle = new JTextField("0");
	        enemyTriangle.setLocation(370, 210);
	        enemyTriangle.setSize(40, 30);
	        enemyTriangle.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyTriangle);

	        enemyWeaponMight = new JTextField("0");
	        enemyWeaponMight.setLocation(370, 240);
	        enemyWeaponMight.setSize(40, 30);
	        enemyWeaponMight.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyWeaponMight);
	        
	        enemyWeaponCritChance = new JTextField("0");
	        enemyWeaponCritChance.setLocation(370, 270);
	        enemyWeaponCritChance.setSize(40, 30);
	        enemyWeaponCritChance.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyWeaponCritChance);
	        
	        enemyWeaponAccuracy = new JTextField("0");
	        enemyWeaponAccuracy.setLocation(370, 300);
	        enemyWeaponAccuracy.setSize(40, 30);
	        enemyWeaponAccuracy.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyWeaponAccuracy);
	        
	        enemySupport = new JTextField("0");
	        enemySupport.setLocation(370, 330);
	        enemySupport.setSize(40, 30);
	        enemySupport.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemySupport);
	        
	        enemyClassCrit = new JTextField("0");
	        enemyClassCrit.setLocation(370, 360);
	        enemyClassCrit.setSize(40, 30);
	        enemyClassCrit.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyClassCrit);
	        
	        userClassCrit = new JTextField("0");
	        userClassCrit.setLocation(120, 360);
	        userClassCrit.setSize(40, 30);
	        userClassCrit.setHorizontalAlignment(LEFT);
	        dataPanel.add(userClassCrit);
	        
	        userTerrainBonus = new JTextField("0");
	        userTerrainBonus.setLocation(120, 390);
	        userTerrainBonus.setSize(40,30);
	        userTerrainBonus.setHorizontalAlignment(LEFT);
	        dataPanel.add(userTerrainBonus);
	        
	        enemyTerrainBonus = new JTextField("0");
	        enemyTerrainBonus.setLocation(370, 390);
	        enemyTerrainBonus.setSize(40,30);
	        enemyTerrainBonus.setHorizontalAlignment(LEFT);
	        dataPanel.add(enemyTerrainBonus);

	        userHP = new JTextField("0");
	        userHP.setLocation(120, 30);
	        userHP.setSize(40, 30);
	        userHP.setHorizontalAlignment(LEFT);
	        dataPanel.add(userHP);
	        
	        userAttack = new JTextField("0");
	        userAttack.setLocation(120, 60);
	        userAttack.setSize(40, 30);
	        userAttack.setHorizontalAlignment(LEFT);
	        dataPanel.add(userAttack);
	        
	        userSkill = new JTextField("0");
	        userSkill.setLocation(120, 90);
	        userSkill.setSize(40, 30);
	        userSkill.setHorizontalAlignment(LEFT);
	        dataPanel.add(userSkill);

	        userSpeed = new JTextField("0");
	        userSpeed.setLocation(120, 120);
	        userSpeed.setSize(40, 30);
	        userSpeed.setHorizontalAlignment(LEFT);
	        dataPanel.add(userSpeed);
	        
	        userDefense = new JTextField("0");
	        userDefense.setLocation(120, 150);
	        userDefense.setSize(40, 30);
	        userDefense.setHorizontalAlignment(LEFT);
	        dataPanel.add(userDefense);
	        
	        userLuck = new JTextField("0");
	        userLuck.setLocation(120, 180);
	        userLuck.setSize(40, 30);
	        userLuck.setHorizontalAlignment(LEFT);
	        dataPanel.add(userLuck);
	        
	        userTriangle = new JTextField("0");
	        userTriangle.setLocation(120, 210);
	        userTriangle.setSize(40, 30);
	        userTriangle.setHorizontalAlignment(LEFT);
	        dataPanel.add(userTriangle);

	        userWeaponMight = new JTextField("0");
	        userWeaponMight.setLocation(120, 240);
	        userWeaponMight.setSize(40, 30);
	        userWeaponMight.setHorizontalAlignment(LEFT);
	        dataPanel.add(userWeaponMight);
	        
	        userWeaponCritChance = new JTextField("0");
	        userWeaponCritChance.setLocation(120, 270);
	        userWeaponCritChance.setSize(40, 30);
	        userWeaponCritChance.setHorizontalAlignment(LEFT);
	        dataPanel.add(userWeaponCritChance);
	        
	        userWeaponAccuracy = new JTextField("0");
	        userWeaponAccuracy.setLocation(120, 300);
	        userWeaponAccuracy.setSize(40, 30);
	        userWeaponAccuracy.setHorizontalAlignment(LEFT);
	        dataPanel.add(userWeaponAccuracy);
	        
	        userSupport = new JTextField("0");
	        userSupport.setLocation(120, 330);
	        userSupport.setSize(40, 30);
	        userSupport.setHorizontalAlignment(LEFT);
	        dataPanel.add(userSupport);


	        
	        // Creation of a Panel to contain all the JButtons.
	        buttonPanel = new JPanel();
	        buttonPanel.setLayout(null);
	        buttonPanel.setLocation(10, 550);
	        buttonPanel.setSize(380, 70);
	        totalGUI.add(buttonPanel);

	        // We create a button and manipulate it using the syntax we have
	        // used before. Now each button has an ActionListener which posts 
	        // its action out when the button is pressed.
	        calculateButton = new JButton("Calculate");
	        calculateButton.setLocation(0, 0);
	        calculateButton.setSize(120, 30);
	        calculateButton.addActionListener(this);
	        buttonPanel.add(calculateButton);


	        resetButton = new JButton("Reset");
	        resetButton.setLocation(130, 0);
	        resetButton.setSize(120, 30);
	        resetButton.addActionListener(this);
	        buttonPanel.add(resetButton);
	        
	        switchButton = new JButton("Switch");
	        switchButton.setLocation(260, 0);
	        switchButton.setSize(120, 30);
	        switchButton.addActionListener(this);
	        buttonPanel.add(switchButton);
	        
	        totalGUI.setOpaque(true);
	        return totalGUI;
	    }

	    // This is the new ActionPerformed Method.
	    // It catches any events with an ActionListener attached.
	    // Using an if statement, we can determine which button was pressed
	    // and change the appropriate values in our GUI.
	    public void actionPerformed(ActionEvent e) {
	    	userTriangleAmount = 0;
	    	enemyTriangleAmount = 0;
	    	if (enemyWeapons.getSelectedItem().equals("Iron Sword")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 5;
	    		enemyWeaponAccuracyAmount = 90;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Axe")||userWeapons.getSelectedItem().equals("Steel Axe")||userWeapons.getSelectedItem().equals("Silver Axe")||userWeapons.getSelectedItem().equals("Killer Axe")||userWeapons.getSelectedItem().equals("Brave Axe")||userWeapons.getSelectedItem().equals("Hammer")||userWeapons.getSelectedItem().equals("Halberd")||userWeapons.getSelectedItem().equals("Hand Axe")||userWeapons.getSelectedItem().equals("Tomahawk")||userWeapons.getSelectedItem().equals("Perun")||userWeapons.getSelectedItem().equals("Lance Reaver")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Steel Sword")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 8;
	    		enemyWeaponAccuracyAmount = 75;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Axe")||userWeapons.getSelectedItem().equals("Steel Axe")||userWeapons.getSelectedItem().equals("Silver Axe")||userWeapons.getSelectedItem().equals("Killer Axe")||userWeapons.getSelectedItem().equals("Brave Axe")||userWeapons.getSelectedItem().equals("Hammer")||userWeapons.getSelectedItem().equals("Halberd")||userWeapons.getSelectedItem().equals("Hand Axe")||userWeapons.getSelectedItem().equals("Tomahawk")||userWeapons.getSelectedItem().equals("Perun")||userWeapons.getSelectedItem().equals("Lance Reaver")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Silver Sword")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 13;
	    		enemyWeaponAccuracyAmount = 80;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Axe")||userWeapons.getSelectedItem().equals("Steel Axe")||userWeapons.getSelectedItem().equals("Silver Axe")||userWeapons.getSelectedItem().equals("Killer Axe")||userWeapons.getSelectedItem().equals("Brave Axe")||userWeapons.getSelectedItem().equals("Hammer")||userWeapons.getSelectedItem().equals("Halberd")||userWeapons.getSelectedItem().equals("Hand Axe")||userWeapons.getSelectedItem().equals("Tomahawk")||userWeapons.getSelectedItem().equals("Perun")||userWeapons.getSelectedItem().equals("Lance Reaver")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Iron Blade")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 9;
	    		enemyWeaponAccuracyAmount = 70;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Axe")||userWeapons.getSelectedItem().equals("Steel Axe")||userWeapons.getSelectedItem().equals("Silver Axe")||userWeapons.getSelectedItem().equals("Killer Axe")||userWeapons.getSelectedItem().equals("Brave Axe")||userWeapons.getSelectedItem().equals("Hammer")||userWeapons.getSelectedItem().equals("Halberd")||userWeapons.getSelectedItem().equals("Hand Axe")||userWeapons.getSelectedItem().equals("Tomahawk")||userWeapons.getSelectedItem().equals("Perun")||userWeapons.getSelectedItem().equals("Lance Reaver")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Steel Blade")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 11;
	    		enemyWeaponAccuracyAmount = 65;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Axe")||userWeapons.getSelectedItem().equals("Steel Axe")||userWeapons.getSelectedItem().equals("Silver Axe")||userWeapons.getSelectedItem().equals("Killer Axe")||userWeapons.getSelectedItem().equals("Brave Axe")||userWeapons.getSelectedItem().equals("Hammer")||userWeapons.getSelectedItem().equals("Halberd")||userWeapons.getSelectedItem().equals("Hand Axe")||userWeapons.getSelectedItem().equals("Tomahawk")||userWeapons.getSelectedItem().equals("Perun")||userWeapons.getSelectedItem().equals("Lance Reaver")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Silver Blade")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 14;
	    		enemyWeaponAccuracyAmount = 60;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Axe")||userWeapons.getSelectedItem().equals("Steel Axe")||userWeapons.getSelectedItem().equals("Silver Axe")||userWeapons.getSelectedItem().equals("Killer Axe")||userWeapons.getSelectedItem().equals("Brave Axe")||userWeapons.getSelectedItem().equals("Hammer")||userWeapons.getSelectedItem().equals("Halberd")||userWeapons.getSelectedItem().equals("Hand Axe")||userWeapons.getSelectedItem().equals("Tomahawk")||userWeapons.getSelectedItem().equals("Perun")||userWeapons.getSelectedItem().equals("Lance Reaver")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Longsword")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 6;
	    		enemyWeaponAccuracyAmount = 85;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Axe")||userWeapons.getSelectedItem().equals("Steel Axe")||userWeapons.getSelectedItem().equals("Silver Axe")||userWeapons.getSelectedItem().equals("Killer Axe")||userWeapons.getSelectedItem().equals("Brave Axe")||userWeapons.getSelectedItem().equals("Hammer")||userWeapons.getSelectedItem().equals("Halberd")||userWeapons.getSelectedItem().equals("Hand Axe")||userWeapons.getSelectedItem().equals("Tomahawk")||userWeapons.getSelectedItem().equals("Perun")||userWeapons.getSelectedItem().equals("Lance Reaver")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Wyrmslayer")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 7;
	    		enemyWeaponAccuracyAmount = 75;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Axe")||userWeapons.getSelectedItem().equals("Steel Axe")||userWeapons.getSelectedItem().equals("Silver Axe")||userWeapons.getSelectedItem().equals("Killer Axe")||userWeapons.getSelectedItem().equals("Brave Axe")||userWeapons.getSelectedItem().equals("Hammer")||userWeapons.getSelectedItem().equals("Halberd")||userWeapons.getSelectedItem().equals("Hand Axe")||userWeapons.getSelectedItem().equals("Tomahawk")||userWeapons.getSelectedItem().equals("Perun")||userWeapons.getSelectedItem().equals("Lance Reaver")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Armorslayer")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 8;
	    		enemyWeaponAccuracyAmount = 80;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Axe")||userWeapons.getSelectedItem().equals("Steel Axe")||userWeapons.getSelectedItem().equals("Silver Axe")||userWeapons.getSelectedItem().equals("Killer Axe")||userWeapons.getSelectedItem().equals("Brave Axe")||userWeapons.getSelectedItem().equals("Hammer")||userWeapons.getSelectedItem().equals("Halberd")||userWeapons.getSelectedItem().equals("Hand Axe")||userWeapons.getSelectedItem().equals("Tomahawk")||userWeapons.getSelectedItem().equals("Perun")||userWeapons.getSelectedItem().equals("Lance Reaver")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Lance Reaver")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 9;
	    		enemyWeaponAccuracyAmount = 75;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Axe")||userWeapons.getSelectedItem().equals("Steel Axe")||userWeapons.getSelectedItem().equals("Silver Axe")||userWeapons.getSelectedItem().equals("Killer Axe")||userWeapons.getSelectedItem().equals("Brave Axe")||userWeapons.getSelectedItem().equals("Hammer")||userWeapons.getSelectedItem().equals("Halberd")||userWeapons.getSelectedItem().equals("Hand Axe")||userWeapons.getSelectedItem().equals("Tomahawk")||userWeapons.getSelectedItem().equals("Perun")||userWeapons.getSelectedItem().equals("Lance Reaver")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Brave Sword")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 9;
	    		enemyWeaponAccuracyAmount = 75;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Axe")||userWeapons.getSelectedItem().equals("Steel Axe")||userWeapons.getSelectedItem().equals("Silver Axe")||userWeapons.getSelectedItem().equals("Killer Axe")||userWeapons.getSelectedItem().equals("Brave Axe")||userWeapons.getSelectedItem().equals("Hammer")||userWeapons.getSelectedItem().equals("Halberd")||userWeapons.getSelectedItem().equals("Hand Axe")||userWeapons.getSelectedItem().equals("Tomahawk")||userWeapons.getSelectedItem().equals("Perun")||userWeapons.getSelectedItem().equals("Lance Reaver")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Killing Edge")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 9;
	    		enemyWeaponAccuracyAmount = 75;
	    		enemyWeaponCritChanceAmount = 30;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Axe")||userWeapons.getSelectedItem().equals("Steel Axe")||userWeapons.getSelectedItem().equals("Silver Axe")||userWeapons.getSelectedItem().equals("Killer Axe")||userWeapons.getSelectedItem().equals("Brave Axe")||userWeapons.getSelectedItem().equals("Hammer")||userWeapons.getSelectedItem().equals("Halberd")||userWeapons.getSelectedItem().equals("Hand Axe")||userWeapons.getSelectedItem().equals("Tomahawk")||userWeapons.getSelectedItem().equals("Perun")||userWeapons.getSelectedItem().equals("Lance Reaver")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Tizona")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 18;
	    		enemyWeaponAccuracyAmount = 85;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Axe")||userWeapons.getSelectedItem().equals("Steel Axe")||userWeapons.getSelectedItem().equals("Silver Axe")||userWeapons.getSelectedItem().equals("Killer Axe")||userWeapons.getSelectedItem().equals("Brave Axe")||userWeapons.getSelectedItem().equals("Hammer")||userWeapons.getSelectedItem().equals("Halberd")||userWeapons.getSelectedItem().equals("Hand Axe")||userWeapons.getSelectedItem().equals("Tomahawk")||userWeapons.getSelectedItem().equals("Perun")||userWeapons.getSelectedItem().equals("Lance Reaver")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Light Brand")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 9;
	    		enemyWeaponAccuracyAmount = 70;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Axe")||userWeapons.getSelectedItem().equals("Steel Axe")||userWeapons.getSelectedItem().equals("Silver Axe")||userWeapons.getSelectedItem().equals("Killer Axe")||userWeapons.getSelectedItem().equals("Brave Axe")||userWeapons.getSelectedItem().equals("Hammer")||userWeapons.getSelectedItem().equals("Halberd")||userWeapons.getSelectedItem().equals("Hand Axe")||userWeapons.getSelectedItem().equals("Tomahawk")||userWeapons.getSelectedItem().equals("Perun")||userWeapons.getSelectedItem().equals("Lance Reaver")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Rune Sword")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 12;
	    		enemyWeaponAccuracyAmount = 65;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Axe")||userWeapons.getSelectedItem().equals("Steel Axe")||userWeapons.getSelectedItem().equals("Silver Axe")||userWeapons.getSelectedItem().equals("Killer Axe")||userWeapons.getSelectedItem().equals("Brave Axe")||userWeapons.getSelectedItem().equals("Hammer")||userWeapons.getSelectedItem().equals("Halberd")||userWeapons.getSelectedItem().equals("Hand Axe")||userWeapons.getSelectedItem().equals("Tomahawk")||userWeapons.getSelectedItem().equals("Perun")||userWeapons.getSelectedItem().equals("Lance Reaver")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Wind Sword")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 9;
	    		enemyWeaponAccuracyAmount = 70;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Axe")||userWeapons.getSelectedItem().equals("Steel Axe")||userWeapons.getSelectedItem().equals("Silver Axe")||userWeapons.getSelectedItem().equals("Killer Axe")||userWeapons.getSelectedItem().equals("Brave Axe")||userWeapons.getSelectedItem().equals("Hammer")||userWeapons.getSelectedItem().equals("Halberd")||userWeapons.getSelectedItem().equals("Hand Axe")||userWeapons.getSelectedItem().equals("Tomahawk")||userWeapons.getSelectedItem().equals("Perun")||userWeapons.getSelectedItem().equals("Lance Reaver")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Iron Lance")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 7;
	    		enemyWeaponAccuracyAmount = 80;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Sword")||userWeapons.getSelectedItem().equals("Steel Sword")||userWeapons.getSelectedItem().equals("Silver Sword")||userWeapons.getSelectedItem().equals("Iron Blade")||userWeapons.getSelectedItem().equals("Steel Blade")||userWeapons.getSelectedItem().equals("Silver Blade")||userWeapons.getSelectedItem().equals("Longsword")||userWeapons.getSelectedItem().equals("Wyrmslayer")||userWeapons.getSelectedItem().equals("Armorslayer")||userWeapons.getSelectedItem().equals("Lance Reaver")||userWeapons.getSelectedItem().equals("Brave Sword")||userWeapons.getSelectedItem().equals("Killing Edge")||userWeapons.getSelectedItem().equals("Tizona")||userWeapons.getSelectedItem().equals("Light Brand")||userWeapons.getSelectedItem().equals("Rune Sword")||userWeapons.getSelectedItem().equals("Wind Sword")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


		        
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Steel Lance")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 10;
	    		enemyWeaponAccuracyAmount = 70;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Sword")||userWeapons.getSelectedItem().equals("Steel Sword")||userWeapons.getSelectedItem().equals("Silver Sword")||userWeapons.getSelectedItem().equals("Iron Blade")||userWeapons.getSelectedItem().equals("Steel Blade")||userWeapons.getSelectedItem().equals("Silver Blade")||userWeapons.getSelectedItem().equals("Longsword")||userWeapons.getSelectedItem().equals("Wyrmslayer")||userWeapons.getSelectedItem().equals("Armorslayer")||userWeapons.getSelectedItem().equals("Lance Reaver")||userWeapons.getSelectedItem().equals("Brave Sword")||userWeapons.getSelectedItem().equals("Killing Edge")||userWeapons.getSelectedItem().equals("Tizona")||userWeapons.getSelectedItem().equals("Light Brand")||userWeapons.getSelectedItem().equals("Rune Sword")||userWeapons.getSelectedItem().equals("Wind Sword")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Silver Lance")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 14;
	    		enemyWeaponAccuracyAmount = 75;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Sword")||userWeapons.getSelectedItem().equals("Steel Sword")||userWeapons.getSelectedItem().equals("Silver Sword")||userWeapons.getSelectedItem().equals("Iron Blade")||userWeapons.getSelectedItem().equals("Steel Blade")||userWeapons.getSelectedItem().equals("Silver Blade")||userWeapons.getSelectedItem().equals("Longsword")||userWeapons.getSelectedItem().equals("Wyrmslayer")||userWeapons.getSelectedItem().equals("Armorslayer")||userWeapons.getSelectedItem().equals("Lance Reaver")||userWeapons.getSelectedItem().equals("Brave Sword")||userWeapons.getSelectedItem().equals("Killing Edge")||userWeapons.getSelectedItem().equals("Tizona")||userWeapons.getSelectedItem().equals("Light Brand")||userWeapons.getSelectedItem().equals("Rune Sword")||userWeapons.getSelectedItem().equals("Wind Sword")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Slim Lance")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 4;
	    		enemyWeaponAccuracyAmount = 85;
	    		enemyWeaponCritChanceAmount = 5;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Sword")||userWeapons.getSelectedItem().equals("Steel Sword")||userWeapons.getSelectedItem().equals("Silver Sword")||userWeapons.getSelectedItem().equals("Iron Blade")||userWeapons.getSelectedItem().equals("Steel Blade")||userWeapons.getSelectedItem().equals("Silver Blade")||userWeapons.getSelectedItem().equals("Longsword")||userWeapons.getSelectedItem().equals("Wyrmslayer")||userWeapons.getSelectedItem().equals("Armorslayer")||userWeapons.getSelectedItem().equals("Lance Reaver")||userWeapons.getSelectedItem().equals("Brave Sword")||userWeapons.getSelectedItem().equals("Killing Edge")||userWeapons.getSelectedItem().equals("Tizona")||userWeapons.getSelectedItem().equals("Light Brand")||userWeapons.getSelectedItem().equals("Rune Sword")||userWeapons.getSelectedItem().equals("Wind Sword")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Killer Lance")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 10;
	    		enemyWeaponAccuracyAmount = 70;
	    		enemyWeaponCritChanceAmount = 30;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Sword")||userWeapons.getSelectedItem().equals("Steel Sword")||userWeapons.getSelectedItem().equals("Silver Sword")||userWeapons.getSelectedItem().equals("Iron Blade")||userWeapons.getSelectedItem().equals("Steel Blade")||userWeapons.getSelectedItem().equals("Silver Blade")||userWeapons.getSelectedItem().equals("Longsword")||userWeapons.getSelectedItem().equals("Wyrmslayer")||userWeapons.getSelectedItem().equals("Armorslayer")||userWeapons.getSelectedItem().equals("Lance Reaver")||userWeapons.getSelectedItem().equals("Brave Sword")||userWeapons.getSelectedItem().equals("Killing Edge")||userWeapons.getSelectedItem().equals("Tizona")||userWeapons.getSelectedItem().equals("Light Brand")||userWeapons.getSelectedItem().equals("Rune Sword")||userWeapons.getSelectedItem().equals("Wind Sword")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Brave Lance")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 10;
	    		enemyWeaponAccuracyAmount = 70;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Sword")||userWeapons.getSelectedItem().equals("Steel Sword")||userWeapons.getSelectedItem().equals("Silver Sword")||userWeapons.getSelectedItem().equals("Iron Blade")||userWeapons.getSelectedItem().equals("Steel Blade")||userWeapons.getSelectedItem().equals("Silver Blade")||userWeapons.getSelectedItem().equals("Longsword")||userWeapons.getSelectedItem().equals("Wyrmslayer")||userWeapons.getSelectedItem().equals("Armorslayer")||userWeapons.getSelectedItem().equals("Lance Reaver")||userWeapons.getSelectedItem().equals("Brave Sword")||userWeapons.getSelectedItem().equals("Killing Edge")||userWeapons.getSelectedItem().equals("Tizona")||userWeapons.getSelectedItem().equals("Light Brand")||userWeapons.getSelectedItem().equals("Rune Sword")||userWeapons.getSelectedItem().equals("Wind Sword")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Javelin")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 6;
	    		enemyWeaponAccuracyAmount = 65;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Sword")||userWeapons.getSelectedItem().equals("Steel Sword")||userWeapons.getSelectedItem().equals("Silver Sword")||userWeapons.getSelectedItem().equals("Iron Blade")||userWeapons.getSelectedItem().equals("Steel Blade")||userWeapons.getSelectedItem().equals("Silver Blade")||userWeapons.getSelectedItem().equals("Longsword")||userWeapons.getSelectedItem().equals("Wyrmslayer")||userWeapons.getSelectedItem().equals("Armorslayer")||userWeapons.getSelectedItem().equals("Lance Reaver")||userWeapons.getSelectedItem().equals("Brave Sword")||userWeapons.getSelectedItem().equals("Killing Edge")||userWeapons.getSelectedItem().equals("Tizona")||userWeapons.getSelectedItem().equals("Light Brand")||userWeapons.getSelectedItem().equals("Rune Sword")||userWeapons.getSelectedItem().equals("Wind Sword")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Short Spear")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 9;
	    		enemyWeaponAccuracyAmount = 60;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Sword")||userWeapons.getSelectedItem().equals("Steel Sword")||userWeapons.getSelectedItem().equals("Silver Sword")||userWeapons.getSelectedItem().equals("Iron Blade")||userWeapons.getSelectedItem().equals("Steel Blade")||userWeapons.getSelectedItem().equals("Silver Blade")||userWeapons.getSelectedItem().equals("Longsword")||userWeapons.getSelectedItem().equals("Wyrmslayer")||userWeapons.getSelectedItem().equals("Armorslayer")||userWeapons.getSelectedItem().equals("Lance Reaver")||userWeapons.getSelectedItem().equals("Brave Sword")||userWeapons.getSelectedItem().equals("Killing Edge")||userWeapons.getSelectedItem().equals("Tizona")||userWeapons.getSelectedItem().equals("Light Brand")||userWeapons.getSelectedItem().equals("Rune Sword")||userWeapons.getSelectedItem().equals("Wind Sword")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Spear")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 12;
	    		enemyWeaponAccuracyAmount = 70;
	    		enemyWeaponCritChanceAmount = 5;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Sword")||userWeapons.getSelectedItem().equals("Steel Sword")||userWeapons.getSelectedItem().equals("Silver Sword")||userWeapons.getSelectedItem().equals("Iron Blade")||userWeapons.getSelectedItem().equals("Steel Blade")||userWeapons.getSelectedItem().equals("Silver Blade")||userWeapons.getSelectedItem().equals("Longsword")||userWeapons.getSelectedItem().equals("Wyrmslayer")||userWeapons.getSelectedItem().equals("Armorslayer")||userWeapons.getSelectedItem().equals("Lance Reaver")||userWeapons.getSelectedItem().equals("Brave Sword")||userWeapons.getSelectedItem().equals("Killing Edge")||userWeapons.getSelectedItem().equals("Tizona")||userWeapons.getSelectedItem().equals("Light Brand")||userWeapons.getSelectedItem().equals("Rune Sword")||userWeapons.getSelectedItem().equals("Wind Sword")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Horseslayer")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 7;
	    		enemyWeaponAccuracyAmount = 70;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Sword")||userWeapons.getSelectedItem().equals("Steel Sword")||userWeapons.getSelectedItem().equals("Silver Sword")||userWeapons.getSelectedItem().equals("Iron Blade")||userWeapons.getSelectedItem().equals("Steel Blade")||userWeapons.getSelectedItem().equals("Silver Blade")||userWeapons.getSelectedItem().equals("Longsword")||userWeapons.getSelectedItem().equals("Wyrmslayer")||userWeapons.getSelectedItem().equals("Armorslayer")||userWeapons.getSelectedItem().equals("Lance Reaver")||userWeapons.getSelectedItem().equals("Brave Sword")||userWeapons.getSelectedItem().equals("Killing Edge")||userWeapons.getSelectedItem().equals("Tizona")||userWeapons.getSelectedItem().equals("Light Brand")||userWeapons.getSelectedItem().equals("Rune Sword")||userWeapons.getSelectedItem().equals("Wind Sword")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Axe Reaver")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 10;
	    		enemyWeaponAccuracyAmount = 70;
	    		enemyWeaponCritChanceAmount = 5;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Sword")||userWeapons.getSelectedItem().equals("Steel Sword")||userWeapons.getSelectedItem().equals("Silver Sword")||userWeapons.getSelectedItem().equals("Iron Blade")||userWeapons.getSelectedItem().equals("Steel Blade")||userWeapons.getSelectedItem().equals("Silver Blade")||userWeapons.getSelectedItem().equals("Longsword")||userWeapons.getSelectedItem().equals("Wyrmslayer")||userWeapons.getSelectedItem().equals("Armorslayer")||userWeapons.getSelectedItem().equals("Lance Reaver")||userWeapons.getSelectedItem().equals("Brave Sword")||userWeapons.getSelectedItem().equals("Killing Edge")||userWeapons.getSelectedItem().equals("Tizona")||userWeapons.getSelectedItem().equals("Light Brand")||userWeapons.getSelectedItem().equals("Rune Sword")||userWeapons.getSelectedItem().equals("Wind Sword")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


		        
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Rhongomiant")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 15;
	    		enemyWeaponAccuracyAmount = 80;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Sword")||userWeapons.getSelectedItem().equals("Steel Sword")||userWeapons.getSelectedItem().equals("Silver Sword")||userWeapons.getSelectedItem().equals("Iron Blade")||userWeapons.getSelectedItem().equals("Steel Blade")||userWeapons.getSelectedItem().equals("Silver Blade")||userWeapons.getSelectedItem().equals("Longsword")||userWeapons.getSelectedItem().equals("Wyrmslayer")||userWeapons.getSelectedItem().equals("Armorslayer")||userWeapons.getSelectedItem().equals("Lance Reaver")||userWeapons.getSelectedItem().equals("Brave Sword")||userWeapons.getSelectedItem().equals("Killing Edge")||userWeapons.getSelectedItem().equals("Tizona")||userWeapons.getSelectedItem().equals("Light Brand")||userWeapons.getSelectedItem().equals("Rune Sword")||userWeapons.getSelectedItem().equals("Wind Sword")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Reginleif")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 10;
	    		enemyWeaponAccuracyAmount = 80;
	    		enemyWeaponCritChanceAmount = 10;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Sword")||userWeapons.getSelectedItem().equals("Steel Sword")||userWeapons.getSelectedItem().equals("Silver Sword")||userWeapons.getSelectedItem().equals("Iron Blade")||userWeapons.getSelectedItem().equals("Steel Blade")||userWeapons.getSelectedItem().equals("Silver Blade")||userWeapons.getSelectedItem().equals("Longsword")||userWeapons.getSelectedItem().equals("Wyrmslayer")||userWeapons.getSelectedItem().equals("Armorslayer")||userWeapons.getSelectedItem().equals("Lance Reaver")||userWeapons.getSelectedItem().equals("Brave Sword")||userWeapons.getSelectedItem().equals("Killing Edge")||userWeapons.getSelectedItem().equals("Tizona")||userWeapons.getSelectedItem().equals("Light Brand")||userWeapons.getSelectedItem().equals("Rune Sword")||userWeapons.getSelectedItem().equals("Wind Sword")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Asclaon")){
	    		enemyWeaponMightAmount = 17;
	    		enemyWeaponAccuracyAmount = 80;
	    		enemyWeaponCritChanceAmount = 0;
	    		if (enemyBoosted == false){
	    		enemyAttackAmount += 5;
	    		enemyAttack.setText(""+enemyAttackAmount);
	    		}
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Sword")||userWeapons.getSelectedItem().equals("Steel Sword")||userWeapons.getSelectedItem().equals("Silver Sword")||userWeapons.getSelectedItem().equals("Iron Blade")||userWeapons.getSelectedItem().equals("Steel Blade")||userWeapons.getSelectedItem().equals("Silver Blade")||userWeapons.getSelectedItem().equals("Longsword")||userWeapons.getSelectedItem().equals("Wyrmslayer")||userWeapons.getSelectedItem().equals("Armorslayer")||userWeapons.getSelectedItem().equals("Lance Reaver")||userWeapons.getSelectedItem().equals("Brave Sword")||userWeapons.getSelectedItem().equals("Killing Edge")||userWeapons.getSelectedItem().equals("Tizona")||userWeapons.getSelectedItem().equals("Light Brand")||userWeapons.getSelectedItem().equals("Rune Sword")||userWeapons.getSelectedItem().equals("Wind Sword")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
		        enemyBoosted = true;


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Iron Axe")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 8;
	    		enemyWeaponAccuracyAmount = 75;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Lance")||userWeapons.getSelectedItem().equals("Steel Lance")||userWeapons.getSelectedItem().equals("Silver Lance")||userWeapons.getSelectedItem().equals("Slim Lance")||userWeapons.getSelectedItem().equals("Killer Lance")||userWeapons.getSelectedItem().equals("Brave Lance")||userWeapons.getSelectedItem().equals("Javelin")||userWeapons.getSelectedItem().equals("Short Spear")||userWeapons.getSelectedItem().equals("Spear")||userWeapons.getSelectedItem().equals("Horseslayer")||userWeapons.getSelectedItem().equals("Axe Reaver")||userWeapons.getSelectedItem().equals("Rhongomiant")||userWeapons.getSelectedItem().equals("Reginleif")||userWeapons.getSelectedItem().equals("Ascalon")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Steel Axe")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 11;
	    		enemyWeaponAccuracyAmount = 65;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Lance")||userWeapons.getSelectedItem().equals("Steel Lance")||userWeapons.getSelectedItem().equals("Silver Lance")||userWeapons.getSelectedItem().equals("Slim Lance")||userWeapons.getSelectedItem().equals("Killer Lance")||userWeapons.getSelectedItem().equals("Brave Lance")||userWeapons.getSelectedItem().equals("Javelin")||userWeapons.getSelectedItem().equals("Short Spear")||userWeapons.getSelectedItem().equals("Spear")||userWeapons.getSelectedItem().equals("Horseslayer")||userWeapons.getSelectedItem().equals("Axe Reaver")||userWeapons.getSelectedItem().equals("Rhongomiant")||userWeapons.getSelectedItem().equals("Reginleif")||userWeapons.getSelectedItem().equals("Ascalon")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Silver Axe")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 15;
	    		enemyWeaponAccuracyAmount = 70;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Lance")||userWeapons.getSelectedItem().equals("Steel Lance")||userWeapons.getSelectedItem().equals("Silver Lance")||userWeapons.getSelectedItem().equals("Slim Lance")||userWeapons.getSelectedItem().equals("Killer Lance")||userWeapons.getSelectedItem().equals("Brave Lance")||userWeapons.getSelectedItem().equals("Javelin")||userWeapons.getSelectedItem().equals("Short Spear")||userWeapons.getSelectedItem().equals("Spear")||userWeapons.getSelectedItem().equals("Horseslayer")||userWeapons.getSelectedItem().equals("Axe Reaver")||userWeapons.getSelectedItem().equals("Rhongomiant")||userWeapons.getSelectedItem().equals("Reginleif")||userWeapons.getSelectedItem().equals("Ascalon")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Killer Axe")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 11;
	    		enemyWeaponAccuracyAmount = 65;
	    		enemyWeaponCritChanceAmount = 30;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Lance")||userWeapons.getSelectedItem().equals("Steel Lance")||userWeapons.getSelectedItem().equals("Silver Lance")||userWeapons.getSelectedItem().equals("Slim Lance")||userWeapons.getSelectedItem().equals("Killer Lance")||userWeapons.getSelectedItem().equals("Brave Lance")||userWeapons.getSelectedItem().equals("Javelin")||userWeapons.getSelectedItem().equals("Short Spear")||userWeapons.getSelectedItem().equals("Spear")||userWeapons.getSelectedItem().equals("Horseslayer")||userWeapons.getSelectedItem().equals("Axe Reaver")||userWeapons.getSelectedItem().equals("Rhongomiant")||userWeapons.getSelectedItem().equals("Reginleif")||userWeapons.getSelectedItem().equals("Ascalon")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Brave Axe")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 10;
	    		enemyWeaponAccuracyAmount = 65;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Lance")||userWeapons.getSelectedItem().equals("Steel Lance")||userWeapons.getSelectedItem().equals("Silver Lance")||userWeapons.getSelectedItem().equals("Slim Lance")||userWeapons.getSelectedItem().equals("Killer Lance")||userWeapons.getSelectedItem().equals("Brave Lance")||userWeapons.getSelectedItem().equals("Javelin")||userWeapons.getSelectedItem().equals("Short Spear")||userWeapons.getSelectedItem().equals("Spear")||userWeapons.getSelectedItem().equals("Horseslayer")||userWeapons.getSelectedItem().equals("Axe Reaver")||userWeapons.getSelectedItem().equals("Rhongomiant")||userWeapons.getSelectedItem().equals("Reginleif")||userWeapons.getSelectedItem().equals("Ascalon")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Hammer")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 10;
	    		enemyWeaponAccuracyAmount = 55;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Lance")||userWeapons.getSelectedItem().equals("Steel Lance")||userWeapons.getSelectedItem().equals("Silver Lance")||userWeapons.getSelectedItem().equals("Slim Lance")||userWeapons.getSelectedItem().equals("Killer Lance")||userWeapons.getSelectedItem().equals("Brave Lance")||userWeapons.getSelectedItem().equals("Javelin")||userWeapons.getSelectedItem().equals("Short Spear")||userWeapons.getSelectedItem().equals("Spear")||userWeapons.getSelectedItem().equals("Horseslayer")||userWeapons.getSelectedItem().equals("Axe Reaver")||userWeapons.getSelectedItem().equals("Rhongomiant")||userWeapons.getSelectedItem().equals("Reginleif")||userWeapons.getSelectedItem().equals("Ascalon")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Halberd")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 10;
	    		enemyWeaponAccuracyAmount = 55;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Lance")||userWeapons.getSelectedItem().equals("Steel Lance")||userWeapons.getSelectedItem().equals("Silver Lance")||userWeapons.getSelectedItem().equals("Slim Lance")||userWeapons.getSelectedItem().equals("Killer Lance")||userWeapons.getSelectedItem().equals("Brave Lance")||userWeapons.getSelectedItem().equals("Javelin")||userWeapons.getSelectedItem().equals("Short Spear")||userWeapons.getSelectedItem().equals("Spear")||userWeapons.getSelectedItem().equals("Horseslayer")||userWeapons.getSelectedItem().equals("Axe Reaver")||userWeapons.getSelectedItem().equals("Rhongomiant")||userWeapons.getSelectedItem().equals("Reginleif")||userWeapons.getSelectedItem().equals("Ascalon")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Sword Reaver")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 11;
	    		enemyWeaponAccuracyAmount = 65;
	    		enemyWeaponCritChanceAmount = 5;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Lance")||userWeapons.getSelectedItem().equals("Steel Lance")||userWeapons.getSelectedItem().equals("Silver Lance")||userWeapons.getSelectedItem().equals("Slim Lance")||userWeapons.getSelectedItem().equals("Killer Lance")||userWeapons.getSelectedItem().equals("Brave Lance")||userWeapons.getSelectedItem().equals("Javelin")||userWeapons.getSelectedItem().equals("Short Spear")||userWeapons.getSelectedItem().equals("Spear")||userWeapons.getSelectedItem().equals("Horseslayer")||userWeapons.getSelectedItem().equals("Axe Reaver")||userWeapons.getSelectedItem().equals("Rhongomiant")||userWeapons.getSelectedItem().equals("Reginleif")||userWeapons.getSelectedItem().equals("Ascalon")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Hand Axe")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 7;
	    		enemyWeaponAccuracyAmount = 60;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Lance")||userWeapons.getSelectedItem().equals("Steel Lance")||userWeapons.getSelectedItem().equals("Silver Lance")||userWeapons.getSelectedItem().equals("Slim Lance")||userWeapons.getSelectedItem().equals("Killer Lance")||userWeapons.getSelectedItem().equals("Brave Lance")||userWeapons.getSelectedItem().equals("Javelin")||userWeapons.getSelectedItem().equals("Short Spear")||userWeapons.getSelectedItem().equals("Spear")||userWeapons.getSelectedItem().equals("Horseslayer")||userWeapons.getSelectedItem().equals("Axe Reaver")||userWeapons.getSelectedItem().equals("Rhongomiant")||userWeapons.getSelectedItem().equals("Reginleif")||userWeapons.getSelectedItem().equals("Ascalon")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Tomahawk")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 13;
	    		enemyWeaponAccuracyAmount = 65;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Lance")||userWeapons.getSelectedItem().equals("Steel Lance")||userWeapons.getSelectedItem().equals("Silver Lance")||userWeapons.getSelectedItem().equals("Slim Lance")||userWeapons.getSelectedItem().equals("Killer Lance")||userWeapons.getSelectedItem().equals("Brave Lance")||userWeapons.getSelectedItem().equals("Javelin")||userWeapons.getSelectedItem().equals("Short Spear")||userWeapons.getSelectedItem().equals("Spear")||userWeapons.getSelectedItem().equals("Horseslayer")||userWeapons.getSelectedItem().equals("Axe Reaver")||userWeapons.getSelectedItem().equals("Rhongomiant")||userWeapons.getSelectedItem().equals("Reginleif")||userWeapons.getSelectedItem().equals("Ascalon")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Perun")){
	    		enemyWeaponMightAmount = 20;
	    		enemyWeaponAccuracyAmount = 75;
	    		enemyWeaponCritChanceAmount = 0;
	    		if (enemyBoosted == false){
	    		enemyAttackAmount += 5;
	    		enemyAttack.setText(""+enemyAttackAmount);
	    		}
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Iron Lance")||userWeapons.getSelectedItem().equals("Steel Lance")||userWeapons.getSelectedItem().equals("Silver Lance")||userWeapons.getSelectedItem().equals("Slim Lance")||userWeapons.getSelectedItem().equals("Killer Lance")||userWeapons.getSelectedItem().equals("Brave Lance")||userWeapons.getSelectedItem().equals("Javelin")||userWeapons.getSelectedItem().equals("Short Spear")||userWeapons.getSelectedItem().equals("Spear")||userWeapons.getSelectedItem().equals("Horseslayer")||userWeapons.getSelectedItem().equals("Axe Reaver")||userWeapons.getSelectedItem().equals("Rhongomiant")||userWeapons.getSelectedItem().equals("Reginleif")||userWeapons.getSelectedItem().equals("Ascalon")){
		        	enemyTriangleAmount = 1;
		        	userTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
		        enemyBoosted = true;


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Iron Bow")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 6;
	    		enemyWeaponAccuracyAmount = 85;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);

	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Steel Bow")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 9;
	    		enemyWeaponAccuracyAmount = 70;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Silver Bow")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 13;
	    		enemyWeaponAccuracyAmount = 75;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Short Bow")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 5;
	    		enemyWeaponAccuracyAmount = 85;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Longbow")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 5;
	    		enemyWeaponAccuracyAmount = 65;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Killer Bow")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 9;
	    		enemyWeaponAccuracyAmount = 75;
	    		enemyWeaponCritChanceAmount = 30;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Brave Bow")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 10;
	    		enemyWeaponAccuracyAmount = 70;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Gandiva")){
	    		enemyWeaponMightAmount = 18;
	    		enemyWeaponAccuracyAmount = 80;
	    		enemyWeaponCritChanceAmount = 0;
	    		if (enemyBoosted == false){
	    		enemySkillAmount +=5;
	    		enemySkill.setText(""+enemySkillAmount);
	    		}
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        enemyBoosted = true;
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Fire")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 5;
	    		enemyWeaponAccuracyAmount = 90;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Lightning")||userWeapons.getSelectedItem().equals("Shine")||userWeapons.getSelectedItem().equals("Divine")||userWeapons.getSelectedItem().equals("Purge")||userWeapons.getSelectedItem().equals("Aura")||userWeapons.getSelectedItem().equals("Eos")){
		        	userTriangleAmount = -1;
		        	enemyTriangleAmount = 1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Thunder")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 8;
	    		enemyWeaponAccuracyAmount = 80;
	    		enemyWeaponCritChanceAmount = 5;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Lightning")||userWeapons.getSelectedItem().equals("Shine")||userWeapons.getSelectedItem().equals("Divine")||userWeapons.getSelectedItem().equals("Purge")||userWeapons.getSelectedItem().equals("Aura")||userWeapons.getSelectedItem().equals("Eos")){
		        	userTriangleAmount = -1;
		        	enemyTriangleAmount = 1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Aircali")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 8;
	    		enemyWeaponAccuracyAmount = 85;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Lightning")||userWeapons.getSelectedItem().equals("Shine")||userWeapons.getSelectedItem().equals("Divine")||userWeapons.getSelectedItem().equals("Purge")||userWeapons.getSelectedItem().equals("Aura")||userWeapons.getSelectedItem().equals("Eos")){
		        	userTriangleAmount = -1;
		        	enemyTriangleAmount = 1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Bolting")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 12;
	    		enemyWeaponAccuracyAmount = 60;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Lightning")||userWeapons.getSelectedItem().equals("Shine")||userWeapons.getSelectedItem().equals("Divine")||userWeapons.getSelectedItem().equals("Purge")||userWeapons.getSelectedItem().equals("Aura")||userWeapons.getSelectedItem().equals("Eos")){
		        	userTriangleAmount = -1;
		        	enemyTriangleAmount = 1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Fimbulv")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 13;
	    		enemyWeaponAccuracyAmount = 80;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Lightning")||userWeapons.getSelectedItem().equals("Shine")||userWeapons.getSelectedItem().equals("Divine")||userWeapons.getSelectedItem().equals("Purge")||userWeapons.getSelectedItem().equals("Aura")||userWeapons.getSelectedItem().equals("Eos")){
		        	userTriangleAmount = -1;
		        	enemyTriangleAmount = 1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Zephyr")){
	    		
	    		enemyWeaponMightAmount = 18;
	    		enemyWeaponAccuracyAmount = 90;
	    		enemyWeaponCritChanceAmount = 10;
	    		if (enemyBoosted == false){
	    		enemyAttackAmount += 5;
	    		enemyAttack.setText(""+enemyAttackAmount);
	    		}
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Lightning")||userWeapons.getSelectedItem().equals("Shine")||userWeapons.getSelectedItem().equals("Divine")||userWeapons.getSelectedItem().equals("Purge")||userWeapons.getSelectedItem().equals("Aura")||userWeapons.getSelectedItem().equals("Eos")){
		        	userTriangleAmount = -1;
		        	enemyTriangleAmount = 1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
		        enemyBoosted = true;

	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Flux")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 7;
	    		enemyWeaponAccuracyAmount = 80;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Fire")||userWeapons.getSelectedItem().equals("Thunder")||userWeapons.getSelectedItem().equals("Aircali")||userWeapons.getSelectedItem().equals("Bolting")||userWeapons.getSelectedItem().equals("Fimbulv")||userWeapons.getSelectedItem().equals("Zephyr")){
		        	userTriangleAmount = -1;
		        	enemyTriangleAmount = 1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Nosferatu")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 10;
	    		enemyWeaponAccuracyAmount = 70;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Fire")||userWeapons.getSelectedItem().equals("Thunder")||userWeapons.getSelectedItem().equals("Aircali")||userWeapons.getSelectedItem().equals("Bolting")||userWeapons.getSelectedItem().equals("Fimbulv")||userWeapons.getSelectedItem().equals("Zephyr")){
		        	userTriangleAmount = -1;
		        	enemyTriangleAmount = 1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Luna")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 0;
	    		enemyWeaponAccuracyAmount = 95;
	    		enemyWeaponCritChanceAmount = 20;
	    		userDefenseAmount = 0;
	    		userDefense.setText(""+enemyDefenseAmount);
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Fire")||userWeapons.getSelectedItem().equals("Thunder")||userWeapons.getSelectedItem().equals("Aircali")||userWeapons.getSelectedItem().equals("Bolting")||userWeapons.getSelectedItem().equals("Fimbulv")||userWeapons.getSelectedItem().equals("Zephyr")){
		        	userTriangleAmount = -1;
		        	enemyTriangleAmount = 1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Eclipse")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 0;
	    		enemyWeaponAccuracyAmount = 30;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Fire")||userWeapons.getSelectedItem().equals("Thunder")||userWeapons.getSelectedItem().equals("Aircali")||userWeapons.getSelectedItem().equals("Bolting")||userWeapons.getSelectedItem().equals("Fimbulv")||userWeapons.getSelectedItem().equals("Zephyr")){
		        	userTriangleAmount = -1;
		        	enemyTriangleAmount = 1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Fenrir")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 15;
	    		enemyWeaponAccuracyAmount = 70;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Fire")||userWeapons.getSelectedItem().equals("Thunder")||userWeapons.getSelectedItem().equals("Aircali")||userWeapons.getSelectedItem().equals("Bolting")||userWeapons.getSelectedItem().equals("Fimbulv")||userWeapons.getSelectedItem().equals("Zephyr")){
		        	userTriangleAmount = -1;
		        	enemyTriangleAmount = 1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Nephtys")){
	    		enemyWeaponMightAmount = 23;
	    		enemyWeaponAccuracyAmount = 80;
	    		enemyWeaponCritChanceAmount = 0;
	    		if (enemyBoosted == false){
	    		enemySpeedAmount += 5;
	    		enemySpeed.setText(""+enemySpeedAmount);
	    		}
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        if (userWeapons.getSelectedItem().equals("Fire")||userWeapons.getSelectedItem().equals("Thunder")||userWeapons.getSelectedItem().equals("Aircali")||userWeapons.getSelectedItem().equals("Bolting")||userWeapons.getSelectedItem().equals("Fimbulv")||userWeapons.getSelectedItem().equals("Zephyr")){
		        	userTriangleAmount = -1;
		        	enemyTriangleAmount = 1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
		        enemyBoosted = true;

	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Lightning")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 4;
	    		enemyWeaponAccuracyAmount = 95;
	    		enemyWeaponCritChanceAmount = 5;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Shine")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 6;
	    		enemyWeaponAccuracyAmount = 90;
	    		enemyWeaponCritChanceAmount = 8;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Divine")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 8;
	    		enemyWeaponAccuracyAmount = 85;
	    		enemyWeaponCritChanceAmount = 10;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Purge")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 10;
	    		enemyWeaponAccuracyAmount = 75;
	    		enemyWeaponCritChanceAmount = 5;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Aura")){
	    		enemyBoosted = false;
	    		enemyWeaponMightAmount = 12;
	    		enemyWeaponAccuracyAmount = 85;
	    		enemyWeaponCritChanceAmount = 15;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
	    	}
	    	if (enemyWeapons.getSelectedItem().equals("Eos")){
	    		enemyWeaponMightAmount = 17;
	    		enemyWeaponAccuracyAmount = 90;
	    		enemyWeaponCritChanceAmount = 5;
	    		if (enemyBoosted == false){
	    		enemyLuckAmount += 5;
	    		enemyLuck.setText(""+enemyLuckAmount);
	    		}
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
		        enemyBoosted = true;
	    	}

	    	
	    	if (userWeapons.getSelectedItem().equals("Iron Sword")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 5;
	    		userWeaponAccuracyAmount = 90;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Axe")||enemyWeapons.getSelectedItem().equals("Steel Axe")||enemyWeapons.getSelectedItem().equals("Silver Axe")||enemyWeapons.getSelectedItem().equals("Killer Axe")||enemyWeapons.getSelectedItem().equals("Brave Axe")||enemyWeapons.getSelectedItem().equals("Hammer")||enemyWeapons.getSelectedItem().equals("Halberd")||enemyWeapons.getSelectedItem().equals("Hand Axe")||enemyWeapons.getSelectedItem().equals("Tomahawk")||enemyWeapons.getSelectedItem().equals("Perun")||enemyWeapons.getSelectedItem().equals("Lance Reaver")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }

	    	}
	    	if (userWeapons.getSelectedItem().equals("Steel Sword")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 8;
	    		userWeaponAccuracyAmount = 75;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Axe")||enemyWeapons.getSelectedItem().equals("Steel Axe")||enemyWeapons.getSelectedItem().equals("Silver Axe")||enemyWeapons.getSelectedItem().equals("Killer Axe")||enemyWeapons.getSelectedItem().equals("Brave Axe")||enemyWeapons.getSelectedItem().equals("Hammer")||enemyWeapons.getSelectedItem().equals("Halberd")||enemyWeapons.getSelectedItem().equals("Hand Axe")||enemyWeapons.getSelectedItem().equals("Tomahawk")||enemyWeapons.getSelectedItem().equals("Perun")||enemyWeapons.getSelectedItem().equals("Lance Reaver")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }

	    	}
	    	if (userWeapons.getSelectedItem().equals("Silver Sword")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 13;
	    		userWeaponAccuracyAmount = 80;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Axe")||enemyWeapons.getSelectedItem().equals("Steel Axe")||enemyWeapons.getSelectedItem().equals("Silver Axe")||enemyWeapons.getSelectedItem().equals("Killer Axe")||enemyWeapons.getSelectedItem().equals("Brave Axe")||enemyWeapons.getSelectedItem().equals("Hammer")||enemyWeapons.getSelectedItem().equals("Halberd")||enemyWeapons.getSelectedItem().equals("Hand Axe")||enemyWeapons.getSelectedItem().equals("Tomahawk")||enemyWeapons.getSelectedItem().equals("Perun")||enemyWeapons.getSelectedItem().equals("Lance Reaver")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }

	    	}
	    	if (userWeapons.getSelectedItem().equals("Iron Blade")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 9;
	    		userWeaponAccuracyAmount = 70;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Axe")||enemyWeapons.getSelectedItem().equals("Steel Axe")||enemyWeapons.getSelectedItem().equals("Silver Axe")||enemyWeapons.getSelectedItem().equals("Killer Axe")||enemyWeapons.getSelectedItem().equals("Brave Axe")||enemyWeapons.getSelectedItem().equals("Hammer")||enemyWeapons.getSelectedItem().equals("Halberd")||enemyWeapons.getSelectedItem().equals("Hand Axe")||enemyWeapons.getSelectedItem().equals("Tomahawk")||enemyWeapons.getSelectedItem().equals("Perun")||enemyWeapons.getSelectedItem().equals("Lance Reaver")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }

	    	}
	    	if (userWeapons.getSelectedItem().equals("Steel Blade")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 11;
	    		userWeaponAccuracyAmount = 65;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Axe")||enemyWeapons.getSelectedItem().equals("Steel Axe")||enemyWeapons.getSelectedItem().equals("Silver Axe")||enemyWeapons.getSelectedItem().equals("Killer Axe")||enemyWeapons.getSelectedItem().equals("Brave Axe")||enemyWeapons.getSelectedItem().equals("Hammer")||enemyWeapons.getSelectedItem().equals("Halberd")||enemyWeapons.getSelectedItem().equals("Hand Axe")||enemyWeapons.getSelectedItem().equals("Tomahawk")||enemyWeapons.getSelectedItem().equals("Perun")||enemyWeapons.getSelectedItem().equals("Lance Reaver")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }

	    	}
	    	if (userWeapons.getSelectedItem().equals("Silver Blade")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 14;
	    		userWeaponAccuracyAmount = 60;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Axe")||enemyWeapons.getSelectedItem().equals("Steel Axe")||enemyWeapons.getSelectedItem().equals("Silver Axe")||enemyWeapons.getSelectedItem().equals("Killer Axe")||enemyWeapons.getSelectedItem().equals("Brave Axe")||enemyWeapons.getSelectedItem().equals("Hammer")||enemyWeapons.getSelectedItem().equals("Halberd")||enemyWeapons.getSelectedItem().equals("Hand Axe")||enemyWeapons.getSelectedItem().equals("Tomahawk")||enemyWeapons.getSelectedItem().equals("Perun")||enemyWeapons.getSelectedItem().equals("Lance Reaver")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }

	    	}
	    	if (userWeapons.getSelectedItem().equals("Longsword")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 6;
	    		userWeaponAccuracyAmount = 85;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Axe")||enemyWeapons.getSelectedItem().equals("Steel Axe")||enemyWeapons.getSelectedItem().equals("Silver Axe")||enemyWeapons.getSelectedItem().equals("Killer Axe")||enemyWeapons.getSelectedItem().equals("Brave Axe")||enemyWeapons.getSelectedItem().equals("Hammer")||enemyWeapons.getSelectedItem().equals("Halberd")||enemyWeapons.getSelectedItem().equals("Hand Axe")||enemyWeapons.getSelectedItem().equals("Tomahawk")||enemyWeapons.getSelectedItem().equals("Perun")||enemyWeapons.getSelectedItem().equals("Lance Reaver")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }

	    	}
	    	if (userWeapons.getSelectedItem().equals("Wyrmslayer")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 7;
	    		userWeaponAccuracyAmount = 75;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Axe")||enemyWeapons.getSelectedItem().equals("Steel Axe")||enemyWeapons.getSelectedItem().equals("Silver Axe")||enemyWeapons.getSelectedItem().equals("Killer Axe")||enemyWeapons.getSelectedItem().equals("Brave Axe")||enemyWeapons.getSelectedItem().equals("Hammer")||enemyWeapons.getSelectedItem().equals("Halberd")||enemyWeapons.getSelectedItem().equals("Hand Axe")||enemyWeapons.getSelectedItem().equals("Tomahawk")||enemyWeapons.getSelectedItem().equals("Perun")||enemyWeapons.getSelectedItem().equals("Lance Reaver")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }

	    	}
	    	if (userWeapons.getSelectedItem().equals("Armorslayer")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 8;
	    		userWeaponAccuracyAmount = 80;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Axe")||enemyWeapons.getSelectedItem().equals("Steel Axe")||enemyWeapons.getSelectedItem().equals("Silver Axe")||enemyWeapons.getSelectedItem().equals("Killer Axe")||enemyWeapons.getSelectedItem().equals("Brave Axe")||enemyWeapons.getSelectedItem().equals("Hammer")||enemyWeapons.getSelectedItem().equals("Halberd")||enemyWeapons.getSelectedItem().equals("Hand Axe")||enemyWeapons.getSelectedItem().equals("Tomahawk")||enemyWeapons.getSelectedItem().equals("Perun")||enemyWeapons.getSelectedItem().equals("Lance Reaver")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }

	    	}
	    	if (userWeapons.getSelectedItem().equals("Lance Reaver")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 9;
	    		userWeaponAccuracyAmount = 75;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Axe")||enemyWeapons.getSelectedItem().equals("Steel Axe")||enemyWeapons.getSelectedItem().equals("Silver Axe")||enemyWeapons.getSelectedItem().equals("Killer Axe")||enemyWeapons.getSelectedItem().equals("Brave Axe")||enemyWeapons.getSelectedItem().equals("Hammer")||enemyWeapons.getSelectedItem().equals("Halberd")||enemyWeapons.getSelectedItem().equals("Hand Axe")||enemyWeapons.getSelectedItem().equals("Tomahawk")||enemyWeapons.getSelectedItem().equals("Perun")||enemyWeapons.getSelectedItem().equals("Lance Reaver")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }

	    	}
	    	if (userWeapons.getSelectedItem().equals("Brave Sword")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 9;
	    		userWeaponAccuracyAmount = 75;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Axe")||enemyWeapons.getSelectedItem().equals("Steel Axe")||enemyWeapons.getSelectedItem().equals("Silver Axe")||enemyWeapons.getSelectedItem().equals("Killer Axe")||enemyWeapons.getSelectedItem().equals("Brave Axe")||enemyWeapons.getSelectedItem().equals("Hammer")||enemyWeapons.getSelectedItem().equals("Halberd")||enemyWeapons.getSelectedItem().equals("Hand Axe")||enemyWeapons.getSelectedItem().equals("Tomahawk")||enemyWeapons.getSelectedItem().equals("Perun")||enemyWeapons.getSelectedItem().equals("Lance Reaver")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }

	    	}
	    	if (userWeapons.getSelectedItem().equals("Killing Edge")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 9;
	    		userWeaponAccuracyAmount = 75;
	    		userWeaponCritChanceAmount = 30;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Axe")||enemyWeapons.getSelectedItem().equals("Steel Axe")||enemyWeapons.getSelectedItem().equals("Silver Axe")||enemyWeapons.getSelectedItem().equals("Killer Axe")||enemyWeapons.getSelectedItem().equals("Brave Axe")||enemyWeapons.getSelectedItem().equals("Hammer")||enemyWeapons.getSelectedItem().equals("Halberd")||enemyWeapons.getSelectedItem().equals("Hand Axe")||enemyWeapons.getSelectedItem().equals("Tomahawk")||enemyWeapons.getSelectedItem().equals("Perun")||enemyWeapons.getSelectedItem().equals("Lance Reaver")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }

	    	}
	    	if (userWeapons.getSelectedItem().equals("Tizona")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 18;
	    		userWeaponAccuracyAmount = 85;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Axe")||enemyWeapons.getSelectedItem().equals("Steel Axe")||enemyWeapons.getSelectedItem().equals("Silver Axe")||enemyWeapons.getSelectedItem().equals("Killer Axe")||enemyWeapons.getSelectedItem().equals("Brave Axe")||enemyWeapons.getSelectedItem().equals("Hammer")||enemyWeapons.getSelectedItem().equals("Halberd")||enemyWeapons.getSelectedItem().equals("Hand Axe")||enemyWeapons.getSelectedItem().equals("Tomahawk")||enemyWeapons.getSelectedItem().equals("Perun")||enemyWeapons.getSelectedItem().equals("Lance Reaver")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }

	    	}
	    	if (userWeapons.getSelectedItem().equals("Light Brand")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 9;
	    		userWeaponAccuracyAmount = 70;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Axe")||enemyWeapons.getSelectedItem().equals("Steel Axe")||enemyWeapons.getSelectedItem().equals("Silver Axe")||enemyWeapons.getSelectedItem().equals("Killer Axe")||enemyWeapons.getSelectedItem().equals("Brave Axe")||enemyWeapons.getSelectedItem().equals("Hammer")||enemyWeapons.getSelectedItem().equals("Halberd")||enemyWeapons.getSelectedItem().equals("Hand Axe")||enemyWeapons.getSelectedItem().equals("Tomahawk")||enemyWeapons.getSelectedItem().equals("Perun")||enemyWeapons.getSelectedItem().equals("Lance Reaver")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }

	    	}
	    	if (userWeapons.getSelectedItem().equals("Rune Sword")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 12;
	    		userWeaponAccuracyAmount = 65;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Axe")||enemyWeapons.getSelectedItem().equals("Steel Axe")||enemyWeapons.getSelectedItem().equals("Silver Axe")||enemyWeapons.getSelectedItem().equals("Killer Axe")||enemyWeapons.getSelectedItem().equals("Brave Axe")||enemyWeapons.getSelectedItem().equals("Hammer")||enemyWeapons.getSelectedItem().equals("Halberd")||enemyWeapons.getSelectedItem().equals("Hand Axe")||enemyWeapons.getSelectedItem().equals("Tomahawk")||enemyWeapons.getSelectedItem().equals("Perun")||enemyWeapons.getSelectedItem().equals("Lance Reaver")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }

	    	}
	    	if (userWeapons.getSelectedItem().equals("Wind Sword")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 9;
	    		userWeaponAccuracyAmount = 70;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Axe")||enemyWeapons.getSelectedItem().equals("Steel Axe")||enemyWeapons.getSelectedItem().equals("Silver Axe")||enemyWeapons.getSelectedItem().equals("Killer Axe")||enemyWeapons.getSelectedItem().equals("Brave Axe")||enemyWeapons.getSelectedItem().equals("Hammer")||enemyWeapons.getSelectedItem().equals("Halberd")||enemyWeapons.getSelectedItem().equals("Hand Axe")||enemyWeapons.getSelectedItem().equals("Tomahawk")||enemyWeapons.getSelectedItem().equals("Perun")||enemyWeapons.getSelectedItem().equals("Lance Reaver")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }

	    	}
	    	if (userWeapons.getSelectedItem().equals("Iron Lance")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 7;
	    		userWeaponAccuracyAmount = 80;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Sword")||enemyWeapons.getSelectedItem().equals("Steel Sword")||enemyWeapons.getSelectedItem().equals("Silver Sword")||enemyWeapons.getSelectedItem().equals("Iron Blade")||enemyWeapons.getSelectedItem().equals("Steel Blade")||enemyWeapons.getSelectedItem().equals("Silver Blade")||enemyWeapons.getSelectedItem().equals("Longsword")||enemyWeapons.getSelectedItem().equals("Wyrmslayer")||enemyWeapons.getSelectedItem().equals("Armorslayer")||enemyWeapons.getSelectedItem().equals("Lance Reaver")||enemyWeapons.getSelectedItem().equals("Brave Sword")||enemyWeapons.getSelectedItem().equals("Killing Edge")||enemyWeapons.getSelectedItem().equals("Tizona")||enemyWeapons.getSelectedItem().equals("Light Brand")||enemyWeapons.getSelectedItem().equals("Rune Sword")||enemyWeapons.getSelectedItem().equals("Wind Sword")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Steel Lance")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 10;
	    		userWeaponAccuracyAmount = 70;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Sword")||enemyWeapons.getSelectedItem().equals("Steel Sword")||enemyWeapons.getSelectedItem().equals("Silver Sword")||enemyWeapons.getSelectedItem().equals("Iron Blade")||enemyWeapons.getSelectedItem().equals("Steel Blade")||enemyWeapons.getSelectedItem().equals("Silver Blade")||enemyWeapons.getSelectedItem().equals("Longsword")||enemyWeapons.getSelectedItem().equals("Wyrmslayer")||enemyWeapons.getSelectedItem().equals("Armorslayer")||enemyWeapons.getSelectedItem().equals("Lance Reaver")||enemyWeapons.getSelectedItem().equals("Brave Sword")||enemyWeapons.getSelectedItem().equals("Killing Edge")||enemyWeapons.getSelectedItem().equals("Tizona")||enemyWeapons.getSelectedItem().equals("Light Brand")||enemyWeapons.getSelectedItem().equals("Rune Sword")||enemyWeapons.getSelectedItem().equals("Wind Sword")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }
	    	}
	    	if (userWeapons.getSelectedItem().equals("Silver Lance")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 14;
	    		userWeaponAccuracyAmount = 75;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Sword")||enemyWeapons.getSelectedItem().equals("Steel Sword")||enemyWeapons.getSelectedItem().equals("Silver Sword")||enemyWeapons.getSelectedItem().equals("Iron Blade")||enemyWeapons.getSelectedItem().equals("Steel Blade")||enemyWeapons.getSelectedItem().equals("Silver Blade")||enemyWeapons.getSelectedItem().equals("Longsword")||enemyWeapons.getSelectedItem().equals("Wyrmslayer")||enemyWeapons.getSelectedItem().equals("Armorslayer")||enemyWeapons.getSelectedItem().equals("Lance Reaver")||enemyWeapons.getSelectedItem().equals("Brave Sword")||enemyWeapons.getSelectedItem().equals("Killing Edge")||enemyWeapons.getSelectedItem().equals("Tizona")||enemyWeapons.getSelectedItem().equals("Light Brand")||enemyWeapons.getSelectedItem().equals("Rune Sword")||enemyWeapons.getSelectedItem().equals("Wind Sword")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }
	    	}
	    	if (userWeapons.getSelectedItem().equals("Slim Lance")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 4;
	    		userWeaponAccuracyAmount = 85;
	    		userWeaponCritChanceAmount = 5;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Sword")||enemyWeapons.getSelectedItem().equals("Steel Sword")||enemyWeapons.getSelectedItem().equals("Silver Sword")||enemyWeapons.getSelectedItem().equals("Iron Blade")||enemyWeapons.getSelectedItem().equals("Steel Blade")||enemyWeapons.getSelectedItem().equals("Silver Blade")||enemyWeapons.getSelectedItem().equals("Longsword")||enemyWeapons.getSelectedItem().equals("Wyrmslayer")||enemyWeapons.getSelectedItem().equals("Armorslayer")||enemyWeapons.getSelectedItem().equals("Lance Reaver")||enemyWeapons.getSelectedItem().equals("Brave Sword")||enemyWeapons.getSelectedItem().equals("Killing Edge")||enemyWeapons.getSelectedItem().equals("Tizona")||enemyWeapons.getSelectedItem().equals("Light Brand")||enemyWeapons.getSelectedItem().equals("Rune Sword")||enemyWeapons.getSelectedItem().equals("Wind Sword")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }
	    	}
	    	if (userWeapons.getSelectedItem().equals("Killer Lance")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 10;
	    		userWeaponAccuracyAmount = 70;
	    		userWeaponCritChanceAmount = 30;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Sword")||enemyWeapons.getSelectedItem().equals("Steel Sword")||enemyWeapons.getSelectedItem().equals("Silver Sword")||enemyWeapons.getSelectedItem().equals("Iron Blade")||enemyWeapons.getSelectedItem().equals("Steel Blade")||enemyWeapons.getSelectedItem().equals("Silver Blade")||enemyWeapons.getSelectedItem().equals("Longsword")||enemyWeapons.getSelectedItem().equals("Wyrmslayer")||enemyWeapons.getSelectedItem().equals("Armorslayer")||enemyWeapons.getSelectedItem().equals("Lance Reaver")||enemyWeapons.getSelectedItem().equals("Brave Sword")||enemyWeapons.getSelectedItem().equals("Killing Edge")||enemyWeapons.getSelectedItem().equals("Tizona")||enemyWeapons.getSelectedItem().equals("Light Brand")||enemyWeapons.getSelectedItem().equals("Rune Sword")||enemyWeapons.getSelectedItem().equals("Wind Sword")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }
	    	}
	    	if (userWeapons.getSelectedItem().equals("Brave Lance")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 10;
	    		userWeaponAccuracyAmount = 70;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Sword")||enemyWeapons.getSelectedItem().equals("Steel Sword")||enemyWeapons.getSelectedItem().equals("Silver Sword")||enemyWeapons.getSelectedItem().equals("Iron Blade")||enemyWeapons.getSelectedItem().equals("Steel Blade")||enemyWeapons.getSelectedItem().equals("Silver Blade")||enemyWeapons.getSelectedItem().equals("Longsword")||enemyWeapons.getSelectedItem().equals("Wyrmslayer")||enemyWeapons.getSelectedItem().equals("Armorslayer")||enemyWeapons.getSelectedItem().equals("Lance Reaver")||enemyWeapons.getSelectedItem().equals("Brave Sword")||enemyWeapons.getSelectedItem().equals("Killing Edge")||enemyWeapons.getSelectedItem().equals("Tizona")||enemyWeapons.getSelectedItem().equals("Light Brand")||enemyWeapons.getSelectedItem().equals("Rune Sword")||enemyWeapons.getSelectedItem().equals("Wind Sword")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }
	    	}
	    	if (userWeapons.getSelectedItem().equals("Javelin")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 6;
	    		userWeaponAccuracyAmount = 65;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Sword")||enemyWeapons.getSelectedItem().equals("Steel Sword")||enemyWeapons.getSelectedItem().equals("Silver Sword")||enemyWeapons.getSelectedItem().equals("Iron Blade")||enemyWeapons.getSelectedItem().equals("Steel Blade")||enemyWeapons.getSelectedItem().equals("Silver Blade")||enemyWeapons.getSelectedItem().equals("Longsword")||enemyWeapons.getSelectedItem().equals("Wyrmslayer")||enemyWeapons.getSelectedItem().equals("Armorslayer")||enemyWeapons.getSelectedItem().equals("Lance Reaver")||enemyWeapons.getSelectedItem().equals("Brave Sword")||enemyWeapons.getSelectedItem().equals("Killing Edge")||enemyWeapons.getSelectedItem().equals("Tizona")||enemyWeapons.getSelectedItem().equals("Light Brand")||enemyWeapons.getSelectedItem().equals("Rune Sword")||enemyWeapons.getSelectedItem().equals("Wind Sword")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }
	    	}
	    	if (userWeapons.getSelectedItem().equals("Short Spear")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 9;
	    		userWeaponAccuracyAmount = 60;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Sword")||enemyWeapons.getSelectedItem().equals("Steel Sword")||enemyWeapons.getSelectedItem().equals("Silver Sword")||enemyWeapons.getSelectedItem().equals("Iron Blade")||enemyWeapons.getSelectedItem().equals("Steel Blade")||enemyWeapons.getSelectedItem().equals("Silver Blade")||enemyWeapons.getSelectedItem().equals("Longsword")||enemyWeapons.getSelectedItem().equals("Wyrmslayer")||enemyWeapons.getSelectedItem().equals("Armorslayer")||enemyWeapons.getSelectedItem().equals("Lance Reaver")||enemyWeapons.getSelectedItem().equals("Brave Sword")||enemyWeapons.getSelectedItem().equals("Killing Edge")||enemyWeapons.getSelectedItem().equals("Tizona")||enemyWeapons.getSelectedItem().equals("Light Brand")||enemyWeapons.getSelectedItem().equals("Rune Sword")||enemyWeapons.getSelectedItem().equals("Wind Sword")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }
	    	}
	    	if (userWeapons.getSelectedItem().equals("Spear")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 12;
	    		userWeaponAccuracyAmount = 70;
	    		userWeaponCritChanceAmount = 5;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Sword")||enemyWeapons.getSelectedItem().equals("Steel Sword")||enemyWeapons.getSelectedItem().equals("Silver Sword")||enemyWeapons.getSelectedItem().equals("Iron Blade")||enemyWeapons.getSelectedItem().equals("Steel Blade")||enemyWeapons.getSelectedItem().equals("Silver Blade")||enemyWeapons.getSelectedItem().equals("Longsword")||enemyWeapons.getSelectedItem().equals("Wyrmslayer")||enemyWeapons.getSelectedItem().equals("Armorslayer")||enemyWeapons.getSelectedItem().equals("Lance Reaver")||enemyWeapons.getSelectedItem().equals("Brave Sword")||enemyWeapons.getSelectedItem().equals("Killing Edge")||enemyWeapons.getSelectedItem().equals("Tizona")||enemyWeapons.getSelectedItem().equals("Light Brand")||enemyWeapons.getSelectedItem().equals("Rune Sword")||enemyWeapons.getSelectedItem().equals("Wind Sword")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }
	    	}
	    	if (userWeapons.getSelectedItem().equals("Horseslayer")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 7;
	    		userWeaponAccuracyAmount = 70;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Sword")||enemyWeapons.getSelectedItem().equals("Steel Sword")||enemyWeapons.getSelectedItem().equals("Silver Sword")||enemyWeapons.getSelectedItem().equals("Iron Blade")||enemyWeapons.getSelectedItem().equals("Steel Blade")||enemyWeapons.getSelectedItem().equals("Silver Blade")||enemyWeapons.getSelectedItem().equals("Longsword")||enemyWeapons.getSelectedItem().equals("Wyrmslayer")||enemyWeapons.getSelectedItem().equals("Armorslayer")||enemyWeapons.getSelectedItem().equals("Lance Reaver")||enemyWeapons.getSelectedItem().equals("Brave Sword")||enemyWeapons.getSelectedItem().equals("Killing Edge")||enemyWeapons.getSelectedItem().equals("Tizona")||enemyWeapons.getSelectedItem().equals("Light Brand")||enemyWeapons.getSelectedItem().equals("Rune Sword")||enemyWeapons.getSelectedItem().equals("Wind Sword")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }
	    	}
	    	if (userWeapons.getSelectedItem().equals("Axe Reaver")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 10;
	    		userWeaponAccuracyAmount = 70;
	    		userWeaponCritChanceAmount = 5;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Sword")||enemyWeapons.getSelectedItem().equals("Steel Sword")||enemyWeapons.getSelectedItem().equals("Silver Sword")||enemyWeapons.getSelectedItem().equals("Iron Blade")||enemyWeapons.getSelectedItem().equals("Steel Blade")||enemyWeapons.getSelectedItem().equals("Silver Blade")||enemyWeapons.getSelectedItem().equals("Longsword")||enemyWeapons.getSelectedItem().equals("Wyrmslayer")||enemyWeapons.getSelectedItem().equals("Armorslayer")||enemyWeapons.getSelectedItem().equals("Lance Reaver")||enemyWeapons.getSelectedItem().equals("Brave Sword")||enemyWeapons.getSelectedItem().equals("Killing Edge")||enemyWeapons.getSelectedItem().equals("Tizona")||enemyWeapons.getSelectedItem().equals("Light Brand")||enemyWeapons.getSelectedItem().equals("Rune Sword")||enemyWeapons.getSelectedItem().equals("Wind Sword")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }
	    	}
	    	if (userWeapons.getSelectedItem().equals("Rhongomiant")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 15;
	    		userWeaponAccuracyAmount = 80;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Sword")||enemyWeapons.getSelectedItem().equals("Steel Sword")||enemyWeapons.getSelectedItem().equals("Silver Sword")||enemyWeapons.getSelectedItem().equals("Iron Blade")||enemyWeapons.getSelectedItem().equals("Steel Blade")||enemyWeapons.getSelectedItem().equals("Silver Blade")||enemyWeapons.getSelectedItem().equals("Longsword")||enemyWeapons.getSelectedItem().equals("Wyrmslayer")||enemyWeapons.getSelectedItem().equals("Armorslayer")||enemyWeapons.getSelectedItem().equals("Lance Reaver")||enemyWeapons.getSelectedItem().equals("Brave Sword")||enemyWeapons.getSelectedItem().equals("Killing Edge")||enemyWeapons.getSelectedItem().equals("Tizona")||enemyWeapons.getSelectedItem().equals("Light Brand")||enemyWeapons.getSelectedItem().equals("Rune Sword")||enemyWeapons.getSelectedItem().equals("Wind Sword")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }
	    	}
	    	if (userWeapons.getSelectedItem().equals("Reginleif")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 10;
	    		userWeaponAccuracyAmount = 80;
	    		userWeaponCritChanceAmount = 10;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Sword")||enemyWeapons.getSelectedItem().equals("Steel Sword")||enemyWeapons.getSelectedItem().equals("Silver Sword")||enemyWeapons.getSelectedItem().equals("Iron Blade")||enemyWeapons.getSelectedItem().equals("Steel Blade")||enemyWeapons.getSelectedItem().equals("Silver Blade")||enemyWeapons.getSelectedItem().equals("Longsword")||enemyWeapons.getSelectedItem().equals("Wyrmslayer")||enemyWeapons.getSelectedItem().equals("Armorslayer")||enemyWeapons.getSelectedItem().equals("Lance Reaver")||enemyWeapons.getSelectedItem().equals("Brave Sword")||enemyWeapons.getSelectedItem().equals("Killing Edge")||enemyWeapons.getSelectedItem().equals("Tizona")||enemyWeapons.getSelectedItem().equals("Light Brand")||enemyWeapons.getSelectedItem().equals("Rune Sword")||enemyWeapons.getSelectedItem().equals("Wind Sword")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }
	    	}
	    	if (userWeapons.getSelectedItem().equals("Asclaon")){
	    		userWeaponMightAmount = 17;
	    		userWeaponAccuracyAmount = 80;
	    		userWeaponCritChanceAmount = 0;
	    		if (userBoosted == false){
	    		userAttackAmount += 5;
	    		userAttack.setText(""+userAttackAmount);
	    		}
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Sword")||enemyWeapons.getSelectedItem().equals("Steel Sword")||enemyWeapons.getSelectedItem().equals("Silver Sword")||enemyWeapons.getSelectedItem().equals("Iron Blade")||enemyWeapons.getSelectedItem().equals("Steel Blade")||enemyWeapons.getSelectedItem().equals("Silver Blade")||enemyWeapons.getSelectedItem().equals("Longsword")||enemyWeapons.getSelectedItem().equals("Wyrmslayer")||enemyWeapons.getSelectedItem().equals("Armorslayer")||enemyWeapons.getSelectedItem().equals("Lance Reaver")||enemyWeapons.getSelectedItem().equals("Brave Sword")||enemyWeapons.getSelectedItem().equals("Killing Edge")||enemyWeapons.getSelectedItem().equals("Tizona")||enemyWeapons.getSelectedItem().equals("Light Brand")||enemyWeapons.getSelectedItem().equals("Rune Sword")||enemyWeapons.getSelectedItem().equals("Wind Sword")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	userTriangle.setText(""+userTriangleAmount);
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        }
		        userBoosted = true;
	    	}
	    	if (userWeapons.getSelectedItem().equals("Iron Axe")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 8;
	    		userWeaponAccuracyAmount = 75;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Lance")||enemyWeapons.getSelectedItem().equals("Steel Lance")||enemyWeapons.getSelectedItem().equals("Silver Lance")||enemyWeapons.getSelectedItem().equals("Slim Lance")||enemyWeapons.getSelectedItem().equals("Killer Lance")||enemyWeapons.getSelectedItem().equals("Brave Lance")||enemyWeapons.getSelectedItem().equals("Javelin")||enemyWeapons.getSelectedItem().equals("Short Spear")||enemyWeapons.getSelectedItem().equals("Spear")||enemyWeapons.getSelectedItem().equals("Horseslayer")||enemyWeapons.getSelectedItem().equals("Axe Reaver")||enemyWeapons.getSelectedItem().equals("Rhongomiant")||enemyWeapons.getSelectedItem().equals("Reginleif")||enemyWeapons.getSelectedItem().equals("Ascalon")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Steel Axe")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 11;
	    		userWeaponAccuracyAmount = 65;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Lance")||enemyWeapons.getSelectedItem().equals("Steel Lance")||enemyWeapons.getSelectedItem().equals("Silver Lance")||enemyWeapons.getSelectedItem().equals("Slim Lance")||enemyWeapons.getSelectedItem().equals("Killer Lance")||enemyWeapons.getSelectedItem().equals("Brave Lance")||enemyWeapons.getSelectedItem().equals("Javelin")||enemyWeapons.getSelectedItem().equals("Short Spear")||enemyWeapons.getSelectedItem().equals("Spear")||enemyWeapons.getSelectedItem().equals("Horseslayer")||enemyWeapons.getSelectedItem().equals("Axe Reaver")||enemyWeapons.getSelectedItem().equals("Rhongomiant")||enemyWeapons.getSelectedItem().equals("Reginleif")||enemyWeapons.getSelectedItem().equals("Ascalon")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Silver Axe")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 15;
	    		userWeaponAccuracyAmount = 70;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Lance")||enemyWeapons.getSelectedItem().equals("Steel Lance")||enemyWeapons.getSelectedItem().equals("Silver Lance")||enemyWeapons.getSelectedItem().equals("Slim Lance")||enemyWeapons.getSelectedItem().equals("Killer Lance")||enemyWeapons.getSelectedItem().equals("Brave Lance")||enemyWeapons.getSelectedItem().equals("Javelin")||enemyWeapons.getSelectedItem().equals("Short Spear")||enemyWeapons.getSelectedItem().equals("Spear")||enemyWeapons.getSelectedItem().equals("Horseslayer")||enemyWeapons.getSelectedItem().equals("Axe Reaver")||enemyWeapons.getSelectedItem().equals("Rhongomiant")||enemyWeapons.getSelectedItem().equals("Reginleif")||enemyWeapons.getSelectedItem().equals("Ascalon")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Killer Axe")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 11;
	    		userWeaponAccuracyAmount = 65;
	    		userWeaponCritChanceAmount = 30;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Lance")||enemyWeapons.getSelectedItem().equals("Steel Lance")||enemyWeapons.getSelectedItem().equals("Silver Lance")||enemyWeapons.getSelectedItem().equals("Slim Lance")||enemyWeapons.getSelectedItem().equals("Killer Lance")||enemyWeapons.getSelectedItem().equals("Brave Lance")||enemyWeapons.getSelectedItem().equals("Javelin")||enemyWeapons.getSelectedItem().equals("Short Spear")||enemyWeapons.getSelectedItem().equals("Spear")||enemyWeapons.getSelectedItem().equals("Horseslayer")||enemyWeapons.getSelectedItem().equals("Axe Reaver")||enemyWeapons.getSelectedItem().equals("Rhongomiant")||enemyWeapons.getSelectedItem().equals("Reginleif")||enemyWeapons.getSelectedItem().equals("Ascalon")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Brave Axe")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 10;
	    		userWeaponAccuracyAmount = 65;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Lance")||enemyWeapons.getSelectedItem().equals("Steel Lance")||enemyWeapons.getSelectedItem().equals("Silver Lance")||enemyWeapons.getSelectedItem().equals("Slim Lance")||enemyWeapons.getSelectedItem().equals("Killer Lance")||enemyWeapons.getSelectedItem().equals("Brave Lance")||enemyWeapons.getSelectedItem().equals("Javelin")||enemyWeapons.getSelectedItem().equals("Short Spear")||enemyWeapons.getSelectedItem().equals("Spear")||enemyWeapons.getSelectedItem().equals("Horseslayer")||enemyWeapons.getSelectedItem().equals("Axe Reaver")||enemyWeapons.getSelectedItem().equals("Rhongomiant")||enemyWeapons.getSelectedItem().equals("Reginleif")||enemyWeapons.getSelectedItem().equals("Ascalon")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Hammer")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 10;
	    		userWeaponAccuracyAmount = 55;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Lance")||enemyWeapons.getSelectedItem().equals("Steel Lance")||enemyWeapons.getSelectedItem().equals("Silver Lance")||enemyWeapons.getSelectedItem().equals("Slim Lance")||enemyWeapons.getSelectedItem().equals("Killer Lance")||enemyWeapons.getSelectedItem().equals("Brave Lance")||enemyWeapons.getSelectedItem().equals("Javelin")||enemyWeapons.getSelectedItem().equals("Short Spear")||enemyWeapons.getSelectedItem().equals("Spear")||enemyWeapons.getSelectedItem().equals("Horseslayer")||enemyWeapons.getSelectedItem().equals("Axe Reaver")||enemyWeapons.getSelectedItem().equals("Rhongomiant")||enemyWeapons.getSelectedItem().equals("Reginleif")||enemyWeapons.getSelectedItem().equals("Ascalon")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Halberd")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 10;
	    		userWeaponAccuracyAmount = 55;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Lance")||enemyWeapons.getSelectedItem().equals("Steel Lance")||enemyWeapons.getSelectedItem().equals("Silver Lance")||enemyWeapons.getSelectedItem().equals("Slim Lance")||enemyWeapons.getSelectedItem().equals("Killer Lance")||enemyWeapons.getSelectedItem().equals("Brave Lance")||enemyWeapons.getSelectedItem().equals("Javelin")||enemyWeapons.getSelectedItem().equals("Short Spear")||enemyWeapons.getSelectedItem().equals("Spear")||enemyWeapons.getSelectedItem().equals("Horseslayer")||enemyWeapons.getSelectedItem().equals("Axe Reaver")||enemyWeapons.getSelectedItem().equals("Rhongomiant")||enemyWeapons.getSelectedItem().equals("Reginleif")||enemyWeapons.getSelectedItem().equals("Ascalon")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Sword Reaver")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 11;
	    		userWeaponAccuracyAmount = 65;
	    		userWeaponCritChanceAmount = 5;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Lance")||enemyWeapons.getSelectedItem().equals("Steel Lance")||enemyWeapons.getSelectedItem().equals("Silver Lance")||enemyWeapons.getSelectedItem().equals("Slim Lance")||enemyWeapons.getSelectedItem().equals("Killer Lance")||enemyWeapons.getSelectedItem().equals("Brave Lance")||enemyWeapons.getSelectedItem().equals("Javelin")||enemyWeapons.getSelectedItem().equals("Short Spear")||enemyWeapons.getSelectedItem().equals("Spear")||enemyWeapons.getSelectedItem().equals("Horseslayer")||enemyWeapons.getSelectedItem().equals("Axe Reaver")||enemyWeapons.getSelectedItem().equals("Rhongomiant")||enemyWeapons.getSelectedItem().equals("Reginleif")||enemyWeapons.getSelectedItem().equals("Ascalon")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Hand Axe")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 7;
	    		userWeaponAccuracyAmount = 60;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Lance")||enemyWeapons.getSelectedItem().equals("Steel Lance")||enemyWeapons.getSelectedItem().equals("Silver Lance")||enemyWeapons.getSelectedItem().equals("Slim Lance")||enemyWeapons.getSelectedItem().equals("Killer Lance")||enemyWeapons.getSelectedItem().equals("Brave Lance")||enemyWeapons.getSelectedItem().equals("Javelin")||enemyWeapons.getSelectedItem().equals("Short Spear")||enemyWeapons.getSelectedItem().equals("Spear")||enemyWeapons.getSelectedItem().equals("Horseslayer")||enemyWeapons.getSelectedItem().equals("Axe Reaver")||enemyWeapons.getSelectedItem().equals("Rhongomiant")||enemyWeapons.getSelectedItem().equals("Reginleif")||enemyWeapons.getSelectedItem().equals("Ascalon")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Tomahawk")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 13;
	    		userWeaponAccuracyAmount = 65;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Lance")||enemyWeapons.getSelectedItem().equals("Steel Lance")||enemyWeapons.getSelectedItem().equals("Silver Lance")||enemyWeapons.getSelectedItem().equals("Slim Lance")||enemyWeapons.getSelectedItem().equals("Killer Lance")||enemyWeapons.getSelectedItem().equals("Brave Lance")||enemyWeapons.getSelectedItem().equals("Javelin")||enemyWeapons.getSelectedItem().equals("Short Spear")||enemyWeapons.getSelectedItem().equals("Spear")||enemyWeapons.getSelectedItem().equals("Horseslayer")||enemyWeapons.getSelectedItem().equals("Axe Reaver")||enemyWeapons.getSelectedItem().equals("Rhongomiant")||enemyWeapons.getSelectedItem().equals("Reginleif")||enemyWeapons.getSelectedItem().equals("Ascalon")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Perun")){
	    		userWeaponMightAmount = 20;
	    		userWeaponAccuracyAmount = 75;
	    		userWeaponCritChanceAmount = 0;
	    		if (userBoosted == false){
	    		userAttackAmount += 5;
	    		userAttack.setText(""+userAttackAmount);
	    		}
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Iron Lance")||enemyWeapons.getSelectedItem().equals("Steel Lance")||enemyWeapons.getSelectedItem().equals("Silver Lance")||enemyWeapons.getSelectedItem().equals("Slim Lance")||enemyWeapons.getSelectedItem().equals("Killer Lance")||enemyWeapons.getSelectedItem().equals("Brave Lance")||enemyWeapons.getSelectedItem().equals("Javelin")||enemyWeapons.getSelectedItem().equals("Short Spear")||enemyWeapons.getSelectedItem().equals("Spear")||enemyWeapons.getSelectedItem().equals("Horseslayer")||enemyWeapons.getSelectedItem().equals("Axe Reaver")||enemyWeapons.getSelectedItem().equals("Rhongomiant")||enemyWeapons.getSelectedItem().equals("Reginleif")||enemyWeapons.getSelectedItem().equals("Ascalon")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
		        userBoosted = true;

	    	}
	    	if (userWeapons.getSelectedItem().equals("Iron Bow")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 6;
	    		userWeaponAccuracyAmount = 85;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
	    	}
	    	if (userWeapons.getSelectedItem().equals("Steel Bow")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 9;
	    		userWeaponAccuracyAmount = 70;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
	    	}
	    	if (userWeapons.getSelectedItem().equals("Silver Bow")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 13;
	    		userWeaponAccuracyAmount = 75;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
	    	}
	    	if (userWeapons.getSelectedItem().equals("Short Bow")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 5;
	    		userWeaponAccuracyAmount = 85;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
	    	}
	    	if (userWeapons.getSelectedItem().equals("Longbow")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 5;
	    		userWeaponAccuracyAmount = 65;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
	    	}
	    	if (userWeapons.getSelectedItem().equals("Killer Bow")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 9;
	    		userWeaponAccuracyAmount = 75;
	    		userWeaponCritChanceAmount = 30;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
	    	}
	    	if (userWeapons.getSelectedItem().equals("Brave Bow")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 10;
	    		userWeaponAccuracyAmount = 70;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
	    	}
	    	if (userWeapons.getSelectedItem().equals("Gandiva")){
	    		userWeaponMightAmount = 18;
	    		userWeaponAccuracyAmount = 80;
	    		userWeaponCritChanceAmount = 0;
	    		if (userBoosted == false){
	    		userSkillAmount +=5;
	    		userSkill.setText(""+userSkillAmount);
	    		}
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        userBoosted = true;
	    	}
	    	if (userWeapons.getSelectedItem().equals("Fire")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 5;
	    		userWeaponAccuracyAmount = 90;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Lightning")||enemyWeapons.getSelectedItem().equals("Shine")||enemyWeapons.getSelectedItem().equals("Divine")||enemyWeapons.getSelectedItem().equals("Purge")||enemyWeapons.getSelectedItem().equals("Aura")||enemyWeapons.getSelectedItem().equals("Eos")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Thunder")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 8;
	    		userWeaponAccuracyAmount = 80;
	    		userWeaponCritChanceAmount = 5;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Lightning")||enemyWeapons.getSelectedItem().equals("Shine")||enemyWeapons.getSelectedItem().equals("Divine")||enemyWeapons.getSelectedItem().equals("Purge")||enemyWeapons.getSelectedItem().equals("Aura")||enemyWeapons.getSelectedItem().equals("Eos")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Aircali")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 8;
	    		userWeaponAccuracyAmount = 85;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Lightning")||enemyWeapons.getSelectedItem().equals("Shine")||enemyWeapons.getSelectedItem().equals("Divine")||enemyWeapons.getSelectedItem().equals("Purge")||enemyWeapons.getSelectedItem().equals("Aura")||enemyWeapons.getSelectedItem().equals("Eos")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Bolting")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 12;
	    		userWeaponAccuracyAmount = 60;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Lightning")||enemyWeapons.getSelectedItem().equals("Shine")||enemyWeapons.getSelectedItem().equals("Divine")||enemyWeapons.getSelectedItem().equals("Purge")||enemyWeapons.getSelectedItem().equals("Aura")||enemyWeapons.getSelectedItem().equals("Eos")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Fimbulv")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 13;
	    		userWeaponAccuracyAmount = 80;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Lightning")||enemyWeapons.getSelectedItem().equals("Shine")||enemyWeapons.getSelectedItem().equals("Divine")||enemyWeapons.getSelectedItem().equals("Purge")||enemyWeapons.getSelectedItem().equals("Aura")||enemyWeapons.getSelectedItem().equals("Eos")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Zephyr")){
	    		
	    		userWeaponMightAmount = 18;
	    		userWeaponAccuracyAmount = 90;
	    		userWeaponCritChanceAmount = 10;
	    		if (userBoosted == false){
	    		userAttackAmount += 5;
	    		userAttack.setText(""+userAttackAmount);
	    		}
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Lightning")||enemyWeapons.getSelectedItem().equals("Shine")||enemyWeapons.getSelectedItem().equals("Divine")||enemyWeapons.getSelectedItem().equals("Purge")||enemyWeapons.getSelectedItem().equals("Aura")||enemyWeapons.getSelectedItem().equals("Eos")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
		        userBoosted = true;

	    	}
	    	if (userWeapons.getSelectedItem().equals("Flux")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 7;
	    		userWeaponAccuracyAmount = 80;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Fire")||enemyWeapons.getSelectedItem().equals("Thunder")||enemyWeapons.getSelectedItem().equals("Aircali")||enemyWeapons.getSelectedItem().equals("Bolting")||enemyWeapons.getSelectedItem().equals("Fimbulv")||enemyWeapons.getSelectedItem().equals("Zephyr")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Nosferatu")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 10;
	    		userWeaponAccuracyAmount = 70;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Fire")||enemyWeapons.getSelectedItem().equals("Thunder")||enemyWeapons.getSelectedItem().equals("Aircali")||enemyWeapons.getSelectedItem().equals("Bolting")||enemyWeapons.getSelectedItem().equals("Fimbulv")||enemyWeapons.getSelectedItem().equals("Zephyr")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Luna")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 0;
	    		userWeaponAccuracyAmount = 95;
	    		userWeaponCritChanceAmount = 20;
	    		enemyDefenseAmount = 0;
	    		enemyDefense.setText(""+enemyDefenseAmount);
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Fire")||enemyWeapons.getSelectedItem().equals("Thunder")||enemyWeapons.getSelectedItem().equals("Aircali")||enemyWeapons.getSelectedItem().equals("Bolting")||enemyWeapons.getSelectedItem().equals("Fimbulv")||enemyWeapons.getSelectedItem().equals("Zephyr")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Eclipse")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 0;
	    		userWeaponAccuracyAmount = 30;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Fire")||enemyWeapons.getSelectedItem().equals("Thunder")||enemyWeapons.getSelectedItem().equals("Aircali")||enemyWeapons.getSelectedItem().equals("Bolting")||enemyWeapons.getSelectedItem().equals("Fimbulv")||enemyWeapons.getSelectedItem().equals("Zephyr")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Fenrir")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 15;
	    		userWeaponAccuracyAmount = 70;
	    		userWeaponCritChanceAmount = 0;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Fire")||enemyWeapons.getSelectedItem().equals("Thunder")||enemyWeapons.getSelectedItem().equals("Aircali")||enemyWeapons.getSelectedItem().equals("Bolting")||enemyWeapons.getSelectedItem().equals("Fimbulv")||enemyWeapons.getSelectedItem().equals("Zephyr")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Nephtys")){
	    		userWeaponMightAmount = 23;
	    		userWeaponAccuracyAmount = 80;
	    		userWeaponCritChanceAmount = 0;
	    		if (userBoosted == false){
	    		userSpeedAmount += 5;
	    		userSpeed.setText(""+userSpeedAmount);
	    		}
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Fire")||enemyWeapons.getSelectedItem().equals("Thunder")||enemyWeapons.getSelectedItem().equals("Aircali")||enemyWeapons.getSelectedItem().equals("Bolting")||enemyWeapons.getSelectedItem().equals("Fimbulv")||enemyWeapons.getSelectedItem().equals("Zephyr")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
		        userBoosted = true;

	    	}
	    	if (userWeapons.getSelectedItem().equals("Lightning")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 4;
	    		userWeaponAccuracyAmount = 95;
	    		userWeaponCritChanceAmount = 5;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Flux")||enemyWeapons.getSelectedItem().equals("Nosferatu")||enemyWeapons.getSelectedItem().equals("Luna")||enemyWeapons.getSelectedItem().equals("Eclipse")||enemyWeapons.getSelectedItem().equals("Fenrir")||enemyWeapons.getSelectedItem().equals("Nephtys")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Shine")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 6;
	    		userWeaponAccuracyAmount = 90;
	    		userWeaponCritChanceAmount = 8;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Flux")||enemyWeapons.getSelectedItem().equals("Nosferatu")||enemyWeapons.getSelectedItem().equals("Luna")||enemyWeapons.getSelectedItem().equals("Eclipse")||enemyWeapons.getSelectedItem().equals("Fenrir")||enemyWeapons.getSelectedItem().equals("Nephtys")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Divine")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 8;
	    		userWeaponAccuracyAmount = 85;
	    		userWeaponCritChanceAmount = 10;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Flux")||enemyWeapons.getSelectedItem().equals("Nosferatu")||enemyWeapons.getSelectedItem().equals("Luna")||enemyWeapons.getSelectedItem().equals("Eclipse")||enemyWeapons.getSelectedItem().equals("Fenrir")||enemyWeapons.getSelectedItem().equals("Nephtys")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Purge")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 10;
	    		userWeaponAccuracyAmount = 75;
	    		userWeaponCritChanceAmount = 5;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Flux")||enemyWeapons.getSelectedItem().equals("Nosferatu")||enemyWeapons.getSelectedItem().equals("Luna")||enemyWeapons.getSelectedItem().equals("Eclipse")||enemyWeapons.getSelectedItem().equals("Fenrir")||enemyWeapons.getSelectedItem().equals("Nephtys")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Aura")){
	    		userBoosted = false;
	    		userWeaponMightAmount = 12;
	    		userWeaponAccuracyAmount = 85;
	    		userWeaponCritChanceAmount = 15;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Flux")||enemyWeapons.getSelectedItem().equals("Nosferatu")||enemyWeapons.getSelectedItem().equals("Luna")||enemyWeapons.getSelectedItem().equals("Eclipse")||enemyWeapons.getSelectedItem().equals("Fenrir")||enemyWeapons.getSelectedItem().equals("Nephtys")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }


	    	}
	    	if (userWeapons.getSelectedItem().equals("Eos")){
	    		userWeaponMightAmount = 17;
	    		userWeaponAccuracyAmount = 90;
	    		userWeaponCritChanceAmount = 5;
	    		if (userBoosted == false){
	    		userLuckAmount += 5;
	    		userLuck.setText(""+userLuckAmount);
	    		}
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
		        if (enemyWeapons.getSelectedItem().equals("Flux")||enemyWeapons.getSelectedItem().equals("Nosferatu")||enemyWeapons.getSelectedItem().equals("Luna")||enemyWeapons.getSelectedItem().equals("Eclipse")||enemyWeapons.getSelectedItem().equals("Fenrir")||enemyWeapons.getSelectedItem().equals("Nephtys")){
		        	userTriangleAmount = 1;
		        	enemyTriangleAmount = -1;
		        	enemyTriangle.setText(""+enemyTriangleAmount);
		        	userTriangle.setText(""+userTriangleAmount);
		        }
		        userBoosted = true;

	    	}
	    	if (enemyWeapons.getSelectedItem().equals("No Weapon")){
	    		enemyWeaponMightAmount = 0;
	    		enemyWeaponAccuracyAmount = 0;
	    		enemyWeaponCritChanceAmount = 0;
	    		enemyBoosted = false;
	    		enemyWeaponMight.setText(""+enemyWeaponMightAmount);
		        enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
		        enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
	    	}
	    	if (userWeapons.getSelectedItem().equals("No Weapon")){
	    		userWeaponMightAmount = 0;
	    		userWeaponAccuracyAmount = 0;
	    		userWeaponCritChanceAmount = 0;
	    		userBoosted = false;
	    		userWeaponMight.setText(""+userWeaponMightAmount);
		        userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
		        userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
	    	}
	    	enemyTriangle.setText(""+enemyTriangleAmount);
	        userTriangle.setText(""+userTriangleAmount);
	        if(e.getSource() == calculateButton)
	        {
	    		userHPAmount = Integer.parseInt(userHP.getText());
	    		enemyHPAmount = Integer.parseInt(enemyHP.getText());
	    		userAttackAmount = Integer.parseInt(userAttack.getText());
	    		userSkillAmount = Integer.parseInt(userSkill.getText());
	    		userSpeedAmount = Integer.parseInt(userSpeed.getText());
	    		userDefenseAmount = Integer.parseInt(userDefense.getText());
	    		userLuckAmount = Integer.parseInt(userLuck.getText());
	    		userTriangleAmount = Integer.parseInt(userTriangle.getText());
	    		userWeaponMightAmount = Integer.parseInt(userWeaponMight.getText());
	    		userWeaponCritChanceAmount = Integer.parseInt(userWeaponCritChance.getText());
	    		userTerrainBonusAmount = Integer.parseInt(userTerrainBonus.getText());
	    		enemyTerrainBonusAmount = Integer.parseInt(enemyTerrainBonus.getText());
	    		userSupportAmount = Integer.parseInt(userSupport.getText());
	    		userWeaponAccuracyAmount = Integer.parseInt(userWeaponAccuracy.getText());
	    		enemyAttackAmount = Integer.parseInt(enemyAttack.getText());
	    		enemySkillAmount = Integer.parseInt(enemySkill.getText());
	    		enemySpeedAmount = Integer.parseInt(enemySpeed.getText());
	    		enemyDefenseAmount = Integer.parseInt(enemyDefense.getText());
	    		enemyLuckAmount = Integer.parseInt(enemyLuck.getText());
	    		enemyTriangleAmount = Integer.parseInt(enemyTriangle.getText());
	    		enemyWeaponMightAmount = Integer.parseInt(enemyWeaponMight.getText());
	    		enemyWeaponCritChanceAmount = Integer.parseInt(enemyWeaponCritChance.getText());
	    		enemySupportAmount = Integer.parseInt(enemySupport.getText());
	    		enemyWeaponAccuracyAmount = Integer.parseInt(enemyWeaponAccuracy.getText());
	    		enemyClassCritAmount = Integer.parseInt(enemyClassCrit.getText());
	    		userClassCritAmount = Integer.parseInt(userClassCrit.getText());
	    		userLevelAmount = Integer.parseInt(userLevel.getText());
	    		enemyLevelAmount = Integer.parseInt(enemyLevel.getText());
	    		userAttackGrowthAmount = Integer.parseInt(userAttackGrowth.getText());
	    		userSkillGrowthAmount = Integer.parseInt(userSkillGrowth.getText());
	    		userDefenseGrowthAmount = Integer.parseInt(userDefenseGrowth.getText());
	    		userResistanceGrowthAmount = Integer.parseInt(userResistanceGrowth.getText());
	    		userLuckGrowthAmount = Integer.parseInt(userLuckGrowth.getText());
	    		userSpeedGrowthAmount = Integer.parseInt(userSpeedGrowth.getText());
	    		userHPGrowthAmount = Integer.parseInt(userHPGrowth.getText());
	    		currentExpAmount = Integer.parseInt(currentEXP.getText());
	    		
	    		int attackAccuracy = userWeaponAccuracyAmount + (userSkillAmount * 2) + (userLuckAmount / 2) + userSupportAmount + 15* userTriangleAmount;
	    		int attackAvoid = enemySpeedAmount * 2 + enemyLuckAmount + enemyTerrainBonusAmount + enemySupportAmount;
	    		int attackHitChance = attackAccuracy - attackAvoid;
	    		int attackPower = userWeaponMightAmount + userAttackAmount + userTriangleAmount;
	    		int attackDefense = enemyDefenseAmount + enemyTerrainBonusAmount + enemySupportAmount;
	    		int attackDamage = 0;
	    		int attackCrit = userWeaponCritChanceAmount + userSkillAmount/2 + 15*userClassCritAmount - enemyLuckAmount;
	    		int expGained = 0;
	    		Random generator = new Random();
    			int randomInt = generator.nextInt(100);
	    		if (userHPAmount > 0){
	    			
	    			userAttackHit = "Attacker's Attack Missed.";
	    			if (userWeapons.getSelectedItem().equals("No Weapon")){
	    				attackDamage = 0;
	    				attackHitChance = 0;
	    				attackCrit = 0;
	    				userAttackHit = "No weapon, no attack.";
	    			}
	    			if (randomInt < attackHitChance){
	    				
	    				randomInt = generator.nextInt(100);
	    				if ((attackPower-attackDefense)<0){
	    					attackDamage = 0;
	    					userAttackHit = "Attacker's Attack Hit. No damage.";
	    				}
	    				else if (randomInt < attackCrit){
	    					attackDamage = 3 * (attackPower- attackDefense);
	    					userAttackHit = ("Critical Hit! Attacker's Attack Hit for " +attackDamage +" damage.");
	    					if (enemyHPAmount > 0){
	    						if (isUser.isSelected()){
	    							int thingy = 30 - 5*userLevelAmount;
									if (thingy < 0){
										thingy = 0;
									}
	    							expGained = thingy + 5*(enemyLevelAmount-userLevelAmount);
	    							if (expGained < 5){
	    								expGained = 5;
	    							}
	    							if (expGained > 50){
	    								expGained = 50;
	    							}
	    						}
	    					}
	    					if (userWeapons.getSelectedItem().toString().contains("Brave")){
	    						userAttackHit = ("Critical Hit! Attacker's Attack Hit for " +attackDamage +"(x2) damage.");
	    						attackDamage*=2;
	    					}
	    					if (userWeapons.getSelectedItem().equals("Eclipse")){
	    						attackDamage = enemyHPAmount/2;
	    					}
	    					if (userWeapons.getSelectedItem().equals("Nosferatu")){
	    						if (attackDamage > enemyHPAmount){
	    							attackDamage = enemyHPAmount;
	    						}
	    						userHPAmount += attackDamage;
	    					}
	    				}
	    				else {
	    					attackDamage = (attackPower - attackDefense);
	    					if (enemyHPAmount > 0){
	    						
	    						userAttackHit = ("Attacker's Attack Hit for " +attackDamage +" damage.");
	    						if (isUser.isSelected()){
	    							int thingy = 30 - 5*userLevelAmount;
									if (thingy < 0){
										thingy = 0;
									}
	    							expGained = thingy + 5*(enemyLevelAmount-userLevelAmount);
	    							if (expGained < 5){
	    								expGained = 5;
	    							}
	    							if (expGained > 50){
	    								expGained = 50;
	    							}
	    						}
	    						if (userWeapons.getSelectedItem().toString().contains("Brave")){
	    							userAttackHit = ("Critical Hit! Attacker's Attack Hit for " +attackDamage +"(x2) damage.");
		    						attackDamage*=2;
		    					}
	    						if (userWeapons.getSelectedItem().equals("Eclipse")){
		    						attackDamage = enemyHPAmount/2;
		    					}
		    					if (userWeapons.getSelectedItem().equals("Nosferatu")){
		    						if (attackDamage > enemyHPAmount){
		    							attackDamage = enemyHPAmount;
		    						}
		    						userHPAmount += attackDamage;
		    					}
	    					}
	    				}
	    			}
	    			enemyHPAmount-=attackDamage;
	    		}
	    	    if (enemyHPAmount > 0){
	    	    	int defenseAccuracy = enemyWeaponAccuracyAmount + (enemySkillAmount * 2) + (enemyLuckAmount / 2) + enemySupportAmount + 15* enemyTriangleAmount;
		    		int defenseAvoid = userSpeedAmount * 2 + userLuckAmount + userTerrainBonusAmount + userSupportAmount;
		    		int defenseHitChance = defenseAccuracy - defenseAvoid;
		    		int defensePower = enemyWeaponMightAmount + enemyAttackAmount + enemyTriangleAmount;
		    		int defenseDefense = userDefenseAmount + userTerrainBonusAmount + userSupportAmount;
		    		int defenseDamage = 0;
		    		int defenseCrit = enemyWeaponCritChanceAmount + enemySkillAmount/2 +15*enemyClassCritAmount - userLuckAmount;
		    		randomInt = generator.nextInt(100);
		    		enemyAttackHit = "Defender's Attack Missed.";
		    		if (enemyWeapons.getSelectedItem().equals("No Weapon")){
		    			defenseDamage = 0;
		    			defenseHitChance = 0;
		    			defenseCrit = 0;
		    			enemyAttackHit = "No weapon, no attack.";
		    		}
		    		if (randomInt < defenseHitChance){
						if (!isUser.isSelected()){
							if (userHPAmount > 0){
								int thingy = 30 - 5*userLevelAmount;
								if (thingy < 0){
									thingy = 0;
								}
							expGained = thingy + 5*(userLevelAmount-enemyLevelAmount);
							if (expGained < 5){
								expGained = 5;
							}
							if (expGained > 50){
								expGained = 50;
							}
							}
						}
		    	    	randomInt = generator.nextInt(100);
		    	    	if ((defensePower-defenseDefense)<0){
	    	    			defenseDamage = 0;
	    	    			enemyAttackHit = "Defender's Attack Hit. No damage.";
	    	    		}
		    	    	else if (randomInt < defenseCrit){
		    	    		defenseDamage = 3 * (defensePower- defenseDefense);
		    	    		enemyAttackHit = ("Critical hit! Defender's Attack Hit for " +defenseDamage +" damage.");
		    	    		if (enemyWeapons.getSelectedItem().toString().contains("Brave")){
    							enemyAttackHit = ("Critical Hit! Defender's Attack Hit for " +defenseDamage +"(x2) damage.");
	    						defenseDamage*=2;
	    					}
    						if (enemyWeapons.getSelectedItem().equals("Eclipse")){
	    						defenseDamage = userHPAmount/2;
	    					}
	    					if (enemyWeapons.getSelectedItem().equals("Nosferatu")){
	    						if (defenseDamage > userHPAmount){
	    							defenseDamage = userHPAmount;
	    						}
	    						enemyHPAmount += defenseDamage;
	    					}

		    	    	}
		    	    	else {
		    	    		defenseDamage = (defensePower - defenseDefense);
		    	    		enemyAttackHit = ("Defender's Attack Hit for " +defenseDamage +" damage.");
		    	    		if (enemyWeapons.getSelectedItem().toString().contains("Brave")){
    							enemyAttackHit = ("Defender's Attack Hit for " +defenseDamage +"(x2) damage.");
	    						defenseDamage*=2;
	    					}
    						if (enemyWeapons.getSelectedItem().equals("Eclipse")){
	    						defenseDamage = userHPAmount/2;
	    					}
	    					if (enemyWeapons.getSelectedItem().equals("Nosferatu")){
	    						if (defenseDamage > userHPAmount){
	    							defenseDamage = userHPAmount;
	    						}
	    						enemyHPAmount += defenseDamage;
	    					}

		    	    	}
		    	    }
		    		userHPAmount -= defenseDamage;
		    		if (userHPAmount < 0){
		    			userHPAmount = 0;
		    		}
	    	    }
	    	    userAttackDouble = "Attacker could not double.";
	    	    if (userSpeedAmount - enemySpeedAmount >= 4 && !userWeapons.getSelectedItem().equals("No Weapon")){
	    	    	randomInt = generator.nextInt(100);
	    	    	userAttackDouble = "Attacker Doubled, but missed.";
		    		if (userHPAmount > 0){
		    			if (randomInt < attackHitChance){
		    				randomInt = generator.nextInt(100);
		    				if ((attackPower-attackDefense)<0){
		    					attackDamage = 0;
		    					userAttackDouble = "Attacker Doubled, and hit for no damage.";
		    				}
		    				else if (randomInt < attackCrit){
		    					attackDamage = 3 * (attackPower- attackDefense);
		    					userAttackDouble = ("Critical Hit! Attacker Doubled, and hit for "+attackDamage +" damage.");
		    					if (userWeapons.getSelectedItem().toString().contains("Brave")){
	    							userAttackDouble = ("Critical Hit! Attacker Doubled, and hit for " +attackDamage +"(x2) damage.");
		    						attackDamage*=2;
		    					}
		    					if (userWeapons.getSelectedItem().equals("Eclipse")){
		    						attackDamage = enemyHPAmount/2;
		    					}
		    					if (userWeapons.getSelectedItem().equals("Nosferatu")){
		    						if (attackDamage > enemyHPAmount){
		    							attackDamage = enemyHPAmount;
		    						}
		    						userHPAmount += attackDamage;
		    					}
		    				}
    					
    						
		    				else {
		    					attackDamage = (attackPower - attackDefense);
		    					userAttackDouble = ("Attacker Doubled, and hit for "+attackDamage +" damage.");
		    					if (userWeapons.getSelectedItem().equals("Eclipse")){
		    						attackDamage = enemyHPAmount/2;
		    					}
		    					if (userWeapons.getSelectedItem().equals("Nosferatu")){
		    						if (attackDamage > enemyHPAmount){
		    							attackDamage = enemyHPAmount;
		    						}
		    						userHPAmount += attackDamage;
		    					}
		    				}
		    			}
		    			enemyHPAmount-=attackDamage;
		    		}
	    	    }
	    	    enemyAttackDouble = "Defender could not double.";
	    	    if (enemySpeedAmount - userSpeedAmount >= 4 && enemyHPAmount > 0 && !enemyWeapons.getSelectedItem().equals("No Weapon")){
	    	    	int defenseAccuracy = enemyWeaponAccuracyAmount + (enemySkillAmount * 2) + (enemyLuckAmount / 2) + enemySupportAmount + 15* enemyTriangleAmount;
		    		int defenseAvoid = userSpeedAmount * 2 + userLuckAmount + userTerrainBonusAmount + userSupportAmount;
		    		int defenseHitChance = defenseAccuracy - defenseAvoid;
		    		int defensePower = enemyWeaponMightAmount + enemyAttackAmount + enemyTriangleAmount;
		    		int defenseDefense = userDefenseAmount + userTerrainBonusAmount + userSupportAmount;
		    		int defenseDamage = 0;
		    		int defenseCrit = enemyWeaponCritChanceAmount + enemySkillAmount/2 +15*enemyClassCritAmount - userLuckAmount;
	    	    	randomInt = generator.nextInt(100);
	    	    	if (randomInt < defenseHitChance){
		    	    	randomInt = generator.nextInt(100);
		    	    	if ((defensePower-defenseDefense)<0){
	    	    			defenseDamage = 0;
	    	    			enemyAttackDouble = "Defender's Double Hit. No damage.";
	    	    		}
		    	    	else if (randomInt < defenseCrit){
		    	    		defenseDamage = 3 * (defensePower- defenseDefense);
		    	    		enemyAttackDouble = ("Critical hit! Defender Doubled and hit for " +defenseDamage +" damage.");
		    	    		if (enemyWeapons.getSelectedItem().toString().contains("Brave")){
    							enemyAttackDouble = ("Critical Hit! Defender Doubled and hit for " +defenseDamage +"(x2) damage.");
	    						defenseDamage*=2;
	    					}
    						if (enemyWeapons.getSelectedItem().equals("Eclipse")){
	    						defenseDamage = userHPAmount/2;
	    					}
	    					if (enemyWeapons.getSelectedItem().equals("Nosferatu")){
	    						if (defenseDamage > userHPAmount){
	    							defenseDamage = userHPAmount;
	    						}
	    						enemyHPAmount += defenseDamage;
	    					}
		    	    	}
		    	    	else {
		    	    		defenseDamage = (defensePower - defenseDefense);
		    	    		enemyAttackDouble = ("Defender Doubled and hit for " +defenseDamage +" damage.");
		    	    		if (enemyWeapons.getSelectedItem().toString().contains("Brave")){
    							enemyAttackDouble = ("Defender Doubled and hit for " +defenseDamage +"(x2) damage.");
	    						defenseDamage*=2;
	    					}
    						if (enemyWeapons.getSelectedItem().equals("Eclipse")){
	    						defenseDamage = userHPAmount/2;
	    					}
	    					if (enemyWeapons.getSelectedItem().equals("Nosferatu")){
	    						if (defenseDamage > userHPAmount){
	    							defenseDamage = userHPAmount;
	    						}
	    						enemyHPAmount += defenseDamage;
	    					}
		    	    	}
		    	    }
	    	    }
	    	    if (enemyHPAmount <= 0){
	    	    	/*enemyAttackHit = "";
	    	    	enemyAttackDouble = "";
	    	    	userAttackHit = "The defender is dead.";
	    	    	userAttackDouble = "";
	    	    	enemyHPAmount = 0;
	    	    	*/
	    	    	
	    	    	expGained*=2;

	    	    }
	    	    /*if (userHPAmount <= 0){
	    	    	enemyAttackHit = "";
	    	    	enemyAttackDouble = "";
	    	    	userAttackHit = "The attacker is dead.";
	    	    	userAttackDouble = "";
	    	    }*/
	    	    text1Label.setText(""+userAttackHit);
	    	    text2Label.setText(""+enemyAttackHit);
	    	    text3Label.setText(""+userAttackDouble);
	    	    text4Label.setText(""+enemyAttackDouble);
	    	    currentExpAmount += expGained;
	    	 	userAttackGrowthLabelAmount.setText("+0");
    	    	userSkillGrowthLabelAmount.setText("+0");
    	    	userHPGrowthLabelAmount.setText("+0");
    	    	userDefenseGrowthLabelAmount.setText("+0");
    	    	userSpeedGrowthLabelAmount.setText("+0");
    	    	userLuckGrowthLabelAmount.setText("+0");
    	    	userResistanceGrowthLabelAmount.setText("+0");
    	    	  randomTextLabel.setText("");
	    	    if (currentExpAmount/100 >= 1){
	    	    	userLevelAmount++;
		    	    currentExpAmount =currentExpAmount%100;
		    	 	randomTextLabel.setText("Growths are CALCULATED but not ADDED into the stats.");
		    	    randomInt = generator.nextInt(100);
		    	    if (randomInt < userAttackGrowthAmount){
		    	    	userAttackGrowthLabelAmount.setText("+1");
		    	    }
		    	    randomInt = generator.nextInt(100);
		    	    if (randomInt < userSkillGrowthAmount){
		    	    	userSkillGrowthLabelAmount.setText("+1");
		    	    }
		    	    randomInt = generator.nextInt(100);
		    	    if (randomInt < userDefenseGrowthAmount){
		    	    	userDefenseGrowthLabelAmount.setText("+1");
		    	    }
		    	    randomInt = generator.nextInt(100);
		    	    if (randomInt < userResistanceGrowthAmount){
		    	    	userResistanceGrowthLabelAmount.setText("+1");
		    	    }
		    	    randomInt = generator.nextInt(100);
		    	    if (randomInt < userLuckGrowthAmount){
		    	    	userLuckGrowthLabelAmount.setText("+1");
		    	    }
		    	    randomInt = generator.nextInt(100);
		    	    if (randomInt < userSpeedGrowthAmount){
		    	    	userSpeedGrowthLabelAmount.setText("+1");
		    	    }
		    	    randomInt = generator.nextInt(100);
		    	    if (randomInt < userHPGrowthAmount){
		    	    	userHPGrowthLabelAmount.setText("+1");
		    	    }
		   
		    	   
		    	    
		    	    
	    	    }
	    	  
	    	    enemyHP.setText(""+enemyHPAmount);
	    	    userHP.setText(""+userHPAmount);
	    	    currentEXP.setText(""+currentExpAmount);
	    	    userLevel.setText(""+userLevelAmount);
	    	    
	        }

	        else if(e.getSource() == resetButton)
	        {
	        	userHPAmount = 0;
	    	    enemyHPAmount = 0;
	    	    userAttackAmount = 0;
	    	    userSkillAmount = 0;
	    	    userSpeedAmount = 0;
	    	    userDefenseAmount = 0;
	    	    userLuckAmount = 0;
	    	    userTriangleAmount = 0;
	    	    userWeaponMightAmount = 0;
	    	    userWeaponCritChanceAmount = 0;
	    	    userTerrainBonusAmount = 0;
	    	    enemyTerrainBonusAmount = 0;
	    	    userSupportAmount = 0;
	    	    userWeaponAccuracyAmount = 0;
	    	    enemyAttackAmount = 0;
	    	    enemySkillAmount = 0;
	    	    enemySpeedAmount = 0;
	    	    enemyDefenseAmount = 0;
	    	    enemyLuckAmount = 0;
	    	    enemyTriangleAmount = 0;
	    	    enemyWeaponMightAmount = 0;
	    	    enemyWeaponCritChanceAmount = 0;
	    	    enemySupportAmount = 0;
	    	    enemyWeaponAccuracyAmount = 0;
	    	    userClassCritAmount = 0;
	    	    enemyClassCritAmount = 0;
	    	    currentExpAmount = 0;
	    	    userAttackGrowthAmount = 0;
	    	    userSkillGrowthAmount = 0;
	    	    userDefenseGrowthAmount = 0;
	    	    userResistanceGrowthAmount = 0;
	    	    userLuckGrowthAmount = 0;
	    	    userSpeedGrowthAmount = 0;
	    	    userHPGrowthAmount = 0;
	    	    String userAttackHit = "";
	    		String enemyAttackHit = "";
	    		String userAttackDouble = "";
	    		String enemyAttackDouble = "";

	            userHP.setText(""+userHPAmount);
	            enemyHP.setText(""+enemyHPAmount);
	            userAttack.setText(""+userAttackAmount);
	            userSkill.setText(""+userSkillAmount);
	            userSpeed.setText(""+userSpeedAmount);
	            userDefense.setText(""+userDefenseAmount);
	            userLuck.setText(""+userLuckAmount);
	            userTriangle.setText(""+userTriangleAmount);
	            userWeaponMight.setText(""+userWeaponMightAmount);
	            userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
	            userSupport.setText(""+userSupportAmount);
	            userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
	            userTerrainBonus.setText(""+userTerrainBonusAmount);
	            enemyTerrainBonus.setText(""+enemyTerrainBonusAmount);
	            enemyAttack.setText(""+enemyAttackAmount);
	            enemySkill.setText(""+enemySkillAmount);
	            enemySpeed.setText(""+enemySpeedAmount);
	            enemyDefense.setText(""+enemyDefenseAmount);
	            enemyLuck.setText(""+enemyLuckAmount);
	            enemyTriangle.setText(""+enemyTriangleAmount);
	            enemyWeaponMight.setText(""+enemyWeaponMightAmount);
	            enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
	            enemySupport.setText(""+enemySupportAmount);
	            enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
	            userClassCrit.setText(""+userClassCritAmount);
	            enemyClassCrit.setText(""+enemyClassCritAmount);
	            currentEXP.setText(""+currentExpAmount);
	            userAttackGrowth.setText(""+userAttackGrowthAmount);
	            userSkillGrowth.setText(""+userSkillGrowthAmount);
	            userDefenseGrowth.setText(""+userDefenseGrowthAmount);
	            userResistanceGrowth.setText(""+userResistanceGrowthAmount);
	            userLuckGrowth.setText(""+userLuckGrowthAmount);
	            userSpeedGrowth.setText(""+userSpeedGrowthAmount);
	            userHPGrowth.setText(""+userHPGrowthAmount);
	    	 	userAttackGrowthLabelAmount.setText("+0");
    	    	userSkillGrowthLabelAmount.setText("+0");
    	    	userHPGrowthLabelAmount.setText("+0");
    	    	userDefenseGrowthLabelAmount.setText("+0");
    	    	userSpeedGrowthLabelAmount.setText("+0");
    	    	userLuckGrowthLabelAmount.setText("+0");
    	    	userResistanceGrowthLabelAmount.setText("+0");
    	    	randomTextLabel.setText("");
    	    	text1Label.setText(""+userAttackHit);
	    	    text2Label.setText(""+enemyAttackHit);
	    	    text3Label.setText(""+userAttackDouble);
	    	    text4Label.setText(""+enemyAttackDouble);
	            
	        }
	        else if (e.getSource()==switchButton){
	        	userHPAmount = Integer.parseInt(userHP.getText());
	    		enemyHPAmount = Integer.parseInt(enemyHP.getText());
	    		userAttackAmount = Integer.parseInt(userAttack.getText());
	    		userSkillAmount = Integer.parseInt(userSkill.getText());
	    		userSpeedAmount = Integer.parseInt(userSpeed.getText());
	    		userDefenseAmount = Integer.parseInt(userDefense.getText());
	    		userLuckAmount = Integer.parseInt(userLuck.getText());
	    		userTriangleAmount = Integer.parseInt(userTriangle.getText());
	    		userWeaponMightAmount = Integer.parseInt(userWeaponMight.getText());
	    		userWeaponCritChanceAmount = Integer.parseInt(userWeaponCritChance.getText());
	    		userTerrainBonusAmount = Integer.parseInt(userTerrainBonus.getText());
	    		enemyTerrainBonusAmount = Integer.parseInt(enemyTerrainBonus.getText());
	    		userSupportAmount = Integer.parseInt(userSupport.getText());
	    		userWeaponAccuracyAmount = Integer.parseInt(userWeaponAccuracy.getText());
	    		enemyAttackAmount = Integer.parseInt(enemyAttack.getText());
	    		enemySkillAmount = Integer.parseInt(enemySkill.getText());
	    		enemySpeedAmount = Integer.parseInt(enemySpeed.getText());
	    		enemyDefenseAmount = Integer.parseInt(enemyDefense.getText());
	    		enemyLuckAmount = Integer.parseInt(enemyLuck.getText());
	    		enemyTriangleAmount = Integer.parseInt(enemyTriangle.getText());
	    		enemyWeaponMightAmount = Integer.parseInt(enemyWeaponMight.getText());
	    		enemyWeaponCritChanceAmount = Integer.parseInt(enemyWeaponCritChance.getText());
	    		enemySupportAmount = Integer.parseInt(enemySupport.getText());
	    		enemyWeaponAccuracyAmount = Integer.parseInt(enemyWeaponAccuracy.getText());
	    		enemyClassCritAmount = Integer.parseInt(enemyClassCrit.getText());
	    		userClassCritAmount = Integer.parseInt(userClassCrit.getText());
	    		userLevelAmount = Integer.parseInt(userLevel.getText());
	    		enemyLevelAmount = Integer.parseInt(enemyLevel.getText());
	    		userAttackGrowthAmount = Integer.parseInt(userAttackGrowth.getText());
	    		userSkillGrowthAmount = Integer.parseInt(userSkillGrowth.getText());
	    		userDefenseGrowthAmount = Integer.parseInt(userDefenseGrowth.getText());
	    		userResistanceGrowthAmount = Integer.parseInt(userResistanceGrowth.getText());
	    		userLuckGrowthAmount = Integer.parseInt(userLuckGrowth.getText());
	    		userSpeedGrowthAmount = Integer.parseInt(userSpeedGrowth.getText());
	    		userHPGrowthAmount = Integer.parseInt(userHPGrowth.getText());
	    		currentExpAmount = Integer.parseInt(currentEXP.getText());
	        	
	    		temp = userWeapons.getSelectedIndex();
	    		userWeapons.setSelectedIndex(enemyWeapons.getSelectedIndex());
	        	enemyWeapons.setSelectedIndex(temp);
	    		
	        	temp = userHPAmount;
	        	userHPAmount = enemyHPAmount;
	        	enemyHPAmount = temp;
	        	temp = userAttackAmount;
	        	userAttackAmount = enemyAttackAmount;
	        	enemyAttackAmount = temp;
	        	temp = userSkillAmount;
	        	userSkillAmount = enemySkillAmount;
	        	enemySkillAmount = temp;
	        	temp = userSpeedAmount;
	        	userSpeedAmount = enemySpeedAmount;
	        	enemySpeedAmount = temp;
	        	temp = userDefenseAmount;
	        	userDefenseAmount = enemyDefenseAmount;
	        	enemyDefenseAmount = temp;
	        	temp = userLuckAmount;
	        	userLuckAmount = enemyLuckAmount;
	        	enemyLuckAmount = temp;
	        	temp = userTriangleAmount;
	        	userTriangleAmount = enemyTriangleAmount;
	        	enemyTriangleAmount = temp;
	        	temp = userWeaponMightAmount;
	        	userWeaponMightAmount = enemyWeaponMightAmount;
	        	enemyWeaponMightAmount = temp;
	        	temp = userWeaponCritChanceAmount;
	        	userWeaponCritChanceAmount = enemyWeaponCritChanceAmount;
	        	enemyWeaponCritChanceAmount = temp;
	        	temp = userWeaponAccuracyAmount;
	        	userWeaponAccuracyAmount = enemyWeaponAccuracyAmount;
	        	enemyWeaponAccuracyAmount = temp;
	        	temp = userSupportAmount;
	        	userSupportAmount = enemySupportAmount;
	        	enemySupportAmount = temp;
	        	temp = userClassCritAmount;
	        	userClassCritAmount = enemyClassCritAmount;
	        	enemyClassCritAmount = temp;
	        	temp = userLevelAmount;
	        	userLevelAmount = enemyLevelAmount;
	        	enemyLevelAmount = temp;
	        	temp = userTerrainBonusAmount;
	        	userTerrainBonusAmount = enemyTerrainBonusAmount;
	        	enemyTerrainBonusAmount = temp;
	        	
	            userHP.setText(""+userHPAmount);
	            enemyHP.setText(""+enemyHPAmount);
	            userLevel.setText(""+userLevelAmount);
	            enemyLevel.setText(""+enemyLevelAmount);
	            userAttack.setText(""+userAttackAmount);
	            userSkill.setText(""+userSkillAmount);
	            userSpeed.setText(""+userSpeedAmount);
	            userDefense.setText(""+userDefenseAmount);
	            userLuck.setText(""+userLuckAmount);
	            userTriangle.setText(""+userTriangleAmount);
	            userWeaponMight.setText(""+userWeaponMightAmount);
	            userWeaponCritChance.setText(""+userWeaponCritChanceAmount);
	            userSupport.setText(""+userSupportAmount);
	            userWeaponAccuracy.setText(""+userWeaponAccuracyAmount);
	            enemyAttack.setText(""+enemyAttackAmount);
	            enemySkill.setText(""+enemySkillAmount);
	            enemySpeed.setText(""+enemySpeedAmount);
	            enemyDefense.setText(""+enemyDefenseAmount);
	            enemyLuck.setText(""+enemyLuckAmount);
	            enemyTriangle.setText(""+enemyTriangleAmount);
	            enemyWeaponMight.setText(""+enemyWeaponMightAmount);
	            enemyWeaponCritChance.setText(""+enemyWeaponCritChanceAmount);
	            enemySupport.setText(""+enemySupportAmount);
	            enemyWeaponAccuracy.setText(""+enemyWeaponAccuracyAmount);
	            userClassCrit.setText(""+userClassCritAmount);
	            enemyClassCrit.setText(""+enemyClassCritAmount);
	            userTerrainBonus.setText(""+userTerrainBonusAmount);
	            enemyTerrainBonus.setText(""+enemyTerrainBonusAmount);
	        }
	    }

	    private static void createAndShowGUI() {

	        JFrame.setDefaultLookAndFeelDecorated(true);
	        JFrame frame = new JFrame("Fire Emblem RP Calculator (Or, FERPulator)");

	        //Create and set up the content pane.
	        Calculator demo = new Calculator();
	        frame.setContentPane(demo.createContentPane());

	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(900, 650);
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }
	}