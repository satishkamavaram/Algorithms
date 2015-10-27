package com.satish.algorithms;

/**
 * Given different coins in ATM machine. 
 * Find minimum number of coins required to collect total amount.
 * @author satishkamavaram
 *
 */
public class Algorithm4 {

	int maxCoins = -1;
    int totalAmt = 11;
    int [] coinValues = {5,1,3,4,2,6,8,7,2};
   
    public static void main(String[] args) {
           // TODO Auto-generated method stub
    	   Algorithm4 coins = new Algorithm4();
           coins.findArrayCombination(coins.coinValues,0);
           System.out.println(coins.maxCoins);
    }

    private  void calculate(int [] coins)
    {
           int size = coins.length;
           int total = totalAmt;
           int numberOfCoins = 0;
           for(int i =0;i<size;i++)
           {
                        if(total>0)
                        {
                               numberOfCoins +=total/coins[i];
                               total = total%coins[i];
                        }
                        else
                               break;
           }
          
           if(maxCoins<0 || numberOfCoins < maxCoins)
                  maxCoins = numberOfCoins;
    }
   
    private  void findArrayCombination(int [] coins, int start)
    {
           if(start==coins.length)
           {
                  calculate(coins);
                  return;
           }
          
           for(int i =start;i<coins.length;i++)
           {
                  int temp = coins[start];
                  coins[start] = coins[i];
                  coins[i] = temp;
                 
                  findArrayCombination(coins,start+1);
                 
                  temp = coins[start];
                  coins[start] = coins[i];
                  coins[i] = temp;
                 
           }
                 
    }

}
