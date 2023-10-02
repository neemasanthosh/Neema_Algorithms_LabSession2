package com.greatlearning.lab.transaction;

public class Transaction {

	public int targetCheck(int[] transactions, int target) {
		int sum = 0;
		for (int i = 0; i <= transactions.length - 1; i++) {
			sum = sum + transactions[i];
			if (sum >= target) {
				return i;
			}
		}

		return -1;
	}
}
