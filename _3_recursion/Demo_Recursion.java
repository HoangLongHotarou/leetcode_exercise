public class Demo_Recursion {
    public static void printElement(int[] arr,int index) {
        if(index<0||index>=arr.length)return;
        printElement(arr, index+1);
        System.out.println(arr[index]);
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        printElement(arr, 0);
    }
}
