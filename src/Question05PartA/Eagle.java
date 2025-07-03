package Question05PartA;

public class Eagle extends AnimalType implements Bird {
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }
}
