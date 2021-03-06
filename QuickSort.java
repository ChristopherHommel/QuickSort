/**
 * An implementation of the quicksort algorithm
 * @author Christopher
 *
 */

public class QuickSort {

	public static void main(String[] args) {
		
		}
	
	/**
	 * Sort the starting and end values inplace recursively
	 * @param array an array with unsorted integers
	 * @param start beginning point of the array
	 * @param end final point of the array
	 */
	public void sort(int[] array, int start, int end) {
		if (start < end) {
			//Sort the array before and after partition
			int partitionIndex = partition(array, start, end);
			sort(array, start, partitionIndex - 1);
			sort(array, partitionIndex + 1, end);

		}
	}

	/**
	 * Take the last element as a pivot point
	 * and place all elements smaller than it to the left
	 * and all elements greater than it to the right
	 * @param array an array with unsorted integers
	 * @param start beginning point of the array
	 * @param end final point of the array
	 * @return the next point in the array until there is no more points
	 */
	private int partition(int[] array, int start, int end) {
		//The point to pivot elements around
		int pivotPoint = array[end];
		int index = start - 1;
		
		//Loop though each element in the array
		for (int j = start; j < end; j++) {
			//If the current poisition in the array is less than or equal to the pivot point
			if (array[j] <= pivotPoint) {
				//Goto the next element
				index++;

				//Swap elements here
				//Save the next point into a temporary value
				int tempPoint = array[index];
				//Swap elements with the next element
				array[index] = array[j];
				//Set the current element to the temporary value
				array[j] = tempPoint;
			}

		}
		//Swap array +1 and the pivot point
		int tempPoint = array[index + 1];
		array[index + 1] = array[end];
		array[end] = tempPoint;
		return index + 1;

	}

}
