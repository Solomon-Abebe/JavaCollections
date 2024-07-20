package Classes.Encapsulation;

import java.awt.*;

 public class Circle1 {
     Point center;
    private double radius;
    private static int numberOfCircles=10;

    public Circle1(){
        numberOfCircles ++;
    }
    public Circle1(Point center, double radius){
        numberOfCircles ++;
        this.center = center;
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = (radius>=0)?radius:0;
    }

    public double getRadius() {
        return radius;
    }

    public static int getNumberOfCircles() {
        return numberOfCircles;
    }

     public static void main(String[] args) {
        Circle1 circle1 = new Circle1(new Point(1,2),4);
        Circle1 circle2 = new Circle1();
        Circle1 circle3 = new Circle1(new Point(2, 5),6);

        circle1.setRadius(-2);
        circle2.setRadius(4);
        circle3.setRadius(3);


        System.out.println(circle1.getRadius());
        System.out.println(circle2.getRadius());
        System.out.println(circle3.getRadius());
        System.out.println(Circle1.getNumberOfCircles());//static variables and methods are accessed using the class Circle1.

     }
}
