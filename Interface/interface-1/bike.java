class bike implements vehicle{
    int speed;
    int gear;

    @Override
    public void ChangeGear(int newGear){
        gear = newGear;
    }

    @Override
    public void speedUp(int increment){
        speed += increment;
    }

    @Override
    public void applyBrakes(int decrement){
        speed -= decrement;
    }

    public void printStates(){
        System.out.println("speed: " + speed + " gear: " + gear);
    }
}