/**
 * Created by Krishnapriya on 1/21/2018.
 */

/**array of element is taken ans searching and sorting is applied on the list
 * Insertion sort is used to sort the elements
 * binary search is used to ind the elements.
 */


public class SortingAndSearching {
    int input[] = {90, 34, 56, 22, 45, 9};

    int[] sorting(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int index = input[i];
            int j = i;
            while (j > 0 && input[j - 1] > index) {
                input[j] = input[j - 1];
                j--;
            }
            input[j] = index;
        }
        return input;
    }

    int searching(int[] input) {

        int key = 22;
        int start = 0;
        int end = input.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == input[mid]) {
                return mid;
            }
            if (key < input[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}

