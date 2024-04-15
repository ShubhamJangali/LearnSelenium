package Java.Practice;
 interface RBI{
//     interface methods are by default public and abstract.
    public void linkadhar();
    public void netbanking();
    public void creditcard();
}
interface Goverment extends RBI{
     public void aim();
}
class difine implements Goverment{

    @Override
    public void linkadhar() {
        System.out.println("linkadhar");
    }

    @Override
    public void netbanking() {
        System.out.println("netbanking");
    }

    @Override
    public void creditcard() {
        System.out.println("creaditcard");
    }

    @Override
    public void aim() {
        System.out.println("Goverment control RBI");
    }
}
public class InterfaceMain {
    public static void main(String[] args) {
        difine def = new difine();
        def.aim();
        def.linkadhar();
        def.creditcard();def.netbanking();
    }
}
