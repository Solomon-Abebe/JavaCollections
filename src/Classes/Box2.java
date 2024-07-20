package Classes;

public class Box2 {
    double height, depth, width;
    double volume(){
        return height*depth*width;
    }

//class BoxDemo2{
    public static void main(String[] args) {
        Box2 myBox1= new Box2();
        Box2 myBox2=new Box2();
        myBox1.width =10;
        myBox1.depth=20;
        myBox1.height=15;
        //double vol;
        //vol=myBox1.volume();
       // double vol = myBox1.volume();
        System.out.println(" The volume is:" + myBox1.volume());


        myBox2.depth=3;
        myBox2.height=9;
        myBox2.width = 6;
      //OR
        double vol= myBox2.volume();
        System.out.println(" The volume is:" +vol);
    }
    //}
}
