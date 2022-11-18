package com.example.car_agency;

import java.util.ArrayList;

public class branch {
    String city;

    ArrayList<car> cars = new ArrayList<car>();

    public branch(String address, ArrayList<car> cars) {
        this.city = address;
        this.cars = cars;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String address) {
        this.city = address;
    }

    public ArrayList<car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<car> cars) {
        this.cars = cars;
    }

    int noOfCars() {
        int i = 0;
        for (car c : cars) {
            i++;
        }
        return i;
    }
}
