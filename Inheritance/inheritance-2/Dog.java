class Dog extends Mammal {
    private String breed;

    // Constructor
    public Dog(String name, int legs, String breed) {
        super(name, legs); // Call the intermediate parent class constructor
        this.breed = breed;
        System.out.println("Dog constructor called with breed: " + breed);
    }

    // Method to describe the dog
    @Override
    public void describe() {
        super.describe(); // Call the intermediate parent class method
        System.out.println(getName() + " is a dog of breed " + breed + ".");
    }
}