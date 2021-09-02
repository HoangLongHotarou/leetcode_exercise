import java.util.Arrays;

public class Sorting {

    public static void bubbleSort(int[] n) {
        for (int i = n.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] n) {
        for (int i = 0; i < n.length; i++) {
            int min = i;
            for (int j = i + 1; j < n.length; j++) {
                if (n[j] < n[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = n[min];
                n[min] = n[i];
                n[i] = temp;
            }
        }
    }

    public static void insertionSort(int[] n) {
        for (int i = 1; i < n.length; i++) {
            int temp = n[i];
            int j = i - 1;
            while (j >= 0 && n[j] > temp) {
                n[j + 1] = n[j];
                j--;
            }
            n[j + 1] = temp;
        }
    }

    public static int[] sortArray(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static int[] mergeSort(int[] arr, int L, int R) {
        // DKDB DKD
        if (L == R) {
            return new int[] { arr[L] };
        }
        // Chia ra
        int mid = (L + R) / 2;
        int[] a1 = mergeSort(arr, L, mid);
        int[] a2 = mergeSort(arr, mid + 1, R);

        // Vun dong
        int n = a1.length + a2.length;
        int[] solution = new int[n];
        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) {
                if (a1[i1] < a2[i2]) {
                    solution[i++] = a1[i1++];
                } else {
                    solution[i++] = a2[i2++];
                }
            } else {
                if (i1 < a1.length) {
                    solution[i++] = a1[i1++];
                } else {
                    solution[i++] = a2[i2++];
                }
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        int[] n = { 2, 3, 4, 5, 1, 2, 2, 3, 191, 22, 12 };
        // bubbleSort(n);
        // selectionSort(n);
        // insertionSort(n);
        // System.out.println(Arrays.toString(n));
        // int[] s = sortArray(n);
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(sortArray(n)));
    }
}
