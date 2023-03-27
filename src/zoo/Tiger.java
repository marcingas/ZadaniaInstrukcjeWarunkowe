package zoo;

public class Tiger extends Animal{
    private String name;
    private int age;
    private boolean isWild;

    public Tiger(String name, int age, boolean isWild) {
        super(name,age,isWild);
    }
    public String giveVoice(){
        return "Grrrrr!!!!!!!!";
    }
}
