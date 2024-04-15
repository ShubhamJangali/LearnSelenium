package Java.Practice;

class capsule{
   private String name = "Shubham";
   private int salary= 500000;

   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name = name;
   }
   public int getSalary(){
       return salary;
   }
   public void setSalary(int n){
       salary = n;
   }
}
public class another {
    public static void main(String[] args) {
        capsule cap = new capsule();
        System.out.println(cap.getName());
        cap.setName("Shubham jangali");
        System.out.println(cap.getName());
        System.out.println(cap.getSalary());
        cap.setSalary(700000);
        System.out.println(cap.getSalary());
    }
}
