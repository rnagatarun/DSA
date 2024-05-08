import java.util.ArrayList;

public class Main {

    // Merge function to merge two sorted sub-arrays
    public static void merge(int[] a, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        // Merge the two halves
        while (left <= mid && right <= high) {
            if (a[left] <= a[right]) {
                temp.add(a[left]);
                left++;
            } else {
                temp.add(a[right]);
                right++;
            }
        }

        // Copy remaining elements from the left sub-array
        while (left <= mid) {
            temp.add(a[left]);
            left++;
        }

        // Copy remaining elements from the right sub-array
        while (right <= high) {
            temp.add(a[right]);
            right++;
        }

        // Copy the sorted elements back to the original array
        for (int i = low; i <= high; i++) {
            a[i] = temp.get(i - low);
        }
    }

    // Merge sort function
    public static void mergeSort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;
        mergeSort(a, low, mid);
        mergeSort(a, mid + 1, high);
        merge(a, low, mid, high);
    }

    // Main function
    public static void main(String[] args) {
        int[] a = {1, 4, 2, 3, 5, 9, 7, 6, 3};
        int low = 0;
        int high = a.length - 1;

        // Perform merge sort on the array
        mergeSort(a, low, high);

        // Print the sorted array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
