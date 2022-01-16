import java.util.SortedMap;

public class Zoo {

    public static void main(String[] args) {


        Bird bird1 = new Bird(3, "female", 60);

        Fish fish1 = new Fish(5,"male", 100 );

        Chicken chicken1 = new Chicken(1, "female", 100);
        Animal chicken2 = new Chicken(1, "female", 100);

        Sparrow sparrow1 = new Sparrow(1, "male", 50);

        moveAnimals(bird1);
        moveAnimals(fish1);
        moveAnimals(chicken1);
        moveAnimals(chicken2);
        moveAnimals(sparrow1);
    }

    public static void moveAnimals(Animal animal) {
        animal.move();
    }



}
