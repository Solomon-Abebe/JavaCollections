package Classes.StaticNonStaticMethods;

public class StaticNonStaticMethods {
    private final double length;
    private final double width;
    public static double staticArea(double length, double width){
        return length*width;
    }
    public StaticNonStaticMethods(double length, double width){
        this.length= length;
        this.width =width;
    }
    public double nonStaticArea(){
        return length*width;
    }

    public static void main(String[] args) {
        double areaStatic = staticArea(5,6);
        System.out.println("Static approach area calculation: ="+ areaStatic);

        StaticNonStaticMethods nonStaticRectangle = new StaticNonStaticMethods(5,6);

        double areaNonStatic = nonStaticRectangle.nonStaticArea();
        System.out.println(areaNonStatic);
    }
}
