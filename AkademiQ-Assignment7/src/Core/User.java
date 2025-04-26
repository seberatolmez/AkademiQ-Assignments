package Core;

import java.util.Date;

public class User {
    private int id;
    private  String userName;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String nationalIdentiity;
    private String email;
    private String password;

    public User(int id, String userName,
                String firstName, String lastName, Date dateOfBirth, String nationalIdentiity,
                String email, String password) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalIdentiity = nationalIdentiity;
        this.email = email;
        this.password = password;
    }
    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalIdentiity() {
        return nationalIdentiity;
    }

    public void setNationalIdentiity(String nationalIdentiity) {
        this.nationalIdentiity = nationalIdentiity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
