
class circle extends shape {

    double radius;

    public circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle colour is " + super.getColor() + " and area is " + area();
    }

}
