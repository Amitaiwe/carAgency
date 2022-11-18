package com.example.car_agency;

public abstract class car {
    String company;
    int year;
    int price;

    public car(String company, int year, int price) {
        this.company = company;
        this.year = year;
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract String getClassName();

    @Override
    public String toString() {
        return "car{" +
                "company='" + company + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

}
