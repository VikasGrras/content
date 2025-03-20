package DSA.recursion;

import java.util.Arrays;

public class recursion6 {
    //reverse the given array
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8};
        int n=arr.length;
        int first=0;
        System.out.println(Arrays.toString(arr));
        fun(first,n,arr);
        System.out.print(Arrays.toString(arr));

    }
    static void fun(int first,int n,int[] arr){
        if(first>=n/2){
            return;
        }
        int temp;
       temp= arr[first];
       arr[first]=arr[n-first-1];
       arr[n-first-1]=temp;
       fun(first+1,n,arr);
    }
}
