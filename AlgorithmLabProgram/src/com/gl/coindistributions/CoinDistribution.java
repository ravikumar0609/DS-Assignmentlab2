package com.gl.coindistributions;

/**
 * @author psairavikumar
 *  @version 1.0.0
 *  @Date 10 April 2022
 *  
 *  @implementation - Merge sort, Collection framework hashmap
 *  
 *  */

import java.util.HashMap;
import java.util.Scanner;

public class CoinDistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MergeSort sort = new MergeSort();
		System.out.println("Enter the size of currency denominations");
		int currencySize = sc.nextInt();
		System.out.println("Enter the currency denominations value");
		int currency[] = new int[currencySize];
		for (int i = 0; i < currencySize; i++) {
			currency[i] = sc.nextInt();
		}
		// used merge sort for sorting initial array in descending order
		sort.mergeSort(currency, 0, currency.length - 1);
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();

		currencyDistribution(currencySize, currency, amount);

		sc.close();

	}

	public static void currencyDistribution(int currencySize, int[] currency, int amount) {
		/**
		 * Hash map is used to store the currency used and distibution value and print
		 * it. as Hash map follow ascending order key value the output will be display
		 * in ascending order.
		 */
		HashMap<Integer, Integer> distribution = new HashMap<>();
		for (int i = 0; i < currencySize; i++) {
			if (amount != 0) {
				int value = amount / currency[i];
				if (value != 0) {
					distribution.put(currency[i], value);
				}
				amount = amount % currency[i];
			}
		}
		System.out.println("Your payment approach in order to give min no of notes will be");
		distribution.forEach((key, value) -> System.out.println(key + " : " + value));
	}

}
