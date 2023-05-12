## A coin sorting program using Java
# CoinSorter.java is a a non-GUI program
# CoinSorterGUI.java is a GUI program inherited from CoinSorter.java

The following coins (in order of priority) are in circulation in the scope of this program:
• £2 (equivalent to 200p)
• £1 (equivalent to 100p)
• 50p
• 20p
• 10p


The minimum input value for exchange in pennies is 0 (inclusive). The maximum input value for exchange in pennies is capped at 10,000 (inclusive).


The program enables the user to check, at most, how many coins of a certain denomination can be exchanged given an input value in pennies and the denomination. It also prints the remainder. For example, given the input value of 352 pennies and the input denomination of £1 coins, the output will be three £1 coins and a remainder of 52p.

Given a total value in pennies and a coin denomination to exclude, the program also allows the user to determine how many coins and what denominations (prioritising the higher denominations) they can exchange for while excluding a certain coin denomination. The remainder is also printed. For example, given 563 pennies and excluding the £2 coin, we can exchange for five £1 coins, one 50p coin and one 10p coin, with a remainder of 3p.

The program also have several utility functions. The user will also be able to print the current configurations of the program (current currency, min/max coin to exchange).