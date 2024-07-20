package Classes;

public class Box {

    double width = 10;
    double height = 20;
    double depth = 15;// these are instance variables

    // double vol = width * height * depth;
    // display volume of a box
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }
}
   class BoxDemo {/* while the file name is Box.java BoxDemo couldn't be public(i.e. it should be in BoxDemo. java
   file to be public) */
        public static void main(String[] args) {
            Box myBox = new Box();
        /*
        OR
        Box myBox; // declare reference to object
        myBox = new Box(); // allocate a Box object
         */
            Box myBox2 = new Box();
           // double vol;
            // assign values to myBox instance variables
            myBox.depth = 10;
            myBox.width = 15;
            myBox.height = 20;

            myBox.volume();

            myBox2.depth = 3;
            myBox2.width = 9;
            myBox2.height = 6;

            myBox2.volume();
// Compute volume of Box
           /*vol= myBox.depth* myBox.height* myBox.width;
            System.out.println("The Volume of Box is:" + vol);

            vol = myBox2.depth * myBox2.width * myBox2.height;
            System.out.println("The Volume of Box is:" + vol);
            */
        }
    }

