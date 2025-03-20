package Polymorphism;

public class Main {
   public  void sum(){
         System.out.println("there is no number");
     }

     public int sum(int a){
       int result=a+a;
       return result;
     }
     public static int sum(String name,int a){
       return a;
     }

     public static void  main(String[] args){
         Main obj=new Main();
         obj.sum();
        // int result=obj.sum(10,);
         sum("vikas",20);

     }
}
