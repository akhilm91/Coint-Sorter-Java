
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.control.Label; 


public class testCoinSorterGUI extends Application
{	
	static CoinSorterGUI csGUI = new CoinSorterGUI();

	public void start(Stage stage)
	{	
		/*'Enter Total Value' label for both coin calculator 
		and multi coin calculator button*/
		Label labelOne = new Label();         
		labelOne.setTextFill(Color.AZURE);         
		labelOne.setFont(Font.font("Calibri", 20));
		labelOne.setMinSize(210,50);         
		labelOne.setMaxSize(210,50); 
		labelOne.setVisible(false);
	
		// coin to include label for coin calculator
		//coin to exclude label for multi coin calculator button
		Label labelTwo = new Label();         
		labelTwo.setTextFill(Color.AZURE);         
		labelTwo.setFont(Font.font("Calibri", 20));
		labelTwo.setVisible(false);
		
		// to input 'Enter Total Value'
		TextField textAreaOne = new TextField();
		textAreaOne.setMinSize(210,50);         
		textAreaOne.setMaxSize(210,50); 
		textAreaOne.setVisible(false);
		
		// to input coin chosen, or coin to exclude
		TextField textAreaTwo = new TextField();     
		textAreaTwo.setMinSize(210,50);         
		textAreaTwo.setMaxSize(210,50); 
		textAreaTwo.setVisible(false);
		
		// button to calculate coin calculator
		Button calculateButton1 = new Button();
		calculateButton1.setText("CALCULATE");	
		calculateButton1.setMinWidth(50);
		calculateButton1.setMinHeight(50);
		calculateButton1.setStyle("-fx-font-size:20");
		calculateButton1.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,
				new CornerRadii(20), new Insets(0))));
		calculateButton1.setVisible(false);
		
		// button to calculate multi coin calculator
		Button calculateButton2 = new Button();
		calculateButton2.setText("CALCULATE");	
		calculateButton2.setMinWidth(50);
		calculateButton2.setMinHeight(50);
		calculateButton2.setStyle("-fx-font-size:20");
		calculateButton2.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,
				new CornerRadii(20), new Insets(0))));
		calculateButton2.setVisible(false);		
		
		// to output result for all buttons
		Label outputLabel = new Label();         
		outputLabel.setTextFill(Color.AZURE);         
		outputLabel.setFont(Font.font("Calibri", 20));
		outputLabel.setText("\n\n\n");
		
		// coin Calculator Button
		Button coinCalculatorButton = new Button();
		coinCalculatorButton.setText("COIN CALCULATOR");	
		coinCalculatorButton.setMinWidth(350);
		coinCalculatorButton.setMinHeight(50);
		coinCalculatorButton.setStyle("-fx-font-size:20");
		coinCalculatorButton.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,
				new CornerRadii(20), new Insets(0))));		
				
		// multiple coin Calculator Button
		Button multiplecoinCalculatorButton = new Button();
		multiplecoinCalculatorButton.setText(" MULTIPLE COIN CALCULATOR");		
		multiplecoinCalculatorButton.setMinWidth(350);
		multiplecoinCalculatorButton.setMinHeight(50);
		multiplecoinCalculatorButton.setStyle("-fx-font-size:20");
		multiplecoinCalculatorButton.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,
				new CornerRadii(20), new Insets(0))));
		
		// Button to print Coin List 
		Button printCoinListButton = new Button();
		printCoinListButton.setText("PRINT COIN LIST");		
		printCoinListButton.setMinWidth(350);
		printCoinListButton.setMinHeight(50);
		printCoinListButton.setStyle("-fx-font-size:20");
		printCoinListButton.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,
				new CornerRadii(20), new Insets(0))));
		
		// print coin list calling method from coin sorter when clciked
		printCoinListButton.setOnAction
		(e ->
			{	
				calculateButton1.setVisible(false);
				calculateButton2.setVisible(false);
				labelOne.setVisible(false);
				labelTwo.setVisible(false);
				textAreaOne.setVisible(false);
				textAreaTwo.setVisible(false);
				outputLabel.setText("\nCURRENT COIN DENOMINATIONS IN CIRCULATION\n\t\t\t\t" + csGUI.printCoinList());
				outputLabel.setVisible(true);
			}
			);
		
		// Button to change details
		Button setDetailsButton = new Button();
		setDetailsButton.setText("SET DETAILS");		
		setDetailsButton.setMinWidth(350);
		setDetailsButton.setMinHeight(50);
		setDetailsButton.setStyle("-fx-font-size:20");
		setDetailsButton.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,
				new CornerRadii(20), new Insets(0))));
		
		// Button to display config
		Button displayConfigButton = new Button();
		displayConfigButton.setText("DISPLAY PROGRAM CONFIGURATIONS");		
		displayConfigButton.setMinWidth(710);
		displayConfigButton.setMinHeight(50);
		displayConfigButton.setStyle("-fx-font-size:20");
		displayConfigButton.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,
				new CornerRadii(20), new Insets(0))));
		
		// display config calling method from coin sorter GUI when clciked
		displayConfigButton.setOnAction
		(e ->
			{	
				calculateButton1.setVisible(false);
				calculateButton2.setVisible(false);
				labelOne.setVisible(false);
				labelTwo.setVisible(false);
				textAreaOne.setVisible(false);
				textAreaTwo.setVisible(false);
				
				outputLabel.setText(csGUI.displayProgramConfigs());
				outputLabel.setVisible(true);
			}
		);
		
		// Button to close the app
		Button quitButton = new Button();
		quitButton.setText("QUIT");		
		quitButton.setMinWidth(30);
		quitButton.setMinHeight(30);
		quitButton.setStyle("-fx-text-fill: white");
		quitButton.setBackground(new Background(new BackgroundFill(Color.RED,
				new CornerRadii(10), new Insets(0))));
		
		//sub menu
		
		// to display info on top of sub menu
		Label subInfoLabel = new Label();         
		subInfoLabel.setTextFill(Color.AZURE);         
		subInfoLabel.setFont(Font.font("Calibri", 15));
		subInfoLabel.setText("INPUT REQUIRED VALUE IN THE BOX AND CLICK ON THE BUTTON BELOW TO CHANGE THAT SETTING\n\n");
		
		// to input new currency
		TextField setCurrencyField = new TextField();     
		setCurrencyField.setMinWidth(200);         
		setCurrencyField.setMinHeight(50);
		setCurrencyField.setMaxWidth(200);         
		setCurrencyField.setMaxHeight(50);
		
		// to input min coin value
		TextField setMinCoinField = new TextField();     
		setMinCoinField.setMinWidth(200);          
		setMinCoinField.setMinHeight(50);
		setMinCoinField.setMaxWidth(200);          
		setMinCoinField.setMinHeight(50);
		
		// to input max coin value
		TextField setMaxCoinField = new TextField();     
		setMaxCoinField.setMinWidth(200);        
		setMaxCoinField.setMinHeight(50);
		setMaxCoinField.setMaxWidth(200);        
		setMaxCoinField.setMaxHeight(50);
		
		/* to display the change in setting
		   For e.g.: Currency set to Dollar */
		Label subOutputLabel = new Label();         
		subOutputLabel.setTextFill(Color.AZURE);         
		subOutputLabel.setFont(Font.font("Calibri", 20));
		subOutputLabel.setText("\n\n\n");
		
		// button to set currency
		Button setCurrencyButton = new Button();
		setCurrencyButton.setText("SET CURRENCY");		
		setCurrencyButton.setMinWidth(200);
		setCurrencyButton.setMinHeight(50);
		setCurrencyButton.setMaxWidth(400);
		setCurrencyButton.setMaxHeight(50);
		setCurrencyButton.setStyle("-fx-font-size:20");
		setCurrencyButton.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,
				new CornerRadii(20), new Insets(0))));
		
		// button to set min coin value
		Button setMinCoinButton = new Button();
		setMinCoinButton.setText("SET MINIMUM COIN INPUT VALUE");		
		setMinCoinButton.setMinWidth(200);
		setMinCoinButton.setMinHeight(50);
		setMinCoinButton.setMaxWidth(400);
		setMinCoinButton.setMaxHeight(50);
		setMinCoinButton.setStyle("-fx-font-size:20");
		setMinCoinButton.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,
				new CornerRadii(20), new Insets(0))));
		
		// button to set max coin value
		Button setMaxCoinButton = new Button();
		setMaxCoinButton.setText("SET MAXIMUM COIN INPUT VALUE");		
		setMaxCoinButton.setMinWidth(200);
		setMaxCoinButton.setMinHeight(50);
		setMaxCoinButton.setMaxWidth(400);
		setMaxCoinButton.setMaxHeight(50);
		setMaxCoinButton.setStyle("-fx-font-size:20");
		setMaxCoinButton.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,
				new CornerRadii(20), new Insets(0))));
		
		// button to go back to main menu
		Button setMainMenuButton = new Button();
		setMainMenuButton.setText("<<< BACK TO MAIN MENU");		
		setMainMenuButton.setMinWidth(510);
		setMainMenuButton.setMinHeight(50);
		setMainMenuButton.setStyle("-fx-font-size:20");
		setMainMenuButton.setBackground(new Background(new BackgroundFill(Color.CADETBLUE,
				new CornerRadii(40), new Insets(0))));
		setMainMenuButton.setBorder(new Border(new BorderStroke(Color.BLACK,
				BorderStrokeStyle.SOLID, new CornerRadii(40), new BorderWidths(1))));
		
		// adding all the items to HBox to align it horizontally
		HBox row1 = new HBox(10);
		row1.setAlignment(Pos.CENTER);	
		row1.getChildren().addAll(coinCalculatorButton, multiplecoinCalculatorButton);  
		
		HBox row2 = new HBox(10);
		row2.setAlignment(Pos.CENTER);	
		row2.getChildren().addAll(printCoinListButton, setDetailsButton); 
		
		HBox row3 = new HBox(10);
		row3.setAlignment(Pos.CENTER);	
		row3.getChildren().addAll(displayConfigButton);
		
		HBox row4 = new HBox(10);
		row4.setAlignment(Pos.CENTER);	
		row4.getChildren().addAll(quitButton); 
		
		HBox row5 = new HBox(10);
		row5.setAlignment(Pos.CENTER);	
		row5.getChildren().addAll(labelOne, labelTwo);  
		
		HBox row6 = new HBox(10);
		row6.setAlignment(Pos.CENTER);	
		row6.getChildren().addAll(textAreaOne, textAreaTwo); 
		
		HBox row7 = new HBox(10);
		row7.setAlignment(Pos.CENTER);	
		row7.getChildren().addAll(calculateButton1, calculateButton2); 
		
		HBox row8 = new HBox(10);
		row8.setAlignment(Pos.CENTER);	
		row8.getChildren().addAll(outputLabel);  
				
		// adding all the HBox to VBox to align it vertically
		VBox root1 = new VBox(10);
		root1.setAlignment(Pos.CENTER);	
		root1.getChildren().addAll(row1, row2, row3, row4, row5, row6, row7, row8);
		root1.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGREY,
				new CornerRadii(0), new Insets(0))));
		
		/* setting the scene
		 * 
		 * This application does not change scenes for a smoother transition
		 */
		Scene primaryscene = new Scene(root1, 800, 600);         
		stage.setScene(primaryscene);         
		stage.setTitle("COIN SORTER");		
		stage.show();
		
		coinCalculatorButton.setOnAction
		(e ->
			{	
				calculateButton1.setVisible(true);
				calculateButton2.setVisible(false);
				
				row7.getChildren().clear();
				row7.getChildren().addAll(calculateButton1);
				outputLabel.setVisible(false);
				labelOne.setText("ENTER TOTAL VALUE");
				labelOne.setVisible(true);
				textAreaOne.setVisible(true);
				labelTwo.setText("COIN CHOSEN");
				labelTwo.setVisible(true);
				textAreaTwo.setVisible(true);
				
				calculateButton1.setOnAction
				(f ->
					{						
						if(textAreaOne.getText().isEmpty() || textAreaTwo.getText().isEmpty())        
						{                               
							outputLabel.setText("\n\nVALUE MUST BE ENTERED");                       
						}						
						else 
						{
							int totalCoinValue = Integer.parseInt(textAreaOne.getText());
							int singleCoin = Integer.parseInt(textAreaTwo.getText());
							
							if ((totalCoinValue < csGUI.getMinCoinIn()) || (totalCoinValue > csGUI.getMaxCoinIn()) 
									|| ((singleCoin != 200) && (singleCoin != 100) && (singleCoin != 50) && (singleCoin != 20) && (singleCoin != 10)))
							{
								outputLabel.setText("\n\nVALUES OUT OF RANGE"); 
							}							
							else
							{								
								outputLabel.setText("\n\n" + csGUI.coinCalculator(Integer.parseInt(textAreaOne.getText()), Integer.parseInt(textAreaTwo.getText())).toUpperCase());
							}
							
						}						
						outputLabel.setVisible(true);						
					}
				);
				
			}
		);
		
		multiplecoinCalculatorButton.setOnAction
		(e ->
			{	
				calculateButton1.setVisible(false);
				calculateButton2.setVisible(true);
				outputLabel.setVisible(false);
				row7.getChildren().clear();
				row7.getChildren().addAll(calculateButton2);				
				labelOne.setText("ENTER TOTAL VALUE");
				labelOne.setVisible(true);
				textAreaOne.setVisible(true);
				labelTwo.setText("COIN TO EXCLUDE");
				labelTwo.setVisible(true);
				textAreaTwo.setVisible(true);
				
				calculateButton2.setOnAction
				(f ->
					{					
						if(textAreaOne.getText().isEmpty() || textAreaTwo.getText().isEmpty())        
						{                               
							outputLabel.setText("\n\nVALUE MUST BE ENTERED");                       
						} 					
						else 
						{
							int totalCoinValue = Integer.parseInt(textAreaOne.getText());
							int excludedCoin = Integer.parseInt(textAreaTwo.getText());
							
							if ((totalCoinValue < csGUI.getMinCoinIn()) || (totalCoinValue > csGUI.getMaxCoinIn()) 
									|| ((excludedCoin != 200) && (excludedCoin != 100) && (excludedCoin != 50) && (excludedCoin != 20) && (excludedCoin != 10)))
							{
								outputLabel.setText("\n\nVALUES OUT OF RANGE"); 
							}
							
							else
							{							
								outputLabel.setText("\n" + csGUI.multiCoinCalculator(Integer.parseInt(textAreaOne.getText()), Integer.parseInt(textAreaTwo.getText())).toUpperCase());
							}
						}					
						outputLabel.setVisible(true);					
					}
				);			
			
			}
		);
		
		setDetailsButton.setOnAction
		(j ->
			{	
				calculateButton1.setVisible(false);
				calculateButton2.setVisible(false);
				root1.setAlignment(Pos.CENTER);	
				//root1.getChildren().removeAll(row1, row2, row3, row4, row5, row6, row7, row8);
				root1.getChildren().clear();
				root1.getChildren().addAll(subInfoLabel, setCurrencyField, setCurrencyButton, setMinCoinField, 
						setMinCoinButton, setMaxCoinField, setMaxCoinButton, subOutputLabel, setMainMenuButton);
				root1.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGREY,
						new CornerRadii(0), new Insets(0))));			
				
				setCurrencyButton.setOnAction
				(e->				
					{
						String currencyInA = setCurrencyField.getText();
						
						if (setCurrencyField.getText().isEmpty())        
						{                               
							subOutputLabel.setText("\n\nCURRENCY MUST BE ENTERED");                       
						} 						
						else 
						{
							csGUI.setCurrency(currencyInA);
							subOutputLabel.setText("\n\nCURRENCY SET TO " + currencyInA.toUpperCase());   
						}
					}						
				);
				
				setMinCoinButton.setOnAction
				(e->				
					{						
						if (setMinCoinField.getText().isEmpty())        
						{                               
							subOutputLabel.setText("\n\nVALUE MUST BE ENTERED");                       
						} 	
						else
						{
							int minCoinInB = Integer.parseInt(setMinCoinField.getText());
							csGUI.setMinCoinInGUI(minCoinInB);
							subOutputLabel.setText("\n\n" + csGUI.setMinCoinInGUIMessage(Integer.parseInt(setMinCoinField.getText())));
						}						
					}						
				);
				
				setMaxCoinButton.setOnAction
				(e->				
					{						
						if (setMaxCoinField.getText().isEmpty())        
						{                               
							subOutputLabel.setText("\n\nVALUE MUST BE ENTERED");                       
						} 
						else 
						{
							int maxCoinInB = Integer.parseInt(setMaxCoinField.getText());
							csGUI.setMaxCoinInGUI(maxCoinInB);
							subOutputLabel.setText("\n\n" + csGUI.setMaxCoinInGUIMessage(Integer.parseInt(setMaxCoinField.getText())));
						}					
					}						
				);
				
				setMainMenuButton.setOnAction
				(h ->
					{	
						root1.setAlignment(Pos.CENTER);
						root1.getChildren().clear();
						root1.getChildren().addAll(row1, row2, row3, row4, row5, row6, row7, row8);											
						outputLabel.setText("\n\n\n");
						labelOne.setVisible(false);
						labelTwo.setVisible(false);
						textAreaOne.setVisible(false);
						textAreaTwo.setVisible(false);
						root1.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGREY,
								new CornerRadii(0), new Insets(0))));
					}
				);
				
			}
		);		
		
		quitButton.setOnAction
		(e ->
			{	
				wait(500);
				stage.hide();
			}
		);
	
	}
	
	public static void wait(int ms)
	{
	    try
	    {
	        Thread.sleep(ms);
	    }
	    catch(InterruptedException ex)
	    {
	        Thread.currentThread().interrupt();
	    }
	}

	public static void main(String[] args) 
	{
		launch(args);

	}
}
