package model;

import utils.IdUtils;

public abstract class User {

    protected final String id;
    protected String name;
    protected String password;
    protected String email;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.id = IdUtils.generateId();
    }

    public void login() {
        System.out.println("Login");
    }

    public void signup() {
        System.out.println("Signup");
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }


}
