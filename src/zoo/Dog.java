package zoo;

public class Dog {
    private String name;
    private int age;
    private boolean isWild;

    public Dog(String name, int age, boolean isWild) {
        this.name = name;
        this.age = age;
        this.isWild = isWild;
    }

    public String giveVoice() {
        return "hau hau";
    }
}
