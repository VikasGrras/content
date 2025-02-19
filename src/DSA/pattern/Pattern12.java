package DSA.pattern;

public class Pattern12 {
    public static void main(String[] args){
       /* print A
                AB
                ABC
                ABCD
                ABCDE  */
    for(int i=0;i<5;i++) {
        for (char ch = 'A';ch<='A'+i; ch++) {
              System.out.print(ch);
        }
        System.out.println();
    }
    }

}
