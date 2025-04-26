package Entities;

import Core.User;

public class Instructor extends User {
    private String companyName;

    public Instructor(String companyName) {
        super();
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
