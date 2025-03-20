package DSA.recursion;

public class recursion5 {
    //write a program to print factorial of a number;
    static int n=4;
    static int fact=1;
    public static void main(String[] args){
        fun(n);
        System.out.print(fact);

    }
  static int fun(int n){
        if(n<1){
            return 1;
        }
        fact=n*fun(n-1);
        return fact;

    }

}
