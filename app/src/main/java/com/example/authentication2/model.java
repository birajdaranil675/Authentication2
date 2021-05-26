package com.example.authentication2;

public class model {
    String id;
    String name;
    String email;
    String contact;
    String password;
    String city;

    public model() {
    }

    public model(String id, String name, String email, String contact, String password, String city) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.password = password;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
