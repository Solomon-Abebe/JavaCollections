package Classes.Abstraction;

public class AbstractDemo {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        SamsungS23 s23 = new SamsungS23();

        show(s23);
    }
    public static void show(Phone iphone){
        iphone.showConfig();
    }
}
abstract class Phone{
    public abstract void showConfig();


}
class Iphone extends Phone{
    @Override
    public void showConfig() {
        System.out.println("6GB, IOS 17.2.1");
    }
}
class SamsungS23 extends Phone{
    public void showConfig(){
        System.out.println("8GB, Android 14");
    }
}