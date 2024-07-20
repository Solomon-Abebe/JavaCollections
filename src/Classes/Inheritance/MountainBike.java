package Classes.Inheritance;

public class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int startHeight, int startSpeed, int startGear){
        super(startSpeed,startGear);//initializes, it must be the first statement
        this.seatHeight=startHeight;//initializing the local variable
    }
    public void setHeight(int newValue){

    }
}
