import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;


public class RandomGenerator implements  ActionListener, SwingConstants{
    // Definition of global values and items that are part of the GUI.
	
	/**
 * 
 */
	int pokemon1CatchRate = 0;
	int pokemon2CatchRate = 0;
	int pokemon3CatchRate = 0;
	int pokemon4CatchRate = 0;
	int pokemon5CatchRate = 0;
	int pokemon6CatchRate = 0;
	int pokemon7CatchRate = 0;
	int pokemon8CatchRate = 0;
	int pokemon9CatchRate = 0;
	int pokemon10CatchRate = 0;
	int pokemon11CatchRate = 0;
	int pokemon12CatchRate = 0;
	int pokemon13CatchRate = 0;
	int pokemon14CatchRate = 0;
	int pokemon15CatchRate = 0;
	int pokemon16CatchRate = 0;
	
	String pokemon1Name = "";
	String pokemon2Name = "";
	String pokemon3Name = "";
	String pokemon4Name = "";
	String pokemon5Name = "";
	String pokemon6Name = "";
	String pokemon7Name = "";
	String pokemon8Name = "";
	String pokemon9Name = "";
	String pokemon10Name = "";
	String pokemon11Name = "";
	String pokemon12Name = "";
	String pokemon13Name = "";
	String pokemon14Name = "";
	String pokemon15Name = "";
	String pokemon16Name = "";
	
    JPanel titlePanel, dataPanel, buttonPanel;
    JLabel redLabel, blueLabel;
    JLabel randomTextLabel;
    JTextField pokemon1NameField, pokemon2NameField, pokemon3NameField, pokemon4NameField, pokemon5NameField;
    JTextField pokemon6NameField, pokemon7NameField, pokemon8NameField, pokemon9NameField, pokemon10NameField;
    JTextField pokemon11NameField, pokemon12NameField, pokemon13NameField, pokemon14NameField, pokemon15NameField, pokemon16NameField;
    JTextField pokemon1CatchRateField, pokemon2CatchRateField, pokemon3CatchRateField, pokemon4CatchRateField, pokemon5CatchRateField;
    JTextField pokemon6CatchRateField, pokemon7CatchRateField, pokemon8CatchRateField, pokemon9CatchRateField, pokemon10CatchRateField;
    JTextField pokemon11CatchRateField, pokemon12CatchRateField, pokemon13CatchRateField, pokemon14CatchRateField, pokemon15CatchRateField, pokemon16CatchRateField;
   

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

        blueLabel = new JLabel("Pokemon");
        blueLabel.setLocation(23, 0);
        blueLabel.setSize(120, 30);
        blueLabel.setHorizontalAlignment(LEFT);
        blueLabel.setForeground(Color.blue);
        titlePanel.add(blueLabel);

        redLabel = new JLabel("Catch Rate");
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
        
   
   
        
        randomTextLabel = new JLabel("");
        randomTextLabel.setLocation(200, 0);
        randomTextLabel.setSize(80, 30);
        randomTextLabel.setHorizontalAlignment(LEFT);
        dataPanel.add(randomTextLabel);
         
        pokemon1NameField = new JTextField("");
        pokemon1NameField.setLocation(0, 0);
        pokemon1NameField.setSize(80, 30);
        pokemon1NameField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon1NameField);
        
        pokemon2NameField = new JTextField("");
        pokemon2NameField.setLocation(0, 30);
        pokemon2NameField.setSize(80, 30);
        pokemon2NameField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon2NameField);
      
        pokemon3NameField = new JTextField("");
        pokemon3NameField.setLocation(0, 60);
        pokemon3NameField.setSize(80, 30);
        pokemon3NameField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon3NameField);

        pokemon4NameField = new JTextField("");
        pokemon4NameField.setLocation(0, 90);
        pokemon4NameField.setSize(80, 30);
        pokemon4NameField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon4NameField);
        
        pokemon5NameField = new JTextField("");
        pokemon5NameField.setLocation(0, 120);
        pokemon5NameField.setSize(80, 30);
        pokemon5NameField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon5NameField);
        
        pokemon6NameField = new JTextField("");
        pokemon6NameField.setLocation(0, 150);
        pokemon6NameField.setSize(80, 30);
        pokemon6NameField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon6NameField);
        
        pokemon7NameField = new JTextField("");
        pokemon7NameField.setLocation(0, 180);
        pokemon7NameField.setSize(80, 30);
        pokemon7NameField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon7NameField);
        
        pokemon8NameField = new JTextField("");
        pokemon8NameField.setLocation(0, 210);
        pokemon8NameField.setSize(80, 30);
        pokemon8NameField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon8NameField);
        
        pokemon9NameField = new JTextField("");
        pokemon9NameField.setLocation(0, 240);
        pokemon9NameField.setSize(80, 30);
        pokemon9NameField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon9NameField);
        
        pokemon10NameField = new JTextField("");
        pokemon10NameField.setLocation(0, 270);
        pokemon10NameField.setSize(80, 30);
        pokemon10NameField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon10NameField);
        
        pokemon11NameField = new JTextField("");
        pokemon11NameField.setLocation(0, 300);
        pokemon11NameField.setSize(80, 30);
        pokemon11NameField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon11NameField);
        
        pokemon12NameField = new JTextField("");
        pokemon12NameField.setLocation(0, 330);
        pokemon12NameField.setSize(80, 30);
        pokemon12NameField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon12NameField);
        
        pokemon13NameField = new JTextField("");
        pokemon13NameField.setLocation(0, 360);
        pokemon13NameField.setSize(80, 30);
        pokemon13NameField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon13NameField);
        
        pokemon14NameField = new JTextField("");
        pokemon14NameField.setLocation(0, 390);
        pokemon14NameField.setSize(80, 30);
        pokemon14NameField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon14NameField);
        
        pokemon15NameField = new JTextField("");
        pokemon15NameField.setLocation(0, 420);
        pokemon15NameField.setSize(80, 30);
        pokemon15NameField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon15NameField);
        
        pokemon16NameField = new JTextField("");
        pokemon16NameField.setLocation(0, 450);
        pokemon16NameField.setSize(80, 30);
        pokemon16NameField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon16NameField);
        
        pokemon1CatchRateField = new JTextField("0");
        pokemon1CatchRateField.setLocation(150, 0);
        pokemon1CatchRateField.setSize(30, 30);
        pokemon1CatchRateField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon1CatchRateField);
        
        pokemon2CatchRateField = new JTextField("0");
        pokemon2CatchRateField.setLocation(150, 30);
        pokemon2CatchRateField.setSize(30, 30);
        pokemon2CatchRateField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon2CatchRateField);
      
        pokemon3CatchRateField = new JTextField("0");
        pokemon3CatchRateField.setLocation(150, 60);
        pokemon3CatchRateField.setSize(30, 30);
        pokemon3CatchRateField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon3CatchRateField);

        pokemon4CatchRateField = new JTextField("0");
        pokemon4CatchRateField.setLocation(150, 90);
        pokemon4CatchRateField.setSize(30, 30);
        pokemon4CatchRateField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon4CatchRateField);
        
        pokemon5CatchRateField = new JTextField("0");
        pokemon5CatchRateField.setLocation(150, 120);
        pokemon5CatchRateField.setSize(30, 30);
        pokemon5CatchRateField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon5CatchRateField);
        
        pokemon6CatchRateField = new JTextField("0");
        pokemon6CatchRateField.setLocation(150, 150);
        pokemon6CatchRateField.setSize(30, 30);
        pokemon6CatchRateField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon6CatchRateField);
        
        pokemon7CatchRateField = new JTextField("0");
        pokemon7CatchRateField.setLocation(150, 180);
        pokemon7CatchRateField.setSize(30, 30);
        pokemon7CatchRateField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon7CatchRateField);
        
        pokemon8CatchRateField = new JTextField("0");
        pokemon8CatchRateField.setLocation(150, 210);
        pokemon8CatchRateField.setSize(30, 30);
        pokemon8CatchRateField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon8CatchRateField);
        
        pokemon9CatchRateField = new JTextField("0");
        pokemon9CatchRateField.setLocation(150, 240);
        pokemon9CatchRateField.setSize(30, 30);
        pokemon9CatchRateField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon9CatchRateField);
        
        pokemon10CatchRateField = new JTextField("0");
        pokemon10CatchRateField.setLocation(150, 270);
        pokemon10CatchRateField.setSize(30, 30);
        pokemon10CatchRateField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon10CatchRateField);
        
        pokemon11CatchRateField = new JTextField("0");
        pokemon11CatchRateField.setLocation(150, 300);
        pokemon11CatchRateField.setSize(30, 30);
        pokemon11CatchRateField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon11CatchRateField);
        
        pokemon12CatchRateField = new JTextField("0");
        pokemon12CatchRateField.setLocation(150, 330);
        pokemon12CatchRateField.setSize(30, 30);
        pokemon12CatchRateField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon12CatchRateField);
        
        pokemon13CatchRateField = new JTextField("0");
        pokemon13CatchRateField.setLocation(150, 360);
        pokemon13CatchRateField.setSize(30, 30);
        pokemon13CatchRateField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon13CatchRateField);
        
        pokemon14CatchRateField = new JTextField("0");
        pokemon14CatchRateField.setLocation(150, 390);
        pokemon14CatchRateField.setSize(30, 30);
        pokemon14CatchRateField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon14CatchRateField);
        
        pokemon15CatchRateField = new JTextField("0");
        pokemon15CatchRateField.setLocation(150, 420);
        pokemon15CatchRateField.setSize(30, 30);
        pokemon15CatchRateField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon15CatchRateField);
        
        pokemon16CatchRateField = new JTextField("0");
        pokemon16CatchRateField.setLocation(150, 450);
        pokemon16CatchRateField.setSize(30, 30);
        pokemon16CatchRateField.setHorizontalAlignment(LEFT);
        dataPanel.add(pokemon16CatchRateField);




        
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
        	
    		pokemon1CatchRate = Integer.parseInt(pokemon1CatchRateField.getText());
    		pokemon2CatchRate = Integer.parseInt(pokemon2CatchRateField.getText());
    		pokemon3CatchRate = Integer.parseInt(pokemon3CatchRateField.getText());
    		pokemon4CatchRate = Integer.parseInt(pokemon4CatchRateField.getText());
    		pokemon5CatchRate = Integer.parseInt(pokemon5CatchRateField.getText());
    		pokemon6CatchRate = Integer.parseInt(pokemon6CatchRateField.getText());
    		pokemon7CatchRate = Integer.parseInt(pokemon7CatchRateField.getText());
    		pokemon8CatchRate = Integer.parseInt(pokemon8CatchRateField.getText());
    		pokemon9CatchRate = Integer.parseInt(pokemon9CatchRateField.getText());
    		pokemon10CatchRate = Integer.parseInt(pokemon10CatchRateField.getText());
    		pokemon11CatchRate = Integer.parseInt(pokemon11CatchRateField.getText());
    		pokemon12CatchRate = Integer.parseInt(pokemon12CatchRateField.getText());
    		pokemon13CatchRate = Integer.parseInt(pokemon13CatchRateField.getText());
    		pokemon14CatchRate = Integer.parseInt(pokemon14CatchRateField.getText());
    		pokemon15CatchRate = Integer.parseInt(pokemon15CatchRateField.getText());
    		pokemon16CatchRate = Integer.parseInt(pokemon16CatchRateField.getText());
    		
    		pokemon1Name = pokemon1NameField.getText();
    		pokemon2Name = pokemon2NameField.getText();
    		pokemon3Name = pokemon3NameField.getText();
    		pokemon4Name = pokemon4NameField.getText();
    		pokemon5Name = pokemon5NameField.getText();
    		pokemon6Name = pokemon6NameField.getText();
    		pokemon7Name = pokemon7NameField.getText();
    		pokemon8Name = pokemon8NameField.getText();
    		pokemon9Name = pokemon9NameField.getText();
    		pokemon10Name = pokemon10NameField.getText();
    		pokemon11Name = pokemon11NameField.getText();
    		pokemon12Name = pokemon12NameField.getText();
    		pokemon13Name = pokemon13NameField.getText();
    		pokemon14Name = pokemon14NameField.getText();
    		pokemon15Name = pokemon15NameField.getText();
    		pokemon16Name = pokemon16NameField.getText();
    		
    		int sum = pokemon1CatchRate + pokemon2CatchRate + pokemon3CatchRate + pokemon4CatchRate;
    		sum+= pokemon5CatchRate;
    		sum+= pokemon6CatchRate;
    		sum+= pokemon7CatchRate;
    		sum+= pokemon8CatchRate;
    		sum+= pokemon9CatchRate;
    		sum+= pokemon10CatchRate;
    		sum+= pokemon11CatchRate;
    		sum+= pokemon12CatchRate;
    		sum+= pokemon13CatchRate;
    		sum+= pokemon14CatchRate;
    		sum+= pokemon15CatchRate;
    		sum+= pokemon16CatchRate;
    		int number = pokemon1CatchRate;
    		String pokemonEncountered = "";
    		Random generator = new Random();
    		if (sum > 0){
    		int random = generator.nextInt(sum);
    		if (random < number){
    			pokemonEncountered = pokemon1Name;
    		}
    		else if (random < pokemon1CatchRate + pokemon2CatchRate){
    			pokemonEncountered = pokemon2Name;
    		}
    		else if (random < pokemon1CatchRate + pokemon2CatchRate + pokemon3CatchRate){
    			pokemonEncountered = pokemon3Name;
    		}
    		else if (random < pokemon1CatchRate + pokemon2CatchRate + pokemon3CatchRate + pokemon4CatchRate){
    			pokemonEncountered = pokemon4Name;
    		}
    		else if (random < pokemon5CatchRate + pokemon1CatchRate + pokemon2CatchRate + pokemon3CatchRate + pokemon4CatchRate){
    			pokemonEncountered = pokemon5Name;
    		}
    		else if (random < pokemon6CatchRate + pokemon5CatchRate + pokemon1CatchRate + pokemon2CatchRate + pokemon3CatchRate + pokemon4CatchRate){
    			pokemonEncountered = pokemon6Name;
    		}
    		else if (random < pokemon7CatchRate + pokemon6CatchRate + pokemon5CatchRate + pokemon1CatchRate + pokemon2CatchRate + pokemon3CatchRate + pokemon4CatchRate){
    			pokemonEncountered = pokemon7Name;
    		}
    		else if (random < pokemon8CatchRate + pokemon7CatchRate + pokemon6CatchRate + pokemon5CatchRate + pokemon1CatchRate + pokemon2CatchRate + pokemon3CatchRate + pokemon4CatchRate){
    			pokemonEncountered = pokemon8Name;
    		}
    		else if (random < pokemon9CatchRate + pokemon8CatchRate + pokemon7CatchRate + pokemon6CatchRate + pokemon5CatchRate + pokemon1CatchRate + pokemon2CatchRate + pokemon3CatchRate + pokemon4CatchRate){
    			pokemonEncountered = pokemon9Name;
    		}
    		else if (random < pokemon10CatchRate + pokemon9CatchRate + pokemon8CatchRate + pokemon7CatchRate + pokemon6CatchRate + pokemon5CatchRate + pokemon1CatchRate + pokemon2CatchRate + pokemon3CatchRate + pokemon4CatchRate){
    			pokemonEncountered = pokemon10Name;
    		}
    		else if (random < pokemon11CatchRate + pokemon10CatchRate + pokemon9CatchRate + pokemon8CatchRate + pokemon7CatchRate + pokemon6CatchRate + pokemon5CatchRate + pokemon1CatchRate + pokemon2CatchRate + pokemon3CatchRate + pokemon4CatchRate){
    			pokemonEncountered = pokemon11Name;
    		}
    		else if (random < pokemon12CatchRate + pokemon11CatchRate + pokemon10CatchRate + pokemon9CatchRate + pokemon8CatchRate + pokemon7CatchRate + pokemon6CatchRate + pokemon5CatchRate + pokemon1CatchRate + pokemon2CatchRate + pokemon3CatchRate + pokemon4CatchRate){
    			pokemonEncountered = pokemon12Name;
    		}
    		else if (random < pokemon13CatchRate + pokemon12CatchRate + pokemon11CatchRate + pokemon10CatchRate + pokemon9CatchRate + pokemon8CatchRate + pokemon7CatchRate + pokemon6CatchRate + pokemon5CatchRate + pokemon1CatchRate + pokemon2CatchRate + pokemon3CatchRate + pokemon4CatchRate){
    			pokemonEncountered = pokemon13Name;
    		}
    		else if (random < pokemon14CatchRate + pokemon13CatchRate + pokemon12CatchRate + pokemon11CatchRate + pokemon10CatchRate + pokemon9CatchRate + pokemon8CatchRate + pokemon7CatchRate + pokemon6CatchRate + pokemon5CatchRate + pokemon1CatchRate + pokemon2CatchRate + pokemon3CatchRate + pokemon4CatchRate){
    			pokemonEncountered = pokemon14Name;
    		}
    		else if (random < pokemon15CatchRate + pokemon14CatchRate + pokemon13CatchRate + pokemon12CatchRate + pokemon11CatchRate + pokemon10CatchRate + pokemon9CatchRate + pokemon8CatchRate + pokemon7CatchRate + pokemon6CatchRate + pokemon5CatchRate + pokemon1CatchRate + pokemon2CatchRate + pokemon3CatchRate + pokemon4CatchRate){
    			pokemonEncountered = pokemon15Name;
    		}
    		else {
    			pokemonEncountered = pokemon16Name;
    		}
    		randomTextLabel.setText(pokemonEncountered);
    		}
        }
    		
        else if(e.getSource() == resetButton)
        {
        	pokemon1CatchRate = 0;
        	pokemon2CatchRate = 0;
        	pokemon3CatchRate = 0;
        	pokemon4CatchRate = 0;
        	pokemon5CatchRate = 0;
        	pokemon6CatchRate = 0;
        	pokemon7CatchRate = 0;
        	pokemon8CatchRate = 0;
        	pokemon9CatchRate = 0;
        	pokemon10CatchRate = 0;
        	pokemon11CatchRate = 0;
        	pokemon12CatchRate = 0;
        	pokemon13CatchRate = 0;
        	pokemon14CatchRate = 0;
        	pokemon15CatchRate = 0;
        	pokemon16CatchRate = 0;
        	
        	pokemon1Name = "";
        	pokemon2Name = "";
        	pokemon3Name = "";
        	pokemon4Name = "";
        	pokemon5Name = "";
        	pokemon6Name = "";
        	pokemon7Name = "";
        	pokemon8Name = "";
        	pokemon9Name = "";
        	pokemon10Name = "";
        	pokemon11Name = "";
        	pokemon12Name = "";
        	pokemon13Name = "";
        	pokemon14Name = "";
        	pokemon15Name = "";
        	pokemon16Name = "";
        	
        	pokemon1CatchRateField.setText(Integer.toString(pokemon1CatchRate));
        	pokemon2CatchRateField.setText(Integer.toString(pokemon2CatchRate));
        	pokemon3CatchRateField.setText(Integer.toString(pokemon3CatchRate));
        	pokemon4CatchRateField.setText(Integer.toString(pokemon4CatchRate));
        	pokemon5CatchRateField.setText(Integer.toString(pokemon5CatchRate));
        	pokemon6CatchRateField.setText(Integer.toString(pokemon6CatchRate));
        	pokemon7CatchRateField.setText(Integer.toString(pokemon7CatchRate));
        	pokemon8CatchRateField.setText(Integer.toString(pokemon8CatchRate));
        	pokemon9CatchRateField.setText(Integer.toString(pokemon9CatchRate));
        	pokemon10CatchRateField.setText(Integer.toString(pokemon10CatchRate));
        	pokemon11CatchRateField.setText(Integer.toString(pokemon11CatchRate));
        	pokemon12CatchRateField.setText(Integer.toString(pokemon12CatchRate));
        	pokemon13CatchRateField.setText(Integer.toString(pokemon13CatchRate));
        	pokemon14CatchRateField.setText(Integer.toString(pokemon14CatchRate));
        	pokemon15CatchRateField.setText(Integer.toString(pokemon15CatchRate));
        	pokemon16CatchRateField.setText(Integer.toString(pokemon16CatchRate));
        	
        	pokemon1NameField.setText(pokemon1Name);
        	pokemon2NameField.setText(pokemon2Name);
        	pokemon3NameField.setText(pokemon3Name);
        	pokemon4NameField.setText(pokemon4Name);
        	pokemon5NameField.setText(pokemon5Name);
        	pokemon6NameField.setText(pokemon6Name);
        	pokemon7NameField.setText(pokemon7Name);
        	pokemon8NameField.setText(pokemon8Name);
        	pokemon9NameField.setText(pokemon9Name);
        	pokemon10NameField.setText(pokemon10Name);
        	pokemon11NameField.setText(pokemon11Name);
        	pokemon12NameField.setText(pokemon12Name);
        	pokemon13NameField.setText(pokemon13Name);
        	pokemon14NameField.setText(pokemon14Name);
        	pokemon15NameField.setText(pokemon15Name);
        	pokemon16NameField.setText(pokemon16Name);
        	
        	randomTextLabel.setText("");
        }

		
       
        
    }

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Pokemon RP Pokemon Generator");

        //Create and set up the content pane.
        
        RandomGenerator demo = new RandomGenerator();
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
