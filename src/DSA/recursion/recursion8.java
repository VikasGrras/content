package DSA.recursion;

public class recursion8 {
    //Write a code to get the fibonacci series
    public static void main(String[] args){
        int n=5;
        for (int i = 0; i<=n;i++)
            System.out.print(fibonacci(i)+" ");
    }
    static int fibonacci(int N){

        // Base Condition.
        if(N <= 1){

            return N ;
        }

        // Problem broken down into 2 functional calls
        // and their results combined and returned.
        int last = fibonacci(N-1);
        int slast = fibonacci(N-2);

        return last+slast;


    }
}
