package sortingAlgorithms;

public class InsertionSort<T extends Comparable<T>> {

	public void insertionSort(T[] data) {
		for(int i = 1; i < data.length; i++) {
			T key = data[i];
			int position = i;
			
			while(position > 0 && data[position-1].compareTo(key) > 0) {
				data[position] = data[position-1];
				position--;
			}
			
			data[position] = key;
		}
	}
	
}
