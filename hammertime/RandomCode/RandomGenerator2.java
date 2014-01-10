import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;


public class RandomGenerator2 implements  ActionListener, SwingConstants{
    // Definition of global values and items that are part of the GUI.
	
	/**
 * 
 */
	int pokemon1LevelAmount = 0;
	int pokemon2LevelAmount = 0;
	int pokemon3LevelAmount = 0;
	int pokemon4LevelAmount = 0;
	int pokemon5LevelAmount = 0;
	int pokemon6LevelAmount = 0;
	int enemyPokemon1LevelAmount = 0;
	int enemyPokemon2LevelAmount = 0;
	int enemyPokemon3LevelAmount = 0;
	int enemyPokemon4LevelAmount = 0;
	
    JPanel titlePanel, dataPanel, buttonPanel;
    JLabel redLabel, blueLabel;
    JLabel randomTextLabel;
    JTextField pokemon1LevelField, pokemon2LevelField, pokemon3LevelField, pokemon4LevelField, pokemon5LevelField;
    JTextField pokemon6LevelField;
    JLabel enemyPokemon1LevelLabel, enemyPokemon2LevelLabel, enemyPokemon3LevelLabel, enemyPokemon4LevelLabel;

    JButton calculateButton, resetButton;

    public JPanel createContentPane (){

        // We create a bottom JPanel to place everything on.
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);
	

        // Creation of a Panel to contain the title labels
        titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(0, 0);
        titlePanel.setSize(800, 30);
        totalGUI.add(titlePanel);

        blueLabel = new JLabel("Pokemon Levels");
        blueLabel.setLocation(0, 0);
        blueLabel.setSize(120, 30);
        blueLabel.setHorizontalAlignment(LEFT);
        blueLabel.setForeground(Color.blue);
        titlePanel.add(blueLabel);

        redLabel = new JLabel("Enemy Pokemon Levels");
        redLabel.setLocation(144, 0);
        redLabel.setSize(120, 30);
        redLabel.setHorizontalAlignment(LEFT);
        redLabel.setForeground(Color.red);
        titlePanel.add(redLabel);


        // Creation of a Panel to contain the score labels.
        dataPanel = new JPanel();
        dataPanel.setLayout(null);
        dataPanel.setLocation(10, 40);
        dataPanel.setSize(900, 500);
        totalGUI.add(dataPanel);
        
   
        enemyPokemon1LevelLabel = new JLabel("");
        enemyPokemon1LevelLabel.setLocation(150, 0);
        enemyPokemon1LevelLabel.setSize(30, 30);
        enemyPokemon1LevelLabel.setHorizontalAlignment(LEFT);
        dataPanel.add(enemyPokemon1LevelLabel);
        
        enemyPokemon2LevelLabel = new JLabel("");
        enemyPokemon2LevelLabel.setLocation(150, 30);
        enemyPokemon2LevelLabel.setSize(30, 30);
        enemyPokemon2LevelLabel.setHorizontalAlignment(LEFT);
        dataPanel.add(enemyPokemon2LevelLabel);
        
        enemyPokemon3LevelLabel = new JLabel("");
        enemyPokemon3LevelLabel.setLocation(150, 60);
        enemyPokemon3LevelLabel.setSize(30, 30);
        enemyPokemon3LevelLabel.setHorizontalAlignment(LEFT);
        dataPanel.add(enemyPokemon3LevelLabel);
        
        enemyPokemon4LevelLabel = new JLabel("");
        enemyPokemon4LevelLabel.setLocation(150, 90);
        enemyPokemon4LevelLabel.setSize(30, 30);
        enemyPokemon4LevelLabel.setHorizontalAlignment(LEFT);
        dataPanel.add(enemyPokemon4LevelLabel);
        
        randomTextLabel = new JLabel("");
        randomTextLabel.setLocation(200, 0);
        randomTextLabel.setSize(80, 30);
        randomTextLabel.setHorizontalAlignment(LEFT);
        dataPanel.add(randomTextLabel);
         
        pokemon1LevelField = new JTextField("0");
        pokemon1LevelField.setLocation(0, 0);
        pokemon1LevelField.setSize(30, 30);
        pokemon1LevelField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon1LevelField);
        
        pokemon2LevelField = new JTextField("0");
        pokemon2LevelField.setLocation(0, 30);
        pokemon2LevelField.setSize(30, 30);
        pokemon2LevelField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon2LevelField);
      
        pokemon3LevelField = new JTextField("0");
        pokemon3LevelField.setLocation(0, 60);
        pokemon3LevelField.setSize(30, 30);
        pokemon3LevelField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon3LevelField);

        pokemon4LevelField = new JTextField("0");
        pokemon4LevelField.setLocation(0, 90);
        pokemon4LevelField.setSize(30, 30);
        pokemon4LevelField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon4LevelField);
        
        pokemon5LevelField = new JTextField("0");
        pokemon5LevelField.setLocation(0, 120);
        pokemon5LevelField.setSize(30, 30);
        pokemon5LevelField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon5LevelField);
        
        pokemon6LevelField = new JTextField("0");
        pokemon6LevelField.setLocation(0, 150);
        pokemon6LevelField.setSize(30, 30);
        pokemon6LevelField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon6LevelField);
        
      
        
     




        
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
        

        
        totalGUI.setOpaque(true);
        return totalGUI;
    }

    // This is the new ActionPerformed Method.
    // It catches any events with an ActionListener attached.
    // Using an if statement, we can determine which button was pressed
    // and change the appropriate values in our GUI.
    public void actionPerformed(ActionEvent e) {
 
        if(e.getSource() == calculateButton)
        {
        	
    		pokemon1LevelAmount = Integer.parseInt(pokemon1LevelField.getText());
    		pokemon2LevelAmount = Integer.parseInt(pokemon2LevelField.getText());
    		pokemon3LevelAmount = Integer.parseInt(pokemon3LevelField.getText());
    		pokemon4LevelAmount = Integer.parseInt(pokemon4LevelField.getText());
    		pokemon5LevelAmount = Integer.parseInt(pokemon5LevelField.getText());
    		pokemon6LevelAmount = Integer.parseInt(pokemon6LevelField.getText());
    		
    		
    		
    		
    		int max = pokemon1LevelAmount;
    		int min = pokemon1LevelAmount;
    		int randomLevel1 = 0;
    		int randomLevel2 = 0;
    		int randomLevel3 = 0;
    		int randomLevel4 = 0;

    		
    		if (pokemon2LevelAmount != 0 && pokemon2LevelAmount < min){
    			min = pokemon2LevelAmount;
    		}
    		if (pokemon2LevelAmount != 0 && pokemon2LevelAmount > max){
    			max = pokemon2LevelAmount;
    		}
    		if (pokemon3LevelAmount != 0 && pokemon3LevelAmount < min){
    			min = pokemon3LevelAmount;
    		}
    		if (pokemon3LevelAmount != 0 && pokemon3LevelAmount > max){
    			max = pokemon3LevelAmount;
    		}
    		if (pokemon4LevelAmount != 0 && pokemon4LevelAmount < min){
    			min = pokemon4LevelAmount;
    		}
    		if (pokemon4LevelAmount != 0 && pokemon4LevelAmount > max){
    			max = pokemon4LevelAmount;
    		}
    		if (pokemon5LevelAmount != 0 && pokemon5LevelAmount < min){
    			min = pokemon5LevelAmount;
    		}
    		if (pokemon5LevelAmount != 0 && pokemon5LevelAmount > max){
    			max = pokemon5LevelAmount;
    		}
    		if (pokemon6LevelAmount != 0 && pokemon6LevelAmount < min){
    			min = pokemon6LevelAmount;
    		}
    		if (pokemon6LevelAmount != 0 && pokemon6LevelAmount > max){
    			max = pokemon6LevelAmount;
    		}
    		
    		Random generator = new Random();
    		
    		int randomPokemonAmount = generator.nextInt(4)+1;
    		if (max - min == 0){
    				randomLevel1 = generator.nextInt(2) + min;
    				randomLevel2 = generator.nextInt(2) + min;
    				randomLevel3 = generator.nextInt(2) + min;
    				randomLevel4 = generator.nextInt(2) + min;

    			
    		}
    		else{
    			randomLevel1 = generator.nextInt(max - min) + min;
    			randomLevel2 = generator.nextInt(max - min) + min;
    			randomLevel3 = generator.nextInt(max - min) + min;
    			randomLevel4 = generator.nextInt(max - min) + min;
    		}
    			
    		enemyPokemon1LevelLabel.setText(""+randomLevel1);
    		enemyPokemon2LevelLabel.setText("");
    		enemyPokemon3LevelLabel.setText("");
    		enemyPokemon4LevelLabel.setText("");
	
    		if (randomPokemonAmount == 2){
        		enemyPokemon2LevelLabel.setText(""+randomLevel2);
    		}
    		if (randomPokemonAmount == 3){
        		enemyPokemon2LevelLabel.setText(""+randomLevel2);
        		enemyPokemon3LevelLabel.setText(""+randomLevel3);
    		}
    		if (randomPokemonAmount == 4){
    			enemyPokemon2LevelLabel.setText(""+randomLevel2);
        		enemyPokemon3LevelLabel.setText(""+randomLevel3);
        		enemyPokemon4LevelLabel.setText(""+randomLevel4);
    		}
        }
    		
        else if(e.getSource() == resetButton)
        {
        	pokemon1LevelField.setText("0");
        	pokemon2LevelField.setText("0");
        	pokemon3LevelField.setText("0");
        	pokemon4LevelField.setText("0");
        	pokemon5LevelField.setText("0");        	
        	pokemon6LevelField.setText("0");
    		enemyPokemon1LevelLabel.setText("");
    		enemyPokemon2LevelLabel.setText("");
    		enemyPokemon3LevelLabel.setText("");
    		enemyPokemon4LevelLabel.setText("");
        	randomTextLabel.setText("");
        }

		
       
        
    }

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Pokemon RP Level Generator");

        //Create and set up the content pane.
        
        RandomGenerator2 demo = new RandomGenerator2();
        frame.setContentPane(demo.createContentPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 650);
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
