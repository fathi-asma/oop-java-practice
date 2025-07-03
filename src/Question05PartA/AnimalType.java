package Question05PartA;

public class AnimalType {
    protected String name;

    public AnimalType(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

}
