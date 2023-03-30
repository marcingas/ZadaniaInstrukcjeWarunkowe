package zoo;

public class Animal {
    private String name;
    private int age;
    private boolean wild;

    public String getName() {
        return name;
    }

    public boolean IsWild() {
        return wild;
    }

    public Animal(String name, int age, boolean wild) {
        this.name = name;
        this.age = age;
        this.wild = wild;
    }



    public String giveVoice(){
        return "usual Animal voice ";
    }
    public String doWildThings(boolean Wild){
        if(Wild){
            return "Doing vild things";
        }else {
            return "nice " + toString();
        }
    }

    @Override
    public String toString() {
        return "Animal "+ name;
    }
}
