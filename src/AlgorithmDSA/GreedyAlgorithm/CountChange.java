package AlgorithmDSA.GreedyAlgorithm;

import java.util.Arrays;

public class CountChange {
    public static int countCoin(int []arr, int amount){


       // Arrays.sort(arr); // Sort the denominations in descending order for greedy method
        int coinCount = 0; // Initialize coin count

        for (int i = 0; i < arr.length && amount > 0; i++) {
           // int currentDenomination = arr[i];
            if (arr[i]<=amount){
                int nums= amount/arr[i];
                coinCount +=nums;
                amount-=arr[i]*nums;
            }
          /*
          // for-loop included as external loop
          while (amount >= currentDenomination) {
                amount -= currentDenomination;
                coinCount++;
            }*/
        }

        return coinCount;
    }

    public static void main(String[] args) {
        int[]arr={25,10,5,1};
        int amount=77;
        System.out.println(countCoin(arr,amount));
    }
}
