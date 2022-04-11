package com.gl.paymoney;

/**
 *  @author psairavikumar
 *  @version 1.0.0
 *  @Date 10 April 2022
 *  
 *  @implementation - from the given array of money , check the target value and find out in how much transaction target 
 *  will be achieved.
 *  
 * */
import java.util.Scanner;

public class Transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// take input from user.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int arraySize = sc.nextInt();
		System.out.println("Enter the values of array");
		int arr[] = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int total_no_target = sc.nextInt();
		// this loop will run until no of target and check the given target is achieved or not.
		for (int j = 0; j < total_no_target; j++) {
			// method to check if a given taget is achieved in n transactions.
			transactionStatus(arraySize, arr, total_no_target, sc, j);
		}
		sc.close();

	}
//method to check if a given taget is achieved in n transactions.
	public static void transactionStatus(int arraySize, int[] arr, int total_no_target, Scanner sc, int j) {
		int Sum = 0;
		boolean Flag = false;
		int i;
		System.out.println("Enter the value of target " + (j + 1));
		int target = sc.nextInt();
		// this loop will check the target is achieved or not
		for (i = 0; i < arraySize; i++) {
			Sum = Sum + arr[i];
			if (Sum >= target) {
				Flag = true;
				break;
			}
		}
		if (Flag) {
			System.out.print("Target " + (j + 1) + " achevied after " + (i + 1) + " Transactions \n\n");
		} else {
			System.out.print("Given target is not achieved");
		}
	}
}