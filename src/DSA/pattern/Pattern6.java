package DSA.pattern;

public class Pattern6 {
  /*  print *********
             *******
              *****
               ***
                *   */
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<10-i*2-1;j++){
                System.out.print("*");
            }
            for(int j=1;j<i+1;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
