package zoo;

public class Dog extends Animal{
    private String name;
    private int age;
    private boolean isWild;

    public Dog(String name, int age, boolean isWild) {
        super(name,age,isWild);
    }

    public String giveVoice() {
        return "hau hau";
    }
}
