package zoo;

public class Dog {
  private String name;
  private int age;
  //zadanie domow - trziecie pole

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String giveVoice(){
    return "hau hau";
  }
}
