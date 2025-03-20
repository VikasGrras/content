package DSA.recursion;

public class recursion7 {
    public static void main(String[] args){
        //Check if a String is palindrome or not
        String r="Vikas";
        int n=r.length();
        int i=0;
        fun(r,n,i);
    }
    static void fun(String r,int n,int i){
        if(i>=n/2){
            System.out.println("String is palindrome");
            return;
        }
      if(r.toLowerCase().charAt(i)==r.toLowerCase().charAt(n-i-1)){
          fun(r,n,i+1);
      }else {
          System.out.println("String is not palindrome");
      }


    }
}
