package com.spring.thymeleaf.model;

public class UserForm {

    private String name;
    private String email;
    private String password;
    private String gender;
    private String address;
    private String married;
    private String profession;

    public UserForm() {
    }

    public UserForm(String name, String email, String password, String gender, String address, String married,
            String profession) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.address = address;
        this.married = married;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getMarried() {
        return married;
    }

    public String getProfession() {
        return profession;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    


}
