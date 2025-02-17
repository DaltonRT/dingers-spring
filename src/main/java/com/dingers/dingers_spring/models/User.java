package com.dingers.dingers_spring.models;



public class User {

private int id;
private String password;
private String role;
private String firstName;
private String lastName;
private String userName;
private String email;

public User(String password, String role, String firstName, String lastName, String userName, String email){
    this.password = password;
    this.role = role;
    this.firstName = firstName;
    this.lastName = lastName;
    this.userName = userName;
    this.email = email;

}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}