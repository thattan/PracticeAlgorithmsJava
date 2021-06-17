package sortingAndSearching;

import constants.Constants;

public class BubbleSort extends Constants {

	public static void main(String[] args) {
		// Bubble Sort Algorithm
		// O (N^2) speed
		// Takes highest number and moves it to the last index one spot at a time
		// Comparing indexes right next to each other, moving the bigger one to the higher index
		int[] tempArray = randomNumbers20;
		printArray(tempArray);
		for (int i = 0; i < tempArray.length - 2; i++) { // The last index does not need to be checked because the largest number will already be moved here
			for (int j = 0; j < tempArray.length  - i - 2; j++) { 
				if (tempArray[j] > tempArray[j + 1]) {
					int tempInt = tempArray[j + 1];
					tempArray[j + 1] = tempArray[j];
					tempArray[j] = tempInt;
				}
			}
		}
		printArray(tempArray);
	}
}
