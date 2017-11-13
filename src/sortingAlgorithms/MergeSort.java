package sortingAlgorithms;

public class MergeSort<T extends Comparable<T>> {

	public void mergeSort(T[] data, int min, int max) {
		T[] temp;
		int index1, left, right;
		
		if(min==max) {
			return;
		}
		
		int size = max-min + 1;
		int pivot = (min + max ) / 2;
		
		temp = (T[])(new Comparable[size]);
		
		mergeSort(data,min,pivot);
		
		mergeSort(data,pivot+1,max);
		
		for(index1 = 0; index1 < size; index1++) {
			temp[index1] = data[min + index1];
		}
		
		left = 0;
		right = pivot - min + 1;
		for(index1 = 0; index1< size; index1++) {
			if(right <= max-min) {
				 if(left <= pivot - min) {
					 if(temp[left].compareTo(temp[right]) >0) {
						 data[index1 + min] = temp[right++];
					 }else {
						 data[index1 + min] = temp[left++];
					 }
				 }else {
					 data[index1+min] = temp[right++];
				 }
			}else {
				data[index1 + min] = temp[left++];
			}
		}
		
	}
}
