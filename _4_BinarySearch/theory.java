public class theory {
    public static int binarySearch(int []arr, int key){
        int right = arr.length-1;
        int left = 0;
        while(left<=right){
            int mid = (left+right)/2;
            System.out.println("["+left+","+right+"]"+mid);
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){
                right = mid-1;
            }else if(arr[mid]<key){
                left = mid+1;
            }
        }
        return -1;
    }

    public static int bSearch(int []arr, int key, int left, int right){
        if(left > right)
            return -1;
        int mid = (left+right)/2;
        if(key > arr[mid]){
            return bSearch(arr, key,mid+1,right);
        }else  if(key < arr[mid])
            return bSearch(arr, key,left,mid-1);
        else
            return mid;
    }

    public static int bSearch(int []arr,int key){
        int n = arr.length;
        return bSearch(arr,key,0,n-1);
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8};
        System.out.println(bSearch(arr, 8));
    }
}
