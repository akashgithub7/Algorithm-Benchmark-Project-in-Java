package com.felight.akash.algobenchmark;

import java.util.Arrays;
import java.util.Random;

public class Sorting {

	public static int[] sortAsc(int[] array){
		Arrays.sort(array);
		return array;
	}
	
	public static int[] randomArray(int[] array){
		int[]array1=array;
		for(int i=0;i<array1.length;i++) {
			int index=0;
			array1[i]=(int)((Math.random()*1000));
			//index++;
		} return array1;
	}
	
		public static int[] sortDesc(int[] array1){
			Arrays.sort(array1);
			int index=0;
			int []array=new int[array1.length];
			for(int i=array1.length-1;i>=0;i--){
				array[index]=array1[i];
				index++;
			}return array;
			
		}
		
		public static int[] insertionSort(int[] array1){
			int[] array=array1;
			for(int i=1;i<array.length;i++) {
				int element=array[i];
				int j=i;
				
				while(j>0 && array[j-1]>element) {
					array[j]=array[j-1];
					j=j-1;
					array[j]=element;
				}
			}return array;
		}
		
		public static int[] selectionSort(int[] array1){
			
			int i,j,min,minIndex,temp=0;
			int[] arr=array1;
			for(i=0;i<arr.length;i++) {
				min=arr[i];
				minIndex=i;
				for(j=i;j<arr.length;j++) {
					if(arr[j]<min){
						min=arr[j];
						minIndex=j;
					}
				}
			
				if(min<arr[i]){
					temp=arr[i];
					arr[i]=arr[minIndex];
					arr[minIndex]=temp;
				}
			}
			return arr;
		}
		
		public static int[] bubbleSort(int[] array1) {
			int[] arr=array1;
			int i,j,temp=0;
			
			for(i=0;i<arr.length-1;i++){
				for(j=0;j<arr.length-1-i;j++){
					if(arr[j]>arr[j+1]){
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			return arr;
		}
		

	    public static int[] mergeSort(int[] array) {
	        if (array.length > 1) {
	            int[] left = leftHalf(array);
	            int[] right = rightHalf(array);
	            mergeSort(left);
	            mergeSort(right);
	            merge(array, left, right);
	        }
			return array;
	    }

	    public static int[] leftHalf(int[] array) {
	        int size1 = array.length / 2;
	        int[] left = new int[size1];
	        for (int i = 0; i < size1; i++) {
	            left[i] = array[i];
	        }
	        return left;
	    }

	    public static int[] rightHalf(int[] array) {
	        int size1 = array.length / 2;
	        int size2 = array.length - size1;
	        int[] right = new int[size2];
	        for (int i = 0; i < size2; i++) {
	            right[i] = array[i + size1];
	        }
	        return right;
	    }

	    public static void merge(int[] result, int[] left, int[] right) {
	        int i1 = 0;
	        int i2 = 0;
	        for (int i = 0; i < result.length; i++) {
	            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
	                result[i] = left[i1];
	                i1++;
	            } else {
	                result[i] = right[i2];
	                i2++;
	            }
	        }
	    }
	    
	    public static int[] quickSorting(int[] arr) {
	        quickSort(arr, 0, arr.length - 1);
			return arr;
	    }

	    public static void quickSort(int arr[], int low, int high) {
	        int i = low, j = high;
	        int temp;
	        int pivot = arr[(low + high) / 2];

	        while (i <= j) {
	            while (arr[i] < pivot)
	                i++;
	            while (arr[j] > pivot)
	                j--;
	            if (i <= j) {
	                temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	                i++;
	                j--;
	            }
	        }

	        if (low < j)
	            quickSort(arr, low, j);
	        if (i < high)
	            quickSort(arr, i, high);
	    }
	    
	    static int N;

	    public static int[] heapSort(int arr[]) {
	        heapify(arr);
	        for (int i = N; i > 0; i--) {
	            swapNumbers(0, i, arr);
	            N = N - 1;
	            maxheap(arr, 0);
	        }
			return arr;
	    }

	    /* Function to build a heap */
	    public static void heapify(int arr[]) {
	        N = arr.length - 1;
	        for (int i = N / 2; i >= 0; i--)
	            maxheap(arr, i);
	    }

	    /* Function to swap largest element in heap */
	    public static void maxheap(int arr[], int i) {
	        int left = 2 * i;
	        int right = 2 * i + 1;
	        int max = i;
	        if (left <= N && arr[left] > arr[i])
	            max = left;
	        if (right <= N && arr[right] > arr[max])
	            max = right;

	        if (max != i) {
	            swapNumbers(i, max, arr);
	            maxheap(arr, max);
	        }
	    }

	    private static void swapNumbers(int i, int j, int[] array) {
	        int temp;
	        temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }



}
