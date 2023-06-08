package Musician;

public class Group {
    private Musician[] group;

    Group(){
        group = new Musician[10];
    }

    public Musician[] getGroup() {
        return group;
    }

    public void setGroup(Musician[] group) {
        this.group = group;
    }
}
