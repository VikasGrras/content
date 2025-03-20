package package2;

import Inheritance.Parent;

public class Main {
        int rollno;
     String name;
    public void Main(Main obj){
         rollno= obj.rollno;
        name= obj.name;


    }
    public Main(){
      rollno=10;
      name="vikas";
    }


    public static void main(String[] args){
        Main obj=new Main();
        Main obj2=new Main();
        System.out.println(obj2.rollno);
        System.out.println(obj2.name);


    }
}
