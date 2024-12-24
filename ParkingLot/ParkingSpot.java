// The ParkingSpot class represents an individual parking spot and tracks the availability and the parked vehicle.

public class ParkingSpot{
    private final int spotNumber;
    private final VehicleType vehicleType;
    private Vehicle parkedVehicle;

    public ParkingSpot(int spotNumber,VehicleType vehicletype){
        this.spotNumber = spotNumber;
        this.vehicleType = vehicletype;

    }

    public synchronized boolean isAvailable(){
        return parkedVehicle == null;
    }

    public synchronized void parkVehicle(Vehicle vehicle){
        if(isAvailable() && vehicle.getType()==vehicleType){
            parkedVehicle=vehicle;
        } else{
            throw new IllegalArgumentException("Invalid vehicle type or spot already occupied");
        }
    }

    public synchronized void unparkVehicle(){
        parkedVehicle = null;
    }

    public VehicleType getVehicleType(){
        return vehicleType;
    }

    public Vehicle getParkedVehicle(){
        return parkedVehicle;
    }

    public int getSpotNumber(){
        return spotNumber;
    }
}