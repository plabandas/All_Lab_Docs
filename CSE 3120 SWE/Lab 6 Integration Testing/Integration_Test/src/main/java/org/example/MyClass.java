package org.example;

public class MyClass {

    private String name;
    private int id;
    private int secret;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSecret() {
        return secret;
    }

    public void setSecret(int secret) {
        this.secret = secret;
    }

    public int calculateKey(){
        return id*secret;
    }
}
