package com.java.array;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicRotation {

	static void rotateArray(int arr[], int size) {
		int x = arr[size-1];
		for(int i=size-1; i>0;i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		System.out.println("Enter array elements");
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		rotateArray(arr,size);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
