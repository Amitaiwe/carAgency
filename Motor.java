package com.example.car_agency;

public class Motor extends car{
    boolean isOffRoad;

    public Motor(String company, int year, int price, boolean isOffRoad) {
        super(company, year, price);
        this.isOffRoad = isOffRoad;
    }

    public boolean isOffRoad() {
        return isOffRoad;
    }

    public void setOffRoad(boolean offRoad) {
        isOffRoad = offRoad;
    }

    @Override
    public String toString() {
        if(!isOffRoad){
            return company +" "+ year + " price: "+price;
        }
        if(isOffRoad){
            return company +" "+ year + " price: "+price+" offRoad monster!";
        }
        return null;
    }

    @Override
    public String getClassName() {
        return "motor";
    }

}
