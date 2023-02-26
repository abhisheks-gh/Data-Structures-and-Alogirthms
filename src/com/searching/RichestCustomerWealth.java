// https://leetcode.com/problems/richest-customer-wealth/

package com.searching;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };

        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int person = 0; person < accounts.length; person++) {
            int sumOfWealth = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sumOfWealth += accounts[person][account];

                if (sumOfWealth > max)
                    max = sumOfWealth;
            }
        }

        return max;
    }
}
