package Question05PartA;

public class BirdTest {
    public static void main(String[] args) {

       Eagle e1 = new Eagle("Eagle");
       e1.fly();
       e1.eat();

       System.out.println();

       Penguin p1 = new Penguin("Penguin");
       p1.eat();

    }
}
