package zoo;

public class Animal {
    private String name;
    private int age;
    private boolean isWild;

    public Animal(String name, int age, boolean isWild) {
        this.name = name;
        this.age = age;
        this.isWild = isWild;
    }
    public String giveVoice(){
        return "usual Animal voice ";
    }
}
