package Classes.Inheritance;

class InheritanceDemo {
    public static void main(String[] args) {
        MountainBike mountainBike= new MountainBike(20,10,1);
        System.out.println("Gear is:"+mountainBike.gear);
        System.out.println("Seat height is:"+mountainBike.seatHeight);
        System.out.println("Speed is:"+mountainBike.speed);
        mountainBike.applyBrake(1);
        System.out.println("Speed after applying brake is:"+mountainBike.speed);
    }
}
