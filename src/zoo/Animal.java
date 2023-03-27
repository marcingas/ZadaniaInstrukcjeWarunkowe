package zoo;

public class Animal {
    private String name;
    private int age;
    private boolean isWild;

    public boolean getIsWild() {
        return isWild;
    }

    public Animal(String name, int age, boolean isWild) {
        this.name = name;
        this.age = age;
        this.isWild = isWild;
    }



    public String giveVoice(){
        return "usual Animal voice ";
    }
    public String doVildThings(boolean isWild){
        if(isWild){
            return "Doing vild things";
        }else {
            return "nice " + getClass().getSimpleName();
        }
    }
}
