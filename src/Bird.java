public class Bird extends Animal {

    public Bird(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    public void fly() {
        System.out.println("Flying...");
    }

    public void move() {
        System.out.println("Bird is flapping wings...");
    }
}
