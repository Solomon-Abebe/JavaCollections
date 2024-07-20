package Classes.Exercises.Encapsulation;

public class Rectangle {

    // Encapsulation
    /*
    UML diagram
    -height: double
    -width: double
    +Rectangle()
    +Rectangle(double, double)
    +getArea():double
    +getPerimeter:double
    +getters/setters


     */

    private double height;
    private  double width;
    public Rectangle(){
        this(1.0, 1.0);
    }
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return this.height * this.width;
    }
    public double getPerimeter(){
        return (this.height + this.width)*2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
}
