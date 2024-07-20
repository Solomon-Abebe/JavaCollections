package Classes.Construcctors;

 class Box {
    private double height, width, depth;

     Box(){
         height=-1;
         width=-1;
         depth=-1;
     }
     Box(double height, double width, double depth){
         this.height = height;
         this.width = width;
         this.depth = depth;
     }
     Box(double len){
         width = height = depth = len;
     }
     double volume(){
         return height*width*depth;
        // System.out.println(" Volume is: " + height*width*depth);
     }
     // method with no return type
//     void volume(){
//
//        System.out.println(" Volume is: " + height*width*depth);
//     }
}

class BoxDemo{
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box(10,15,20);
        Box myBox3 = new Box(3);

        System.out.println(" Volume of myBox1: "+ myBox1.volume());
        System.out.println(" Volume of myBox2: "+ myBox2.volume());
        System.out.println(" Volume of myBox3: "+ myBox3.volume());

        // myBox1.volume();

    }
}