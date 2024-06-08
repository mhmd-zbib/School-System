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


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
