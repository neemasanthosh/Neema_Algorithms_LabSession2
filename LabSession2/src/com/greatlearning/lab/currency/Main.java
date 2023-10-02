package com.greatlearning.lab.currency;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations:");
		int size = sc.nextInt();
		System.out.println("Enter the currency denominations value:");
		int[] denominations = new int[size];
		for (int i = 0; i < size; i++) {
			denominations[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay:");
		int amount = sc.nextInt();
		MergeSortDesc sort = new MergeSortDesc();
		sort.sort(denominations, 0, denominations.length - 1);
		System.out.println("");
		Currency currency = new Currency();
		currency.currencyCount(denominations, amount);
		sc.close();
	}
}
