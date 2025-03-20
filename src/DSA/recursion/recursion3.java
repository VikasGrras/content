package DSA.recursion;

public class recursion3 {
    //print N to 1 using recursion
    static int n;
    public static void main(String[] args){
        n=5;
        fun();

    }
    static void fun(){
        if(n<1){
            return;
        }
        System.out.println(n);
        n=n-1;
        fun();
    }
}
