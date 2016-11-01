package com.felight.akash.algobenchmark;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length=sc.nextInt();
		
		int[] array=new int[length];
		
		for(int i=1;i<length;i++){
			int index=i;
			array[index]=i;
		}
		int[] array1=array;

		System.out.println("Enter your choice ..\n"
				+ "1. For Best case\n"
				+ "2. For Average case\n"
				+ "3. For Worst case\n");
		
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			Sorting.sortAsc(array1);
			int[] arrayAsc=array1;
			System.out.println("Best Case array generated.");
			
			break;
			
		case 2:
			Sorting.randomArray(array1);
			int[] randomArr=array1;
			System.out.println("Average Case array generated.");
			
			break;
		
		case 3:
			int [] arra=Sorting.sortDesc(array1);
			int[] arrayDesc=array1;
			System.out.println("Worst Case array generated");
			
			break;
			}
		
		
		System.out.println();
		int ch=10;
		while(ch!=8){
		System.out.println("Enter your choice \n"
				+ "1 for Insertion Sort \n"
				+ "2 for Selection Sort \n"
				+ "3 for Bubble Sort \n"
				+ "4 for Merge Sort \n"
				+ "5 for Quick SOrt \n"
				+ "6 for Heap Sort \n"
				+ "7 for Benchmark all Sorted array \n"
				+ "8 for Stop");
		
		ch=sc.nextInt(); 
		
		switch(ch){
		case 1:
			long start=System.currentTimeMillis();
			int[] arrayI=Sorting.insertionSort(array1);
			long end=System.currentTimeMillis();
			long total=end-start;
			System.out.println("Insertion sorted array requires "+total+" ms");
			System.out.println();
				
			break;
			
		case 2:
			long start2=System.currentTimeMillis();
			int[] arrayS=Sorting.selectionSort(array1);
			long end2=System.currentTimeMillis();
			long total2=end2-start2;
			System.out.println("Selection sorted array requires "+total2+" ms");
			System.out.println();
			
			break;
			
		case 3:
			long start3=System.currentTimeMillis();
			int[] arrayB=Sorting.selectionSort(array1);
			long end3=System.currentTimeMillis();
			long total3=end3-start3;
			System.out.println("Bubble sorted array requires "+total3+" ms");
			System.out.println();
				
			break;
			
		case 4:
			long start4=System.currentTimeMillis();
			int[] arrayM=Sorting.selectionSort(array1);
			long end4=System.currentTimeMillis();
			long total4=end4-start4;
			System.out.println("Merge sorted array requires "+total4+" ms");
			System.out.println();
				
			break;	
			
		case 5:
			long start5=System.currentTimeMillis();
			int[] arrayQ=Sorting.selectionSort(array1);
			long end5=System.currentTimeMillis();
			long total5=end5-start5;
			System.out.println("Quick sorted array requires "+total5+" ms");
			System.out.println();
				
			break;	
			
		case 6:
			long start6=System.currentTimeMillis();
			int[] arrayH=Sorting.selectionSort(array1);
			long end6=System.currentTimeMillis();
			long total6=end6-start6;
			System.out.println("Heap sorted array requires "+total6+" ms");
			System.out.println();	
			
			break;
			
		case 7:
			System.out.println("All algorithm requires time in Milli Seconds");
			long startI=System.currentTimeMillis();
			int[] arr1=Sorting.insertionSort(array1);
			long endI=System.currentTimeMillis();
			long totalI=endI-startI;
			System.out.println("Inserion sort :"+totalI+" ms");
			
			long startS=System.currentTimeMillis();
			int[] arr2=Sorting.selectionSort(array1);
			long endS=System.currentTimeMillis();
			long totalS=endS-startS;
			System.out.println("Selection sort:"+totalS+" ms");
			
			long startB=System.currentTimeMillis();
			int[] arr3=Sorting.bubbleSort(array1);
			long endB=System.currentTimeMillis();
			long totalB=endB-startB;
			System.out.println("Bubble sort   :"+totalB+" ms");
			
			long startM=System.currentTimeMillis();
			int[] arr4=Sorting.mergeSort(array1);
			long endM=System.currentTimeMillis();
			long totalM=endM-startM;
			System.out.println("Merge sort    :"+totalM+" ms");
			
			long startQ=System.currentTimeMillis();
			int[] arr5=Sorting.quickSorting(array1);
			long endQ=System.currentTimeMillis();
			long totalQ=endQ-startQ;
			System.out.println("Quick sort    :"+totalQ+" ms");
			
			long startH=System.currentTimeMillis();
			int[] arrH=Sorting.heapSort(array1);
			long endH=System.currentTimeMillis();
			long totalH=endH-startH;
			System.out.println("Heap sort     :"+totalH+" ms");
			
			System.out.println();
			
			break;
		case 8:
			System.out.println("Stop");
				
			
		}
	}
	}	
}
