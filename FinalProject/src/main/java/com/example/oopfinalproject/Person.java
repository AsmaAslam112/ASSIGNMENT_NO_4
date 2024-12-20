package com.example.oopfinalproject;

import javafx.beans.property.SimpleStringProperty;

public class Person {
    private SimpleStringProperty ID;
    private SimpleStringProperty Name;
    private SimpleStringProperty Number;
    private SimpleStringProperty Password;

    public String getName() {
        return Name.get();
    }

    public SimpleStringProperty nameProperty() {
        return Name;
    }

    public void setName(String name) {
        this.Name.set(name);
    }

    public String getNumber() {
        return Number.get();
    }

    public SimpleStringProperty numberProperty() {
        return Number;
    }

    public void setNumber(String number) {
        this.Number.set(number);
    }

    public String getID() {
        return ID.get();
    }

    public void setID(String ID) {
        this.ID.set(ID);
    }

    public String getPassword() {
        return Password.get();
    }

    public void setPassword(String password) {
        this.Password.set(password);
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", Name=" + Name +
                ", Number=" + Number +
                ", Password=" + Password +
                '}';
    }

    public Person(String ID, String password, String name, String number) {
        this.ID = new SimpleStringProperty(ID);
        this.Name = new SimpleStringProperty(name);
        this.Number = new SimpleStringProperty(number);
        this.Password = new SimpleStringProperty(password);
    }}