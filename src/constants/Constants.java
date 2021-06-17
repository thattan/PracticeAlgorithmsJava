package constants;

import java.util.Random;

public class Constants {

	public static int[] randomNumbers20 = getRandomNumbers(20);

	public static int[] getRandomNumbers(int arraySize) {
		Random rd = new Random();
		int[] arr = new int[arraySize];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1; // storing random integers in an array, 1-100
		}
		return arr;
	}

    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length - 1; i++)
        System.out.print(arr[i] + " ");
        System.out.println();
    }
	
}
