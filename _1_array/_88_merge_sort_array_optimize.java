/*
    1,2,3,0,0,0
    2,5,6

    1,2,3,0,0,6
    1,2,3,0,5,6
    1,2,3,3,5,6

    1,4,7,0,0,0
    2,5,6

    1,4,7,0,0,7
    1,4,7,0,6,7
    1,4,7,5,6,7
    1,4,4,5,6,7
    1,2,4,5,6,7

*/

public class _88_merge_sort_array_optimize {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1, i = m - 1, j = n - 1;
        while (j >= 0 && i >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k--] = nums1[i--];
            }
            else if (nums1[i] < nums2[j]) {
                nums1[k--] = nums2[j--];
            }
        }
        while(j>=0){
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] num1 = { 1, 4, 7, 0, 0, 0 };
        // int[] num1 = { 0 };
        int m = 3;
        int[] num2 = { 2, 5, 6 };
        int n = 3;
        // int[] num1 = {2,0};
        // int m = 1;
        // int[] num2 = {1};
        // int n = 1;
        merge(num1, m, num2, n);
        for (int i : num1)
            System.out.println(i);
    }
}
