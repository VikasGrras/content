package DSA.pattern;

public class Pattern9 {
    public static void main(String[] args){
      /*  print 1
                01
                101
                0101
                10101      */

        int v;
        for(int i=0;i<5;i++){
            if(i%2==0)  v=1;
            else v=0;
            for(int j=0;j<=i;j++){
                System.out.print(v);
                v=1-v;
            }
            System.out.println("");
        }
    }
}
