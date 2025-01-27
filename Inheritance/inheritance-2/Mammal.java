

class Mammal extends Animal{
    private int legs;

    public Mammal(String name, int legs) {
        super(name);
        this.legs = legs;
        System.out.println("Mammal constructor is called with legs: "+ legs);
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println(getName() +" is a mammal with "+ legs +" legs");
    }


}