package Entities;

public class Instructor extends User{
    private int id ;
    private String name ;

    public Instructor(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Instructor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
