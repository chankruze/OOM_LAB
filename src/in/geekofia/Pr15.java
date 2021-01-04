package in.geekofia;

import java.text.MessageFormat;

public class Pr15 {
    /**
     * Practical Number: 15
     * Task: Given are two one-dimensional arrays, A and B which are sorted in ascending order.
     * Write a program to merge them into a single sorted array C that contains every item from
     * arrays A and B, in ascending order.
     */
    public static int[] mergeSortedArrays(int[] firstArray, int[] secondArray) {
        int[] finalArray = new int[firstArray.length + secondArray.length];
        int index1 = 0, index2 = 0, index3 = 0;

        // Traverse both array
        while (index1 < firstArray.length && index2 < secondArray.length) {
            // Check if current element of first array is smaller than current element
            // of second array. If yes, store first array element and increment first array
            // index. Otherwise do same with second array
            if (firstArray[index1] < secondArray[index2])
                finalArray[index3++] = firstArray[index1++];
            else
                finalArray[index3++] = secondArray[index2++];

            System.out.println(MessageFormat.format("arr[{0}] = {1}, i = {2}, j = {3}, k = {4}",
                    index3 - 1, finalArray[index3 - 1], index1, index2, index3));
        }

        // Store remaining elements of first array
        while (index1 < firstArray.length)
            finalArray[index3++] = firstArray[index1++];

        // Store remaining elements of second array
        while (index2 < secondArray.length)
            finalArray[index3++] = secondArray[index2++];

        return finalArray;
    }

    public static void main(String[] args) {
        // init variables
        int[] arrayA = {1, 2, 3, 4, 45, 89, 151};
        int[] arrayB = {14, 27, 37, 39, 45, 99, 201};

        // array lengths
        int countA = arrayA.length;
        int countB = arrayB.length;

        // final sorted array of length A + B
        int[] arrayC = mergeSortedArrays(arrayA, arrayB);

        System.out.println("--- Before Merging ---");
        for (int i : arrayA) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : arrayB) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("--- After Merging --- ");
        for (int i = 0; i < countA + countB; i++)
            System.out.print(arrayC[i] + " ");
    }
}
