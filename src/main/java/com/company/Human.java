package com.company;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {

    private long id;
    private String name;
    private String male;
    private Date birthDate;
    private Division division;
    private double salary;
    private static SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy"); // форматируем дату
    public Human (long id, String name, String male, Date birthDate, Division division, double salary) {
        this.id = id;
        this.name = name;
        this.male = male;
        this.birthDate = birthDate;
        this.division = division;
        this.salary = salary;
    }

    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setMale(String male) {
        this.male = male;
    }
    public String getMale() {
        return male;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setDivision(Division division) {
        this.division = division;
    }
    public Division getDivision() {
        return division;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "{id: " + id + "; name: " + name + "; male: " + male + "; birthDate: " + format.format(birthDate) + "; division: " + division + "; salary: " + salary + "}";
    }
}
