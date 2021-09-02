public class _88_merge_sort_array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0 && n>0){m+=1;}
        for (int ai : nums2) {
            insertElemnet(ai, nums1, m);
            m++;
        }
    }

    private static void insertElemnet(int ai, int[] nums1, int m) {
        boolean find = false;
        for(int k = 0; k <m; k++){
            if(nums1[k]>ai){
                find=true;
                for(int i= m-1;i>=k;i--){
                    nums1[i+1] = nums1[i];
                }
                nums1[k] = ai;
                break;
            }
        }

        if(find == false){
            nums1[m] = ai;
        }
    }

    public static void main(String[] args) {
        int[] num1 = { 1, 2, 3, 0, 0, 0 };
        // int[] num1 = { 0 };
        int m = 3;
        int[] num2 = { 2, 5, 6 };
        int n = 3;
        merge(num1, m, num2, n);
        for (int i : num1)
            System.out.println(i);
    }
}
