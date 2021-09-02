import java.util.Hashtable;

public class _387_first_unique_char {
    // public static int firstUniqChar(String s) {
    //         Hashtable<Character,Integer>  map = new Hashtable<Character,Integer>();
    //         for (Character c : s.toCharArray()) {
    //             if(map.containsKey(c)){
    //                 int count = map.get(c)+1;
    //                 map.put(c,count);
    //             }else{
    //                 map.put(c,1);
    //             }
    //         }
    //         for(int i = 0;i< s.length();i++){
    //             if(map.get(s.charAt(i))==1){
    //                 return i;
    //             }
    //         }
    //         return -1;
    // }

    public static int firstUniqChar(String s){
        char[] arr = s.toCharArray();
        int[] count = new int[123];
        for(int i=0;i<arr.length;i++){
            count[(int)arr[i]]+=1;
        }
        for(int i=0;i<arr.length;i++){
            if(count[(int)arr[i]]==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}
