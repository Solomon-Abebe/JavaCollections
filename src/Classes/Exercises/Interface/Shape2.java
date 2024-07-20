package Classes.Exercises.Interface;

interface Shape2 {
    double calculateArea();
    double calculatePerimeter();
}
class Circle2 implements Shape2{
    double radius;
     Circle2(double radius){
        this.radius =radius;
    }
    public double calculateArea(){
        return Math.round(Math.PI*radius*radius);
    }
    public double calculatePerimeter(){
        return Math.round(Math.PI*2*radius);
    }
}
class Rectangle2 implements Shape2{
    double height;
    double width;
     Rectangle2(double height, double width){
        this.width = width;
        this.height = height;
    }

    public double calculateArea(){
        return height*width;
    }
    public double calculatePerimeter(){
        return (height+width)*2;
    }
}
 class MainTest{
    public static void main(String[] args) {
        Shape2 circle2 = new Circle2(50);
        Shape2 rectangle2 = new Rectangle2(7,8);
        System.out.println("circleArea: "+circle2.calculateArea());
        System.out.println("Perimeter: "+circle2.calculatePerimeter());

        System.out.println("RectangleArea: "+rectangle2.calculateArea());
        System.out.println("Perimeter: "+rectangle2.calculatePerimeter());

    }
}
