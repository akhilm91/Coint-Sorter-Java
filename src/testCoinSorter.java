import java.util.*;

public class testCoinSorter 
{
	
	static Scanner sc2 = new Scanner(System.in);
	static CoinSorter cs = new CoinSorter();
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		int mainSelection = 0;
		
		do 
		{
		printMainMenu();
		mainSelection = sc2.nextInt();
		
		switch (mainSelection)		
			{		
			case 1:
				mainSelectionCase1();
			    break;
		  
			case 2:
				mainSelectionCase2();
				break;
			    
			case 3:
				mainSelectionCase3();
			    break;
		    
			case 4:
				int subSelection = 0;
				do 
				{
				printSubMenu();	
				subSelection = sc2.nextInt();
				
				switch (subSelection) 
					{
					  case 1:
						  subSelectionCase1();
						  break;
					  case 2:
						  subSelectionCase2();
						  break;
					  case 3:
						  subSelectionCase3();
						  break;
					}			    
				} 
				while (subSelection != 4);
				break;
				
			case 5:
				mainSelectionCase5();
			    break;
			}
		}
		while(mainSelection != 6);  
		
		System.out.println("End of program");
	}
	
	public static void printMainMenu()
	{
		System.out.println("***Coin Sorter - Main Menu***");
		System.out.println("1 - Coin calculator \n"
				+ "2 - Multiple coin calculator \n"
				+ "3 - Print coin list \n"
				+ "4 - Set details \n"
				+ "5 - Display program configurations \n"
				+ "6 - Quit the program \n");
	}
	
	public static void printSubMenu()
	{
		System.out.println("***Set Details Sub-Menu***");
		System.out.println("1 - Set currency \n"
				+ "2 - Set minimum coin input value \n"
				+ "3 - Set maximum coin input value \n"
				+ "4 - Return to main menu \n");
	}
	
	public static void printEmptyLine()
	{
		System.out.println("");		
	}
	
	public static void printTwoEmptyLines()
	{
		System.out.println("");	
		System.out.println("");	
	}
	
	public static void mainSelectionCase1()
	{		
	    System.out.println(cs.validatedCoinCalculator());
	    
	    printTwoEmptyLines();		
	    wait(1000);
	}
	
	public static void mainSelectionCase2()
	{
		System.out.println(cs.validatedMultiCoinCalculator());
		
	    printTwoEmptyLines();		
	    wait(1000);
	}
	
	public static void mainSelectionCase3()
	{
		System.out.println("The current coin denominations in circulation are " + cs.printCoinList());
		cs.printCoinList();		
		printTwoEmptyLines();
		wait(1000);
	}
	
	public static void mainSelectionCase5()
	{
		System.out.println(cs.displayProgramConfigs());				
		printTwoEmptyLines();		
		wait(1000);
	}
	
	public static void subSelectionCase1()
	{
		sc2.skip("((?<!(?>\\R))\\s)*"); //to wait for user input, and not to skip
		System.out.println("Enter currency type to exchange: \n");
		String currencyTypeIn1 = sc2.nextLine();
		wait(200);
		cs.setCurrency(currencyTypeIn1);	
		System.out.println("Currency type set to: " + currencyTypeIn1 + "\n");
		printTwoEmptyLines();
		wait(1000);
	}
	
	public static void subSelectionCase2()
	{
		 System.out.println("Enter minimum coin value to set: \n");
		 int minCoinIn1 = sc2.nextInt();
		 wait(200);
		 cs.setMinCoinIn(minCoinIn1);	
		 printTwoEmptyLines();
		 wait(1000);
	}
	
	public static void subSelectionCase3()
	{
		 System.out.println("Enter maximum coin value to set: \n");
		 int maxCoinIn1 = sc2.nextInt();
		 wait(200);
		 cs.setMaxCoinIn(maxCoinIn1);
		 printTwoEmptyLines();
		 wait(1000);
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

}