package com.company;

public class Division {

    private long id;
    private String name;

    public Division(long id, String name) {
        this.id = id;
        this.name = name;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "id: " + id + " name: " + name;
    }
}
