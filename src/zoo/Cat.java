package zoo;

public class Cat extends Animal{
    private String name;
    private int age;

    private boolean isWild;


    public Cat(String name, int age, boolean isWild) {
        super(name,age,isWild);
    }

    public String giveVoice() {
        return "miau miau";
    }
}
