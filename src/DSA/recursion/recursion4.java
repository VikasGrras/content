package DSA.recursion;

public class recursion4 {
    //sum of first N numbers
    static int n;
    static int sum=0;
    public static void main(String[] args){
        n=3;
        fun();

    }
    static void fun(){
        if(n<1){
            System.out.print(sum);
            return;
        }
        sum+=n;
        n=n-1;
        fun();
    }
}
