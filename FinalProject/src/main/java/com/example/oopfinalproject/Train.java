package com.example.oopfinalproject;

import javafx.beans.property.SimpleStringProperty;

public class Train {
    private SimpleStringProperty busId;
    private SimpleStringProperty From;
    private SimpleStringProperty To;
    private SimpleStringProperty Date;
    private SimpleStringProperty Time;
    private SimpleStringProperty Status;
    private SimpleStringProperty Fair;
    private int seats;
    private int availableSeats;


    public String getStatus() {
        return Status.get();
    }

    public SimpleStringProperty statusProperty() {
        return Status;
    }

    public void setStatus(String status) {
        this.Status.set(status);
    }

    public String getFair() {
        return Fair.get();
    }

    public SimpleStringProperty fairProperty() {
        return Fair;
    }

    public void setFair(String fair) {
        this.Fair.set(fair);
    }

    public Train(String busId, String from, String to, String date, String time, int seats, int availableSeats, String status,
                 String fair) {
        this.busId = new SimpleStringProperty(busId);
        this.From = new SimpleStringProperty(from);
        this.To = new SimpleStringProperty(to);
        this.Date = new SimpleStringProperty(date);
        this.Time = new SimpleStringProperty(time);
        this.seats = seats;
        this.availableSeats = availableSeats;
        this.Status = new SimpleStringProperty(status);
        this.Fair = new SimpleStringProperty(fair);
    }




    // Getters and setters for each property
    public String getBusId() {
        return busId.get();
    }

    public SimpleStringProperty busIdProperty() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId.set(busId);
    }

    public String getFrom() {
        return From.get();
    }

    public SimpleStringProperty fromProperty() {
        return From;
    }

    public void setFrom(String from) {
        this.From.set(from);
    }

    public String getTo() {
        return To.get();
    }

    public SimpleStringProperty toProperty() {
        return To;
    }

    public void setTo(String to) {
        this.To.set(to);
    }

    public String getDate() {
        return Date.get();
    }

    public SimpleStringProperty dateProperty() {
        return Date;
    }

    public void setDate(String date) {
        this.Date.set(date);
    }

    public String getTime() {
        return Time.get();
    }

    public SimpleStringProperty timeProperty() {
        return Time;
    }

    public void setTime(String time) {
        this.Time.set(time);
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busId=" + busId +
                ", From=" + From +
                ", To=" + To +
                ", Date=" + Date +
                ", Time=" + Time +
                ", Status=" + Status +
                ", Fair=" + Fair +
                ", seats=" + seats +
                ", availableSeats=" + availableSeats +
                '}';
    }
}
