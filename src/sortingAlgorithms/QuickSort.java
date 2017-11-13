package sortingAlgorithms;

public class QuickSort<T extends Comparable<T>> {

	public void quickSort(T[] data, int min, int max) {
		int indexOfPartition;
		
		if(max-min>0) {
			indexOfPartition = findPartition(data,min,max);
			
			quickSort(data,min,indexOfPartition-1);
			
			quickSort(data,indexOfPartition+1,max);
		}
	}
	
	private int findPartition(T[] data, int min, int max) {
		int left,right;
		T temp, partitionElement;
		
		partitionElement =  data[min];
		
		left=min;
		right=max;
		
		while(left<right) {
			while(data[left].compareTo(partitionElement) <= 0 && left < right) {
				left++;
			}
			while(data[right].compareTo(partitionElement) >0) {
				right--;
			}
			if(left < right) {
				temp = data[left];
				data[left] = data[right];
				data[right] = temp;
			}
		}
		
		temp = data[min];
		data[min] = data[right];
		data[right] = temp;
		
		return right;
		
	}
	
}
