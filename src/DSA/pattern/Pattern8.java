package DSA.pattern;

public class Pattern8  {
    public static void main(String[] args){
      /*  print              *
                             **
                             ***
                             ****
                             *****
                             ****
                             ***
                             **
                             *                                           */

      int n=5;

        for(int i=1;i<2*n;i++){
            int k=i;
            if(k>n) k=2*n-i;
            for(int j=0;j<k;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
