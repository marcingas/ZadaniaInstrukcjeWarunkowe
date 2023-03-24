package zoo;

public class Cat {
  private String name;
  private int age;
  // trzecie pole - zadanie domowe

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String giveVoice(){
    return "miau miau";
  }
}
