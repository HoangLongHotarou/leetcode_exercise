/**
 * _136_single_number
 */
public class _136_single_number {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int n:nums){
            result^=n;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,3};
        System.out.println(singleNumber(nums));
    }
}