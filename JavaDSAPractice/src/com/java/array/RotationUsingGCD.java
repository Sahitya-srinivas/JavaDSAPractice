package com.java.array;

import java.util.Scanner;

public class RotationUsingGCD {
	
	 void RotateArray(int arr[], int d, int n) {
		int i, j, k, temp;
		d = d % n;
		int gcd = GCD(d,n);
		for(i=0;i<gcd;i++) {
			temp = arr[i];
			j = i;
			while(true) {
				k = j + d;
				if(k>=n)
					k=k-n;
				if(k==i)
					break;
				arr[j] = arr[k];
				j=k;
			}
			arr[j] = temp;
		}
	}
	 int GCD(int a,int b) {
		if(b==0)
			return a;
		else 
			return GCD(b,a%b);
	}
	 void PrintArray(int arr[],int size) {
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+ " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotationUsingGCD rgcd = new RotationUsingGCD();
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
		rgcd.RotateArray(arr,d,size);
		rgcd.PrintArray(arr,size);
		sc.close();
	}

}
