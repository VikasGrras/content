package DSA.pattern;

public class Pattern3 {
    public static void main(String[] args){
   /* print  1
             12
             123
             1234
             12345 */
    for(int i=0;i<=4;i++){
        for(int j=1;j<=i+1;j++){
            System.out.print(j);
        }
        System.out.println("");
    }
}}
