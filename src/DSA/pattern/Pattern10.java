package DSA.pattern;

public class  Pattern10 {
    public static void main(String[] args){
     /*   print    1      1
                   12    21
                   123  321
                   12344321         */
    for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        for(int j=1;j<=8-2*i;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        System.out.println("");

    }}
}
