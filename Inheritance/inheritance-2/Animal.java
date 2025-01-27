class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor is called: "+ name);
    }

    public String getName(){
        return name;
    }

    public void describe(){
        System.out.println(name +" is an animal");
    }


}