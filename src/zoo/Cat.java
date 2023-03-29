package zoo;

public class Cat extends Animal{



    public Cat(String name, int age, boolean isWild) {
        super(name, age, isWild);
    }

    public String giveVoice() {
        return "miau miau";
    }

    @Override
    public String toString() {
        return "Cat " + getName();
    }
}
