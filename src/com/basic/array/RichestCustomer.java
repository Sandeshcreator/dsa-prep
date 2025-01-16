package com.basic.array;

public class RichestCustomer {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int current = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                current += accounts[i][j];
            }
            if (current > maxWealth) {
                maxWealth = current;
            }
        }
        return maxWealth;
    }
}
