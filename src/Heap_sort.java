import java.util.Arrays;

/**
 * Реализовать алгоритм пирамидальной сортировки (HeapSort).
 */
public class Heap_sort {
    public static void main(String[] args) {
        int[] arr = {99, 54, 68, 49, 78, 35, 14, 65, -68, 7, 0, 6, 8, 32};
        HeapSort(arr);
        printArray(arr);
    }

    public static void printArray (int[] my_array) {
        for (int i = 0; i < my_array.length; i++) {
            System.out.printf("%d ", my_array[i]);
        }
    }
    public static void HeapSort (int[] my_array) {
        int N = my_array.length;
        for (int i = N / 2 - 1; i >= 0; i--) {
            Heap(my_array, N, i);
        }
        for (int i = N - 1; i >= 0; i--) {
            int temp = my_array[0];
            my_array[0] = my_array[i];
            my_array[i] = temp;
            Heap(my_array, i, 0);
        }
    }
    public static void Heap (int[] my_array, int N, int i) {
        int big = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < N && my_array[left] > my_array[big]) {
            big = left;
        }
        if (right < N && my_array[right] > my_array[big]) {
            big = right;
        }
        if (big != i) {
            int temp = my_array[i];
            my_array[i] = my_array[big];
            my_array[big] = temp;
            Heap(my_array, N, big);
        }
    }
}