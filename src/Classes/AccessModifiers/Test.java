package Classes.AccessModifiers;

public class Test {
   // public int x;// this attribute is public and can be accessed by defining an object in other classes
    //int x;
   /* this is default access modifier. since the Test class and the Main class are in the same package it works
    like the public attribute! if the two classes are in different package it won't work*/
    private int x;
    // the private attribute is only accessed inside the same class:

    /* public static void main(String[] args) {
        Test test = new Test();
        test.x=10;
        System.out.println(test.x);
    }*/
    // or using public setter and getter methods
    public Test(int x){
        this.setX(x);
    }

    public void setX(int x) {
        this.x = Math.max(x, 0);
        //or if-else or
        //this.x = (x>=0)?x:0;

    }

    public int getX() {

        return x;
    }
}
