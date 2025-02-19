package DSA.pattern;

public class Pattern13 {
    public static void main(String[] args){
        for(int i=0;i<2*5-1;i++){

            // inner loop for no. of columns.
            for(int j=0;j<2*5-1;j++){

                // Initialising the top, down, left and right indices of a cell.
                int top = i;
                int bottom = j;
                int right = (2*5 - 2) - j;
                int left = (2*5 - 2) - i;

                // Min of 4 directions and then we subtract from n
                // because previously we would get a pattern whose border
                // has 0's, but we want with border N's and then decrease inside.
                System.out.print(5- Math.min(Math.min(top,bottom),Math.min(left,right)) + " ");
            }

            // As soon as the numbers for each iteration are printed, we move to the
            // next row and give a line break otherwise all numbers
            // would get printed in 1 line.
            System.out.println();
        }
        }
}
