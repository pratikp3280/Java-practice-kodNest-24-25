package Array;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;

class Two_Sum_using_HashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of prices
        int n = sc.nextInt();

        // Input prices
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Input budget
        int budget = sc.nextInt();

        // Find and print the two items that fit within the budget
        int[] result = findTwoItems(prices, budget);
        System.out.println("Input: prices = " + Arrays.toString(prices) + ", budget = " + budget);
        System.out.println("Output: " + Arrays.toString(result));
    }

    public static int[] findTwoItems(int[] prices, int budget) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];    // Pick the current price from array
            int complement = budget - currentPrice;  // Find the complement to budget

            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(currentPrice, i);
        }
        return new int[]{};  // Return empty array if no solution
    }
}
