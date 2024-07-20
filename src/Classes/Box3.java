package Classes;

public class Box3 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
    void setDim(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }
}

     class BoxDemo3{
        public static void main(String[] args) {
            Box3 myBox1=new Box3();
            Box3 myBox2=new Box3();

            myBox1.setDim(10,20,15);
            myBox2.setDim(3,9,6);

            double vol1=myBox1.volume();
            System.out.println("The volume is:"+ vol1);

            double vol2= myBox2.volume();
            System.out.println("The volume is:"+vol2);

        }
    }

