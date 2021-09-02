class _1295_Find_Num_Even_of_Digits{
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i:nums){
            if(checkEven(i)){
                count++;
            }
        }
        return count;
    }

    private static boolean checkEven(int i) {
        // int s = 0;
        // while(i>0){
        //     i=i/10;
        //     s++;
        // }
        int s = String.format("%d",i).length();
        if(s%2==0)return true;
        return false;
    }

    public static void main(String[] args) {
        int [] a = {11,1,1122,45};
        System.out.println(findNumbers(a));
    }
}