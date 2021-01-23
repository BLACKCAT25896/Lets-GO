package com.bmsrental.letsgo.model;

public class DriverInfoModel {
    public String first_name, last_name, phone_number;
    public double ratting;

    public DriverInfoModel() {
    }

    public DriverInfoModel(String first_name, String last_name, String phone_number, double ratting) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.ratting = ratting;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setRatting(double ratting) {
        this.ratting = ratting;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public double getRatting() {
        return ratting;
    }
}
