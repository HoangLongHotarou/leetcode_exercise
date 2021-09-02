import java.lang.annotation.Target;
import java.util.HashMap;

public class _1_two_sum {
    public static int[] twoSum(int[] nums, int target) {
        int []s = new int[2];
        HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>();
        // long [] count = new long[10000000];
        for (int i = 0; i < nums.length; i++) {
            int v = target - nums[i];
            if(temp.containsKey(v)){
                s[0] = temp.get(v);
                s[1] = i;
                return s;
            }else{
                temp.put(nums[i],i);
            } 
        }
        return s;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4,15};
        int target = 6;
        int[] s = twoSum(nums, target);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
