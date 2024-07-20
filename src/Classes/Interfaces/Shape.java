package Classes.Interfaces;

 interface Shape {// interface is public abstract by defaultS
    double getArea();

}
interface Perimeter{
    double getPerimeter();
}
class Circle implements Shape, Perimeter{
    double radius;

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }
    public Circle(double radius){
        this.radius =radius;
    }
}
class Rectangle implements Shape,Perimeter{
    double height;
    double width;
    public double getArea(){
        return height*width;
    }
    public double getPerimeter(){
        return 2*(height+width);
    }
    public void setHeight(double height){
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(8);

        System.out.println("Area of the Rectangle is: "+rectangle.getArea());
        System.out.println("Perimeter of the Rectangle is: "+rectangle.getPerimeter());


        Circle circle = new Circle(6);
       // circle.setRadius(6);

        System.out.println("Area of Circle is:"+ Math.round(circle.getArea()*100)/100);
        System.out.println("Perimeter of Circle is:"+ Math.round(circle.getPerimeter()*100)/100);
    }
}