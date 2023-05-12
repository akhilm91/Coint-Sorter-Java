
import java.util.*;

public class CoinSorterGUI extends CoinSorter
{
	//constructor
	public CoinSorterGUI(String currency, int minCoinIn, int maxCoinIn, List<Integer> coinList) 
	{
		super(currency, minCoinIn, maxCoinIn, coinList);		
	}
	
	public CoinSorterGUI()
	{
		//default constructor
	}
	
	public String validatedMultiCoinCalculator()
	{
		String valStr2 = validatedMultiCoinCalculator();
		return valStr2.toUpperCase();
	}
	
	public String printCoinListGUI() 
	{
		return super.printCoinList();		
	}
	
	public String displayProgramConfigs()
	{
		String displayString =  super.displayProgramConfigs();
		return displayString.toUpperCase();
	}
	
	public void setMinCoinInGUI(int minCoinInA) 
	{
		if (minCoinInA >= 0 && minCoinInA <= 10000 && minCoinInA < getMaxCoinIn() ) 
		{
			setMinCoinIn(minCoinInA);
		//System.out.println("Minimum coin value set to: " + getMinCoinIn() + "\n");
		}
	}
	
	public String setMinCoinInGUIMessage(int minCoinInA) 
	{
		String message = "";
		
		if (minCoinInA >= 0 && minCoinInA <= 10000 && minCoinInA < getMaxCoinIn() ) 
		{
			message = "MINIMUM COIN VALUE SET TO " + minCoinInA;
		
		}
		else
		{
			message = "MINIMUM COIN VALUE MUST BE GREATER THAN 0 AND LESS THAN UPPER LIMIT";
		}
		
		return  message;
		
	}
	
	public void setMaxCoinInGUI(int maxCoinInA) 
	{
		if (maxCoinInA >= 0 && maxCoinInA <= 10000 && maxCoinInA > getMinCoinIn()) 
		{
			setMaxCoinIn(maxCoinInA);
		//System.out.println("Maximum coin value set to: " + getMaxCoinIn() + "\n");
		}		
	}
	
	public String setMaxCoinInGUIMessage(int maxCoinInA) 
	{
		String message = "";
		
		if (maxCoinInA >= 0 && maxCoinInA <= 10000 && maxCoinInA > getMinCoinIn())
		{
			message = "MAXIMUM COIN VALUE SET TO " + maxCoinInA;
		
		}
		else
		{
			message = "MAXIMUM COIN VALUE MUST BE LESS THAN 10000 AND GREATER THAN LOWER LIMIT";
		}
		
		return  message;
		
	}

}
