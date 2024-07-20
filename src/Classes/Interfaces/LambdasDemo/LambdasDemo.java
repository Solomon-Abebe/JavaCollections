package Classes.Interfaces.LambdasDemo;

public class LambdasDemo {
    public static String prefix = "-"; // this is static variable
    public static void show(){

        String prefix="-"; // local variable
        //greet(new ConsolePrinter());// passing ConsolePrinter object or instance to the method greet
        // or using anonymous inner class ( a class inside a method):
        /*greet( new Printer (){
        public void print(String message){
        System.out .println(message);
        }
        });*/
        // or using(passing to a method) lambda expression with much cleaner and concise code
        //greet(message -> System.out.println(message));

        // or store lambda expression in a variable
        Printer printer=message -> System.out.println(prefix+message);// we can access the local variable and /or the static variable in the method
        greet(printer);

        //Or using method reference
        greet(System.out::println);
    }
    public static void greet(Printer printer){
        printer.print("Hello World");
    }

    public static void main(String[] args) {
        show();
    }
}
