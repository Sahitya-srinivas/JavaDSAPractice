package com.java.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {
	
	static void reverseRotation(int arr[], int d) {
		 int n = arr.length;
		 if(d == 0)
			 return;
		 d = d % n;
		 rotateArray(arr,0,d-1);
		 rotateArray(arr,d,n-1);
		 rotateArray(arr,0,n-1);
	}
	static void rotateArray(int arr[], int start, int end) {
		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
//	static void printArray(int arr[]) {
//		int n=arr.length;
//		for(int i=0;i<n;i++)
//			System.out.print(arr[i]+" ");
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		System.out.println("Enter array elements");
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter rotating index");
		int d = sc.nextInt();
		reverseRotation(arr,d);
		System.out.println(Arrays.toString(arr));
//		printArray(arr);
		sc.close();
	}

}
