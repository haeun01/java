package Java0328;

import java.time.LocalDate;

public class User {
    String name;
    String email;
    String userId;
    LocalDate birthDate;
    int password;



    public User() {

    }

    public User (String name, String email, String userId, LocalDate birthDate, int password) {
        this.name = name;
        this.email = email;
        this.userId = userId;
        this.password = password;
        this.birthDate = birthDate;
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

    public String getuserId() {
        return userId;
    }

    public void setuserId(String userId) {
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
        return name + ", " + email + ", " + userId + ", "+ birthDate + ", " + password;
    }
}

