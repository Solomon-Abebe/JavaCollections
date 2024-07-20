package Classes.Exercises.Encapsulation;

import Classes.Exercises.Encapsulation.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i< rectangles.length; i++){
            System.out.println("Do you want to insert the height and width of the rectangle? y/n");
            char choice = input.next().charAt(0); // y/n
            if(choice=='y')
                rectangles[i] =  new Rectangle(input.nextDouble(), input.nextDouble());
            else
                rectangles[i] = new Rectangle();
        }
        System.out.println(" The Rectangles are:");
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Rectangle"+(i+1)+
                    ":height:"+ rectangles[i].getHeight()+
                    ", width:"+ rectangles[i].getWidth() +
                    ", area:" + rectangles[i].getArea() +
                    ",perimeter:" + rectangles[i].getPerimeter());

        }
    }
}
