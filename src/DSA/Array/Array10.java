package DSA.Array;

public class Array10 {
    public static void main(String[] args){
        int[] arr={3,6,8,2,4,7};
        int[] arrNew=new int[arr.length];
        for(int i=1;i<arr.length-1;i++){
            if((arr[i]-arr[i-1])>(arr[i]-arr[i+1])){
                arr[i]=arr[i]-arr[i-1];
            }
            else {
                arr[i]=  arr[i]-arr[i+1];
            }
        }
    }

}
