package com.example.oopfinalproject;
import javafx.beans.property.SimpleStringProperty;

    public class Owner {

        private SimpleStringProperty name;
        private SimpleStringProperty ID;
        private SimpleStringProperty Password;
        private SimpleStringProperty Number;

        public String getName() {
            return name.get();
        }

        public SimpleStringProperty nameProperty() {
            return name;
        }

        public void setName(String name) {
            this.name.set(name);
        }

        public String getID() {
            return ID.get();
        }

        public SimpleStringProperty IDProperty() {
            return ID;
        }

        public void setID(String ID) {
            this.ID.set(ID);
        }

        public String getPassword() {
            return Password.get();
        }

        public SimpleStringProperty passwordProperty() {
            return Password;
        }

        public void setPassword(String password) {
            this.Password.set(password);
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

        @Override
        public String toString() {
            return "Admin{" +
                    "name=" + name +
                    ", ID=" + ID +
                    ", Password=" + Password +
                    ", Number=" + Number +
                    '}';
        }

        public Owner(String ID, String password, String name, String number) {
            this.ID = new SimpleStringProperty(ID);
            this.name = new SimpleStringProperty(name);
            this.Number = new SimpleStringProperty(number);
            this.Password = new SimpleStringProperty(password);
        }}


