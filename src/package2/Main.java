package package2;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {


    public static void main(String[] args){
        int[] arr={2,-3,-4,-6,5,4};
        int[] arr2=new int[arr.length];
         for(int i=0;i<arr.length;i++){
             if((arr[i]>=0)&&(i%2==0)){
                 arr2[i]=arr[i];
             }
             if((arr[i]<0)&&(i%2!=0)){
                 arr2[i]=arr[i];
             }
         }
         System.out.println(Arrays.toString(arr2));

    }




}
