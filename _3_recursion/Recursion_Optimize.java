public class Recursion_Optimize {
    // De quy co nho: luu lai ket qua da tinh 

    static int[] F = new int [1000];

    public static int Fibo2(int n) {
        if(F[n]!=0)
            return F[n];
        System.out.println("Can tinh F["+n+"]");
        if(n<=2){
            F[1] = 1;
            F[2] = 1; 
            return 1;
        }
        F[n] = Fibo2(n-1)+Fibo2(n-2);
        return F[n];
    }

    public static int Fibo(int n) {
        System.out.println("Can tinh F["+n+"]");
        if(n<=2){
            return 1;
        }
        return Fibo(n-1)+Fibo(n-2);
    }

    public static void main(String[] args) {
        System.out.println(Fibo2(20));
    }
}
