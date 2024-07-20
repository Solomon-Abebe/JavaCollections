package Classes.Exercises.Polymorphism;

public class Overloading22 {
    public int add(int a, int b){
        return (a+b);
    }
    public int add(int a, int b, int c){
        return (a+b+c);
    }

    public static void main(String[] args) {
        Overloading22 addition1 = new Overloading22();
        int result = addition1.add(5,6);
        System.out.println(result);
    }
}
