package com.java.array;

import java.util.Scanner;

public class ArrayRotationRight {

	static void RotateArray(int arr[],int d,int n) {
		int temp[] = new int[n];
		int k=0;
		for(int i=d;i<=n-1;i++) {
			temp[k] = arr[i];
			k++;
		}
		for(int i=0;i<d;i++) {
			temp[k] = arr[i];
			k++;
		}
		for(int i=0;i<n;i++) {
			arr[i] = temp[i];
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		System.out.println("Enter array elements");
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the rotating index");
		int d = sc.nextInt();
		RotateArray(arr,d,size);
		sc.close();
	}

}
