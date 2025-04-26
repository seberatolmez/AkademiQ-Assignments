package Entities;

import Core.User;

public class Employee extends User {
    private String position;

    public Employee(String position) {
        super();
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
