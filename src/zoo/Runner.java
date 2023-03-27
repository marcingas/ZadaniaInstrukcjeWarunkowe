package zoo;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Animal cat = new Cat("filemon", 2, false);
        Animal dog = new Dog("burek", 5, false);
        Animal tiger = new Tiger("Tygrysek", 6, true);

        List<Animal> zoo = new ArrayList<>();
        zoo.add(cat);
        zoo.add(dog);
        zoo.add(tiger);


        for (Animal animal : zoo) {
            System.out.println(animal.getClass().getSimpleName() + " gives voice: " + animal.giveVoice());
        }
    }
}

