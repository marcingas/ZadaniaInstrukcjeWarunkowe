package zoo;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Animal cat = new Cat("Filemon", 2, false);
        Animal dog = new Dog("Burek", 5, false);
        Animal tiger = new Tiger("Tygrysek", 6, true);

        List<Animal> zoo = new ArrayList<>();
        zoo.add(cat);
        zoo.add(dog);
        zoo.add(tiger);

//        first version:
        for(int i = 0; i < zoo.size(); i++){
            Animal animal = zoo.get(i);
            System.out.println(animal.toString() +" gives voice: " + animal.giveVoice());
            System.out.println(animal.doWildThings(animal.IsWild()));
        }
        System.out.println("version 2: ");
// second version:
        for (Animal animal : zoo) {
            System.out.println(animal.toString() + " gives voice: " + animal.giveVoice());
        }
    }
}

