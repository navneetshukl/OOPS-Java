public class main{
    public static void main(String[] args) {
        bicycle b=new bicycle();
        b.ChangeGear(2);
        b.speedUp(3);
        b.applyBrakes(1);

        System.out.println("Bicycle present state is : ");
        b.printStates();

        bike bk=new bike();
        bk.ChangeGear(1);
        bk.speedUp(4);
        bk.applyBrakes(3);

        System.out.println("Bike present state is : ");
        bk.printStates();
    }
}