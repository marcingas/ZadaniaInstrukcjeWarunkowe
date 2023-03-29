package zoo;

public class Animal {
    private String name;
    private int age;
    private boolean Wild;

    public String getName() {
        return name;
    }

    public boolean IsWild() {
        return Wild;
    }

    public Animal(String name, int age, boolean Wild) {
        this.name = name;
        this.age = age;
        this.Wild = Wild;
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
