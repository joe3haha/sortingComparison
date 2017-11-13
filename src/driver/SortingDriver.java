package driver;

import java.util.Random;

import sortingAlgorithms.BubbleSort;
import sortingAlgorithms.InsertionSort;
import sortingAlgorithms.MergeSort;
import sortingAlgorithms.QuickSort;
import sortingAlgorithms.SelectionSort;

public class SortingDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BubbleSort<Integer> bSort = new BubbleSort<Integer>();
		InsertionSort<Integer> insertSort = new InsertionSort<Integer>();
		MergeSort<Integer> mergeSort = new MergeSort<Integer>();
		QuickSort<Integer> quickSort = new QuickSort<Integer>();
		SelectionSort<Integer> selectionSort = new SelectionSort<Integer>();
		long bsortTime = 0;
		long insertSortTime = 0;
		long mergeSortTime = 0;
		long quickSortTime = 0;
		long selectionSortTime = 0;
		for(int cycles = 0; cycles < 40; cycles++) {
			//Generate an array of Integers with random order
			Integer[] arr1 = new Integer[10000];
			Integer[] arr2 = new Integer[10000];
			Integer[] arr3 = new Integer[10000];
			Integer[] arr4 = new Integer[10000];
			Integer[] arr5 = new Integer[10000];	
			Random rand = new Random();
			for(int i = 0; i < 10000; i++) {
				arr1[i] = rand.nextInt(100000000);
			}
			//create copies of arr1;
			System.arraycopy(arr1, 0, arr2, 0, 10000);
			System.arraycopy(arr1, 0, arr3, 0, 10000);
			System.arraycopy(arr1, 0, arr4, 0, 10000);
			System.arraycopy(arr1, 0, arr5, 0, 10000);
			//test the various sorting algorithms
			long start = System.currentTimeMillis();
			bSort.bubbleSort(arr1);
			long finish   = System.currentTimeMillis();
			long runtime = finish - start;
			bsortTime += runtime;
			start = System.currentTimeMillis();
			insertSort.insertionSort(arr2);
			finish   = System.currentTimeMillis();
			runtime = finish - start;
			insertSortTime += runtime;
			start = System.currentTimeMillis();
			mergeSort.mergeSort(arr3, 0, 10000-1);
			finish   = System.currentTimeMillis();
			runtime = finish - start;
			mergeSortTime += runtime;
			start = System.currentTimeMillis();
			quickSort.quickSort(arr4, 0, 10000-1);
			finish   = System.currentTimeMillis();
			runtime = finish - start;
			quickSortTime += runtime;
			start = System.currentTimeMillis();
			selectionSort.selectionSort(arr5);
			finish   = System.currentTimeMillis();
			runtime = finish - start;
			selectionSortTime += runtime;		
			
		}
		
		System.out.println("Average sort time of bubble sort: " + bsortTime/40);
		System.out.println("Average sort time of insertion sort: " + insertSortTime/40);
		System.out.println("Average sort time of merge sort: " + mergeSortTime/40);
		System.out.println("Average sort time of quick sort: " + quickSortTime/40);
		System.out.println("Average sort time of selection sort: " + selectionSortTime/40);
		
	}

}
