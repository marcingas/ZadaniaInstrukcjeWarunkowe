package zoo;

public class Dog extends Animal{


    public Dog(String name, int age, boolean isWild) {
        super(name,age,isWild);
    }

    public String giveVoice() {
        return "hau hau";
    }
}
