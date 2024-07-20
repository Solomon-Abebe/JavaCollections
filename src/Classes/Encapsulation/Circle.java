package Classes.Encapsulation;

import java.awt.*;

public class Circle {
    Point center;// point is object
    double radius;

    Circle(){

    }
    Circle(Point center, double radius){
        this.center=center;
        this.radius=radius;
    }
    double getPerimeter(){

        return 2*Math.PI*radius;
    }
    double getArea(){

        return Math.PI*radius*radius;
    }
    void setCenter(Point center){

        this.center=center;
    }
    void setRadius(double radius){

        this.radius= radius;
    }

    public static void main(String[] args) {
        Circle c1=new Circle(new Point(3,5),8);

        System.out.println(c1.center);
        System.out.println(c1.radius);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

    }
}
