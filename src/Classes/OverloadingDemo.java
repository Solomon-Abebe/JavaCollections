package Classes;

 class OverloadingDemo {
    //Demonstrate method overloading
    void test(){
        System.out.println("No Parameters");
    }
//    void test(int a){
//        System.out.println("Method Overloading with One Integer Parameter:"+a);
//    }
    void test(int a, int b){
        System.out.println("Method overloading with two integer parameters:"+a +" "+b);
    }
    void test(double a){
        System.out.println("Method overloading with double:"+a);
       // return a*a;

    }
}
class Overload{
    public static void main(String[] args) {
        OverloadingDemo ob = new OverloadingDemo();
       // double result;
        int i=88;
        //call all versions of method test()
        ob.test();
        ob.test(10);
        ob.test(10,20);
        ob.test(i);
        //System.out.println(result);

    }
}