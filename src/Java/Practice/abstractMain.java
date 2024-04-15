package Java.Practice;
abstract class car{
    public void price(){
        System.out.println("Price");
    }
    public void milage(){
        System.out.println("milage");
    }
    public abstract void engineworks();
    public abstract void ACworks();

}
class setproperty extends car{
    public void engineworks(){
        System.out.println("engineworks");
    }
    public void ACworks(){
        System.out.println("AC works");
    }
}
public class abstractMain {
    public static void main(String[] args) {
        setproperty set = new setproperty();
        set.price();
        set.milage();
        set.engineworks();
        set.ACworks();
    }
}
