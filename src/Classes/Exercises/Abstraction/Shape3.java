package Classes.Exercises.Abstraction;

 abstract class Shape3 {
     abstract double abstractArea();
     abstract double abstractPerimeter();
}
class Circle3 extends Shape3{
     private double radius;
     Circle3(double radius){
         this.radius = radius;
     }
     public double abstractArea(){
         return Math.round(Math.PI*radius*radius);
     }
     public double abstractPerimeter(){
         return Math.round(Math.PI*2*radius);
     }
}
class Rectangle3 extends Shape3{
     double height;
     double width;
     Rectangle3(double height, double width){
         this.height =height;
         this.width = width;
     }
     public double abstractArea()
     {
         return height*width;
     }
     public double abstractPerimeter(){
         return (height + width)*2;
     }
}
class MainTest3{
    public static void main(String[] args) {
        Shape3 circle3= new Circle3(5);
        System.out.println(circle3.abstractArea());
        System.out.println(circle3.abstractPerimeter());


        Shape3 rectangle3 = new Rectangle3(10,15);
        System.out.println(rectangle3.abstractPerimeter());
        System.out.println(rectangle3.abstractArea());
    }
}