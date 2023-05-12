
import java.util.*;
import java.util.ArrayList;


public class CoinSorter 
{
	//attributes
	
	private String currency;
	private int minCoinIn;
	private int maxCoinIn;
	private int totalCoinValue;
	private int excludedCoin;
	private int singleCoin;
	private List<Integer> coinList = new ArrayList<Integer>();
	
	Scanner sc1 = new Scanner(System.in);
	
	//constructor
	public CoinSorter(String currency, int minCoinIn, int maxCoinIn, List<Integer> coinList)
	{
		this.currency = currency;
		this.minCoinIn = minCoinIn;
		this.maxCoinIn = maxCoinIn;
		this.coinList = coinList;		
	}	
	
	public CoinSorter() 
	{		
		//default constructor
		currency = "Pound Sterling";
		minCoinIn = 0;
		maxCoinIn = 10000;
		setCoinList();
	}	
	
	//methods
	
	//add coins to coin list, or reset to default coin list
	public void setCoinList() 
	{
		coinList.clear();
		coinList.add(200);
		coinList.add(100);
		coinList.add(50);
		coinList.add(20);
		coinList.add(10);		
	}
	
	public void setCurrency(String currencyIn) 
	{
		currency = currencyIn;
	}
	
	public void setMinCoinIn(int minCoinInA) 
	{
		if (minCoinInA >= 0 && minCoinInA <= 10000 && minCoinInA < maxCoinIn) 
		{
		minCoinIn = minCoinInA;
		System.out.println("Minimum coin value set to: " + getMinCoinIn() + "\n");
		}
		else 
		{
			System.out.println("Enter a value greater than 0 and less than upper limit value");
		}
	}
	
	public void setMaxCoinIn(int maxCoinInA) 
	{
		if (maxCoinInA >= 0 && maxCoinInA <= 10000 && maxCoinInA > minCoinIn) 
		{
		maxCoinIn = maxCoinInA;
		System.out.println("Maximum coin value set to: " + getMaxCoinIn() + "\n");
		}
		else 
		{
			System.out.println("Enter a value less than 10000 and more than lower limit value");
		}				
	}
	
	public String getCurrency() 
	{		
		return currency;
	}
	
	public int getMinCoinIn() 
	{
		return minCoinIn;
	}
	
	public int getMaxCoinIn() 
	{
		return maxCoinIn;
	}
	
	public String printCoinList() 
	{		
		//System.out.print("The current coin denominations in circulation are " + coinList);
		return String.valueOf(coinList);
	}
	
	public void validateTotalValue()
	{
		
		do 
		{
		System.out.print("Enter total value to exchange: \n");
		totalCoinValue = sc1.nextInt();
		} 
		while ((totalCoinValue < getMinCoinIn()) || (totalCoinValue > getMaxCoinIn()));
	}
	
	public void validateExcludedCoin()
	{		
		do
		{
		System.out.print("Please input the coin you want to exclude: \n");
		excludedCoin = sc1.nextInt();
		}
		while ((excludedCoin != 200) && (excludedCoin != 100) && (excludedCoin != 50)
				&& (excludedCoin != 20) && (excludedCoin != 10));
	}
	
	public void validateSingleCoin()
	{		
		do
		{
		System.out.print("Please input the coin you want to include: \n");
		singleCoin = sc1.nextInt();
		}
		while ((singleCoin != 200) && (singleCoin != 100) && (singleCoin != 50)
				&& (singleCoin != 20) && (singleCoin != 10));
	}
	
	public String coinCalculator(int totalValue, int coinType)
	{
		int coinExchanged = Math.floorDiv(totalValue, coinType);
		int coinRemainder = totalValue % coinType;		
		String valStr = "A total of " + coinExchanged + " x " + coinType + 
				"p coins can be exchanged, with a remainder of " + coinRemainder + "p";		
		
		return valStr;
	}
	
	public String validatedCoinCalculator()
	{
		validateTotalValue();
		validateSingleCoin();	
		
		int coinExchanged = Math.floorDiv(totalCoinValue, singleCoin);
		int coinRemainder = totalCoinValue % singleCoin;		
		String valStr = "A total of " + coinExchanged + " x " + singleCoin + 
				"p coins can be exchanged, with a remainder of " + coinRemainder + "p";		
		
		return valStr;
	}
	
	public String multiCoinCalculator(int totalValue, int coinTypeExluded)
	//incomplete
	{		
		int quantity = 0;
		int remainder = totalValue;
		String valStr = "The coins exchanged are ";
				
		for (int item : coinList)
		{
			if (item == coinTypeExluded) 
			{
				quantity = 0;
				valStr = valStr + quantity + " x " + item + "p, ";				
			}
			else 
			{
				quantity = Math.floorDiv(remainder, item);
				remainder = remainder%item;
				valStr = valStr + quantity + " x " + item + "p, ";
			}			
		}		
		valStr = valStr + "\nwith a remainder of " + remainder;
			
		return valStr;		
	}
	
	public String validatedMultiCoinCalculator()	
	{		
		validateTotalValue();
		validateExcludedCoin();	
		
		int quantity = 0;
		int remainder = totalCoinValue;
		String valStr = "The coins exchanged are ";
				
		for (int item : coinList)
		{
			if (item == excludedCoin) 
			{
				quantity = 0;
				valStr = valStr + quantity + " x " + item + "p, ";				
			}
			else 
			{
				quantity = Math.floorDiv(remainder, item);
				remainder = remainder%item;
				valStr = valStr + quantity + " x " + item + "p, ";
			}			
		}		
		valStr = valStr + "\nwith a remainder of " + remainder + "p";
			
		return valStr;		
	}
	
	public String displayProgramConfigs()
	{
		return "Current Currency is " + getCurrency() + "\nCurrent minimum is " + getMinCoinIn()  
				+ "\nCurrent maximum is " + getMaxCoinIn() ;
	}	
	
}