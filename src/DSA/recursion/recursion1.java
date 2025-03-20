package DSA.recursion;

public class recursion1 {
    //write a recursion program to print values from 0 to n
    static int count=0;
    static int n=6;
    public static void main(String[] args){
        f1();
    }

  static  void f1(){
        if(count>n){
            return;
        }
        System.out.print(count);
      count=count+1;
        f1();
    }
}
