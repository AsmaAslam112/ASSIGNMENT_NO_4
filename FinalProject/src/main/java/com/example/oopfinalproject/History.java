package com.example.oopfinalproject;

import javafx.beans.property.SimpleStringProperty;

public class History{
    private SimpleStringProperty Username;
    private SimpleStringProperty trainid;
    private SimpleStringProperty from;
    private SimpleStringProperty to;
    private SimpleStringProperty date;
    private SimpleStringProperty time;
    private int seats;
    private SimpleStringProperty fair;


    public String getFair() {
        return fair.get();
    }

    public SimpleStringProperty fairProperty() {
        return fair;
    }

    public void setFair(String fair) {
        this.fair.set(fair);
    }

    public String getUsername() {
        return Username.get();
    }

    public SimpleStringProperty usernameProperty() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username.set(username);
    }

    public String getTrainid() {
        return trainid.get();
    }

    public SimpleStringProperty TrainidProperty() {
        return trainid;
    }

    public void setBusid(String trainid) {
        this.trainid.set(trainid);
    }

    public String getFrom() {
        return from.get();
    }

    public SimpleStringProperty fromProperty() {
        return from;
    }

    public void setFrom(String from) {
        this.from.set(from);
    }

    public String getTo() {
        return to.get();
    }

    public SimpleStringProperty toProperty() {
        return to;
    }

    public void setTo(String to) {
        this.to.set(to);
    }

    public String getDate() {
        return date.get();
    }

    public SimpleStringProperty dateProperty() {
        return date;
    }

    public void setDate(String date) {
        this.date.set(date);
    }

    public String getTime() {
        return time.get();
    }

    public SimpleStringProperty timeProperty() {
        return time;
    }

    public void setTime(String time) {
        this.time.set(time);
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }


    @Override
    public String toString() {
        return "History{" +
                "Username=" + Username +
                ", trainid=" + trainid +
                ", from=" + from +
                ", to=" + to +
                ", date=" + date +
                ", time=" + time +
                ", seats=" + seats +
                ", fair=" + fair +
                '}';
    }



    public History(String username, String trainid, String from, String to,
                   String date, String time, int seats, String fair) {
        this.Username =new SimpleStringProperty(username);
        this.trainid = new SimpleStringProperty(trainid);
        this.from =new SimpleStringProperty( from);
        this.to = new SimpleStringProperty(to);
        this.date =new SimpleStringProperty(date);
        this.time = new SimpleStringProperty(time);
        this.seats = seats;
        this.fair = new SimpleStringProperty(fair);
    }

}