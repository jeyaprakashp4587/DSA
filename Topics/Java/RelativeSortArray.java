import java.util.ArrayList;
import java.util.Arrays;

/**
 * RelativeSortArray
 */
public class RelativeSortArray {

    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
        int[] arr2 = { 2, 1, 4, 3, 9, 6 };
        // Arrays.sort(arr2);
        // Arrays.sort(arr1);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    list.add(arr1[i]);
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] != arr1[j]) {
                    list.add(arr1[i]);
                }
            }
        }
        for (int i : list) {
            System.out.print(i);
        }
    }
}