package zoo;

import java.util.ArrayList;
import java.util.List;

public class Runner {
  public static void main(String[] args) {
    Cat cat = new Cat("filemon", 2);
    Dog dog = new Dog("burek", 5);
    //trzecie

    List<Object> zoo = new ArrayList<>();
    zoo.add(cat);
    zoo.add(dog);
    //trzecie

    for (int i = 0; i < zoo.size(); i++) {
      Object animal = zoo.get(i);
      if (animal instanceof Cat){
        String catsVoice = ((Cat) animal).giveVoice();
        System.out.println(catsVoice);
      }
      if (animal instanceof Dog){
        String dogsVoice = ((Dog) animal).giveVoice();
        System.out.println(dogsVoice);
      }
      //trzeci if
    }
  }
}
