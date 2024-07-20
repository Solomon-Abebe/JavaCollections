package Classes.Exercises.Polymorphism;

public class Calculator {
    public void add(int a, int b){
        System.out.println("Two Parameters: "+(a+b));
    }

    /*
    OR
     public int add(int a, int b){
        return a+b;
    }
     */
    //method overloading
    public void add(double a, double b, int c){
        System.out.println("Three Parameters:" +(a+b+c));
    }
    public double add(double a, double b, double c){
         return a+b+c;
    }


}
class MainDemo{
    public static void main(String[] args) {
        Calculator addition = new Calculator();
        addition.add(5,10);
        addition.add(10,16.5,20);

        System.out.println(addition.add(5,10,20.5));

        Multiplication multiplication = new Multiplication();
        multiplication.Operation(5,6);

        Division division = new Division();
        division.Operation(5,20);


    }
}
     class MathOperation{
      public void Operation(int a, int b){
          System.out.println(" Some Math Operation");
      }
     }
     class Multiplication extends MathOperation{
         @Override
         public void Operation(int a, int b) {
             //super.Operation(a, b);
             System.out.println("Multiplication Result: "+a*b);
         }
     }
     class Division extends MathOperation{
    public void Operation(int a, int b){
        super.Operation(5,6);// calling the method in superclass
        System.out.println("Division Result: "+ b/a);
    }
     }
