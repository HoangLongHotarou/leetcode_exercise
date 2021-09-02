import java.lang.reflect.Array;
import java.util.Arrays;

// 2 2 3 1 
/**
 *      2 0 0
 *      0 0 2
 *      0 3 2 
 *      3 2 1
 */

public class ThirdMaximumNum {
    public static int thirdMaxNum(int[] n) {
        long[] arr = {Long.MIN_VALUE,Long.MIN_VALUE,Long.MIN_VALUE};
        for(int i =0;i<n.length;i++){
            insert(arr,n[i]);
        }
        if(arr[2]==Long.MIN_VALUE)
            return (int)arr[0];
        return (int)arr[2];
    }

    private static void insert(long[] arr, int val) {
        int i = 0;
        while(i<arr.length){
            if(val == arr[i]){
                return;
            }
            // chen value vao vi tri i
            else if(val>arr[i]){
                break;
            // doi 1 lan
            }else{
                i++;
            }
        }
        // Min|min|min  3 2 1
        if(i<arr.length){
            for (int j = arr.length-2; j >=i ; j--) {
                arr[j+1] = arr[j];
            }
            arr[i] = val;
        }
    }

    public static int thirdMaxNum1(int[] n) {
        long max = Long.MIN_VALUE;
        long mid = max;
        long min = mid;
        for (int i : n) {
            if(i>max){
                min = mid;
                mid = max;
                max = i;
            }
            else if(mid<i && i<max){
                min = mid;
                mid = i;
            }else if(min<i && i<mid){
                min = i;
            }           
        }
        return (int)(min!=Long.MIN_VALUE?min:max);
    }

    public static void main(String[] args) {
        int[] n = {2,2,3,1};
        System.out.println(Arrays.toString(n));
        System.out.println(thirdMaxNum(n));
    }
}
