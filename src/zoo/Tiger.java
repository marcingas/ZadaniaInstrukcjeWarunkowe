package zoo;

public class Tiger {
    private String name;
    private int age;
    private boolean isWild;

    public Tiger(String name, int age, boolean isWild) {
        this.name = name;
        this.age = age;
        this.isWild = isWild;
    }
    public String giveVoice(){
        return "Grrrrr!!!!!!!!";
    }
}
