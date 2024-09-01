import java.util.Arrays;

public class InsertionSort {
    static void insertionSort (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int insertPos = Arrays.binarySearch(arr, 0, i, key);

            if (insertPos < 0) {insertPos = -(insertPos + 1);}

            System.arraycopy(arr, insertPos, arr, insertPos + 1, i - insertPos);
            arr[insertPos] = key;
        }
    }

    public static void main(String... arg){
        int[] testArray = {3, 4, 8, 1, 10};
        insertionSort(testArray);
        for (int num : testArray){System.out.print(num + " ");}
    }
}
