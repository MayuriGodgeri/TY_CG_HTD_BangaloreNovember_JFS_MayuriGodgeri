package com.capgemini.datastructure;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Sorting 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of elements");
	int n=sc.nextInt();
	System.out.println("enter the elements to be sorted");
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		
		arr[i]=sc.nextInt();
	}
	BubbleSort bs=new BubbleSort();
	bs.bubbleSort(arr);
	System.out.println("bubble sorted array");
	bs.printArray(arr);
	
	InsertionSort is=new InsertionSort();
	is.sort(arr);
	System.out.println("insertion sorted array"); 
	is.printArray(arr);
	QuickSort qs=new QuickSort();
	 qs.sort(arr, 0, n-1); 
	  
     System.out.println("quick sorted array"); 
     qs.printArray(arr); 
	MergeSort ms=new MergeSort();
	ms.sort(arr, 0, arr.length-1); 
	  
    System.out.println("merge Sorted array"); 
    ms.printArray(arr); 

	
}
}
