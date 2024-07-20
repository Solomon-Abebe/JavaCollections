package Classes;

public class BoxConst2 {
    //double width, height, depth;
    double width;// instance variables
    double height;
    double depth;
  /*  BoxConst2(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }*/

      BoxConst2(double width, double height, double depth){
        this.width=width;//this keyword accesses the instance variable
        this.height=height;
        this.depth=depth;
    }
    double volume(){
        return width*height*depth;
    }
}
class BoxDemo7{
    public static void main(String[] args) {
        BoxConst2 myBox1=new BoxConst2(10,15,20);
        BoxConst2 myBox2=new BoxConst2(3,9,6);

        System.out.println("The volume of Box1 is:"+ myBox1.volume());
        System.out.println("The volume of Box2 is:"+ myBox2.volume());
    }
}
