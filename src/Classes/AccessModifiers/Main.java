package Classes.AccessModifiers;

import Classes.Encapsulation.Circle1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
/*       // this is for public int x;
 Test test = new Test();
        test.x = 10;
        System.out.println(test.x);
        */
        // this is for private int x;
        Test test =  new Test(-10);
        //test.setX(10);
        System.out.println(test.getX());


        /*
        Circle1 circle1 = new Circle1(new Point(1,2),4);
        Circle1 circle2 = new Circle1();
        Circle1 circle3 = new Circle1(new Point(2, 5),6);

        circle1.setRadius(-2);
        circle2.setRadius(4);
        */
       // circle3.setRadius(3);


//        System.out.println(circle1.getRadius());
//        System.out.println(circle2.getRadius());
//        System.out.println(circle3.getRadius());
//        System.out.println(Circle1.getNumberOfCircles());


    }
}
