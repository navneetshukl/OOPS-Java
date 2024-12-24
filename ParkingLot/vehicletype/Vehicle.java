//The Vehicle class is an abstract base class for different types of vehicles. It is extended by Car, Motorcycle, and Truck classes.

public  abstract class Vehicle{
    protected String licensePlate;
    protected VehicleType type;

    public Vehicle(String licensePlate,VehicleType type){
        this.licensePlate = licensePlate;
        this.type = type;
    }

    public VehicleType getType(){
        return type;
    }
}