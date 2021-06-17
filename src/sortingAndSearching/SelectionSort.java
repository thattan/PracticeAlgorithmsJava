package sortingAndSearching;

import constants.Constants;

public class SelectionSort extends Constants{
	public static void main(String[] args) {
		// Selection Sort Algorithm
		// Sort of the opposite of bubble sort, loop through and find the minimum index and move it to the beginning
		int[] tempArray = randomNumbers20;
		System.out.println("Selection Sort");
		printArray(tempArray);
		for (int i = 0; i < tempArray.length - 2; i++) { 
			int minIndex = i;
			for (int j = i + 1; j < tempArray.length  - 1; j++) { 
				if (tempArray[j] < tempArray[minIndex])
					minIndex = j;
			}
			int tempIndex = tempArray[minIndex];
			tempArray[minIndex] = tempArray[i];
			tempArray[i] = tempIndex;
		}
		printArray(tempArray);
	}
}
