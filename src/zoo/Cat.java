package zoo;

public class Cat {
    private String name;
    private int age;

    private boolean isWild;


    public Cat(String name, int age, boolean isWild) {
        this.name = name;
        this.age = age;
        this.isWild = isWild;
    }

    public String giveVoice() {
        return "miau miau";
    }
}
