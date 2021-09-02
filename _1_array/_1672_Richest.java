public class _1672_Richest {
    public static int maximumWealth(int[][] accounts) {
        int[] money = new int[accounts[0].length];
        int max = -1;
        for(int i = 0; i< accounts.length; i++){
            for (int j = 0; j < accounts[i].length; j++) {
                money[i] = money[i]+accounts[i][j];
            }
            if(money[i]>max){
                max = money[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts)); 
    }
}
