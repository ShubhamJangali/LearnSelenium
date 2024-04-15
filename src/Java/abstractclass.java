package Java;

abstract class demo{

    public demo(){
        System.out.println("demo class constructor");
    }
    public void show(){
        System.out.println("this is show");
    }
    public void printing(){
        System.out.println("this is printing");
    }
    
}

 class demo1 extends demo{
    public demo1(){
        System.out.println("demo1 class constructor");
    }

}


 public class abstractclass  {
     public static void main(String[] args) {
         demo1 d = new demo1();
         d.printing();
         d.show();
     }
 }
