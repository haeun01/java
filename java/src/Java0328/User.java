package Java0328;

import java.time.LocalDate;

public class User {
    String name;
    String email;
    int userId;
    LocalDate birthDate;
    int password;



    public User(String john, String mail, int i, LocalDate localDate, int i1) {

    }

    public User (String name, String email, int userId, int password) {
        this.name = name;
        this.email = email;
        this.userId = userId;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getuserId() {
        return userId;
    }

    public void setuserId(int userId) {
        this.userId = userId;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return name + ", " + email + ", " + userId + ", " + password;
    }
}

