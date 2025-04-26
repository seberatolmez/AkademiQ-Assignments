package Entities;

import Core.User;

public class Applicant extends User {
    String about;

    public Applicant(String about) {
        super();
        this.about = about;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
