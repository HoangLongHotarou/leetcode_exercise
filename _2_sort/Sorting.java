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

    public static void quickSort(int []arr, int L, int R){
        //Stop the recursion
        if(L>=R){
            return;
        }
        // get the key
        int key = arr[(L+R)/2];
        // partiton follow key
        int pivot = partition(arr, L, R, key);
        //div half the array ==> repeat
        quickSort(arr, L, pivot-1);
        quickSort(arr, pivot, R);
    }

    // return pivot value
    public static int partition(int[] arr, int L,int R, int key){
        int iL = L;
        int iR = R;
        while(iL<=iR){
            // if iL find element >= key then swapping
            while(arr[iL]<key)iL++;
            // if iR find elemt <= key then swapping
            while(arr[iR]>key)iR--;
            // swapping 2 element but which incorrect the position
            if(iL<=iR){
                int temp = arr[iL];
                arr[iL++] = arr[iR];
                arr[iR--] = temp;
            }
        }
        return iL;
    }

    public static void main(String[] args) {
        int[] n = { 2, 3, 4, 5, 1, 2, 2, 3, 191, 22, 12 };
        // bubbleSort(n);
        // selectionSort(n);
        // insertionSort(n);
        // System.out.println(Arrays.toString(n));
        // int[] s = sortArray(n);
        System.out.println(Arrays.toString(n));
        // System.out.println(Arrays.toString(sortArray(n)));
        quickSort(n, 0, n.length-1);
        System.out.println(Arrays.toString(n));
    }
}
