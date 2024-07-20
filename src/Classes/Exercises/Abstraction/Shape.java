package Classes.Exercises.Abstraction;
// This Example should be for abstraction
public abstract class Shape {
    public abstract void area();
     public void perimeter(){
         System.out.println("Perimeter of Any Shape: ");

    }
}
      class Circle extends Shape{
        private double radius;
        private static int numberOfCircles;

        Circle(double radius){
            this.radius = radius;
            numberOfCircles ++;
        }

          public double getRadius() {
              return radius;
          }
          public int getNumberOfCircles() {
              return numberOfCircles;
          }

          public void setRadius(double radius) {
              this.radius = radius;
              numberOfCircles++;
          }

          @Override
         public void area() {
             System.out.println("Area of Circle: " + Math.PI*radius*radius);

         }

         @Override
        public void perimeter() {
             System.out.println("Perimeter of Circle: " + 2*Math.PI*radius);

         }
     }
      class Rectangle extends Shape{
     double height;
     double width;
    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

         @Override
        public void area() {
             System.out.println("Area of Rectangle: " + height*width);
         }

         @Override
        public void perimeter() {
             System.out.println("Perimeter of Rectangle: " +2*(height+width));

         }
     }

class MainDemo{
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        circle.area();
        circle.perimeter();

        System.out.println();
        System.out.println(" After changing radius");


        circle.setRadius(10);
        System.out.println("The New Radius is: "+ circle.getRadius());
        circle.area();
        circle.perimeter();

        circle.setRadius(15);
        System.out.println("The New Radius is: "+ circle.getRadius());
        circle.area();
        circle.perimeter();

        System.out.println("Number of Circles: "+ circle.getNumberOfCircles());

        System.out.println();
        Shape rectangle = new Rectangle(5,6);
        rectangle.area();
        rectangle.perimeter();

    }
}
