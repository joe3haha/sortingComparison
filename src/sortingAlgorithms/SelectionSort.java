package sortingAlgorithms;

public class SelectionSort<T extends Comparable<T>> {

	public void selectionSort(T[] data) {
		int min;
		T temp;
		for(int i=0; i< data.length-1; i++) {
			min = i;
			for(int k = i+1; k < data.length; k++) {
				if(data[k].compareTo(data[min])<0) {
					min = k;
				}
			}
			
			temp = data[min];
			data[min] = data[i];
			data[i] = temp;
		}
		
	}
}
