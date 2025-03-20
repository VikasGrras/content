package DSA.recursion;

public class recursion2 {
    //write a program to print name N times
    static int n;
    static int i=0;
    public static void main(String[] args){
        n=5;
        fun();

    }
  static   void fun(){
        if(i>n){
            return;
        }
        System.out.println("Vikas");
        i+=1;
        fun();
    }
}
